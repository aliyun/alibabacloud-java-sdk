// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    // 是否删除全部自定义标签，仅当tag_keys为空时生效，取值：[true,false]。
    @NameInMap("all")
    public Boolean all;

    // 资源所属的地域ID
    @NameInMap("region_id")
    public String regionId;

    // 资源ID。数组长度取值范围为：1~50
    @NameInMap("resource_ids")
    public java.util.List<String> resourceIds;

    // 资源类型定义。取值范围： 只支持CLUSTER这一种资源类型
    @NameInMap("resource_type")
    public String resourceType;

    // 资源的标签键。N的取值范围：1~20
    @NameInMap("tag_keys")
    public java.util.List<String> tagKeys;

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

    public UntagResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public UntagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesRequest setTagKeys(java.util.List<String> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<String> getTagKeys() {
        return this.tagKeys;
    }

}
