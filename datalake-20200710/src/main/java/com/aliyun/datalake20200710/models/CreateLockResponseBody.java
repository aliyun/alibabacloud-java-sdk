// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateLockResponseBody extends TeaModel {
    // Code
    @NameInMap("Code")
    public String code;

    @NameInMap("LockStatus")
    public LockStatus lockStatus;

    // Message
    @NameInMap("Message")
    public String message;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // Success
    @NameInMap("Success")
    public Boolean success;

    public static CreateLockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLockResponseBody self = new CreateLockResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLockResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateLockResponseBody setLockStatus(LockStatus lockStatus) {
        this.lockStatus = lockStatus;
        return this;
    }
    public LockStatus getLockStatus() {
        return this.lockStatus;
    }

    public CreateLockResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLockResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
