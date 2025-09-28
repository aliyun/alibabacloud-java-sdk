// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyDashboardsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cs-default</p>
     */
    @NameInMap("addonName")
    public String addonName;

    /**
     * <strong>example:</strong>
     * <p>databse</p>
     */
    @NameInMap("scene")
    public String scene;

    public static ListIntegrationPolicyDashboardsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyDashboardsRequest self = new ListIntegrationPolicyDashboardsRequest();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyDashboardsRequest setAddonName(String addonName) {
        this.addonName = addonName;
        return this;
    }
    public String getAddonName() {
        return this.addonName;
    }

    public ListIntegrationPolicyDashboardsRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
