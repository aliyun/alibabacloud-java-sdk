// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ModifySiteFeaturesRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-site-bl39ryjtineo</p>
     */
    @NameInMap("NewInstanceId")
    public String newInstanceId;

    /**
     * <p>The site feature information to be cleared.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>network_optimization|smart_routing,loadbalance</p>
     */
    @NameInMap("SiteFeatures")
    public String siteFeatures;

    /**
     * <p>The site ID. You can obtain the ID by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1067072706415168</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ModifySiteFeaturesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySiteFeaturesRequest self = new ModifySiteFeaturesRequest();
        return TeaModel.build(map, self);
    }

    public ModifySiteFeaturesRequest setNewInstanceId(String newInstanceId) {
        this.newInstanceId = newInstanceId;
        return this;
    }
    public String getNewInstanceId() {
        return this.newInstanceId;
    }

    public ModifySiteFeaturesRequest setSiteFeatures(String siteFeatures) {
        this.siteFeatures = siteFeatures;
        return this;
    }
    public String getSiteFeatures() {
        return this.siteFeatures;
    }

    public ModifySiteFeaturesRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
