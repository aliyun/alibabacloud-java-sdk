// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CliTask extends TeaModel {
    // agent IP
    @NameInMap("AgentIp")
    public String agentIp;

    // cli任务id
    @NameInMap("CliTaskId")
    public String cliTaskId;

    // cli命令
    @NameInMap("Command")
    public String command;

    // 设备id
    @NameInMap("DeviceId")
    public String deviceId;

    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 修改时间
    @NameInMap("GmtModify")
    public String gmtModify;

    // 设备回显
    @NameInMap("Output")
    public String output;

    // 协议
    @NameInMap("Protocol")
    public String protocol;

    // 任务错误码
    @NameInMap("ResponseCode")
    public String responseCode;

    // 任务结果
    @NameInMap("Result")
    public String result;

    // 会话id
    @NameInMap("SessionId")
    public String sessionId;

    // cli任务状态
    @NameInMap("Status")
    public String status;

    // 超时参数
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
