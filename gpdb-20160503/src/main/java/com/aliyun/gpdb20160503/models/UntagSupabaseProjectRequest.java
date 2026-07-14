// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UntagSupabaseProjectRequest extends TeaModel {
    /**
     * <p>Specifies whether to unbind all tags from the instance. This parameter takes effect only when TagKey.N is not specified in the request. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The instance ID. Valid values of N: 1 to 50.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><code>instance</code>: reserved mode instance.</li>
     * <li><code>ALIYUN::GPDB::INSTANCE</code>: elastic mode instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag key of the resource. Valid values of N: 1 to 20.</p>
     */
    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    public static UntagSupabaseProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagSupabaseProjectRequest self = new UntagSupabaseProjectRequest();
        return TeaModel.build(map, self);
    }

    public UntagSupabaseProjectRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagSupabaseProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UntagSupabaseProjectRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UntagSupabaseProjectRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagSupabaseProjectRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

}
