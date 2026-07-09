// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteEvaluatorRequest extends TeaModel {
    /**
     * <p>The version to delete. If this parameter is not specified, the entire evaluator is deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("version")
    public String version;

    public static DeleteEvaluatorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEvaluatorRequest self = new DeleteEvaluatorRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEvaluatorRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
