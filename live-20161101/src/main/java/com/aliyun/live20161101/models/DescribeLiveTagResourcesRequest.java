// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveTagResourcesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Tag")
    public java.util.List<DescribeLiveTagResourcesRequestTag> tag;

    @NameInMap("Scope")
    public String scope;

    public static DescribeLiveTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveTagResourcesRequest self = new DescribeLiveTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveTagResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public DescribeLiveTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeLiveTagResourcesRequest setTag(java.util.List<DescribeLiveTagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeLiveTagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public DescribeLiveTagResourcesRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public static class DescribeLiveTagResourcesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeLiveTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveTagResourcesRequestTag self = new DescribeLiveTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeLiveTagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLiveTagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
