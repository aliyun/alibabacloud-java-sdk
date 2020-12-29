// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ApplyScenarioRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Scenario")
    public String scenario;

    @NameInMap("Name")
    public String name;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("Sign")
    public String sign;

    @NameInMap("Config")
    public java.util.Map<String, ?> config;

    @NameInMap("SnTransfer")
    public Boolean snTransfer;

    @NameInMap("SnStat")
    public Boolean snStat;

    @NameInMap("SnDump")
    public Boolean snDump;

    @NameInMap("SnForce")
    public Boolean snForce;

    @NameInMap("UpdateOption")
    public Boolean updateOption;

    public static ApplyScenarioRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyScenarioRequest self = new ApplyScenarioRequest();
        return TeaModel.build(map, self);
    }

    public ApplyScenarioRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ApplyScenarioRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public ApplyScenarioRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApplyScenarioRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ApplyScenarioRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public ApplyScenarioRequest setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    public ApplyScenarioRequest setSnTransfer(Boolean snTransfer) {
        this.snTransfer = snTransfer;
        return this;
    }
    public Boolean getSnTransfer() {
        return this.snTransfer;
    }

    public ApplyScenarioRequest setSnStat(Boolean snStat) {
        this.snStat = snStat;
        return this;
    }
    public Boolean getSnStat() {
        return this.snStat;
    }

    public ApplyScenarioRequest setSnDump(Boolean snDump) {
        this.snDump = snDump;
        return this;
    }
    public Boolean getSnDump() {
        return this.snDump;
    }

    public ApplyScenarioRequest setSnForce(Boolean snForce) {
        this.snForce = snForce;
        return this;
    }
    public Boolean getSnForce() {
        return this.snForce;
    }

    public ApplyScenarioRequest setUpdateOption(Boolean updateOption) {
        this.updateOption = updateOption;
        return this;
    }
    public Boolean getUpdateOption() {
        return this.updateOption;
    }

}
