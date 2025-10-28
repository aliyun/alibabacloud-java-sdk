// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The IDs of the resources. You can specify up to 20 IDs. Set this parameter to a JSON array.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;000e5836-xxxx-xxxx-xxxx-0d6ab2ac4877&quot;]</p>
     */
    @NameInMap("ResourceIds")
    public java.util.Map<String, ?> resourceIds;

    /**
     * <p>The region in which the resource resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <ul>
     * <li><strong>application</strong>: Enterprise Distributed Application Service (EDAS) application</li>
     * <li><strong>cluster</strong>: EDAS cluster</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>application</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The key-value pairs that specify the tags.</p>
     * <ul>
     * <li>You can add up to 20 tags to a resource.</li>
     * <li>The key cannot start with <strong>aliyun</strong> or <strong>acs:</strong> and cannot contain <strong>http://</strong> or <strong>https://</strong>.</li>
     * <li>The tag key or tag value can be up to 128 characters in length, and can contain letters, digits, hyphens (-), commas (,), asterisks (\*), forward slashes (/), question marks (?), and colons (:).</li>
     * <li>Set this parameter to a JSON array.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;:&quot;key1&quot;,&quot;value&quot;:&quot;v1&quot;},{&quot;key&quot;:&quot;key2&quot;,&quot;value&quot;:&quot;v2&quot;}]</p>
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
