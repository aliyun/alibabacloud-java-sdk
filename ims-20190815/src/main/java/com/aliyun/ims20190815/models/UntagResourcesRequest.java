// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags from the resources. Valid values:</p>
     * <br>
     * <p>*   true: remove all tags from the resources.</p>
     * <p>*   false: does not remove all tags from the resources. This is the default value.</p>
     * <br>
     * <p>>  This parameter takes effect only when the TagKey.N parameter is not specified in the request.</p>
     */
    @NameInMap("All")
    public Boolean all;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourcePrincipalName")
    public java.util.List<String> resourcePrincipalName;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <br>
     * <p>*   user: a RAM user</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("TagKey")
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

    public UntagResourcesRequest setResourcePrincipalName(java.util.List<String> resourcePrincipalName) {
        this.resourcePrincipalName = resourcePrincipalName;
        return this;
    }
    public java.util.List<String> getResourcePrincipalName() {
        return this.resourcePrincipalName;
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
