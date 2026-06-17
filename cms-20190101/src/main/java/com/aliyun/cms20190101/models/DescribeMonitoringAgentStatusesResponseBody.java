// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentStatusesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
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
     * <p>The specified resource is not found.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("NodeStatusList")
    public DescribeMonitoringAgentStatusesResponseBodyNodeStatusList nodeStatusList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6F8371DF-AB81-41B8-9E1B-5493B3FF0E4F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeMonitoringAgentStatusesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentStatusesResponseBody self = new DescribeMonitoringAgentStatusesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringAgentStatusesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMonitoringAgentStatusesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMonitoringAgentStatusesResponseBody setNodeStatusList(DescribeMonitoringAgentStatusesResponseBodyNodeStatusList nodeStatusList) {
        this.nodeStatusList = nodeStatusList;
        return this;
    }
    public DescribeMonitoringAgentStatusesResponseBodyNodeStatusList getNodeStatusList() {
        return this.nodeStatusList;
    }

    public DescribeMonitoringAgentStatusesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitoringAgentStatusesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus extends TeaModel {
        @NameInMap("AgentInstallErrorCode")
        public String agentInstallErrorCode;

        @NameInMap("AutoInstall")
        public Boolean autoInstall;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LoongCollectorStatus")
        public String loongCollectorStatus;

        @NameInMap("LoongCollectorVersion")
        public String loongCollectorVersion;

        @NameInMap("OsMonitorConfig")
        public String osMonitorConfig;

        @NameInMap("OsMonitorErrorCode")
        public String osMonitorErrorCode;

        @NameInMap("OsMonitorErrorDetail")
        public String osMonitorErrorDetail;

        @NameInMap("OsMonitorStatus")
        public String osMonitorStatus;

        @NameInMap("OsMonitorVersion")
        public String osMonitorVersion;

        @NameInMap("Status")
        public String status;

        public static DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus self = new DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus();
            return TeaModel.build(map, self);
        }

        public DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus setAgentInstallErrorCode(String agentInstallErrorCode) {
            this.agentInstallErrorCode = agentInstallErrorCode;
            return this;
        }
        public String getAgentInstallErrorCode() {
            return this.agentInstallErrorCode;
        }

        public DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus setAutoInstall(Boolean autoInstall) {
            this.autoInstall = autoInstall;
            return this;
        }
        public Boolean getAutoInstall() {
            return this.autoInstall;
        }

        public DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus setLoongCollectorStatus(String loongCollectorStatus) {
            this.loongCollectorStatus = loongCollectorStatus;
            return this;
        }
        public String getLoongCollectorStatus() {
            return this.loongCollectorStatus;
        }

        public DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus setLoongCollectorVersion(String loongCollectorVersion) {
            this.loongCollectorVersion = loongCollectorVersion;
            return this;
        }
        public String getLoongCollectorVersion() {
            return this.loongCollectorVersion;
        }

        public DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus setOsMonitorConfig(String osMonitorConfig) {
            this.osMonitorConfig = osMonitorConfig;
            return this;
        }
        public String getOsMonitorConfig() {
            return this.osMonitorConfig;
        }

        public DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus setOsMonitorErrorCode(String osMonitorErrorCode) {
            this.osMonitorErrorCode = osMonitorErrorCode;
            return this;
        }
        public String getOsMonitorErrorCode() {
            return this.osMonitorErrorCode;
        }

        public DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus setOsMonitorErrorDetail(String osMonitorErrorDetail) {
            this.osMonitorErrorDetail = osMonitorErrorDetail;
            return this;
        }
        public String getOsMonitorErrorDetail() {
            return this.osMonitorErrorDetail;
        }

        public DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus setOsMonitorStatus(String osMonitorStatus) {
            this.osMonitorStatus = osMonitorStatus;
            return this;
        }
        public String getOsMonitorStatus() {
            return this.osMonitorStatus;
        }

        public DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus setOsMonitorVersion(String osMonitorVersion) {
            this.osMonitorVersion = osMonitorVersion;
            return this;
        }
        public String getOsMonitorVersion() {
            return this.osMonitorVersion;
        }

        public DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeMonitoringAgentStatusesResponseBodyNodeStatusList extends TeaModel {
        @NameInMap("NodeStatus")
        public java.util.List<DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus> nodeStatus;

        public static DescribeMonitoringAgentStatusesResponseBodyNodeStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitoringAgentStatusesResponseBodyNodeStatusList self = new DescribeMonitoringAgentStatusesResponseBodyNodeStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeMonitoringAgentStatusesResponseBodyNodeStatusList setNodeStatus(java.util.List<DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus> nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public java.util.List<DescribeMonitoringAgentStatusesResponseBodyNodeStatusListNodeStatus> getNodeStatus() {
            return this.nodeStatus;
        }

    }

}
