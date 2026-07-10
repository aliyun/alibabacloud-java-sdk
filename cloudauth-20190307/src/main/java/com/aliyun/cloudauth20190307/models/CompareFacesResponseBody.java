// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CompareFacesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The face comparison result.</p>
     */
    @NameInMap("Data")
    public CompareFacesResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Error.InternalError</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
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
         * <p>The confidence thresholds for face comparison. The returned content is a JSON object with the structure <code>&quot;key&quot;:&quot;value&quot;</code>.</p>
         * <ul>
         * <li><code>key</code> is the false acceptance rate (FAR), which is the probability of incorrectly identifying another person as the specified person.</li>
         * <li><code>value</code> is the corresponding threshold.</li>
         * </ul>
         * <blockquote>
         * <p>About the confidence thresholds (confidenceThresholds) in the example:</p>
         * </blockquote>
         * <ul>
         * <li><code>&quot;0.0001&quot;: &quot;90.07&quot;</code> indicates that the corresponding threshold is 90.07 when the FAR is 0.01%.</li>
         * <li><code>&quot;0.001&quot;: &quot;80.01&quot;</code> indicates that the corresponding threshold is 80.01 when the FAR is 0.1%.</li>
         * <li><code>&quot;0.01&quot;: &quot;70.02&quot;</code> indicates that the corresponding threshold is 70.02 when the FAR is 1%.</li>
         * </ul>
         * <p>The confidence thresholds are dynamically generated based on different images and algorithms. Do not persist the confidence thresholds.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;0.0001&quot;:&quot;90.07&quot;,&quot;0.001&quot;:&quot;80.01&quot;,&quot;0.01&quot;:&quot;70.02&quot;}</p>
         */
        @NameInMap("ConfidenceThresholds")
        public String confidenceThresholds;

        /**
         * <p>The similarity score between the faces in the two images. Valid values: [0, 100]. A higher value indicates a greater similarity.</p>
         * 
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
