// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyDashboardsRequest extends TeaModel {
    /**
     * <p>The add-on name.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-default</p>
     */
    @NameInMap("addonName")
    public String addonName;

    /**
     * <p>The query language.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <p>The component scenario.</p>
     * 
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

    public ListIntegrationPolicyDashboardsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListIntegrationPolicyDashboardsRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
