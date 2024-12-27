// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateOriginPoolShrinkRequest extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateOriginPool</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Origins")
    public String originsShrink;

    /**
     * <p>This parameter is required.</p>
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
