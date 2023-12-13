// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentStatusesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>> The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The status information.</p>
     */
    @NameInMap("NodeStatusList")
    public DescribeMonitoringAgentStatusesResponseBodyNodeStatusList nodeStatusList;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
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

        /**
         * <p>Indicates whether the CloudMonitor agent is automatically installed. Valid values:</p>
         * <br>
         * <p>*   true: The CloudMonitor agent is automatically installed.</p>
         * <p>*   false: The CloudMonitor agent is not automatically installed.</p>
         */
        @NameInMap("AutoInstall")
        public Boolean autoInstall;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>SysOM插件的配置信息`sysak`是否开启监控。取值：</p>
         * <br>
         * <p>- true：`sysak`开启监控。</p>
         * <br>
         * <p>- false：`sysak`未开启监控。</p>
         */
        @NameInMap("OsMonitorConfig")
        public String osMonitorConfig;

        /**
         * <p>The error status of SysOM. Valid values:</p>
         * <br>
         * <p>*   `install_fail`: SysOM fails to be installed or an unknown error occurs.</p>
         * <p>*   `install_assist_invalid`: SysOM fails to be installed because the status of Cloud Assistant is invalid.</p>
         * <p>*   `install_assist_command_fail`: SysOM fails to be installed because the installation command fails to run.</p>
         * <p>*   `uninstall_fail`: SysOM fails to be uninstalled or an unknown error occurs.</p>
         * <p>*   `uninstall_assist_invalid`: SysOM fails to be uninstalled because the status of Cloud Assistant is invalid.</p>
         * <p>*   `uninstall_assist_command_fail`: SysOM fails to be uninstalled because the uninstallation command fails to run.</p>
         */
        @NameInMap("OsMonitorErrorCode")
        public String osMonitorErrorCode;

        /**
         * <p>The details of the execution error. Valid values:</p>
         * <br>
         * <p>*   `Command.ErrorCode.Fail.Downlaod.REGIN_ID`: Failed to obtain the region ID.</p>
         * <p>*   `Command.ErrorCode.Fail.Downlaod.SYSAK`: Failed to download the .rpm package of System Analyse Kit (SysAK).</p>
         * <p>*   `Command.ErrorCode.Fail.Downlaod.CMON_FILE`: Failed to download the CMON file.</p>
         * <p>*   `Command.ErrorCode.Fail.Downlaod.BTF`: Failed to start SysAK because the BTF file is not found.</p>
         * <p>*   `Command.ErrorCode.Fail.Start.SYSAK`: Failed to start SysAK due to an unknown error.</p>
         */
        @NameInMap("OsMonitorErrorDetail")
        public String osMonitorErrorDetail;

        /**
         * <p>The status of SysOM. Valid values:</p>
         * <br>
         * <p>*   installing: SysOM is being installed.</p>
         * <p>*   running: SysOM is running.</p>
         * <p>*   stopped: SysOM is stopped.</p>
         * <p>*   uninstalling: SysOM is being uninstalled.</p>
         */
        @NameInMap("OsMonitorStatus")
        public String osMonitorStatus;

        /**
         * <p>SysOM监控的插件版本。</p>
         */
        @NameInMap("OsMonitorVersion")
        public String osMonitorVersion;

        /**
         * <p>The status of the CloudMonitor agent. Valid values:</p>
         * <br>
         * <p>*   running: The CloudMonitor agent is running.</p>
         * <p>*   stopped: The CloudMonitor agent is stopped.</p>
         * <p>*   installing: The CloudMonitor agent is being installed.</p>
         * <p>*   install_faild: The CloudMonitor agent fails to be installed.</p>
         * <p>*   abnormal: The CloudMonitor agent is not properly installed.</p>
         * <p>*   not_installed: The CloudMonitor agent is not installed.</p>
         */
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
