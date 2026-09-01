// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class PublicTemplateSandboxConfig extends TeaModel {
    /**
     * <p>The ACR Enterprise instance ID.</p>
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
    public PublicTemplateRegistryConfig registryConfig;

    /**
     * <p>The sandbox startup command.</p>
     * 
     * <strong>example:</strong>
     * <p>sleep infinity</p>
     */
    @NameInMap("startCommand")
    public String startCommand;

    public static PublicTemplateSandboxConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicTemplateSandboxConfig self = new PublicTemplateSandboxConfig();
        return TeaModel.build(map, self);
    }

    public PublicTemplateSandboxConfig setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public PublicTemplateSandboxConfig setGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }
    public Integer getGeneration() {
        return this.generation;
    }

    public PublicTemplateSandboxConfig setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public PublicTemplateSandboxConfig setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public PublicTemplateSandboxConfig setReadyCommand(String readyCommand) {
        this.readyCommand = readyCommand;
        return this;
    }
    public String getReadyCommand() {
        return this.readyCommand;
    }

    public PublicTemplateSandboxConfig setRegistryConfig(PublicTemplateRegistryConfig registryConfig) {
        this.registryConfig = registryConfig;
        return this;
    }
    public PublicTemplateRegistryConfig getRegistryConfig() {
        return this.registryConfig;
    }

    public PublicTemplateSandboxConfig setStartCommand(String startCommand) {
        this.startCommand = startCommand;
        return this;
    }
    public String getStartCommand() {
        return this.startCommand;
    }

}
