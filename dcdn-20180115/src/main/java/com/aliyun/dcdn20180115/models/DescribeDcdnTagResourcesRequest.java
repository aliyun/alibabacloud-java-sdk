// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnTagResourcesRequest extends TeaModel {
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Tag")
    public java.util.List<DescribeDcdnTagResourcesRequestTag> tag;

    public static DescribeDcdnTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnTagResourcesRequest self = new DescribeDcdnTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public DescribeDcdnTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeDcdnTagResourcesRequest setTag(java.util.List<DescribeDcdnTagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDcdnTagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDcdnTagResourcesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDcdnTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnTagResourcesRequestTag self = new DescribeDcdnTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnTagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDcdnTagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
