// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class CompareFacesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public CompareFacesResponseBodyResultObject resultObject;

    public static CompareFacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompareFacesResponseBody self = new CompareFacesResponseBody();
        return TeaModel.build(map, self);
    }

    public CompareFacesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CompareFacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CompareFacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompareFacesResponseBody setResultObject(CompareFacesResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CompareFacesResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class CompareFacesResponseBodyResultObject extends TeaModel {
        @NameInMap("SimilarityScore")
        public Float similarityScore;

        @NameInMap("ConfidenceThresholds")
        public String confidenceThresholds;

        public static CompareFacesResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            CompareFacesResponseBodyResultObject self = new CompareFacesResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public CompareFacesResponseBodyResultObject setSimilarityScore(Float similarityScore) {
            this.similarityScore = similarityScore;
            return this;
        }
        public Float getSimilarityScore() {
            return this.similarityScore;
        }

        public CompareFacesResponseBodyResultObject setConfidenceThresholds(String confidenceThresholds) {
            this.confidenceThresholds = confidenceThresholds;
            return this;
        }
        public String getConfidenceThresholds() {
            return this.confidenceThresholds;
        }

    }

}
