// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class NodeProcessesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("NodeProcesses")
    public NodeProcessesResponseBodyNodeProcesses nodeProcesses;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static NodeProcessesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NodeProcessesResponseBody self = new NodeProcessesResponseBody();
        return TeaModel.build(map, self);
    }

    public NodeProcessesResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public NodeProcessesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public NodeProcessesResponseBody setNodeProcesses(NodeProcessesResponseBodyNodeProcesses nodeProcesses) {
        this.nodeProcesses = nodeProcesses;
        return this;
    }
    public NodeProcessesResponseBodyNodeProcesses getNodeProcesses() {
        return this.nodeProcesses;
    }

    public NodeProcessesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NodeProcessesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class NodeProcessesResponseBodyNodeProcessesNodeProcess extends TeaModel {
        @NameInMap("Command")
        public String command;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProcessName")
        public String processName;

        @NameInMap("ProcessUser")
        public String processUser;

        public static NodeProcessesResponseBodyNodeProcessesNodeProcess build(java.util.Map<String, ?> map) throws Exception {
            NodeProcessesResponseBodyNodeProcessesNodeProcess self = new NodeProcessesResponseBodyNodeProcessesNodeProcess();
            return TeaModel.build(map, self);
        }

        public NodeProcessesResponseBodyNodeProcessesNodeProcess setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public NodeProcessesResponseBodyNodeProcessesNodeProcess setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public NodeProcessesResponseBodyNodeProcessesNodeProcess setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public NodeProcessesResponseBodyNodeProcessesNodeProcess setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public NodeProcessesResponseBodyNodeProcessesNodeProcess setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public NodeProcessesResponseBodyNodeProcessesNodeProcess setProcessUser(String processUser) {
            this.processUser = processUser;
            return this;
        }
        public String getProcessUser() {
            return this.processUser;
        }

    }

    public static class NodeProcessesResponseBodyNodeProcesses extends TeaModel {
        @NameInMap("NodeProcess")
        public java.util.List<NodeProcessesResponseBodyNodeProcessesNodeProcess> nodeProcess;

        public static NodeProcessesResponseBodyNodeProcesses build(java.util.Map<String, ?> map) throws Exception {
            NodeProcessesResponseBodyNodeProcesses self = new NodeProcessesResponseBodyNodeProcesses();
            return TeaModel.build(map, self);
        }

        public NodeProcessesResponseBodyNodeProcesses setNodeProcess(java.util.List<NodeProcessesResponseBodyNodeProcessesNodeProcess> nodeProcess) {
            this.nodeProcess = nodeProcess;
            return this;
        }
        public java.util.List<NodeProcessesResponseBodyNodeProcessesNodeProcess> getNodeProcess() {
            return this.nodeProcess;
        }

    }

}
