// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to unbind instance tags from the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Unbinds instance tags from the instance.</li>
     * <li><strong>false</strong>: Does not unbind instance tags. You must specify the tags to unbind in the <strong>TagKey.N</strong> parameter.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You must specify at least one of <strong>TagKey.N</strong> and this parameter.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If you specify both <strong>TagKey.N</strong> and this parameter, this parameter does not take effect.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The region ID. Specify this parameter to indicate the region where the instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the data migration, synchronization, or change tracking instance. You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query instance IDs.</p>
     * <blockquote>
     * <p>N specifies the sequence number of the instance ID. For example, ResourceId.0 specifies the first instance ID, and ResourceId.1 specifies the second instance ID. You can unbind tags from 1 to 50 instances at a time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsntk10k6r12v****</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. The only valid value is <strong>ALIYUN::DTS::INSTANCE</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN::DTS::INSTANCE</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag key.</p>
     * <blockquote>
     * <ul>
     * <li>N specifies the sequence number of the tag key. For example, TagKey.0 specifies the first tag key, and TagKey.1 specifies the second tag key. You can unbind 1 to 20 tag keys at a time.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>Empty strings are not allowed.</li>
     * <li>You must specify at least one of <strong>All</strong> and this parameter.</li>
     * <li>If you specify both <strong>All</strong> and this parameter, only this parameter takes effect.</li>
     * </ul>
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
