// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CliTask extends TeaModel {
    @NameInMap("AgentIp")
    public String agentIp;

    @NameInMap("CliTaskId")
    public String cliTaskId;

    @NameInMap("Command")
    public String command;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModify")
    public String gmtModify;

    @NameInMap("Output")
    public String output;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("ResponseCode")
    public String responseCode;

    @NameInMap("Result")
    public String result;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Timeout")
    public Integer timeout;

    public static CliTask build(java.util.Map<String, ?> map) throws Exception {
        CliTask self = new CliTask();
        return TeaModel.build(map, self);
    }

    public CliTask setAgentIp(String agentIp) {
        this.agentIp = agentIp;
        return this;
    }
    public String getAgentIp() {
        return this.agentIp;
    }

    public CliTask setCliTaskId(String cliTaskId) {
        this.cliTaskId = cliTaskId;
        return this;
    }
    public String getCliTaskId() {
        return this.cliTaskId;
    }

    public CliTask setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public CliTask setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CliTask setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CliTask setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }
    public String getGmtModify() {
        return this.gmtModify;
    }

    public CliTask setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public CliTask setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CliTask setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public CliTask setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public CliTask setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CliTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CliTask setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
