// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags from the resource. Valid values:</p>
     * <br>
     * <p>*   true: All tags are removed from the resource.</p>
     * <p>*   false: Specified tags are removed from the resource.</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The region ID of the tag.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource.</p>
     * <br>
     * <p>You can specify up to 50 resources.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <br>
     * <p>*   `ACS::Config::Rule`</p>
     * <p>*   `ACS::Config::AggregateConfigRule`</p>
     * <p>*   `ACS::Config::Aggregator`</p>
     * <p>*   `ACS::Config::CompliancePack`</p>
     * <p>*   `ACS::Config::AggregateCompliancePack`</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag keys of the resource.</p>
     * <br>
     * <p>You can specify up to 20 tag keys.</p>
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
