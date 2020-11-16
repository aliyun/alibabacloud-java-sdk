// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserTagsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Tags")
    @Validation(required = true)
    public java.util.List<DescribeLiveUserTagsResponseTags> tags;

    public static DescribeLiveUserTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUserTagsResponse self = new DescribeLiveUserTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUserTagsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveUserTagsResponse setTags(java.util.List<DescribeLiveUserTagsResponseTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeLiveUserTagsResponseTags> getTags() {
        return this.tags;
    }

    public static class DescribeLiveUserTagsResponseTags extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public java.util.List<String> value;

        public static DescribeLiveUserTagsResponseTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUserTagsResponseTags self = new DescribeLiveUserTagsResponseTags();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUserTagsResponseTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLiveUserTagsResponseTags setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
