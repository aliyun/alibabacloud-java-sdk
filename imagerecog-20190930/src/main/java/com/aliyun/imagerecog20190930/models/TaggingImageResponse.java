// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class TaggingImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public TaggingImageResponseData data;

    public static TaggingImageResponse build(java.util.Map<String, ?> map) throws Exception {
        TaggingImageResponse self = new TaggingImageResponse();
        return TeaModel.build(map, self);
    }

    public TaggingImageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaggingImageResponse setData(TaggingImageResponseData data) {
        this.data = data;
        return this;
    }
    public TaggingImageResponseData getData() {
        return this.data;
    }

    public static class TaggingImageResponseDataTags extends TeaModel {
        @NameInMap("Confidence")
        @Validation(required = true)
        public Float confidence;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static TaggingImageResponseDataTags build(java.util.Map<String, ?> map) throws Exception {
            TaggingImageResponseDataTags self = new TaggingImageResponseDataTags();
            return TeaModel.build(map, self);
        }

        public TaggingImageResponseDataTags setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public TaggingImageResponseDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class TaggingImageResponseData extends TeaModel {
        @NameInMap("Tags")
        @Validation(required = true)
        public java.util.List<TaggingImageResponseDataTags> tags;

        public static TaggingImageResponseData build(java.util.Map<String, ?> map) throws Exception {
            TaggingImageResponseData self = new TaggingImageResponseData();
            return TeaModel.build(map, self);
        }

        public TaggingImageResponseData setTags(java.util.List<TaggingImageResponseDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<TaggingImageResponseDataTags> getTags() {
            return this.tags;
        }

    }

}
