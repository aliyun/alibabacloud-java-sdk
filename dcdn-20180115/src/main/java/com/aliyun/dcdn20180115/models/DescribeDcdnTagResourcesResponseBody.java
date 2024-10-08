// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnTagResourcesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>34AB41F1-04A5-496F-8C8D-634BDBE6A9FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tag of the instance.</p>
     */
    @NameInMap("TagResources")
    public java.util.List<DescribeDcdnTagResourcesResponseBodyTagResources> tagResources;

    public static DescribeDcdnTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnTagResourcesResponseBody self = new DescribeDcdnTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnTagResourcesResponseBody setTagResources(java.util.List<DescribeDcdnTagResourcesResponseBodyTagResources> tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public java.util.List<DescribeDcdnTagResourcesResponseBodyTagResources> getTagResources() {
        return this.tagResources;
    }

    public static class DescribeDcdnTagResourcesResponseBodyTagResourcesTag extends TeaModel {
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

        public static DescribeDcdnTagResourcesResponseBodyTagResourcesTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnTagResourcesResponseBodyTagResourcesTag self = new DescribeDcdnTagResourcesResponseBodyTagResourcesTag();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnTagResourcesResponseBodyTagResourcesTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDcdnTagResourcesResponseBodyTagResourcesTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDcdnTagResourcesResponseBodyTagResources extends TeaModel {
        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The tags of the snapshot.</p>
         */
        @NameInMap("Tag")
        public java.util.List<DescribeDcdnTagResourcesResponseBodyTagResourcesTag> tag;

        public static DescribeDcdnTagResourcesResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnTagResourcesResponseBodyTagResources self = new DescribeDcdnTagResourcesResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnTagResourcesResponseBodyTagResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeDcdnTagResourcesResponseBodyTagResources setTag(java.util.List<DescribeDcdnTagResourcesResponseBodyTagResourcesTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDcdnTagResourcesResponseBodyTagResourcesTag> getTag() {
            return this.tag;
        }

    }

}
