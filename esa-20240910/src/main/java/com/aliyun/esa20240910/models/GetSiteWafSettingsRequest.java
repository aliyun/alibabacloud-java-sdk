// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteWafSettingsRequest extends TeaModel {
    /**
     * <p>Specifies the configuration path. If not provided, all configurations will be retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>bot_management</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Site version.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static GetSiteWafSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSiteWafSettingsRequest self = new GetSiteWafSettingsRequest();
        return TeaModel.build(map, self);
    }

    public GetSiteWafSettingsRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public GetSiteWafSettingsRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetSiteWafSettingsRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
