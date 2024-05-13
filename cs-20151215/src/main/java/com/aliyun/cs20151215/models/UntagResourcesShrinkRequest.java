// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UntagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all custom labels. This parameter takes effect only when `tag_keys` is left empty. Valid values:</p>
     * <br>
     * <p>*   `true`: Remove all custom labels.</p>
     * <p>*   `false`: Do not remove all custom labels.</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <p>The region ID of the resources.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("region_id")
    public String regionId;

    /**
     * <p>The list of resource IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("resource_ids")
    public String resourceIdsShrink;

    /**
     * <p>The type of resource. Set the value to `CLUSTER`.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("resource_type")
    public String resourceType;

    /**
     * <p>The list of keys of the labels that you want to remove.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("tag_keys")
    public String tagKeysShrink;

    public static UntagResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesShrinkRequest self = new UntagResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesShrinkRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagResourcesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UntagResourcesShrinkRequest setResourceIdsShrink(String resourceIdsShrink) {
        this.resourceIdsShrink = resourceIdsShrink;
        return this;
    }
    public String getResourceIdsShrink() {
        return this.resourceIdsShrink;
    }

    public UntagResourcesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesShrinkRequest setTagKeysShrink(String tagKeysShrink) {
        this.tagKeysShrink = tagKeysShrink;
        return this;
    }
    public String getTagKeysShrink() {
        return this.tagKeysShrink;
    }

}
