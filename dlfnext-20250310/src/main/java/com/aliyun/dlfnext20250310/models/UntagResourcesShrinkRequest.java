// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class UntagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags from the resources. This parameter and TagKey are mutually exclusive.</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <p>The list of data catalog IDs from which to remove tags. The value is a JSON array. Maximum: 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;clg-paimon-0424965be0c240acb4159688c9e2c4b6&quot;]</p>
     */
    @NameInMap("resourceId")
    public String resourceIdShrink;

    /**
     * <p>The resource type. Valid value: CATALOGRESOURCE.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CATALOGRESOURCE</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The list of tag keys to remove. The value is a JSON array. This parameter and All are mutually exclusive.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;team&quot;]</p>
     */
    @NameInMap("tagKey")
    public String tagKeyShrink;

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

    public UntagResourcesShrinkRequest setResourceIdShrink(String resourceIdShrink) {
        this.resourceIdShrink = resourceIdShrink;
        return this;
    }
    public String getResourceIdShrink() {
        return this.resourceIdShrink;
    }

    public UntagResourcesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesShrinkRequest setTagKeyShrink(String tagKeyShrink) {
        this.tagKeyShrink = tagKeyShrink;
        return this;
    }
    public String getTagKeyShrink() {
        return this.tagKeyShrink;
    }

}
