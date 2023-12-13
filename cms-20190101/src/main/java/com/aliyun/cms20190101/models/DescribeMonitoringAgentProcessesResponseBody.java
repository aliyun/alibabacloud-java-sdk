// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentProcessesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The value 200 indicates that the call was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The information about the processes.</p>
     */
    @NameInMap("NodeProcesses")
    public DescribeMonitoringAgentProcessesResponseBodyNodeProcesses nodeProcesses;

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

    public static DescribeMonitoringAgentProcessesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentProcessesResponseBody self = new DescribeMonitoringAgentProcessesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringAgentProcessesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMonitoringAgentProcessesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMonitoringAgentProcessesResponseBody setNodeProcesses(DescribeMonitoringAgentProcessesResponseBodyNodeProcesses nodeProcesses) {
        this.nodeProcesses = nodeProcesses;
        return this;
    }
    public DescribeMonitoringAgentProcessesResponseBodyNodeProcesses getNodeProcesses() {
        return this.nodeProcesses;
    }

    public DescribeMonitoringAgentProcessesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitoringAgentProcessesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess extends TeaModel {
        /**
         * <p>The command used to obtain the number of processes. Valid value: `number`.</p>
         * <br>
         * <p>>  The `number` command obtains the number of processes that match the condition.</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The ID of the application group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the process.</p>
         */
        @NameInMap("ProcessId")
        public Long processId;

        /**
         * <p>The name of the process.</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <p>The user who launched the process.</p>
         */
        @NameInMap("ProcessUser")
        public String processUser;

        public static DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess self = new DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess();
            return TeaModel.build(map, self);
        }

        public DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess setProcessId(Long processId) {
            this.processId = processId;
            return this;
        }
        public Long getProcessId() {
            return this.processId;
        }

        public DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess setProcessUser(String processUser) {
            this.processUser = processUser;
            return this;
        }
        public String getProcessUser() {
            return this.processUser;
        }

    }

    public static class DescribeMonitoringAgentProcessesResponseBodyNodeProcesses extends TeaModel {
        @NameInMap("NodeProcess")
        public java.util.List<DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess> nodeProcess;

        public static DescribeMonitoringAgentProcessesResponseBodyNodeProcesses build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitoringAgentProcessesResponseBodyNodeProcesses self = new DescribeMonitoringAgentProcessesResponseBodyNodeProcesses();
            return TeaModel.build(map, self);
        }

        public DescribeMonitoringAgentProcessesResponseBodyNodeProcesses setNodeProcess(java.util.List<DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess> nodeProcess) {
            this.nodeProcess = nodeProcess;
            return this;
        }
        public java.util.List<DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess> getNodeProcess() {
            return this.nodeProcess;
        }

    }

}
