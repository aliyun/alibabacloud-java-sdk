// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class TagResourcesResponseBody extends TeaModel {
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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("ResourceId")
        public String resourceId;

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
