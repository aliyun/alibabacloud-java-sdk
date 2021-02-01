// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeSceneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizeSceneResponseBodyData data;

    public static RecognizeSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeSceneResponseBody self = new RecognizeSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeSceneResponseBody setData(RecognizeSceneResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeSceneResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizeSceneResponseBodyDataTags extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Confidence")
        public Float confidence;

        public static RecognizeSceneResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            RecognizeSceneResponseBodyDataTags self = new RecognizeSceneResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public RecognizeSceneResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public RecognizeSceneResponseBodyDataTags setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

    }

    public static class RecognizeSceneResponseBodyData extends TeaModel {
        @NameInMap("Tags")
        public java.util.List<RecognizeSceneResponseBodyDataTags> tags;

        public static RecognizeSceneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeSceneResponseBodyData self = new RecognizeSceneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeSceneResponseBodyData setTags(java.util.List<RecognizeSceneResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<RecognizeSceneResponseBodyDataTags> getTags() {
            return this.tags;
        }

    }

}
