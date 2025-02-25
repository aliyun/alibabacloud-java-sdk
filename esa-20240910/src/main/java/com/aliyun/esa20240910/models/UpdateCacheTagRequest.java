// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCacheTagRequest extends TeaModel {
    /**
     * <p>Whether to ignore case. Value range:</p>
     * <ul>
     * <li>on: Enabled, ignores case.</li>
     * <li>off: Disabled, does not ignore case.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CaseInsensitive")
    public String caseInsensitive;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5407498413****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the effective version of the site configuration, defaulting to version 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    /**
     * <p>Custom CacheTag name.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("TagName")
    public String tagName;

    public static UpdateCacheTagRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCacheTagRequest self = new UpdateCacheTagRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCacheTagRequest setCaseInsensitive(String caseInsensitive) {
        this.caseInsensitive = caseInsensitive;
        return this;
    }
    public String getCaseInsensitive() {
        return this.caseInsensitive;
    }

    public UpdateCacheTagRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateCacheTagRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public UpdateCacheTagRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
