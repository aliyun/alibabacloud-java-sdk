// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSeoBypassRequest extends TeaModel {
    /**
     * <p>The switch. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled.</li>
     * <li><strong>off</strong>: disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateSeoBypassRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSeoBypassRequest self = new UpdateSeoBypassRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSeoBypassRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public UpdateSeoBypassRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
