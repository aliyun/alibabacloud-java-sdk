// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectSkinDiseaseResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectSkinDiseaseResponseData data;

    public static DetectSkinDiseaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectSkinDiseaseResponse self = new DetectSkinDiseaseResponse();
        return TeaModel.build(map, self);
    }

    public DetectSkinDiseaseResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectSkinDiseaseResponse setData(DetectSkinDiseaseResponseData data) {
        this.data = data;
        return this;
    }
    public DetectSkinDiseaseResponseData getData() {
        return this.data;
    }

    public static class DetectSkinDiseaseResponseData extends TeaModel {
        @NameInMap("Results")
        @Validation(required = true)
        public java.util.Map<String, ?> results;

        public static DetectSkinDiseaseResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectSkinDiseaseResponseData self = new DetectSkinDiseaseResponseData();
            return TeaModel.build(map, self);
        }

        public DetectSkinDiseaseResponseData setResults(java.util.Map<String, ?> results) {
            this.results = results;
            return this;
        }
        public java.util.Map<String, ?> getResults() {
            return this.results;
        }

    }

}
