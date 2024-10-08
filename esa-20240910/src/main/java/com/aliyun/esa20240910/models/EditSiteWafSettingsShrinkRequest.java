// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class EditSiteWafSettingsShrinkRequest extends TeaModel {
    @NameInMap("Settings")
    public String settingsShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static EditSiteWafSettingsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EditSiteWafSettingsShrinkRequest self = new EditSiteWafSettingsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EditSiteWafSettingsShrinkRequest setSettingsShrink(String settingsShrink) {
        this.settingsShrink = settingsShrink;
        return this;
    }
    public String getSettingsShrink() {
        return this.settingsShrink;
    }

    public EditSiteWafSettingsShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public EditSiteWafSettingsShrinkRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
