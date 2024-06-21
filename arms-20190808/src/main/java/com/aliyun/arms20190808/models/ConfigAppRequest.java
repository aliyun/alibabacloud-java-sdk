// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ConfigAppRequest extends TeaModel {
    /**
     * <p>The process identifier (PID) of the application. Separate multiple PIDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iioe7jcnuk@582846f37******,atc889zkcf@d8deedfa9bf******</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    /**
     * <p>Specifies whether to turn on or off the main switch of the ARMS agent. The monitoring stops after the switch is turned off. If you do not specify this parameter, the main switch status of the ARMS agent is queried.</p>
     * <ul>
     * <li><code>true</code>: turns on the switch</li>
     * <li><code>false</code>: turns off the switch</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the application. Set the value to <strong>TRACE</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>TRACE</p>
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
