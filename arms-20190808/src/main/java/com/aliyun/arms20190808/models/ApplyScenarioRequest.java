// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ApplyScenarioRequest extends TeaModel {
    // The ID of the application.
    @NameInMap("AppId")
    public String appId;

    // The configuration of the business monitoring job. The value is a JSON string. For more information about this parameter, see the following additional information about the **Config** parameter.
    @NameInMap("Config")
    public java.util.Map<String, ?> config;

    // The name of the business monitoring job.
    @NameInMap("Name")
    public String name;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The scenario where you want to use the business monitoring job. Valid values:
    // 
    // *   `USER-DEFINED`: user-defined. This is the default value.
    // *   `EDAS-ROLLOUT`: application release in Enterprise Distributed Application Service (EDAS)
    // *   `OAM-ROLLOUT`: application release based on Open Application Model (OAM)
    // *   `MSC-CANARY`: canary release based on Microservice Engine (MSE)
    @NameInMap("Scenario")
    public String scenario;

    // The code of the business monitoring job. This parameter is not required when you create a business monitoring job. However, this parameter is required when you update a business monitoring job.
    @NameInMap("Sign")
    public String sign;

    // Specifies whether to record business parameters to the trace marked with the coloring sign.
    // 
    // *   `true`
    // *   `false`: This is the default value.
    @NameInMap("SnDump")
    public Boolean snDump;

    // Specifies whether traffic in the trace marked with the coloring sign is all collected.
    // 
    // *   `true`
    // *   `false`: This is the default value.
    @NameInMap("SnForce")
    public Boolean snForce;

    // Specifies whether to count traffic based on the coloring sign.
    // 
    // *   `true`
    // *   `false`: This is the default value.
    @NameInMap("SnStat")
    public Boolean snStat;

    // Specifies whether the coloring sign is transparently passed down to downstream application nodes in the trace.
    // 
    // *   `true`
    // *   `false`: This is the default value.
    @NameInMap("SnTransfer")
    public Boolean snTransfer;

    // Specifies whether the operation is an update operation.
    // 
    // *   `true`: update
    // *   `false`: insert
    @NameInMap("UpdateOption")
    public Boolean updateOption;

    public static ApplyScenarioRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyScenarioRequest self = new ApplyScenarioRequest();
        return TeaModel.build(map, self);
    }

    public ApplyScenarioRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ApplyScenarioRequest setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    public ApplyScenarioRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

    public ApplyScenarioRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
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

    public ApplyScenarioRequest setSnStat(Boolean snStat) {
        this.snStat = snStat;
        return this;
    }
    public Boolean getSnStat() {
        return this.snStat;
    }

    public ApplyScenarioRequest setSnTransfer(Boolean snTransfer) {
        this.snTransfer = snTransfer;
        return this;
    }
    public Boolean getSnTransfer() {
        return this.snTransfer;
    }

    public ApplyScenarioRequest setUpdateOption(Boolean updateOption) {
        this.updateOption = updateOption;
        return this;
    }
    public Boolean getUpdateOption() {
        return this.updateOption;
    }

}
