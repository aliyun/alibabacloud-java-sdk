// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all existing tags from the specified resources. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: removes all existing tags from the specified resources.</li>
     * <li><strong>false</strong>: does not remove all existing tags from the specified resources.</li>
     * </ul>
     * <blockquote>
     * <p>All existing tags of a resource are removed only if the <strong>tagKeys</strong> parameter is left empty and the <strong>DeleteAll</strong> parameter is set to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteAll")
    public Boolean deleteAll;

    /**
     * <p>The IDs of the resources from which you want to remove tags. You can specify up to 20 IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;f5ad6ff7-xxxx-xxxx-xxxx-2axxxx82xxxx&quot;]</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>The region in which the resource resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
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
     * <p>The tags that you want to remove. You can specify up to 20 tags. Set this parameter to a JSON array.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;tagKey1&quot;,&quot;tagKey2&quot;]</p>
     */
    @NameInMap("TagKeys")
    public String tagKeys;

    public static UntagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesRequest self = new UntagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesRequest setDeleteAll(Boolean deleteAll) {
        this.deleteAll = deleteAll;
        return this;
    }
    public Boolean getDeleteAll() {
        return this.deleteAll;
    }

    public UntagResourcesRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public UntagResourcesRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public UntagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesRequest setTagKeys(String tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public String getTagKeys() {
        return this.tagKeys;
    }

}
