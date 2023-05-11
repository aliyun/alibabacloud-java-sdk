// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class UninstallMonitoringAgentResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>>  This API operation is not applicable to ECS instances. To uninstall the agent from an ECS instance, see [Install and uninstall the Cloud Monitor agent](~~183482~~).</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UninstallMonitoringAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallMonitoringAgentResponseBody self = new UninstallMonitoringAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallMonitoringAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UninstallMonitoringAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UninstallMonitoringAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UninstallMonitoringAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
