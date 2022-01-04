// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RefreshLockResponseBody extends TeaModel {
    // Code
    @NameInMap("Code")
    public String code;

    // Message
    @NameInMap("Message")
    public String message;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // Success
    @NameInMap("Success")
    public Boolean success;

    public static RefreshLockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshLockResponseBody self = new RefreshLockResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshLockResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RefreshLockResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RefreshLockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshLockResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
