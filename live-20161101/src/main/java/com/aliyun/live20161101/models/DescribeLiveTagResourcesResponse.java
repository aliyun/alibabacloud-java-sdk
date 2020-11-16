// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveTagResourcesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TagResources")
    @Validation(required = true)
    public java.util.List<DescribeLiveTagResourcesResponseTagResources> tagResources;

    public static DescribeLiveTagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveTagResourcesResponse self = new DescribeLiveTagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveTagResourcesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveTagResourcesResponse setTagResources(java.util.List<DescribeLiveTagResourcesResponseTagResources> tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public java.util.List<DescribeLiveTagResourcesResponseTagResources> getTagResources() {
        return this.tagResources;
    }

    public static class DescribeLiveTagResourcesResponseTagResourcesTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeLiveTagResourcesResponseTagResourcesTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveTagResourcesResponseTagResourcesTag self = new DescribeLiveTagResourcesResponseTagResourcesTag();
            return TeaModel.build(map, self);
        }

        public DescribeLiveTagResourcesResponseTagResourcesTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLiveTagResourcesResponseTagResourcesTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveTagResourcesResponseTagResources extends TeaModel {
        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeLiveTagResourcesResponseTagResourcesTag> tag;

        public static DescribeLiveTagResourcesResponseTagResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveTagResourcesResponseTagResources self = new DescribeLiveTagResourcesResponseTagResources();
            return TeaModel.build(map, self);
        }

        public DescribeLiveTagResourcesResponseTagResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeLiveTagResourcesResponseTagResources setTag(java.util.List<DescribeLiveTagResourcesResponseTagResourcesTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeLiveTagResourcesResponseTagResourcesTag> getTag() {
            return this.tag;
        }

    }

}
