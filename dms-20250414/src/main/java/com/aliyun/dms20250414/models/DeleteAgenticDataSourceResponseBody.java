// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteAgenticDataSourceResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the deletion was successful.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The error code returned when the call fails. This field is empty when the call succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the call fails. This field is empty when the call succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>The parameter is invalid</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request. You can use this ID to trace the call.</p>
     * 
     * <strong>example:</strong>
     * <p>request-1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteAgenticDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticDataSourceResponseBody self = new DeleteAgenticDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticDataSourceResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteAgenticDataSourceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteAgenticDataSourceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteAgenticDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAgenticDataSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
