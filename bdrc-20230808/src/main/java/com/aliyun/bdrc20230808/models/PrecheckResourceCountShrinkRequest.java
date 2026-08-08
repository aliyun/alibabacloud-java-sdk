// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class PrecheckResourceCountShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TagResourceMatchers")
    public String tagResourceMatchersShrink;

    public static PrecheckResourceCountShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PrecheckResourceCountShrinkRequest self = new PrecheckResourceCountShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PrecheckResourceCountShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public PrecheckResourceCountShrinkRequest setTagResourceMatchersShrink(String tagResourceMatchersShrink) {
        this.tagResourceMatchersShrink = tagResourceMatchersShrink;
        return this;
    }
    public String getTagResourceMatchersShrink() {
        return this.tagResourceMatchersShrink;
    }

}
