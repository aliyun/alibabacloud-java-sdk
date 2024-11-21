// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class EditSiteWafSettingsRequest extends TeaModel {
    /**
     * <p>The WAF configuration of the website in the JSON format.</p>
     */
    @NameInMap("Settings")
    public WafSiteSettings settings;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version of the website.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static EditSiteWafSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        EditSiteWafSettingsRequest self = new EditSiteWafSettingsRequest();
        return TeaModel.build(map, self);
    }

    public EditSiteWafSettingsRequest setSettings(WafSiteSettings settings) {
        this.settings = settings;
        return this;
    }
    public WafSiteSettings getSettings() {
        return this.settings;
    }

    public EditSiteWafSettingsRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public EditSiteWafSettingsRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
