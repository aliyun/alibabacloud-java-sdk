// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class MCPServerInstallationConfig extends TeaModel {
    @NameInMap("args")
    public String args;

    @NameInMap("command")
    public String command;

    @NameInMap("env")
    public java.util.Map<String, String> env;

    @NameInMap("transportType")
    public String transportType;

    @NameInMap("url")
    public String url;

    public static MCPServerInstallationConfig build(java.util.Map<String, ?> map) throws Exception {
        MCPServerInstallationConfig self = new MCPServerInstallationConfig();
        return TeaModel.build(map, self);
    }

    public MCPServerInstallationConfig setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public MCPServerInstallationConfig setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public MCPServerInstallationConfig setEnv(java.util.Map<String, String> env) {
        this.env = env;
        return this;
    }
    public java.util.Map<String, String> getEnv() {
        return this.env;
    }

    public MCPServerInstallationConfig setTransportType(String transportType) {
        this.transportType = transportType;
        return this;
    }
    public String getTransportType() {
        return this.transportType;
    }

    public MCPServerInstallationConfig setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
