// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteVanityNSRequest extends TeaModel {
    /**
     * <p>The website ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The custom nameserver names. You can specify two to five custom nameserver names. Separate multiple names with commas (,).</p>
     * 
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
