// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateIPv6Request extends TeaModel {
    /**
     * <p>Specifies whether to enable IPv6. Valid values:</p>
     * <ul>
     * <li><strong>on</strong></li>
     * <li><strong>off</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    @NameInMap("Region")
    public String region;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5407498413****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateIPv6Request build(java.util.Map<String, ?> map) throws Exception {
        UpdateIPv6Request self = new UpdateIPv6Request();
        return TeaModel.build(map, self);
    }

    public UpdateIPv6Request setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public UpdateIPv6Request setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateIPv6Request setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
