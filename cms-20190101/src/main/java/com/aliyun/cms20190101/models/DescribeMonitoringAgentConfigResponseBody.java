// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentConfigResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the Cloud Monitor agent is automatically installed on existing Elastic Compute Service (ECS) instances. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("AutoInstall")
    public Boolean autoInstall;

    /**
     * <p>The status code.</p>
     * <br>
     * <p>>  The status code 200 indicates a success.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The service for which one-click alert is enabled.</p>
     */
    @NameInMap("EnableActiveAlert")
    public String enableActiveAlert;

    /**
     * <p>Indicates whether the Cloud Monitor agent is automatically installed on new ECS instances. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("EnableInstallAgentNewECS")
    public Boolean enableInstallAgentNewECS;

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
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <br>
     * <p>*   true: successful.</p>
     * <p>*   false: failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeMonitoringAgentConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentConfigResponseBody self = new DescribeMonitoringAgentConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringAgentConfigResponseBody setAutoInstall(Boolean autoInstall) {
        this.autoInstall = autoInstall;
        return this;
    }
    public Boolean getAutoInstall() {
        return this.autoInstall;
    }

    public DescribeMonitoringAgentConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMonitoringAgentConfigResponseBody setEnableActiveAlert(String enableActiveAlert) {
        this.enableActiveAlert = enableActiveAlert;
        return this;
    }
    public String getEnableActiveAlert() {
        return this.enableActiveAlert;
    }

    public DescribeMonitoringAgentConfigResponseBody setEnableInstallAgentNewECS(Boolean enableInstallAgentNewECS) {
        this.enableInstallAgentNewECS = enableInstallAgentNewECS;
        return this;
    }
    public Boolean getEnableInstallAgentNewECS() {
        return this.enableInstallAgentNewECS;
    }

    public DescribeMonitoringAgentConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMonitoringAgentConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitoringAgentConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
