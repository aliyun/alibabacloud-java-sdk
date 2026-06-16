// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ContainerConfiguration extends TeaModel {
    /**
     * <p>The instance ID or name of Alibaba Cloud Container Registry (ACR).</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xxxxx</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The sandbox entrypoint command. For example: [\&quot;python3\&quot;, \&quot;app.py\&quot;].</p>
     * 
     * <strong>example:</strong>
     * <p>python3,app.py</p>
     */
    @NameInMap("command")
    public java.util.List<String> command;

    /**
     * <p>The container image URI.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/my-namespace/agent-runtime:latest</p>
     */
    @NameInMap("image")
    public String image;

    /**
     * <p>The source of the container image. Valid values: ACR (Alibaba Cloud Container Registry), ACREE (Alibaba Cloud Container Registry Enterprise Edition), and CUSTOM (a custom image repository).</p>
     * 
     * <strong>example:</strong>
     * <p>ACR</p>
     */
    @NameInMap("imageRegistryType")
    public String imageRegistryType;

    /**
     * <p>The listening port for the sandbox runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("port")
    public Integer port;

    /**
     * <p>自定义镜像仓库的配置信息，当imageRegistryType为CUSTOM时使用</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("registryConfig")
    public RegistryConfig registryConfig;

    public static ContainerConfiguration build(java.util.Map<String, ?> map) throws Exception {
        ContainerConfiguration self = new ContainerConfiguration();
        return TeaModel.build(map, self);
    }

    public ContainerConfiguration setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public ContainerConfiguration setCommand(java.util.List<String> command) {
        this.command = command;
        return this;
    }
    public java.util.List<String> getCommand() {
        return this.command;
    }

    public ContainerConfiguration setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public ContainerConfiguration setImageRegistryType(String imageRegistryType) {
        this.imageRegistryType = imageRegistryType;
        return this;
    }
    public String getImageRegistryType() {
        return this.imageRegistryType;
    }

    public ContainerConfiguration setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ContainerConfiguration setRegistryConfig(RegistryConfig registryConfig) {
        this.registryConfig = registryConfig;
        return this;
    }
    public RegistryConfig getRegistryConfig() {
        return this.registryConfig;
    }

}
