// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class TestLargeModelResponseBody extends TeaModel {
    /**
     * <p>The authentication error details.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code. A value of OK indicates that the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data list.</p>
     */
    @NameInMap("Data")
    public java.util.List<TestLargeModelResponseBodyData> data;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F2051E18-FF3F-5C08-8D24-6F150D2AF757</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Successful.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static TestLargeModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestLargeModelResponseBody self = new TestLargeModelResponseBody();
        return TeaModel.build(map, self);
    }

    public TestLargeModelResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public TestLargeModelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TestLargeModelResponseBody setData(java.util.List<TestLargeModelResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<TestLargeModelResponseBodyData> getData() {
        return this.data;
    }

    public TestLargeModelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TestLargeModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestLargeModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TestLargeModelResponseBodyData extends TeaModel {
        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;code\&quot;:\&quot;InvalidApiKey\&quot;,\&quot;message\&quot;:\&quot;Invalid API-key provided.\&quot;,\&quot;request_id\&quot;:\&quot;dd14065e-3dd5-90a1-b8ee-d6c80891defe\&quot;}</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The model version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ModelVersion")
        public String modelVersion;

        /**
         * <p>The output result.</p>
         * 
         * <strong>example:</strong>
         * <p>⌈Hello! I am the AI assistant on the Alibaba Cloud website.\n\nYour input seems incomplete. What specific information about Alibaba Cloud would you like to know?\n\nFor example:\n*   What are the core products of Alibaba Cloud (such as ECS, RDS, OSS, etc.)?\n*   How do I purchase or renew a cloud server?\n*   What security protection capabilities does Alibaba Cloud offer?\n*   How do I get technical support or view documentation?\n\nFeel free to ask your specific questions, and I will answer them for you!⌋</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>Indicates whether the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static TestLargeModelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TestLargeModelResponseBodyData self = new TestLargeModelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TestLargeModelResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public TestLargeModelResponseBodyData setModelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            return this;
        }
        public String getModelVersion() {
            return this.modelVersion;
        }

        public TestLargeModelResponseBodyData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public TestLargeModelResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
