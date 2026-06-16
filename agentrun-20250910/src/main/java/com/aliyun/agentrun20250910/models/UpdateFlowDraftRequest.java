// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateFlowDraftRequest extends TeaModel {
    /**
     * <p>Input parameters for updating flow draft</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UpdateFlowDraftInput body;

    public static UpdateFlowDraftRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowDraftRequest self = new UpdateFlowDraftRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowDraftRequest setBody(UpdateFlowDraftInput body) {
        this.body = body;
        return this;
    }
    public UpdateFlowDraftInput getBody() {
        return this.body;
    }

}
