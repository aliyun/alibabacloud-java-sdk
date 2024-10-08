// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteVanityNSRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <strong>example:</strong>
     * <p>ns1.example.com,ns2.example.com</p>
     */
    @NameInMap("VanityNSList")
    public String vanityNSList;

    public static UpdateSiteVanityNSRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteVanityNSRequest self = new UpdateSiteVanityNSRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSiteVanityNSRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateSiteVanityNSRequest setVanityNSList(String vanityNSList) {
        this.vanityNSList = vanityNSList;
        return this;
    }
    public String getVanityNSList() {
        return this.vanityNSList;
    }

}
