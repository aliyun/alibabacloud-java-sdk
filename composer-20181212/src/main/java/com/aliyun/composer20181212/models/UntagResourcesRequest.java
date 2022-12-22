// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    // 系统规定参数。取值：UntagResources。
    @NameInMap("All")
    public Boolean all;

    // The type of the resources. Set the value to ALIYUN::LC::FLOW.
    // 
    // *   ALIYUN::LC::FLOW indicates Logic Composer workflows.
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    // system
    @NameInMap("ResourceType")
    public String resourceType;

    // Specifies a maximum of 50 resource IDs.
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
