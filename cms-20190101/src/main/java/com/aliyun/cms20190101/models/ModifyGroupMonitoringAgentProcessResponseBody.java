// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyGroupMonitoringAgentProcessResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
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
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyGroupMonitoringAgentProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyGroupMonitoringAgentProcessResponseBody self = new ModifyGroupMonitoringAgentProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyGroupMonitoringAgentProcessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyGroupMonitoringAgentProcessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyGroupMonitoringAgentProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyGroupMonitoringAgentProcessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
