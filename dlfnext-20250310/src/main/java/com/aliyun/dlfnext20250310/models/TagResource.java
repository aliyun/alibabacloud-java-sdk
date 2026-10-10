// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class TagResource extends TeaModel {
    /**
     * <p>The resource ID, which is the data catalog ID.</p>
     * 
     * <strong>example:</strong>
     * <p>clg-paimon-0424965be0c240acb4159688c9e2c4b6</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <p>The resource type, which is fixed to CATALOGRESOURCE.</p>
     * 
     * <strong>example:</strong>
     * <p>CATALOGRESOURCE</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The tag key.</p>
     * 
     * <strong>example:</strong>
     * <p>team</p>
     */
    @NameInMap("tagKey")
    public String tagKey;

    /**
     * <p>The tag value.</p>
     * 
     * <strong>example:</strong>
     * <p>recommendation</p>
     */
    @NameInMap("tagValue")
    public String tagValue;

    public static TagResource build(java.util.Map<String, ?> map) throws Exception {
        TagResource self = new TagResource();
        return TeaModel.build(map, self);
    }

    public TagResource setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public TagResource setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResource setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public String getTagKey() {
        return this.tagKey;
    }

    public TagResource setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
    public String getTagValue() {
        return this.tagValue;
    }

}
