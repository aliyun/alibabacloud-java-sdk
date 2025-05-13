// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CustomContainerConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("accelerationType")
    public String accelerationType;

    /**
     * <strong>example:</strong>
     * <p>[&quot;-arg1&quot;, &quot;value1&quot;]</p>
     */
    @NameInMap("args")
    public String args;

    /**
     * <strong>example:</strong>
     * <p>[&quot;/code/myserver&quot;]</p>
     */
    @NameInMap("command")
    public String command;

    /**
     * <strong>example:</strong>
     * <p>registry-vpc.cn-hangzhou.aliyuncs.com/fc-demo/helloworld:v1beta1</p>
     */
    @NameInMap("image")
    public String image;

    /**
     * <strong>example:</strong>
     * <p>cri-xxxxxxxxxx</p>
     */
    @NameInMap("instanceID")
    public String instanceID;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("webServerMode")
    public Boolean webServerMode;

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

    public CustomContainerConfig setWebServerMode(Boolean webServerMode) {
        this.webServerMode = webServerMode;
        return this;
    }
    public Boolean getWebServerMode() {
        return this.webServerMode;
    }

}
