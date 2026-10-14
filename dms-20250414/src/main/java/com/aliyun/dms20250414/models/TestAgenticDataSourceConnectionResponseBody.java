// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class TestAgenticDataSourceConnectionResponseBody extends TeaModel {
    /**
     * <p>The connection test result.</p>
     */
    @NameInMap("Data")
    public TestAgenticDataSourceConnectionResponseBodyData data;

    /**
     * <p>The error code returned when the call fails. This parameter is empty when the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the call fails. This parameter is empty when the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>The parameter is invalid</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID, which is used to locate the current call.</p>
     * 
     * <strong>example:</strong>
     * <p>request-1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the current call is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static TestAgenticDataSourceConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestAgenticDataSourceConnectionResponseBody self = new TestAgenticDataSourceConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public TestAgenticDataSourceConnectionResponseBody setData(TestAgenticDataSourceConnectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TestAgenticDataSourceConnectionResponseBodyData getData() {
        return this.data;
    }

    public TestAgenticDataSourceConnectionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TestAgenticDataSourceConnectionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public TestAgenticDataSourceConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestAgenticDataSourceConnectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TestAgenticDataSourceConnectionResponseBodyData extends TeaModel {
        /**
         * <p>The description of the connection test result. This parameter is usually empty when the connection is successful, and returns the cause when the connection fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Connection timed out. Check the connection endpoint</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the data source is connected.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static TestAgenticDataSourceConnectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TestAgenticDataSourceConnectionResponseBodyData self = new TestAgenticDataSourceConnectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TestAgenticDataSourceConnectionResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public TestAgenticDataSourceConnectionResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
