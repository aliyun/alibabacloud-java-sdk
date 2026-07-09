// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateEvaluationRunRequest extends TeaModel {
    /**
     * <p>The target status. Currently, only stop-related statuses are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Terminated</p>
     */
    @NameInMap("status")
    public String status;

    public static UpdateEvaluationRunRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEvaluationRunRequest self = new UpdateEvaluationRunRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEvaluationRunRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
