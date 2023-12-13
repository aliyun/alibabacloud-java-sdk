// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupNotifyPolicyResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The HTTP status code 200 indicates that the call succeeds.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries that are returned.</p>
     */
    @NameInMap("Result")
    public Integer result;

    /**
     * <p>Indicates whether the call succeeds. Valid values:</p>
     * <br>
     * <p>*   true: The call succeeds.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Success")
    public String success;

    public static CreateMonitorGroupNotifyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupNotifyPolicyResponseBody self = new CreateMonitorGroupNotifyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMonitorGroupNotifyPolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMonitorGroupNotifyPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMonitorGroupNotifyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMonitorGroupNotifyPolicyResponseBody setResult(Integer result) {
        this.result = result;
        return this;
    }
    public Integer getResult() {
        return this.result;
    }

    public CreateMonitorGroupNotifyPolicyResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
