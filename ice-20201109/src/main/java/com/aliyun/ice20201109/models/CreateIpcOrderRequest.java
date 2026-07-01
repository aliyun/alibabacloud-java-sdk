// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateIpcOrderRequest extends TeaModel {
    /**
     * <p>The capability. Valid values:</p>
     * <ul>
     * <li><p>understand: Image understanding. Supports the analysis of 300 images per day.</p>
     * </li>
     * <li><p>understand-reid: Image understanding with person re-identification (ReID). Supports the analysis of 300 images per day.</p>
     * </li>
     * <li><p>search: Search. Supports 75 searches per day.</p>
     * </li>
     * <li><p>understand-search: Image understanding and search. Supports the analysis of 300 images and 75 searches per day.</p>
     * </li>
     * <li><p>understand-reid-search: Image understanding with ReID and search. Supports the analysis of 300 images and 75 searches per day.</p>
     * </li>
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
     * <li><p>month: A monthly subscription, calculated as 30 days.</p>
     * </li>
     * <li><p>quarter: A quarterly subscription, calculated as 90 days.</p>
     * </li>
     * <li><p>year: An annual subscription, calculated as 365 days.</p>
     * </li>
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
