// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateOriginPoolShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether the origin address pool is enabled. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The origin address pool ID. You can call the <a href="~~ListOriginPools~~">ListOriginPools</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1038520525196928</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The origin server information added to the origin address pool. Use an array to pass multiple origin servers.</p>
     */
    @NameInMap("Origins")
    public String originsShrink;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the ID.</p>
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
