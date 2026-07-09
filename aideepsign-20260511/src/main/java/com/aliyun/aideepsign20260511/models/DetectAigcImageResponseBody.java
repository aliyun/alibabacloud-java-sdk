// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class DetectAigcImageResponseBody extends TeaModel {
    /**
     * <p>The list of AIGC detection result labels.</p>
     */
    @NameInMap("Body")
    public java.util.List<DetectAigcImageResponseBodyBody> body;

    /**
     * <p>The business error code. The value <code>OK</code> is returned if the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code. The value <code>200</code> is returned if the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The additional information. The value <code>success</code> is returned if the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DetectAigcImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectAigcImageResponseBody self = new DetectAigcImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectAigcImageResponseBody setBody(java.util.List<DetectAigcImageResponseBodyBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<DetectAigcImageResponseBodyBody> getBody() {
        return this.body;
    }

    public DetectAigcImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DetectAigcImageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DetectAigcImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetectAigcImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectAigcImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DetectAigcImageResponseBodyBody extends TeaModel {
        /**
         * <p>The confidence level. Value range: 0 to 1. A higher value indicates a higher probability.</p>
         * 
         * <strong>example:</strong>
         * <p>0.51</p>
         */
        @NameInMap("Confidence")
        public String confidence;

        /**
         * <p>The detection label. Valid values:</p>
         * <ul>
         * <li><code>ai_generated</code>: AI-generated.</li>
         * <li><code>non_ai_generated</code>: Not AI-generated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ai_generated</p>
         */
        @NameInMap("Label")
        public String label;

        public static DetectAigcImageResponseBodyBody build(java.util.Map<String, ?> map) throws Exception {
            DetectAigcImageResponseBodyBody self = new DetectAigcImageResponseBodyBody();
            return TeaModel.build(map, self);
        }

        public DetectAigcImageResponseBodyBody setConfidence(String confidence) {
            this.confidence = confidence;
            return this;
        }
        public String getConfidence() {
            return this.confidence;
        }

        public DetectAigcImageResponseBodyBody setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

}
