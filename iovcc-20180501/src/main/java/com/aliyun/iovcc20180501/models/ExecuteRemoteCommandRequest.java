// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ExecuteRemoteCommandRequest extends TeaModel {
    // 项目ID
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ClientId")
    public String clientId;

    // 指令消息ID
    @NameInMap("Command")
    public Long command;

    // 指令入参字符串
    @NameInMap("Params")
    public String params;

    public static ExecuteRemoteCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRemoteCommandRequest self = new ExecuteRemoteCommandRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteRemoteCommandRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ExecuteRemoteCommandRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ExecuteRemoteCommandRequest setCommand(Long command) {
        this.command = command;
        return this;
    }
    public Long getCommand() {
        return this.command;
    }

    public ExecuteRemoteCommandRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
