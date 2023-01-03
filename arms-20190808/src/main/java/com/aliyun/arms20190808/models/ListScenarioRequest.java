// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListScenarioRequest extends TeaModel {
    // The ID of the application.
    @NameInMap("AppId")
    public String appId;

    // The name of the business monitoring job.
    @NameInMap("Name")
    public String name;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The scenario where the business monitoring job is used. Valid values:
    // 
    // *   `USER-DEFINED`: user-defined. This is the default value.
    // *   `EDAS-ROLLOUT`: application release in Enterprise Distributed Application Service (EDAS)
    // *   `OAM-ROLLOUT`: application release based on Open Application Model (OAM)
    // *   `MSC-CANARY`: canary release based on Microservice Engine (MSE)
    @NameInMap("Scenario")
    public String scenario;

    // The code of the business monitoring job. Set this parameter when you know the code of the business monitoring job you want to query.
    @NameInMap("Sign")
    public String sign;

    public static ListScenarioRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScenarioRequest self = new ListScenarioRequest();
        return TeaModel.build(map, self);
    }

    public ListScenarioRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListScenarioRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListScenarioRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListScenarioRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public ListScenarioRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

}
