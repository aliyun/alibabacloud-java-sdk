// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ConfigAppRequest extends TeaModel {
    // The process identifier (PID) of the application. Separate multiple PIDs with commas (,).
    @NameInMap("AppIds")
    public String appIds;

    // Specifies whether to turns on or off the main switch of the agent. The monitoring stops after the switch is turned off. If you do not specify this parameter, the main switch status of the agent is queried.  
    // 
    // - `true`: Turn on the switch.
    // - `false`: Turn off the switch.
    @NameInMap("Enable")
    public String enable;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Type")
    public String type;

    public static ConfigAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigAppRequest self = new ConfigAppRequest();
        return TeaModel.build(map, self);
    }

    public ConfigAppRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public ConfigAppRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public ConfigAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigAppRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
