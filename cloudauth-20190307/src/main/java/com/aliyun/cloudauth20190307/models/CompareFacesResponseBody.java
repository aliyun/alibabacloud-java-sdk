// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CompareFacesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public CompareFacesResponseBodyData data;

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

    public CompareFacesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CompareFacesResponseBody setData(CompareFacesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CompareFacesResponseBodyData getData() {
        return this.data;
    }

    public static class CompareFacesResponseBodyData extends TeaModel {
        @NameInMap("SimilarityScore")
        public Float similarityScore;

        @NameInMap("ConfidenceThresholds")
        public String confidenceThresholds;

        public static CompareFacesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CompareFacesResponseBodyData self = new CompareFacesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CompareFacesResponseBodyData setSimilarityScore(Float similarityScore) {
            this.similarityScore = similarityScore;
            return this;
        }
        public Float getSimilarityScore() {
            return this.similarityScore;
        }

        public CompareFacesResponseBodyData setConfidenceThresholds(String confidenceThresholds) {
            this.confidenceThresholds = confidenceThresholds;
            return this;
        }
        public String getConfidenceThresholds() {
            return this.confidenceThresholds;
        }

    }

}
