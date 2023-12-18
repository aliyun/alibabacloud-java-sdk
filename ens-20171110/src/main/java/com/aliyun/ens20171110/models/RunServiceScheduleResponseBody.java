// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RunServiceScheduleResponseBody extends TeaModel {
    /**
     * <p>The execution results of the commands.</p>
     */
    @NameInMap("CommandResults")
    public RunServiceScheduleResponseBodyCommandResults commandResults;

    /**
     * <p>The index number of the scheduled virtual device (pod).</p>
     */
    @NameInMap("Index")
    public Integer index;

    /**
     * <p>The ID of the scheduled instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP address of the scheduled instance.</p>
     */
    @NameInMap("InstanceIp")
    public String instanceIp;

    /**
     * <p>The start port of the scheduled instance.</p>
     */
    @NameInMap("InstancePort")
    public Integer instancePort;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is repeated. This parameter is not returned if ServcieAction is set to Console.</p>
     */
    @NameInMap("RequestRepeated")
    public String requestRepeated;

    /**
     * <p>The TCP port range of the scheduled instance or container. The value is in the ${from}-$-{to} format. Example: 80-88.</p>
     */
    @NameInMap("TcpPorts")
    public Boolean tcpPorts;

    public static RunServiceScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunServiceScheduleResponseBody self = new RunServiceScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public RunServiceScheduleResponseBody setCommandResults(RunServiceScheduleResponseBodyCommandResults commandResults) {
        this.commandResults = commandResults;
        return this;
    }
    public RunServiceScheduleResponseBodyCommandResults getCommandResults() {
        return this.commandResults;
    }

    public RunServiceScheduleResponseBody setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public RunServiceScheduleResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RunServiceScheduleResponseBody setInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
        return this;
    }
    public String getInstanceIp() {
        return this.instanceIp;
    }

    public RunServiceScheduleResponseBody setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }
    public Integer getInstancePort() {
        return this.instancePort;
    }

    public RunServiceScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunServiceScheduleResponseBody setRequestRepeated(String requestRepeated) {
        this.requestRepeated = requestRepeated;
        return this;
    }
    public String getRequestRepeated() {
        return this.requestRepeated;
    }

    public RunServiceScheduleResponseBody setTcpPorts(Boolean tcpPorts) {
        this.tcpPorts = tcpPorts;
        return this;
    }
    public Boolean getTcpPorts() {
        return this.tcpPorts;
    }

    public static class RunServiceScheduleResponseBodyCommandResultsCommandResult extends TeaModel {
        /**
         * <p>The command.</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The name of the container.</p>
         */
        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <p>The execution result of the command.</p>
         */
        @NameInMap("ResultMsg")
        public String resultMsg;

        public static RunServiceScheduleResponseBodyCommandResultsCommandResult build(java.util.Map<String, ?> map) throws Exception {
            RunServiceScheduleResponseBodyCommandResultsCommandResult self = new RunServiceScheduleResponseBodyCommandResultsCommandResult();
            return TeaModel.build(map, self);
        }

        public RunServiceScheduleResponseBodyCommandResultsCommandResult setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public RunServiceScheduleResponseBodyCommandResultsCommandResult setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public RunServiceScheduleResponseBodyCommandResultsCommandResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

    }

    public static class RunServiceScheduleResponseBodyCommandResults extends TeaModel {
        @NameInMap("CommandResult")
        public java.util.List<RunServiceScheduleResponseBodyCommandResultsCommandResult> commandResult;

        public static RunServiceScheduleResponseBodyCommandResults build(java.util.Map<String, ?> map) throws Exception {
            RunServiceScheduleResponseBodyCommandResults self = new RunServiceScheduleResponseBodyCommandResults();
            return TeaModel.build(map, self);
        }

        public RunServiceScheduleResponseBodyCommandResults setCommandResult(java.util.List<RunServiceScheduleResponseBodyCommandResultsCommandResult> commandResult) {
            this.commandResult = commandResult;
            return this;
        }
        public java.util.List<RunServiceScheduleResponseBodyCommandResultsCommandResult> getCommandResult() {
            return this.commandResult;
        }

    }

}
