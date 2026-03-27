// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateNotifyStrategyRequest extends TeaModel {
    @NameInMap("body")
    public NotifyStrategyForModify body;

    /**
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static UpdateNotifyStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNotifyStrategyRequest self = new UpdateNotifyStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNotifyStrategyRequest setBody(NotifyStrategyForModify body) {
        this.body = body;
        return this;
    }
    public NotifyStrategyForModify getBody() {
        return this.body;
    }

    public UpdateNotifyStrategyRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
