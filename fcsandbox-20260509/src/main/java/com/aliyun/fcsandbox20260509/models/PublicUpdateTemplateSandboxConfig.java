// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateSandboxConfig extends TeaModel {
    /**
     * <p>The ID of the Container Registry Enterprise instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-abc123</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The sandbox generation. A value of 1 indicates rund, and a value of 2 indicates micro.</p>
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
     * <p>registry.cn-hangzhou.aliyuncs.com/my/ns:v1</p>
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
     * <p>The micro sandbox readiness probe command. Only the second generation supports this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>/ready</p>
     */
    @NameInMap("readyCommand")
    public String readyCommand;

    /**
     * <p>The image repository configuration.</p>
     */
    @NameInMap("registryConfig")
    public PublicUpdateTemplateRegistryConfig registryConfig;

    /**
     * <p>The image repository type.</p>
     * 
     * <strong>example:</strong>
     * <p>acr</p>
     */
    @NameInMap("registryType")
    public String registryType;

    /**
     * <p>The micro sandbox startup command. Only the second generation supports this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>/start-coroutines.sh</p>
     */
    @NameInMap("startCommand")
    public String startCommand;

    public static PublicUpdateTemplateSandboxConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicUpdateTemplateSandboxConfig self = new PublicUpdateTemplateSandboxConfig();
        return TeaModel.build(map, self);
    }

    public PublicUpdateTemplateSandboxConfig setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public PublicUpdateTemplateSandboxConfig setGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }
    public Integer getGeneration() {
        return this.generation;
    }

    public PublicUpdateTemplateSandboxConfig setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public PublicUpdateTemplateSandboxConfig setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public PublicUpdateTemplateSandboxConfig setReadyCommand(String readyCommand) {
        this.readyCommand = readyCommand;
        return this;
    }
    public String getReadyCommand() {
        return this.readyCommand;
    }

    public PublicUpdateTemplateSandboxConfig setRegistryConfig(PublicUpdateTemplateRegistryConfig registryConfig) {
        this.registryConfig = registryConfig;
        return this;
    }
    public PublicUpdateTemplateRegistryConfig getRegistryConfig() {
        return this.registryConfig;
    }

    public PublicUpdateTemplateSandboxConfig setRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }
    public String getRegistryType() {
        return this.registryType;
    }

    public PublicUpdateTemplateSandboxConfig setStartCommand(String startCommand) {
        this.startCommand = startCommand;
        return this;
    }
    public String getStartCommand() {
        return this.startCommand;
    }

}
