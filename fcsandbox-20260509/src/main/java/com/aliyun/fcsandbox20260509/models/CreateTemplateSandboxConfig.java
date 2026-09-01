// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateTemplateSandboxConfig extends TeaModel {
    /**
     * <p>The Container Registry Enterprise instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-abcd1234efgh</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The sandbox generation. A value of 1 indicates the first-generation sandbox. A value of 2 indicates the second-generation sandbox.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("generation")
    public Integer generation;

    /**
     * <p>The image address.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/demo/nginx:latest</p>
     */
    @NameInMap("image")
    public String image;

    /**
     * <p>The operating system type.</p>
     * 
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("osType")
    public String osType;

    /**
     * <p>The sandbox readiness probe command.</p>
     * 
     * <strong>example:</strong>
     * <p>curl -sf <a href="http://127.0.0.1:8080/healthz">http://127.0.0.1:8080/healthz</a></p>
     */
    @NameInMap("readyCommand")
    public String readyCommand;

    /**
     * <p>The image repository configuration.</p>
     */
    @NameInMap("registryConfig")
    public CreateTemplateRegistryConfig registryConfig;

    /**
     * <p>The image repository type.</p>
     * 
     * <strong>example:</strong>
     * <p>acr</p>
     */
    @NameInMap("registryType")
    public String registryType;

    /**
     * <p>The sandbox startup command.</p>
     * 
     * <strong>example:</strong>
     * <p>sleep infinity</p>
     */
    @NameInMap("startCommand")
    public String startCommand;

    /**
     * <p>The list of custom build steps.</p>
     */
    @NameInMap("steps")
    public java.util.List<CreateTemplateStep> steps;

    public static CreateTemplateSandboxConfig build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateSandboxConfig self = new CreateTemplateSandboxConfig();
        return TeaModel.build(map, self);
    }

    public CreateTemplateSandboxConfig setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public CreateTemplateSandboxConfig setGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }
    public Integer getGeneration() {
        return this.generation;
    }

    public CreateTemplateSandboxConfig setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public CreateTemplateSandboxConfig setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public CreateTemplateSandboxConfig setReadyCommand(String readyCommand) {
        this.readyCommand = readyCommand;
        return this;
    }
    public String getReadyCommand() {
        return this.readyCommand;
    }

    public CreateTemplateSandboxConfig setRegistryConfig(CreateTemplateRegistryConfig registryConfig) {
        this.registryConfig = registryConfig;
        return this;
    }
    public CreateTemplateRegistryConfig getRegistryConfig() {
        return this.registryConfig;
    }

    public CreateTemplateSandboxConfig setRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }
    public String getRegistryType() {
        return this.registryType;
    }

    public CreateTemplateSandboxConfig setStartCommand(String startCommand) {
        this.startCommand = startCommand;
        return this;
    }
    public String getStartCommand() {
        return this.startCommand;
    }

    public CreateTemplateSandboxConfig setSteps(java.util.List<CreateTemplateStep> steps) {
        this.steps = steps;
        return this;
    }
    public java.util.List<CreateTemplateStep> getSteps() {
        return this.steps;
    }

}
