// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class CompareFacesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("ResultObject")
    @Validation(required = true)
    public CompareFacesResponseResultObject resultObject;

    public static CompareFacesResponse build(java.util.Map<String, ?> map) throws Exception {
        CompareFacesResponse self = new CompareFacesResponse();
        return TeaModel.build(map, self);
    }

    public CompareFacesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompareFacesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CompareFacesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CompareFacesResponse setResultObject(CompareFacesResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CompareFacesResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class CompareFacesResponseResultObject extends TeaModel {
        @NameInMap("SimilarityScore")
        @Validation(required = true)
        public Float similarityScore;

        @NameInMap("ConfidenceThresholds")
        @Validation(required = true)
        public String confidenceThresholds;

        public static CompareFacesResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            CompareFacesResponseResultObject self = new CompareFacesResponseResultObject();
            return TeaModel.build(map, self);
        }

        public CompareFacesResponseResultObject setSimilarityScore(Float similarityScore) {
            this.similarityScore = similarityScore;
            return this;
        }
        public Float getSimilarityScore() {
            return this.similarityScore;
        }

        public CompareFacesResponseResultObject setConfidenceThresholds(String confidenceThresholds) {
            this.confidenceThresholds = confidenceThresholds;
            return this;
        }
        public String getConfidenceThresholds() {
            return this.confidenceThresholds;
        }

    }

}
