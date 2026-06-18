// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateOriginPoolShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the origin pool:</p>
     * <ul>
     * <li><p>true: Enables the origin pool.</p>
     * </li>
     * <li><p>false: Disables the origin pool.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The origin pool ID. Get this ID by calling the <a href="~~ListOriginPools~~">ListOriginPools</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1038520525196928</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>An array of origin configurations.</p>
     */
    @NameInMap("Origins")
    public String originsShrink;

    /**
     * <p>The site ID. Get this ID by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>216558609793952</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateOriginPoolShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOriginPoolShrinkRequest self = new UpdateOriginPoolShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOriginPoolShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateOriginPoolShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateOriginPoolShrinkRequest setOriginsShrink(String originsShrink) {
        this.originsShrink = originsShrink;
        return this;
    }
    public String getOriginsShrink() {
        return this.originsShrink;
    }

    public UpdateOriginPoolShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
