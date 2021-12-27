// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ApplyScenarioShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Config")
    public String configShrink;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Scenario")
    public String scenario;

    @NameInMap("Sign")
    public String sign;

    @NameInMap("SnDump")
    public Boolean snDump;

    @NameInMap("SnForce")
    public Boolean snForce;

    @NameInMap("SnStat")
    public Boolean snStat;

    @NameInMap("SnTransfer")
    public Boolean snTransfer;

    @NameInMap("UpdateOption")
    public Boolean updateOption;

    public static ApplyScenarioShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyScenarioShrinkRequest self = new ApplyScenarioShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ApplyScenarioShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ApplyScenarioShrinkRequest setConfigShrink(String configShrink) {
        this.configShrink = configShrink;
        return this;
    }
    public String getConfigShrink() {
        return this.configShrink;
    }

    public ApplyScenarioShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApplyScenarioShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ApplyScenarioShrinkRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public ApplyScenarioShrinkRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public ApplyScenarioShrinkRequest setSnDump(Boolean snDump) {
        this.snDump = snDump;
        return this;
    }
    public Boolean getSnDump() {
        return this.snDump;
    }

    public ApplyScenarioShrinkRequest setSnForce(Boolean snForce) {
        this.snForce = snForce;
        return this;
    }
    public Boolean getSnForce() {
        return this.snForce;
    }

    public ApplyScenarioShrinkRequest setSnStat(Boolean snStat) {
        this.snStat = snStat;
        return this;
    }
    public Boolean getSnStat() {
        return this.snStat;
    }

    public ApplyScenarioShrinkRequest setSnTransfer(Boolean snTransfer) {
        this.snTransfer = snTransfer;
        return this;
    }
    public Boolean getSnTransfer() {
        return this.snTransfer;
    }

    public ApplyScenarioShrinkRequest setUpdateOption(Boolean updateOption) {
        this.updateOption = updateOption;
        return this;
    }
    public Boolean getUpdateOption() {
        return this.updateOption;
    }

}
