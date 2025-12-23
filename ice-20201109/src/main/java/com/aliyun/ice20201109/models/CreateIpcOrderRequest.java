// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateIpcOrderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>understand</p>
     */
    @NameInMap("Capability")
    public String capability;

    /**
     * <strong>example:</strong>
     * <p>d123</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("Period")
    public String period;

    public static CreateIpcOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpcOrderRequest self = new CreateIpcOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpcOrderRequest setCapability(String capability) {
        this.capability = capability;
        return this;
    }
    public String getCapability() {
        return this.capability;
    }

    public CreateIpcOrderRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CreateIpcOrderRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

}
