// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UntagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags from the specified resources. Valid values:</p>
     * <p>false (default): No
     * true: Yes</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <p>A list of resource IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("resourceId")
    public String resourceIdShrink;

    /**
     * <p>The resource type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Service</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The tag key.</p>
     * <p>You can detach tags with up to 20 tag keys.</p>
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
