// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchRegisterDeviceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public BatchRegisterDeviceResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchRegisterDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchRegisterDeviceResponseBody self = new BatchRegisterDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchRegisterDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchRegisterDeviceResponseBody setData(BatchRegisterDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchRegisterDeviceResponseBodyData getData() {
        return this.data;
    }

    public BatchRegisterDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchRegisterDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchRegisterDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchRegisterDeviceResponseBodyData extends TeaModel {
        /**
         * <p>The application ID (ApplyId) returned for the request if the call is successful.</p>
         */
        @NameInMap("ApplyId")
        public Long applyId;

        public static BatchRegisterDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchRegisterDeviceResponseBodyData self = new BatchRegisterDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchRegisterDeviceResponseBodyData setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

    }

}
