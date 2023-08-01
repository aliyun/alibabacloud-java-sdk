// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The IDs of the resources. You can specify up to 20 IDs. Set this parameter to a JSON array.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.Map<String, ?> resourceIds;

    /**
     * <p>The region in which the resource resides.</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <br>
     * <p>*   **application**: Enterprise Distributed Application Service (EDAS) application</p>
     * <p>*   **cluster**: EDAS cluster</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The key-value pairs that specify the tags.</p>
     * <br>
     * <p>*   You can add up to 20 tags to a resource.</p>
     * <p>*   The key cannot start with **aliyun** or **acs:** and cannot contain **http://** or **https://**.</p>
     * <p>*   The tag key or tag value can be up to 128 characters in length, and can contain letters, digits, hyphens (-), commas (,), asterisks (\*), forward slashes (/), question marks (?), and colons (:).</p>
     * <p>*   Set this parameter to a JSON array.</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    public static ListTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesRequest self = new ListTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesRequest setResourceIds(java.util.Map<String, ?> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.Map<String, ?> getResourceIds() {
        return this.resourceIds;
    }

    public ListTagResourcesRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public ListTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTagResourcesRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

}
