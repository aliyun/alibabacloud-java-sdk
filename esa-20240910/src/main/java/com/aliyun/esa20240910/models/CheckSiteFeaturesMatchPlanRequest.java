// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CheckSiteFeaturesMatchPlanRequest extends TeaModel {
    /**
     * <p>The target instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-site-b0bivjxucjk0</p>
     */
    @NameInMap("NewInstanceId")
    public String newInstanceId;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>861405331573200</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static CheckSiteFeaturesMatchPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSiteFeaturesMatchPlanRequest self = new CheckSiteFeaturesMatchPlanRequest();
        return TeaModel.build(map, self);
    }

    public CheckSiteFeaturesMatchPlanRequest setNewInstanceId(String newInstanceId) {
        this.newInstanceId = newInstanceId;
        return this;
    }
    public String getNewInstanceId() {
        return this.newInstanceId;
    }

    public CheckSiteFeaturesMatchPlanRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
