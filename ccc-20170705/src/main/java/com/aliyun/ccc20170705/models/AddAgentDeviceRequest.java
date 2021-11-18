// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class AddAgentDeviceRequest extends TeaModel {
    @NameInMap("BrowserVersion")
    public String browserVersion;

    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("ClientPort")
    public String clientPort;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Remark")
    public String remark;

    public static AddAgentDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAgentDeviceRequest self = new AddAgentDeviceRequest();
        return TeaModel.build(map, self);
    }

    public AddAgentDeviceRequest setBrowserVersion(String browserVersion) {
        this.browserVersion = browserVersion;
        return this;
    }
    public String getBrowserVersion() {
        return this.browserVersion;
    }

    public AddAgentDeviceRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public AddAgentDeviceRequest setClientPort(String clientPort) {
        this.clientPort = clientPort;
        return this;
    }
    public String getClientPort() {
        return this.clientPort;
    }

    public AddAgentDeviceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddAgentDeviceRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
