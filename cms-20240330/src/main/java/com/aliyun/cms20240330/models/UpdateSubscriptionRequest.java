// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateSubscriptionRequest extends TeaModel {
    @NameInMap("body")
    public SubscriptionForModify body;

    /**
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static UpdateSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscriptionRequest self = new UpdateSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubscriptionRequest setBody(SubscriptionForModify body) {
        this.body = body;
        return this;
    }
    public SubscriptionForModify getBody() {
        return this.body;
    }

    public UpdateSubscriptionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
