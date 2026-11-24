// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class LanguageDetectResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 200 indicates a successful call. For other response codes, refer to the error code information.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The language detection result data, which includes the detected language and usage information.</p>
     */
    @NameInMap("Data")
    public LanguageDetectResponseBodyData data;

    /**
     * <p>The error message. &quot;Success&quot; is returned for normal calls. For exceptions, a specific error message is returned, such as &quot;The parameter contains sensitive information. Try another input.&quot;</p>
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
     * <p>42542C6C-F2A4-1B2B-8EFF-130C8FD06F54</p>
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

    public static LanguageDetectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LanguageDetectResponseBody self = new LanguageDetectResponseBody();
        return TeaModel.build(map, self);
    }

    public LanguageDetectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LanguageDetectResponseBody setData(LanguageDetectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public LanguageDetectResponseBodyData getData() {
        return this.data;
    }

    public LanguageDetectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LanguageDetectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LanguageDetectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class LanguageDetectResponseBodyData extends TeaModel {
        /**
         * <p>The code of the detected language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("DetectedLanguage")
        public String detectedLanguage;

        /**
         * <p>The usage information, which includes the number of input characters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;InputCharacterCount&quot;:4}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static LanguageDetectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            LanguageDetectResponseBodyData self = new LanguageDetectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public LanguageDetectResponseBodyData setDetectedLanguage(String detectedLanguage) {
            this.detectedLanguage = detectedLanguage;
            return this;
        }
        public String getDetectedLanguage() {
            return this.detectedLanguage;
        }

        public LanguageDetectResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
