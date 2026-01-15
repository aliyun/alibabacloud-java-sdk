// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ContainerConfiguration extends TeaModel {
    /**
     * <p>阿里云容器镜像服务（ACR）的实例ID或名称</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xxxxx</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    /**
     * <p>在容器中运行的命令（例如：[&quot;python3&quot;, &quot;app.py&quot;]）</p>
     * 
     * <strong>example:</strong>
     * <p>python3,app.py</p>
     */
    @NameInMap("command")
    public java.util.List<String> command;

    /**
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/my-namespace/agent-runtime:latest</p>
     */
    @NameInMap("image")
    public String image;

    /**
     * <p>容器镜像的来源类型，支持ACR（阿里云容器镜像服务）、ACREE（阿里云容器镜像服务企业版）、CUSTOM（自定义镜像仓库）</p>
     * 
     * <strong>example:</strong>
     * <p>ACR</p>
     */
    @NameInMap("imageRegistryType")
    public String imageRegistryType;

    @NameInMap("port")
    public Integer port;

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

}
