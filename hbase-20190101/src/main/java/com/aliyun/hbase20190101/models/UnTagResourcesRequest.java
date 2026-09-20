// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class UnTagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete all tags. If TagKey is specified, tags are deleted only by TagKey. Valid values: true and false. If this parameter is set to true and TagKey is not specified, all tags are deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of resource N to untag. The resource ID is the cluster ID. You can specify multiple resource IDs, such as ResourceId.2 and ResourceId.3. N is a positive integer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bds-bp15e022622fk0w1</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The key of tag N to delete. You can specify multiple tag keys, such as TagKey.2 and TagKey.3. N is a positive integer.</p>
     * 
     * <strong>example:</strong>
     * <p>key1</p>
     */
    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    public static UnTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnTagResourcesRequest self = new UnTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UnTagResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UnTagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UnTagResourcesRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

}
