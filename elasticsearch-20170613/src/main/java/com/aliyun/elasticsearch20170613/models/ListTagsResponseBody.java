// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListTagsResponseBody extends TeaModel {
    /**
     * <p>The key of the tag.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListTagsResponseBodyResult> result;

    public static ListTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagsResponseBody self = new ListTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagsResponseBody setResult(java.util.List<ListTagsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListTagsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListTagsResponseBodyResult extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListTagsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListTagsResponseBodyResult self = new ListTagsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListTagsResponseBodyResult setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagsResponseBodyResult setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
