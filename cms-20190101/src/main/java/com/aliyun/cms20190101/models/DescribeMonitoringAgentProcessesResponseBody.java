// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentProcessesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("NodeProcesses")
    public DescribeMonitoringAgentProcessesResponseBodyNodeProcesses nodeProcesses;

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

    public DescribeMonitoringAgentProcessesResponseBody setNodeProcesses(DescribeMonitoringAgentProcessesResponseBodyNodeProcesses nodeProcesses) {
        this.nodeProcesses = nodeProcesses;
        return this;
    }
    public DescribeMonitoringAgentProcessesResponseBodyNodeProcesses getNodeProcesses() {
        return this.nodeProcesses;
    }

    public static class DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess extends TeaModel {
        @NameInMap("ProcessName")
        public String processName;

        @NameInMap("ProcessId")
        public Long processId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Command")
        public String command;

        @NameInMap("ProcessUser")
        public String processUser;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess self = new DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess();
            return TeaModel.build(map, self);
        }

        public DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess setProcessId(Long processId) {
            this.processId = processId;
            return this;
        }
        public Long getProcessId() {
            return this.processId;
        }

        public DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess setProcessUser(String processUser) {
            this.processUser = processUser;
            return this;
        }
        public String getProcessUser() {
            return this.processUser;
        }

        public DescribeMonitoringAgentProcessesResponseBodyNodeProcessesNodeProcess setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
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
