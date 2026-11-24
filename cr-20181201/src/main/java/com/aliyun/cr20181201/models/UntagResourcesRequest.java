// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to unbind all tags from the resource. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Unbinds all tags from the resource.</p>
     * </li>
     * <li><p><strong>false</strong>: Does not unbind all tags.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you set both <strong>TagKey.n</strong> and this parameter, this parameter does not take effect.</p>
     * </blockquote>
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
     * <p>The resource ID. You can specify up to 20 resources.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. Currently, Instance resources are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag key. Valid values of N: 1 to 20.</p>
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
