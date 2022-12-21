// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GrantUserPermissionResponseBody extends TeaModel {
    // The error code.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   true: The request was successful.
    // *   false: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static GrantUserPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantUserPermissionResponseBody self = new GrantUserPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantUserPermissionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GrantUserPermissionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GrantUserPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GrantUserPermissionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
