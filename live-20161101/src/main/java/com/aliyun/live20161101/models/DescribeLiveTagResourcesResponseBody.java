// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveTagResourcesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>34AB41F1-04A5-496F-8C8D-634BDBE6A9FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("TagResources")
    public java.util.List<DescribeLiveTagResourcesResponseBodyTagResources> tagResources;

    public static DescribeLiveTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveTagResourcesResponseBody self = new DescribeLiveTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveTagResourcesResponseBody setTagResources(java.util.List<DescribeLiveTagResourcesResponseBodyTagResources> tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public java.util.List<DescribeLiveTagResourcesResponseBodyTagResources> getTagResources() {
        return this.tagResources;
    }

    public static class DescribeLiveTagResourcesResponseBodyTagResourcesTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeLiveTagResourcesResponseBodyTagResourcesTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveTagResourcesResponseBodyTagResourcesTag self = new DescribeLiveTagResourcesResponseBodyTagResourcesTag();
            return TeaModel.build(map, self);
        }

        public DescribeLiveTagResourcesResponseBodyTagResourcesTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLiveTagResourcesResponseBodyTagResourcesTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveTagResourcesResponseBodyTagResources extends TeaModel {
        /**
         * <p>The resource.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The key-value pair of the tag.</p>
         */
        @NameInMap("Tag")
        public java.util.List<DescribeLiveTagResourcesResponseBodyTagResourcesTag> tag;

        public static DescribeLiveTagResourcesResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveTagResourcesResponseBodyTagResources self = new DescribeLiveTagResourcesResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public DescribeLiveTagResourcesResponseBodyTagResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeLiveTagResourcesResponseBodyTagResources setTag(java.util.List<DescribeLiveTagResourcesResponseBodyTagResourcesTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeLiveTagResourcesResponseBodyTagResourcesTag> getTag() {
            return this.tag;
        }

    }

}
