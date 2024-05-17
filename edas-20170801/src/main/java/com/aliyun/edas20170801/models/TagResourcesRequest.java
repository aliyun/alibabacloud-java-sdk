// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>The IDs of the resources. You can specify up to 20 IDs in the format of a JSON array.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>The region in which the resource resides.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <br>
     * <p>*   **application**: Enterprise Distributed Application Service (EDAS) application</p>
     * <p>*   **cluster**: EDAS cluster</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The key-value pairs. When you set this parameter, take note of the following limits:</p>
     * <br>
     * <p>*   You can add up to 20 tags to a resource.</p>
     * <p>*   The tag key cannot start with **aliyun** or **acs:**. It cannot contain **http://** or **https://**.</p>
     * <p>*   The tag key or tag value can be up to 128 characters in length, and can contain letters, digits, hyphens (-), commas (,), asterisks (\\*), forward slashes (/), question marks (?), and colons (:).</p>
     * <p>*   Set this parameter to a JSON array.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public TagResourcesRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public TagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
