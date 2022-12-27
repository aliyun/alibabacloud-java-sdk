// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class TagResourcesResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static TagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesResponseBody self = new TagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public TagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTagResourcesResponseBodyTagResourcesTag extends TeaModel {
        // The key of the tag.
        @NameInMap("Key")
        public String key;

        // The value of the tag.
        @NameInMap("Value")
        public String value;

        public static DescribeTagResourcesResponseBodyTagResourcesTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagResourcesResponseBodyTagResourcesTag self = new DescribeTagResourcesResponseBodyTagResourcesTag();
            return TeaModel.build(map, self);
        }

        public DescribeTagResourcesResponseBodyTagResourcesTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTagResourcesResponseBodyTagResourcesTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeTagResourcesResponseBodyTagResources extends TeaModel {
        // The ID of the resource.
        @NameInMap("ResourceId")
        public String resourceId;

        // The key-value pair of the tag.
        @NameInMap("Tag")
        public java.util.List<DescribeTagResourcesResponseBodyTagResourcesTag> tag;

        public static DescribeTagResourcesResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagResourcesResponseBodyTagResources self = new DescribeTagResourcesResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public DescribeTagResourcesResponseBodyTagResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeTagResourcesResponseBodyTagResources setTag(java.util.List<DescribeTagResourcesResponseBodyTagResourcesTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeTagResourcesResponseBodyTagResourcesTag> getTag() {
            return this.tag;
        }

    }

}
