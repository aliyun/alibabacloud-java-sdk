// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateOptimizeRunRequest extends TeaModel {
    /**
     * <p>The JSON input defined by the task type, preserving the original object or array structure. ExperienceMining accepts a start/end/processTimeMaxNS object. SkillOptimize accepts an inline input array, a skills/window object for SLS, or a skills/records object for ATIF or xTrace. The server validates the input based on the task type and configuration. Memory extraction continues to use the original ContextStore API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;start&quot;:1727136000,&quot;end&quot;:1727139600,&quot;processTimeMaxNS&quot;:1727139600000000000}</p>
     */
    @NameInMap("input")
    public Object input;

    /**
     * <p>Specifies whether to execute an independent pre-run of the complete algorithm. The pre-run generates candidate results and evidence without publishing them to the target dataset or advancing the formal run history. A formal run executes the algorithm independently.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("preview")
    public Boolean preview;

    /**
     * <p>The idempotency token. Use the same value when you retry the same creation request.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateOptimizeRunRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOptimizeRunRequest self = new CreateOptimizeRunRequest();
        return TeaModel.build(map, self);
    }

    public CreateOptimizeRunRequest setInput(Object input) {
        this.input = input;
        return this;
    }
    public Object getInput() {
        return this.input;
    }

    public CreateOptimizeRunRequest setPreview(Boolean preview) {
        this.preview = preview;
        return this;
    }
    public Boolean getPreview() {
        return this.preview;
    }

    public CreateOptimizeRunRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
