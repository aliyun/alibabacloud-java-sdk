// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CustomContainerConfig extends TeaModel {
    @NameInMap("accelerationInfo")
    public AccelerationInfo accelerationInfo;

    /**
     * <strong>example:</strong>
     * <p>deprecated</p>
     */
    @NameInMap("accelerationType")
    public String accelerationType;

    /**
     * <strong>example:</strong>
     * <p>deprecated</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    @NameInMap("command")
    public java.util.List<String> command;

    @NameInMap("entrypoint")
    public java.util.List<String> entrypoint;

    @NameInMap("healthCheckConfig")
    public CustomHealthCheckConfig healthCheckConfig;

    /**
     * <strong>example:</strong>
     * <p>registry-vpc.cn-hangzhou.aliyuncs.com/fc-demo/helloworld:v1</p>
     */
    @NameInMap("image")
    public String image;

    /**
     * <strong>example:</strong>
     * <p>9000</p>
     */
    @NameInMap("port")
    public Integer port;

    /**
     * <strong>example:</strong>
     * <p>stand-sh-registry-vpc.cn-shanghai.cr.aliyuncs.com/fc-demo2/springboot-helloworld@sha256:68d1****0d64d6</p>
     */
    @NameInMap("resolvedImageUri")
    public String resolvedImageUri;

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

    public CustomContainerConfig setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
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

    public CustomContainerConfig setResolvedImageUri(String resolvedImageUri) {
        this.resolvedImageUri = resolvedImageUri;
        return this;
    }
    public String getResolvedImageUri() {
        return this.resolvedImageUri;
    }

}
