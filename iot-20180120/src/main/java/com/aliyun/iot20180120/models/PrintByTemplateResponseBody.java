// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PrintByTemplateResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of the printing operation.</p>
     */
    @NameInMap("Data")
    public PrintByTemplateResponseBodyData data;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PrintByTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PrintByTemplateResponseBody self = new PrintByTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public PrintByTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PrintByTemplateResponseBody setData(PrintByTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PrintByTemplateResponseBodyData getData() {
        return this.data;
    }

    public PrintByTemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public PrintByTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PrintByTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PrintByTemplateResponseBodyData extends TeaModel {
        /**
         * <p>The error code returned by the printer. Valid values:</p>
         * <br>
         * <p>*   2: The printer ran out of paper.</p>
         * <p>*   3: A paper jam occurred in the printer.</p>
         */
        @NameInMap("DeviceErrorCode")
        public String deviceErrorCode;

        /**
         * <p>The error message returned by the printer.</p>
         */
        @NameInMap("DeviceErrorMessage")
        public String deviceErrorMessage;

        /**
         * <p>The ID of the printing operation.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The maximum number of retries. The value is fixed at 2, which indicates that up to two printing retries are supported.</p>
         * <br>
         * <p>If the printer responds to the printing command with a failure or timeout error, IoT Platform delivers the printing command to the printer.</p>
         */
        @NameInMap("MaxRetryCount")
        public Integer maxRetryCount;

        /**
         * <p>The actual number of retries.</p>
         */
        @NameInMap("RetryCount")
        public Integer retryCount;

        /**
         * <p>Indicates whether the printing operation was successful.</p>
         * <br>
         * <p>*   **true**: The printing operation was successful.</p>
         * <p>*   **false**: The printing operation failed.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static PrintByTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PrintByTemplateResponseBodyData self = new PrintByTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PrintByTemplateResponseBodyData setDeviceErrorCode(String deviceErrorCode) {
            this.deviceErrorCode = deviceErrorCode;
            return this;
        }
        public String getDeviceErrorCode() {
            return this.deviceErrorCode;
        }

        public PrintByTemplateResponseBodyData setDeviceErrorMessage(String deviceErrorMessage) {
            this.deviceErrorMessage = deviceErrorMessage;
            return this;
        }
        public String getDeviceErrorMessage() {
            return this.deviceErrorMessage;
        }

        public PrintByTemplateResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PrintByTemplateResponseBodyData setMaxRetryCount(Integer maxRetryCount) {
            this.maxRetryCount = maxRetryCount;
            return this;
        }
        public Integer getMaxRetryCount() {
            return this.maxRetryCount;
        }

        public PrintByTemplateResponseBodyData setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public PrintByTemplateResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
