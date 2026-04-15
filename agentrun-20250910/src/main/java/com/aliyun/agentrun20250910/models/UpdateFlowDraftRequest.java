// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateFlowDraftRequest extends TeaModel {
    /**
     * <p>包含要更新的工作流草稿配置信息的请求体</p>
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
