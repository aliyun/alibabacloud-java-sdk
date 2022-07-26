// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetLockResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LockStatus")
    public LockStatus lockStatus;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetLockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLockResponseBody self = new GetLockResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLockResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLockResponseBody setLockStatus(LockStatus lockStatus) {
        this.lockStatus = lockStatus;
        return this;
    }
    public LockStatus getLockStatus() {
        return this.lockStatus;
    }

    public GetLockResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLockResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
