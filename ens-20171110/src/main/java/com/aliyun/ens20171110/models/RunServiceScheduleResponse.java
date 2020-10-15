// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RunServiceScheduleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RequestRepeated")
    @Validation(required = true)
    public String requestRepeated;

    @NameInMap("TcpPorts")
    @Validation(required = true)
    public Boolean tcpPorts;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("InstancePort")
    @Validation(required = true)
    public Integer instancePort;

    @NameInMap("InstanceIp")
    @Validation(required = true)
    public String instanceIp;

    @NameInMap("Index")
    @Validation(required = true)
    public Integer index;

    @NameInMap("CommandResults")
    @Validation(required = true)
    public RunServiceScheduleResponseCommandResults commandResults;

    public static RunServiceScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        RunServiceScheduleResponse self = new RunServiceScheduleResponse();
        return TeaModel.build(map, self);
    }

    public RunServiceScheduleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunServiceScheduleResponse setRequestRepeated(String requestRepeated) {
        this.requestRepeated = requestRepeated;
        return this;
    }
    public String getRequestRepeated() {
        return this.requestRepeated;
    }

    public RunServiceScheduleResponse setTcpPorts(Boolean tcpPorts) {
        this.tcpPorts = tcpPorts;
        return this;
    }
    public Boolean getTcpPorts() {
        return this.tcpPorts;
    }

    public RunServiceScheduleResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RunServiceScheduleResponse setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }
    public Integer getInstancePort() {
        return this.instancePort;
    }

    public RunServiceScheduleResponse setInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
        return this;
    }
    public String getInstanceIp() {
        return this.instanceIp;
    }

    public RunServiceScheduleResponse setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public RunServiceScheduleResponse setCommandResults(RunServiceScheduleResponseCommandResults commandResults) {
        this.commandResults = commandResults;
        return this;
    }
    public RunServiceScheduleResponseCommandResults getCommandResults() {
        return this.commandResults;
    }

    public static class RunServiceScheduleResponseCommandResultsCommandResult extends TeaModel {
        @NameInMap("ContainerName")
        @Validation(required = true)
        public String containerName;

        @NameInMap("Command")
        @Validation(required = true)
        public String command;

        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        public static RunServiceScheduleResponseCommandResultsCommandResult build(java.util.Map<String, ?> map) throws Exception {
            RunServiceScheduleResponseCommandResultsCommandResult self = new RunServiceScheduleResponseCommandResultsCommandResult();
            return TeaModel.build(map, self);
        }

        public RunServiceScheduleResponseCommandResultsCommandResult setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public RunServiceScheduleResponseCommandResultsCommandResult setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public RunServiceScheduleResponseCommandResultsCommandResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

    }

    public static class RunServiceScheduleResponseCommandResults extends TeaModel {
        @NameInMap("CommandResult")
        @Validation(required = true)
        public java.util.List<RunServiceScheduleResponseCommandResultsCommandResult> commandResult;

        public static RunServiceScheduleResponseCommandResults build(java.util.Map<String, ?> map) throws Exception {
            RunServiceScheduleResponseCommandResults self = new RunServiceScheduleResponseCommandResults();
            return TeaModel.build(map, self);
        }

        public RunServiceScheduleResponseCommandResults setCommandResult(java.util.List<RunServiceScheduleResponseCommandResultsCommandResult> commandResult) {
            this.commandResult = commandResult;
            return this;
        }
        public java.util.List<RunServiceScheduleResponseCommandResultsCommandResult> getCommandResult() {
            return this.commandResult;
        }

    }

}
