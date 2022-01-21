// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentConfigResponseBody extends TeaModel {
    @NameInMap("AutoInstall")
    public Boolean autoInstall;

    @NameInMap("Code")
    public String code;

    @NameInMap("EnableActiveAlert")
    public String enableActiveAlert;

    @NameInMap("EnableInstallAgentNewECS")
    public Boolean enableInstallAgentNewECS;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
