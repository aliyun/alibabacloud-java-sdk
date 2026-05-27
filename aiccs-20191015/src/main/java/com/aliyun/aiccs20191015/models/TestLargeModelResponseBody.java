// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class TestLargeModelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<TestLargeModelResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>F2051E18-FF3F-5C08-8D24-6F150D2AF757</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <p>错误信息</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;code\&quot;:\&quot;InvalidApiKey\&quot;,\&quot;message\&quot;:\&quot;Invalid API-key provided.\&quot;,\&quot;request_id\&quot;:\&quot;dd14065e-3dd5-90a1-b8ee-d6c80891defe\&quot;}</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>模型版本号</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ModelVersion")
        public String modelVersion;

        /**
         * <p>输出结果</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>是否成功</p>
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
