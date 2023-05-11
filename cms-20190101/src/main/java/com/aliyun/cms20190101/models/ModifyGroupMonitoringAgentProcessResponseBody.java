// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyGroupMonitoringAgentProcessResponseBody extends TeaModel {
    /**
     * <p>The number of times for which the threshold can be consecutively exceeded. Valid values of N: 1 to 200. Default value: 3.</p>
     * <br>
     * <p>>  A metric triggers an alert only after the metric value reaches the threshold consecutively for the specified times.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
