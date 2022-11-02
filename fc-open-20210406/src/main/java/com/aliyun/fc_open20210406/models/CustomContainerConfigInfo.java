// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CustomContainerConfigInfo extends TeaModel {
    @NameInMap("accelerationInfo")
    public AccelerationInfo accelerationInfo;

    @NameInMap("accelerationType")
    public String accelerationType;

    @NameInMap("args")
    public String args;

    @NameInMap("command")
    public String command;

    @NameInMap("image")
    public String image;

    @NameInMap("instanceID")
    public String instanceID;

    @NameInMap("webServerMode")
    public Boolean webServerMode;

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

    public CustomContainerConfigInfo setWebServerMode(Boolean webServerMode) {
        this.webServerMode = webServerMode;
        return this;
    }
    public Boolean getWebServerMode() {
        return this.webServerMode;
    }

}
