// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectSkinDiseaseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectSkinDiseaseResponseBodyData data;

    public static DetectSkinDiseaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectSkinDiseaseResponseBody self = new DetectSkinDiseaseResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectSkinDiseaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectSkinDiseaseResponseBody setData(DetectSkinDiseaseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectSkinDiseaseResponseBodyData getData() {
        return this.data;
    }

    public static class DetectSkinDiseaseResponseBodyData extends TeaModel {
        @NameInMap("Results")
        public java.util.Map<String, ?> results;

        public static DetectSkinDiseaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectSkinDiseaseResponseBodyData self = new DetectSkinDiseaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectSkinDiseaseResponseBodyData setResults(java.util.Map<String, ?> results) {
            this.results = results;
            return this;
        }
        public java.util.Map<String, ?> getResults() {
            return this.results;
        }

    }

}
