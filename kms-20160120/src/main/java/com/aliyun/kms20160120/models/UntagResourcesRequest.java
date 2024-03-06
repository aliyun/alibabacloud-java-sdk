// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags from resources. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false (default)</p>
     * <br>
     * <p>>  This parameter takes effect only when you specify an empty tag key.</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The region ID of the resource.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~601478~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the resources from which you want to remove tags. You can enter up to 50 resource IDs.</p>
     * <br>
     * <p>Enter multiple resource IDs in the `["ResourceId.1","ResourceId.2",...]` format.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resource from which you want to remove tags. Valid values:</p>
     * <br>
     * <p>*   key</p>
     * <p>*   secret</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The keys of the tags that you want to remove. You can enter up to 20 tag keys.</p>
     * <br>
     * <p>Enter multiple tag keys in the `["key.1","key.2",...]` format.</p>
     * <br>
     * <p>>  The tag key cannot start with aliyun or acs:.</p>
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
