// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetLockResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The lock status information.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;lockId&quot;:123,&quot;lockStatus&quot;:&quot;Acquired&quot;}</p>
     */
    @NameInMap("LockStatus")
    public LockStatus lockStatus;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>558D764F-8C55-49CA-BF38-80EA532FC08F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
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
