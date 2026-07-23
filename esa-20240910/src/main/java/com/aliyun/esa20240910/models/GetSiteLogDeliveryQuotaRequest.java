// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteLogDeliveryQuotaRequest extends TeaModel {
    /**
     * <p>The type of real-time logs. Valid values:</p>
     * <ul>
     * <li><strong>dcdn_log_access_l1 (default)</strong>: access logs.</li>
     * <li><strong>dcdn_log_er</strong>: edge function logs.</li>
     * <li><strong>dcdn_log_waf</strong>: security protection logs.</li>
     * <li><strong>dcdn_log_ipa</strong>: Layer 4 acceleration logs.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dcdn_log_access_l1</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetSiteLogDeliveryQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSiteLogDeliveryQuotaRequest self = new GetSiteLogDeliveryQuotaRequest();
        return TeaModel.build(map, self);
    }

    public GetSiteLogDeliveryQuotaRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public GetSiteLogDeliveryQuotaRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
