// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateVersionDescRequest extends TeaModel {
    /**
     * <p>The description of the version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>更新版本。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>134567****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version number to be updated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static UpdateVersionDescRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVersionDescRequest self = new UpdateVersionDescRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVersionDescRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateVersionDescRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateVersionDescRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
