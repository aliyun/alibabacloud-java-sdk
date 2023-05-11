// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchBindDeviceToEdgeInstanceWithDriverResponseBody extends TeaModel {
    /**
     * <p>The error message that is returned if the call failed.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates that the call was successful. A value of false indicates that the call failed.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchBindDeviceToEdgeInstanceWithDriverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchBindDeviceToEdgeInstanceWithDriverResponseBody self = new BatchBindDeviceToEdgeInstanceWithDriverResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchBindDeviceToEdgeInstanceWithDriverResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchBindDeviceToEdgeInstanceWithDriverResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchBindDeviceToEdgeInstanceWithDriverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchBindDeviceToEdgeInstanceWithDriverResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
