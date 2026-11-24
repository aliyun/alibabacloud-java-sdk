// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class TextCorrectResponseBody extends TeaModel {
    /**
     * <p>The response code. &quot;success&quot; is returned for successful calls.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The intelligent correction result data.</p>
     */
    @NameInMap("Data")
    public TextCorrectResponseBodyData data;

    /**
     * <p>The error message. &quot;Success&quot; is returned for successful calls. For failed calls, a specific error message is returned, such as &quot;The parameter contains sensitive information. Please try another input.&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which is used to uniquely identify a request.</p>
     * 
     * <strong>example:</strong>
     * <p>32882AD0-50D1-1D90-A221-3987325EC03E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success, and a value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static TextCorrectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TextCorrectResponseBody self = new TextCorrectResponseBody();
        return TeaModel.build(map, self);
    }

    public TextCorrectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TextCorrectResponseBody setData(TextCorrectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TextCorrectResponseBodyData getData() {
        return this.data;
    }

    public TextCorrectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TextCorrectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TextCorrectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TextCorrectResponseBodyData extends TeaModel {
        /**
         * <p>The corrected text.</p>
         * 
         * <strong>example:</strong>
         * <p>Empfehlung</p>
         */
        @NameInMap("CorrectedText")
        public String correctedText;

        /**
         * <p>The usage information, including the number of input characters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;InputCharacterCount&quot;:9}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static TextCorrectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TextCorrectResponseBodyData self = new TextCorrectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TextCorrectResponseBodyData setCorrectedText(String correctedText) {
            this.correctedText = correctedText;
            return this;
        }
        public String getCorrectedText() {
            return this.correctedText;
        }

        public TextCorrectResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
