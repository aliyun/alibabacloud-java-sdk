// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class TaggingImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public TaggingImageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static TaggingImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaggingImageResponseBody self = new TaggingImageResponseBody();
        return TeaModel.build(map, self);
    }

    public TaggingImageResponseBody setData(TaggingImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TaggingImageResponseBodyData getData() {
        return this.data;
    }

    public TaggingImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TaggingImageResponseBodyDataTags extends TeaModel {
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Value")
        public String value;

        public static TaggingImageResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            TaggingImageResponseBodyDataTags self = new TaggingImageResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public TaggingImageResponseBodyDataTags setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public TaggingImageResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class TaggingImageResponseBodyData extends TeaModel {
        @NameInMap("Tags")
        public java.util.List<TaggingImageResponseBodyDataTags> tags;

        public static TaggingImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TaggingImageResponseBodyData self = new TaggingImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TaggingImageResponseBodyData setTags(java.util.List<TaggingImageResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<TaggingImageResponseBodyDataTags> getTags() {
            return this.tags;
        }

    }

}
