// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateOriginPoolShrinkRequest extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UpdateOriginPool</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("Origins")
    public String originsShrink;

    /**
     * <p>This parameter is required.</p>
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
