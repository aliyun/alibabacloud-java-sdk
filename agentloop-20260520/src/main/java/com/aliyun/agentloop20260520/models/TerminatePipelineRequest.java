// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class TerminatePipelineRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>project deprecated</p>
     */
    @NameInMap("reason")
    public String reason;

    public static TerminatePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminatePipelineRequest self = new TerminatePipelineRequest();
        return TeaModel.build(map, self);
    }

    public TerminatePipelineRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
