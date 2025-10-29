// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ContainerConfiguration extends TeaModel {
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

    public static ContainerConfiguration build(java.util.Map<String, ?> map) throws Exception {
        ContainerConfiguration self = new ContainerConfiguration();
        return TeaModel.build(map, self);
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

}
