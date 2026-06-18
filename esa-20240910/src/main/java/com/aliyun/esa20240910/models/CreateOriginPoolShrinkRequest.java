// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateOriginPoolShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether the origin pool is enabled.</p>
     * <ul>
     * <li><p><code>true</code>: enabled</p>
     * </li>
     * <li><p><code>false</code>: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The name of the origin pool. The name must be unique within a site.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pool1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of origins to add to the origin pool. Use an array to specify multiple origins.</p>
     */
    @NameInMap("Origins")
    public String originsShrink;

    /**
     * <p>The site ID. To obtain this ID, call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21655860979****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static CreateOriginPoolShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOriginPoolShrinkRequest self = new CreateOriginPoolShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOriginPoolShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateOriginPoolShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOriginPoolShrinkRequest setOriginsShrink(String originsShrink) {
        this.originsShrink = originsShrink;
        return this;
    }
    public String getOriginsShrink() {
        return this.originsShrink;
    }

    public CreateOriginPoolShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
