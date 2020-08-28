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

    public static class RecognizeSceneResponseDataTags extends TeaModel {
        @NameInMap("Confidence")
        @Validation(required = true)
        public Double confidence;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static RecognizeSceneResponseDataTags build(java.util.Map<String, ?> map) throws Exception {
            RecognizeSceneResponseDataTags self = new RecognizeSceneResponseDataTags();
            return TeaModel.build(map, self);
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

    }

}
