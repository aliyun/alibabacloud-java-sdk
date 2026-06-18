// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateIPv6Request extends TeaModel {
    /**
     * <p>Whether to enable IPv6. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: Enables IPv6.</p>
     * </li>
     * <li><p><strong>off</strong>: Disables IPv6.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The region in which to enable IPv6. The default value is x.x.</p>
     * <ul>
     * <li><p>x.x: global</p>
     * </li>
     * <li><p>cn.cn: Chinese mainland</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>x.x</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The site ID. You can get this ID by calling <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a>.</p>
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
