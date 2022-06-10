// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CustomContainerConfigInfo extends TeaModel {
    @NameInMap("accelerationInfo")
    public AccelerationInfo accelerationInfo;

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

    public static CustomContainerConfigInfo build(java.util.Map<String, ?> map) throws Exception {
        CustomContainerConfigInfo self = new CustomContainerConfigInfo();
        return TeaModel.build(map, self);
    }

    public CustomContainerConfigInfo setAccelerationInfo(AccelerationInfo accelerationInfo) {
        this.accelerationInfo = accelerationInfo;
        return this;
    }
    public AccelerationInfo getAccelerationInfo() {
        return this.accelerationInfo;
    }

    public CustomContainerConfigInfo setAccelerationType(String accelerationType) {
        this.accelerationType = accelerationType;
        return this;
    }
    public String getAccelerationType() {
        return this.accelerationType;
    }

    public CustomContainerConfigInfo setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public CustomContainerConfigInfo setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public CustomContainerConfigInfo setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public CustomContainerConfigInfo setInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }
    public String getInstanceID() {
        return this.instanceID;
    }

}
