// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CompareFacesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CompareFacesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Error.InternalError</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public CompareFacesResponseBody setData(CompareFacesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CompareFacesResponseBodyData getData() {
        return this.data;
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

    public static class CompareFacesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;0.0001&quot;:&quot;90.07&quot;,&quot;0.001&quot;:&quot;80.01&quot;,&quot;0.01&quot;:&quot;70.02&quot;}</p>
         */
        @NameInMap("ConfidenceThresholds")
        public String confidenceThresholds;

        /**
         * <strong>example:</strong>
         * <p>98.7913</p>
         */
        @NameInMap("SimilarityScore")
        public Float similarityScore;

        public static CompareFacesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CompareFacesResponseBodyData self = new CompareFacesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CompareFacesResponseBodyData setConfidenceThresholds(String confidenceThresholds) {
            this.confidenceThresholds = confidenceThresholds;
            return this;
        }
        public String getConfidenceThresholds() {
            return this.confidenceThresholds;
        }

        public CompareFacesResponseBodyData setSimilarityScore(Float similarityScore) {
            this.similarityScore = similarityScore;
            return this;
        }
        public Float getSimilarityScore() {
            return this.similarityScore;
        }

    }

}
