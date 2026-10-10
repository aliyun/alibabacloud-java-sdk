// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
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
    public java.util.List<String> resourceId;

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
    public java.util.List<String> tagKey;

    public static UntagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesRequest self = new UntagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UntagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

}
