// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201001.models;

import com.aliyun.tea.*;

public class CalMcpToolRequest extends TeaModel {
    @NameInMap("Args")
    public String args;

    @NameInMap("Authorization")
    public String authorization;

    @NameInMap("ExternalUserId")
    public String externalUserId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Server")
    public String server;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("Tool")
    public String tool;

    public static CalMcpToolRequest build(java.util.Map<String, ?> map) throws Exception {
        CalMcpToolRequest self = new CalMcpToolRequest();
        return TeaModel.build(map, self);
    }

    public CalMcpToolRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public CalMcpToolRequest setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

    public CalMcpToolRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public CalMcpToolRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CalMcpToolRequest setServer(String server) {
        this.server = server;
        return this;
    }
    public String getServer() {
        return this.server;
    }

    public CalMcpToolRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CalMcpToolRequest setTool(String tool) {
        this.tool = tool;
        return this;
    }
    public String getTool() {
        return this.tool;
    }

}
