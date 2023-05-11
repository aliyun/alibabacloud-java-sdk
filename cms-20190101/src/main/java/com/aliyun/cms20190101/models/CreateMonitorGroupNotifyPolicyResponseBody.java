// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupNotifyPolicyResponseBody extends TeaModel {
    /**
     * <p>The number of entries that are returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the call succeeds. Valid values:</p>
     * <br>
     * <p>*   true: The call succeeds.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>If the policy is valid, no alert notifications are sent for the application group.</p>
     * <br>
     * <p>This topic describes how to create the `PauseNotify` policy to pause alert notifications for the `7301****` application group. The StartTime parameter is set to `1622949300000` and the EndTime parameter is set to `1623208500000`. This indicates that the policy is valid from `2021-06-06 11:15:00 UTC+8` to `2021-06-09 11:15:00 UTC+8`.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
     */
    @NameInMap("Result")
    public Integer result;

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
