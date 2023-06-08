// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeTagResourcesRequest extends TeaModel {
    /**
     * <p>The IDs of the resources. You can specify up to 50 IDs in each request.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. Set the value to **DOMAIN**.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags. You can specify up to 20 tags in each request.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeTagResourcesRequestTag> tag;

    public static DescribeTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagResourcesRequest self = new DescribeTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public DescribeTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeTagResourcesRequest setTag(java.util.List<DescribeTagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeTagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeTagResourcesRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. Valid values of N: **1** to **20**.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. Valid values of N: **1** to **20**.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagResourcesRequestTag self = new DescribeTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeTagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
