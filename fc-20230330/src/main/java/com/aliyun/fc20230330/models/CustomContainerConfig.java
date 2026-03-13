// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CustomContainerConfig extends TeaModel {
    /**
     * <p>The information about image acceleration.</p>
     */
    @NameInMap("accelerationInfo")
    public AccelerationInfo accelerationInfo;

    /**
     * <p>Specifies whether to enable image acceleration. Valid values: Default: enables image acceleration. None: disables image acceleration.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("accelerationType")
    public String accelerationType;

    /**
     * <p>The ID of the image repository for the Container Registry Enterprise Edition. You must specify this parameter if you use an image of Container Registry Enterprise Edition.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xxxxxxxxxx</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The startup parameter of the container.</p>
     */
    @NameInMap("command")
    public java.util.List<String> command;

    /**
     * <p>The container startup command.</p>
     */
    @NameInMap("entrypoint")
    public java.util.List<String> entrypoint;

    /**
     * <p>The custom health check configurations of the function.</p>
     */
    @NameInMap("healthCheckConfig")
    public CustomHealthCheckConfig healthCheckConfig;

    /**
     * <p>The endpoint of the container image.</p>
     * 
     * <strong>example:</strong>
     * <p>registry-vpc.cn-hangzhou.aliyuncs.com/fc-demo/helloworld:v1beta1</p>
     */
    @NameInMap("image")
    public String image;

    /**
     * <p>The port on which the HTTP server listens for the Custom Container runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>9000</p>
     */
    @NameInMap("port")
    public Integer port;

    /**
     * <p>registry related</p>
     */
    @NameInMap("registryConfig")
    public RegistryConfig registryConfig;

    /**
     * <p>The actual digest version of the deployed image. The code version specified by digest is actually used when the function starts. This parameter is returned by GetFunction and is not required as a parameter.</p>
     * 
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

    public CustomContainerConfig setRegistryConfig(RegistryConfig registryConfig) {
        this.registryConfig = registryConfig;
        return this;
    }
    public RegistryConfig getRegistryConfig() {
        return this.registryConfig;
    }

    public CustomContainerConfig setResolvedImageUri(String resolvedImageUri) {
        this.resolvedImageUri = resolvedImageUri;
        return this;
    }
    public String getResolvedImageUri() {
        return this.resolvedImageUri;
    }

}
