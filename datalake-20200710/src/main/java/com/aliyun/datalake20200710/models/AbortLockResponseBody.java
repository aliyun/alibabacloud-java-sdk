// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class AbortLockResponseBody extends TeaModel {
    /**
     * <p>Code</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>RequestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Success</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AbortLockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbortLockResponseBody self = new AbortLockResponseBody();
        return TeaModel.build(map, self);
    }

    public AbortLockResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AbortLockResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AbortLockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AbortLockResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
