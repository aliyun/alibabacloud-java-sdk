// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class MicroSandboxConfig extends TeaModel {
    /**
     * <p>The ID of the ACR Enterprise Edition image repository instance. It is used in combination with MicroSandbox images. This parameter is optional. If it is not provided, the server resolves it on demand.</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The image address.</p>
     */
    @NameInMap("image")
    public String image;

    /**
     * <p>The operating system type.</p>
     */
    @NameInMap("osType")
    public String osType;

    /**
     * <p>The ready command.</p>
     */
    @NameInMap("readyCommand")
    public String readyCommand;

    /**
     * <p>The image repository configuration.</p>
     */
    @NameInMap("registryConfig")
    public RegistryConfig registryConfig;

    /**
     * <p>The startup command.</p>
     */
    @NameInMap("startCommand")
    public String startCommand;

    /**
     * <p>The build steps.</p>
     */
    @NameInMap("steps")
    public java.util.List<Step> steps;

    public static MicroSandboxConfig build(java.util.Map<String, ?> map) throws Exception {
        MicroSandboxConfig self = new MicroSandboxConfig();
        return TeaModel.build(map, self);
    }

    public MicroSandboxConfig setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public MicroSandboxConfig setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public MicroSandboxConfig setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public MicroSandboxConfig setReadyCommand(String readyCommand) {
        this.readyCommand = readyCommand;
        return this;
    }
    public String getReadyCommand() {
        return this.readyCommand;
    }

    public MicroSandboxConfig setRegistryConfig(RegistryConfig registryConfig) {
        this.registryConfig = registryConfig;
        return this;
    }
    public RegistryConfig getRegistryConfig() {
        return this.registryConfig;
    }

    public MicroSandboxConfig setStartCommand(String startCommand) {
        this.startCommand = startCommand;
        return this;
    }
    public String getStartCommand() {
        return this.startCommand;
    }

    public MicroSandboxConfig setSteps(java.util.List<Step> steps) {
        this.steps = steps;
        return this;
    }
    public java.util.List<Step> getSteps() {
        return this.steps;
    }

}
