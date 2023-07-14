// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ConfigAppRequest extends TeaModel {
    /**
     * <p>The process identifier (PID) of the application. Separate multiple PIDs with commas (,).</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    /**
     * <p>Specifies whether to turn on or turn off the main switch of the ARMS agent. The monitoring stops after the switch is turned off. If you do not specify this parameter, the main switch status of the ARMS agent is queried.</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the application. Set the value to **TRACE**.</p>
     */
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
