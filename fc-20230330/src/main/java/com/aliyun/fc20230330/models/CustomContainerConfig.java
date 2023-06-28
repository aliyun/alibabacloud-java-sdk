// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CustomContainerConfig extends TeaModel {
    @NameInMap("accelerationInfo")
    public AccelerationInfo accelerationInfo;

    @NameInMap("accelerationType")
    public String accelerationType;

    @NameInMap("acrInstanceID")
    public String acrInstanceID;

    @NameInMap("command")
    public java.util.List<String> command;

    @NameInMap("entrypoint")
    public java.util.List<String> entrypoint;

    @NameInMap("healthCheckConfig")
    public CustomHealthCheckConfig healthCheckConfig;

    @NameInMap("image")
    public String image;

    @NameInMap("port")
    public Integer port;

    public static CustomContainerConfig build(java.util.Map<String, ?> map) throws Exception {
        CustomContainerConfig self = new CustomContainerConfig();
        return TeaModel.build(map, self);
    }

    public CustomContainerConfig setAccelerationInfo(AccelerationInfo accelerationInfo) {
        this.accelerationInfo = accelerationInfo;
        return this;
    }
    public AccelerationInfo getAccelerationInfo() {
        return this.accelerationInfo;
    }

    public CustomContainerConfig setAccelerationType(String accelerationType) {
        this.accelerationType = accelerationType;
        return this;
    }
    public String getAccelerationType() {
        return this.accelerationType;
    }

    public CustomContainerConfig setAcrInstanceID(String acrInstanceID) {
        this.acrInstanceID = acrInstanceID;
        return this;
    }
    public String getAcrInstanceID() {
        return this.acrInstanceID;
    }

    public CustomContainerConfig setCommand(java.util.List<String> command) {
        this.command = command;
        return this;
    }
    public java.util.List<String> getCommand() {
        return this.command;
    }

    public CustomContainerConfig setEntrypoint(java.util.List<String> entrypoint) {
        this.entrypoint = entrypoint;
        return this;
    }
    public java.util.List<String> getEntrypoint() {
        return this.entrypoint;
    }

    public CustomContainerConfig setHealthCheckConfig(CustomHealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }
    public CustomHealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    public CustomContainerConfig setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public CustomContainerConfig setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

}
