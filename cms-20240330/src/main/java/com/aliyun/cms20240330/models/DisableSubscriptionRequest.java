// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DisableSubscriptionRequest extends TeaModel {
    /**
     * <p>The name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static DisableSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSubscriptionRequest self = new DisableSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public DisableSubscriptionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
