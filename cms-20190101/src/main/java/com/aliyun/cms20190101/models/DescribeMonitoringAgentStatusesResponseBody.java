// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentStatusesResponseBody extends TeaModel {
    /**
     * <p>The status information.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the instance. Separate multiple instance IDs with commas (,).</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("NodeStatusList")
    public DescribeMonitoringAgentStatusesResponseBodyNodeStatusList nodeStatusList;

    /**
     * <p>The status of SysOM. Valid values:</p>
     * <br>
     * <p>*   installing: SysOM is being installed.</p>
     * <p>*   running: SysOM is running.</p>
     * <p>*   stopped: SysOM is stopped.</p>
     * <p>*   uninstalling: SysOM is being uninstalled.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the CloudMonitor agent is automatically installed. Valid values:</p>
     * <br>
     * <p>*   true: The CloudMonitor agent is automatically installed.</p>
     * <p>*   false: The CloudMonitor agent is not automatically installed.</p>
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
         * <p>The error status of SysOM. Valid values:</p>
         * <br>
         * <p>*   `install_fail`: SysOM fails to be installed or an unknown error occurs.</p>
         * <p>*   `install_assist_invalid`: SysOM fails to be installed because the status of Cloud Assistant is invalid.</p>
         * <p>*   `install_assist_command_fail`: SysOM fails to be installed because the installation command fails to run.</p>
         * <p>*   `uninstall_fail`: SysOM fails to be uninstalled or an unknown error occurs.</p>
         * <p>*   `uninstall_assist_invalid`: SysOM fails to be uninstalled because the status of Cloud Assistant is invalid.</p>
         * <p>*   `uninstall_assist_command_fail`: SysOM fails to be uninstalled because the uninstallation command fails to run.</p>
         */
        @NameInMap("AutoInstall")
        public Boolean autoInstall;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OsMonitorErrorCode")
        public String osMonitorErrorCode;

        @NameInMap("OsMonitorErrorDetail")
        public String osMonitorErrorDetail;

        /**
         * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
         */
        @NameInMap("OsMonitorStatus")
        public String osMonitorStatus;

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
