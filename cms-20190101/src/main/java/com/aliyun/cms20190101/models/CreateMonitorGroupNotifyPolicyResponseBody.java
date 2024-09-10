// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupNotifyPolicyResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p> The HTTP status code 200 indicates that the call succeeds.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The Request is not authorization.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>13356BCA-3EC3-4748-A771-2064DA69AEF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Result")
    public Integer result;

    /**
     * <p>Indicates whether the call succeeds. Valid values:</p>
     * <ul>
     * <li>true: The call succeeds.</li>
     * <li>false: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
