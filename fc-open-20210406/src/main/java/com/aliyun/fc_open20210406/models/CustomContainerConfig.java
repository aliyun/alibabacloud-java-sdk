// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CustomContainerConfig extends TeaModel {
    // 镜像加速类型，取值Default为开启加速，None为关闭加速，默认开启
    @NameInMap("accelerationType")
    public String accelerationType;

    // 容器启动参数
    @NameInMap("args")
    public String args;

    // 容器启动命令，等同于 Docker ENTRYPOINT
    @NameInMap("command")
    public String command;

    // 容器镜像地址，实例值： registry-vpc.cn-hangzhou.aliyuncs.com/fc-demo/helloworld:v1beta1
    @NameInMap("image")
    public String image;

    // ACR企业版镜像仓库ID，使用ACR企业版镜像时须传入
    @NameInMap("instanceID")
    public String instanceID;

    public static CustomContainerConfig build(java.util.Map<String, ?> map) throws Exception {
        CustomContainerConfig self = new CustomContainerConfig();
        return TeaModel.build(map, self);
    }

    public CustomContainerConfig setAccelerationType(String accelerationType) {
        this.accelerationType = accelerationType;
        return this;
    }
    public String getAccelerationType() {
        return this.accelerationType;
    }

    public CustomContainerConfig setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public CustomContainerConfig setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public CustomContainerConfig setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public CustomContainerConfig setInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }
    public String getInstanceID() {
        return this.instanceID;
    }

}
