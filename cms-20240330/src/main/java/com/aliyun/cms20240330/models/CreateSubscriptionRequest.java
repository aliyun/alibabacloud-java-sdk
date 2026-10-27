// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateSubscriptionRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public SubscriptionForModify body;

    /**
     * <p>The name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static CreateSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscriptionRequest self = new CreateSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubscriptionRequest setBody(SubscriptionForModify body) {
        this.body = body;
        return this;
    }
    public SubscriptionForModify getBody() {
        return this.body;
    }

    public CreateSubscriptionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
