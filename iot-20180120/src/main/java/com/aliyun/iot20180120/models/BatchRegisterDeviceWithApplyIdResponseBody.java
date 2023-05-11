// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchRegisterDeviceWithApplyIdResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned if the call succeeds. For more information, see the following parameters.</p>
     */
    @NameInMap("Data")
    public BatchRegisterDeviceWithApplyIdResponseBodyData data;

    /**
     * <p>The error message returned if the request fails.</p>
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

    public static BatchRegisterDeviceWithApplyIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchRegisterDeviceWithApplyIdResponseBody self = new BatchRegisterDeviceWithApplyIdResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchRegisterDeviceWithApplyIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchRegisterDeviceWithApplyIdResponseBody setData(BatchRegisterDeviceWithApplyIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchRegisterDeviceWithApplyIdResponseBodyData getData() {
        return this.data;
    }

    public BatchRegisterDeviceWithApplyIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchRegisterDeviceWithApplyIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchRegisterDeviceWithApplyIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchRegisterDeviceWithApplyIdResponseBodyData extends TeaModel {
        /**
         * <p>The application ID.</p>
         */
        @NameInMap("ApplyId")
        public Long applyId;

        public static BatchRegisterDeviceWithApplyIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchRegisterDeviceWithApplyIdResponseBodyData self = new BatchRegisterDeviceWithApplyIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchRegisterDeviceWithApplyIdResponseBodyData setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

    }

}
