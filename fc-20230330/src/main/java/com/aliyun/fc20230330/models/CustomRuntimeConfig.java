// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CustomRuntimeConfig extends TeaModel {
    @NameInMap("args")
    public java.util.List<String> args;

    @NameInMap("command")
    public java.util.List<String> command;

    @NameInMap("healthCheckConfig")
    public CustomHealthCheckConfig healthCheckConfig;

    /**
     * <strong>example:</strong>
     * <p>9000</p>
     */
    @NameInMap("port")
    public Integer port;

    public static CustomRuntimeConfig build(java.util.Map<String, ?> map) throws Exception {
        CustomRuntimeConfig self = new CustomRuntimeConfig();
        return TeaModel.build(map, self);
    }

    public CustomRuntimeConfig setArgs(java.util.List<String> args) {
        this.args = args;
        return this;
    }
    public java.util.List<String> getArgs() {
        return this.args;
    }

    public CustomRuntimeConfig setCommand(java.util.List<String> command) {
        this.command = command;
        return this;
    }
    public java.util.List<String> getCommand() {
        return this.command;
    }

    public CustomRuntimeConfig setHealthCheckConfig(CustomHealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }
    public CustomHealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    public CustomRuntimeConfig setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

}
