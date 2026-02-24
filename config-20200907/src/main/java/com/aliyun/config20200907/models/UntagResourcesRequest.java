// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to detach all tags from the resources. Valid values:</p>
     * <ul>
     * <li><p>true: Detach all tags from the resources.</p>
     * </li>
     * <li><p>false (default): Detach the specified tags.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the resources. You can specify a maximum of 50 resource IDs.</p>
     * <p>You can detach tags from up to 50 resources at a time.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the CloudConfig resource. Valid values:</p>
     * <ul>
     * <li><p><code>ACS::Config::Rule</code>: a rule for a single account.</p>
     * </li>
     * <li><p><code>ACS::Config::AggregateConfigRule</code>: a rule for multiple accounts.</p>
     * </li>
     * <li><p><code>ACS::Config::Aggregator</code>: an account group.</p>
     * </li>
     * <li><p><code>ACS::Config::CompliancePack</code>: a compliance package for a single account.</p>
     * </li>
     * <li><p><code>ACS::Config::AggregateCompliancePack</code>: a compliance package for multiple accounts.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::Config::Rule</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag keys of the tags to detach.</p>
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
