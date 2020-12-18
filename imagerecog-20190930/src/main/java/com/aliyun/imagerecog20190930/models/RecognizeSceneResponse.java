// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeSceneResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeSceneResponseData data;

    public static RecognizeSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeSceneResponse self = new RecognizeSceneResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeSceneResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeSceneResponse setData(RecognizeSceneResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeSceneResponseData getData() {
        return this.data;
    }

    public static class RecognizeSceneResponseDataTags extends TeaModel {
        @NameInMap("Confidence")
        @Validation(required = true)
        public Float confidence;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static RecognizeSceneResponseDataTags build(java.util.Map<String, ?> map) throws Exception {
            RecognizeSceneResponseDataTags self = new RecognizeSceneResponseDataTags();
            return TeaModel.build(map, self);
        }

        public RecognizeSceneResponseDataTags setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public RecognizeSceneResponseDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class RecognizeSceneResponseData extends TeaModel {
        @NameInMap("Tags")
        @Validation(required = true)
        public java.util.List<RecognizeSceneResponseDataTags> tags;

        public static RecognizeSceneResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeSceneResponseData self = new RecognizeSceneResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeSceneResponseData setTags(java.util.List<RecognizeSceneResponseDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<RecognizeSceneResponseDataTags> getTags() {
            return this.tags;
        }

    }

}
