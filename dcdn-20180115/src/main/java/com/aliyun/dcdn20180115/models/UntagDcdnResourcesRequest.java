// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UntagDcdnResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete all tags. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>Default value: **false**</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The ID of the resource. Valid values of N: **1** to **50**.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resource. Set the value to **DOMAIN**.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The key of the tag. Valid values of N: **1** to **20**.</p>
     */
    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    public static UntagDcdnResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagDcdnResourcesRequest self = new UntagDcdnResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UntagDcdnResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagDcdnResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UntagDcdnResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagDcdnResourcesRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

}
