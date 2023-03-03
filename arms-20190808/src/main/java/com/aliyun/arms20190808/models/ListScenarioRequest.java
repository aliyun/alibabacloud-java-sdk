// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListScenarioRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the business monitoring job.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The scenario where the business monitoring job is used. Valid values:</p>
     * <br>
     * <p>*   `USER-DEFINED`: user-defined. This is the default value.</p>
     * <p>*   `EDAS-ROLLOUT`: application release in Enterprise Distributed Application Service (EDAS)</p>
     * <p>*   `OAM-ROLLOUT`: application release based on Open Application Model (OAM)</p>
     * <p>*   `MSC-CANARY`: canary release based on Microservice Engine (MSE)</p>
     */
    @NameInMap("Scenario")
    public String scenario;

    /**
     * <p>The code of the business monitoring job. Set this parameter when you know the code of the business monitoring job you want to query.</p>
     */
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
