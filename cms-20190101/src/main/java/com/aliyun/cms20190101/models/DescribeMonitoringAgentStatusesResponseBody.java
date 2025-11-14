// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentStatusesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p>The status code 200 indicates that the request was successful.</p>
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

    /**
     * <p>The host status information.</p>
     */
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
        /**
         * <p>The error code returned when the CloudMonitor agent is installed. Valid values:</p>
         * <ul>
         * <li>Common.Timeout: The installation timed out.</li>
         * <li>Common.SLR: The service-linked role for CloudMonitor is unauthorized.</li>
         * <li>Common.OS: The operating system is not supported.</li>
         * <li>Assist.Invalid: Cloud Assistant is not running.</li>
         * <li>Assist.Invoke: An error occurred when the installation program is started.</li>
         * <li>Assist.Execute: An error occurred when the installation program is running.</li>
         * </ul>
         */
        @NameInMap("AgentInstallErrorCode")
        public String agentInstallErrorCode;

        /**
         * <p>Indicates whether the CloudMonitor agent is automatically installed. Valid values:</p>
         * <ul>
         * <li>true: The CloudMonitor agent is automatically installed.</li>
         * <li>false: The CloudMonitor agent is not automatically installed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoInstall")
        public Boolean autoInstall;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-hp3dunahluwajv6f****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LoongCollectorStatus")
        public String loongCollectorStatus;

        @NameInMap("LoongCollectorVersion")
        public String loongCollectorVersion;

        /**
         * <p>Indicates whether the SysAK monitoring feature is enabled.`` Valid values:</p>
         * <ul>
         * <li><code>true</code>: The SysAK monitoring feature is enabled.</li>
         * <li><code>false</code>: the SysAK monitoring feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sysak&quot;:true}</p>
         */
        @NameInMap("OsMonitorConfig")
        public String osMonitorConfig;

        /**
         * <p>The error status of SysOM. Valid values:</p>
         * <ul>
         * <li><code>install_fail</code>: SysOM fails to be installed or an unknown error occurs.</li>
         * <li><code>install_assist_invalid</code>: SysOM fails to be installed because the status of Cloud Assistant is invalid.</li>
         * <li><code>install_assist_command_fail</code>: SysOM fails to be installed because the installation command fails to run.</li>
         * <li><code>uninstall_fail</code>: SysOM fails to be uninstalled or an unknown error occurs.</li>
         * <li><code>uninstall_assist_invalid</code>: SysOM fails to be uninstalled because the status of Cloud Assistant is invalid.</li>
         * <li><code>uninstall_assist_command_fail</code>: SysOM fails to be uninstalled because the uninstallation command fails to run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>install_fail</p>
         */
        @NameInMap("OsMonitorErrorCode")
        public String osMonitorErrorCode;

        /**
         * <p>The details of the execution error. Valid values:</p>
         * <ul>
         * <li><code>Command.ErrorCode.Fail.Downlaod.REGIN_ID</code>: Failed to obtain the region ID.</li>
         * <li><code>Command.ErrorCode.Fail.Downlaod.SYSAK</code>: Failed to download the .rpm package of System Analyse Kit (SysAK).</li>
         * <li><code>Command.ErrorCode.Fail.Downlaod.CMON_FILE</code>: Failed to download the CMON file.</li>
         * <li><code>Command.ErrorCode.Fail.Downlaod.BTF</code>: Failed to start SysAK because the BTF file is not found.</li>
         * <li><code>Command.ErrorCode.Fail.Start.SYSAK</code>: Failed to start SysAK due to an unknown error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Command.ErrorCode.Fail.Downlaod.REGIN_ID</p>
         */
        @NameInMap("OsMonitorErrorDetail")
        public String osMonitorErrorDetail;

        /**
         * <p>The status of SysOM. Valid values:</p>
         * <ul>
         * <li>installing: SysOM is being installed.</li>
         * <li>running: SysOM is running.</li>
         * <li>stopped: SysOM is stopped.</li>
         * <li>uninstalling: SysOM is being uninstalled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("OsMonitorStatus")
        public String osMonitorStatus;

        /**
         * <p>The SysOM version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.3.0-12</p>
         */
        @NameInMap("OsMonitorVersion")
        public String osMonitorVersion;

        /**
         * <p>The status of the CloudMonitor agent. Valid values:</p>
         * <ul>
         * <li>running: The CloudMonitor agent is running.</li>
         * <li>stopped: The CloudMonitor agent is stopped.</li>
         * <li>installing: The CloudMonitor agent is being installed.</li>
         * <li>install_faild: The CloudMonitor agent fails to be installed.</li>
         * <li>abnormal: The CloudMonitor agent is not properly installed.</li>
         * <li>not_installed: The CloudMonitor agent is not installed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
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
