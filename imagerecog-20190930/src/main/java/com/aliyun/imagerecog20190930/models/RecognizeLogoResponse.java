// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeLogoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeLogoResponseData data;

    public static RecognizeLogoResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeLogoResponse self = new RecognizeLogoResponse();
        return TeaModel.build(map, self);
    }

    public static class RecognizeLogoResponseDataElementsResultsLogosData extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("X")
        @Validation(required = true)
        public Double x;

        @NameInMap("Y")
        @Validation(required = true)
        public Double y;

        @NameInMap("H")
        @Validation(required = true)
        public Double h;

        @NameInMap("W")
        @Validation(required = true)
        public Double w;

        public static RecognizeLogoResponseDataElementsResultsLogosData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLogoResponseDataElementsResultsLogosData self = new RecognizeLogoResponseDataElementsResultsLogosData();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeLogoResponseDataElementsResults extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("Rate")
        @Validation(required = true)
        public Double rate;

        @NameInMap("LogosData")
        @Validation(required = true)
        public java.util.List<RecognizeLogoResponseDataElementsResultsLogosData> logosData;

        public static RecognizeLogoResponseDataElementsResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLogoResponseDataElementsResults self = new RecognizeLogoResponseDataElementsResults();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeLogoResponseDataElements extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        @NameInMap("Results")
        @Validation(required = true)
        public java.util.List<RecognizeLogoResponseDataElementsResults> results;

        public static RecognizeLogoResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLogoResponseDataElements self = new RecognizeLogoResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeLogoResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<RecognizeLogoResponseDataElements> elements;

        public static RecognizeLogoResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLogoResponseData self = new RecognizeLogoResponseData();
            return TeaModel.build(map, self);
        }

    }

}
