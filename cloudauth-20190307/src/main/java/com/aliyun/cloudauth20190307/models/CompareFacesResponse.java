// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CompareFacesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public CompareFacesResponseData data;

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

    public CompareFacesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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

    public CompareFacesResponse setData(CompareFacesResponseData data) {
        this.data = data;
        return this;
    }
    public CompareFacesResponseData getData() {
        return this.data;
    }

    public static class CompareFacesResponseData extends TeaModel {
        @NameInMap("SimilarityScore")
        @Validation(required = true)
        public Float similarityScore;

        @NameInMap("ConfidenceThresholds")
        @Validation(required = true)
        public String confidenceThresholds;

        public static CompareFacesResponseData build(java.util.Map<String, ?> map) throws Exception {
            CompareFacesResponseData self = new CompareFacesResponseData();
            return TeaModel.build(map, self);
        }

        public CompareFacesResponseData setSimilarityScore(Float similarityScore) {
            this.similarityScore = similarityScore;
            return this;
        }
        public Float getSimilarityScore() {
            return this.similarityScore;
        }

        public CompareFacesResponseData setConfidenceThresholds(String confidenceThresholds) {
            this.confidenceThresholds = confidenceThresholds;
            return this;
        }
        public String getConfidenceThresholds() {
            return this.confidenceThresholds;
        }

    }

}
