// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetSubscriptionRequest extends TeaModel {
    /**
     * <p>The name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static GetSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionRequest self = new GetSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
