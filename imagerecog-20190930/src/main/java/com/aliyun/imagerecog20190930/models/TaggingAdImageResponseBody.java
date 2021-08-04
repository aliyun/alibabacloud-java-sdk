// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class TaggingAdImageResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public TaggingAdImageResponseBodyData data;

    public static TaggingAdImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaggingAdImageResponseBody self = new TaggingAdImageResponseBody();
        return TeaModel.build(map, self);
    }

    public TaggingAdImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaggingAdImageResponseBody setData(TaggingAdImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TaggingAdImageResponseBodyData getData() {
        return this.data;
    }

    public static class TaggingAdImageResponseBodyDataTags extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Confidence")
        public Float confidence;

        public static TaggingAdImageResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            TaggingAdImageResponseBodyDataTags self = new TaggingAdImageResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public TaggingAdImageResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public TaggingAdImageResponseBodyDataTags setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

    }

    public static class TaggingAdImageResponseBodyData extends TeaModel {
        @NameInMap("Tags")
        public java.util.List<TaggingAdImageResponseBodyDataTags> tags;

        public static TaggingAdImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TaggingAdImageResponseBodyData self = new TaggingAdImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TaggingAdImageResponseBodyData setTags(java.util.List<TaggingAdImageResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<TaggingAdImageResponseBodyDataTags> getTags() {
            return this.tags;
        }

    }

}
