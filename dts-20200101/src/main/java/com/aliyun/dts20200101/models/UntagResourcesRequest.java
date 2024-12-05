// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to unbind all tags from the specified instances. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: unbinds all tags from the specified instances.</li>
     * <li><strong>false</strong>: To unbind only specific tags, you must specify the <strong>TagKey.N</strong> parameter.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You must specify at least one of the All and <strong>TagKey.N</strong> parameters.</li>
     * <li>If you specify both the All parameter and the <strong>TagKey.N</strong> parameter, the All parameter does not take effect.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The ID of the region where the data migration, data synchronization, or change tracking instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the data migration, synchronization, and subscription instances, which can be queried by calling the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> API. &gt; N indicates the Nth instance ID to be passed. For example, ResourceId.0 represents passing the first instance ID; ResourceId.1 represents passing the second instance ID. You can unbind tags for 1 to 50 instances simultaneously.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsntk10k6r12v****</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. Valid value: <strong>ALIYUN::DTS::INSTANCE</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN::DTS::INSTANCE</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Tag key. &gt; - N indicates the position of the tag key being passed. For example, TagKey.0 represents the first tag key; TagKey.1 represents the second tag key. Up to 20 tag keys can be unbound simultaneously. - Empty strings are not allowed. - At least one of <strong>All</strong> or this parameter must be provided. - If both <strong>All</strong> and this parameter are provided, only this parameter will take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>testkey1</p>
     */
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

    public UntagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UntagResourcesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
