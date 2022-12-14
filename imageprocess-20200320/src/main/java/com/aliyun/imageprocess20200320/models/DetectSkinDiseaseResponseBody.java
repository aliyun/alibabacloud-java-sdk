// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectSkinDiseaseResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectSkinDiseaseResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectSkinDiseaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectSkinDiseaseResponseBody self = new DetectSkinDiseaseResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectSkinDiseaseResponseBody setData(DetectSkinDiseaseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectSkinDiseaseResponseBodyData getData() {
        return this.data;
    }

    public DetectSkinDiseaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectSkinDiseaseResponseBodyData extends TeaModel {
        @NameInMap("BodyPart")
        public String bodyPart;

        @NameInMap("ImageQuality")
        public Float imageQuality;

        @NameInMap("ImageType")
        public String imageType;

        @NameInMap("Results")
        public java.util.Map<String, ?> results;

        @NameInMap("ResultsEnglish")
        public java.util.Map<String, ?> resultsEnglish;

        public static DetectSkinDiseaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectSkinDiseaseResponseBodyData self = new DetectSkinDiseaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectSkinDiseaseResponseBodyData setBodyPart(String bodyPart) {
            this.bodyPart = bodyPart;
            return this;
        }
        public String getBodyPart() {
            return this.bodyPart;
        }

        public DetectSkinDiseaseResponseBodyData setImageQuality(Float imageQuality) {
            this.imageQuality = imageQuality;
            return this;
        }
        public Float getImageQuality() {
            return this.imageQuality;
        }

        public DetectSkinDiseaseResponseBodyData setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public DetectSkinDiseaseResponseBodyData setResults(java.util.Map<String, ?> results) {
            this.results = results;
            return this;
        }
        public java.util.Map<String, ?> getResults() {
            return this.results;
        }

        public DetectSkinDiseaseResponseBodyData setResultsEnglish(java.util.Map<String, ?> resultsEnglish) {
            this.resultsEnglish = resultsEnglish;
            return this;
        }
        public java.util.Map<String, ?> getResultsEnglish() {
            return this.resultsEnglish;
        }

    }

}
