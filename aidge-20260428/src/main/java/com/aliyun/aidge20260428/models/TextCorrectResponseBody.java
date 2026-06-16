// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class TextCorrectResponseBody extends TeaModel {
    /**
     * <p>Response code. Returns &quot;success&quot; during normal calls.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Intelligent error correction result data.</p>
     */
    @NameInMap("Data")
    public TextCorrectResponseBodyData data;

    /**
     * <p>Error message. Returns &quot;Success&quot; during normal calls. Returns specific error information during exceptions, such as &quot;The parameters contain sensitive information. Please try a different input.&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID, used to identify a unique request call.</p>
     * 
     * <strong>example:</strong>
     * <p>32882AD0-50D1-1D90-A221-3987325EC03E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the call was successful. true indicates success, false indicates failure.</p>
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
         * <p>Usage information, including the number of input characters.</p>
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
