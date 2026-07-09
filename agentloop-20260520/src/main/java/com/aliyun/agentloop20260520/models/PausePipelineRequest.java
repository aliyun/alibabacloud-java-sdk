// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class PausePipelineRequest extends TeaModel {
    /**
     * <p>The reason for pausing the pipeline.</p>
     * 
     * <strong>example:</strong>
     * <p>manual maintenance</p>
     */
    @NameInMap("reason")
    public String reason;

    public static PausePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        PausePipelineRequest self = new PausePipelineRequest();
        return TeaModel.build(map, self);
    }

    public PausePipelineRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
