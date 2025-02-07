// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCacheTagRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CaseInsensitive")
    public String caseInsensitive;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5407498413****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    /**
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
