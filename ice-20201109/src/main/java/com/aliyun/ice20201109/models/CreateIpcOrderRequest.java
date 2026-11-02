// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateIpcOrderRequest extends TeaModel {
    /**
     * <p>The capability. Valid values:</p>
     * <ul>
     * <li>understand: Image understanding. Supports 300 image understanding tasks per day.</li>
     * <li>understand-reid: Image understanding with ReID. Supports 300 image understanding tasks per day.</li>
     * <li>search: Search. Supports 75 searches per day.</li>
     * <li>understand-search: Image understanding and search. Supports 300 image understanding tasks and 75 searches per day.</li>
     * <li>understand-reid-search: Image understanding with ReID and search. Supports 300 image understanding tasks and 75 searches per day.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>understand</p>
     */
    @NameInMap("Capability")
    public String capability;

    /**
     * <p>The device ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d123</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>The subscription period. Valid values:</p>
     * <ul>
     * <li>month: Monthly subscription, calculated as 30 days.</li>
     * <li>quarter: Quarterly subscription, calculated as 90 days.</li>
     * <li>year: Annual subscription, calculated as 365 days.</li>
     * </ul>
     * 
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
