// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserTagsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34AB41F1-04A5-496F-8C8D-634BDBE6A9FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tag.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeDcdnUserTagsResponseBodyTags> tags;

    public static DescribeDcdnUserTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserTagsResponseBody self = new DescribeDcdnUserTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnUserTagsResponseBody setTags(java.util.List<DescribeDcdnUserTagsResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeDcdnUserTagsResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class DescribeDcdnUserTagsResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>region</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag that you want to query.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeDcdnUserTagsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserTagsResponseBodyTags self = new DescribeDcdnUserTagsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserTagsResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDcdnUserTagsResponseBodyTags setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
