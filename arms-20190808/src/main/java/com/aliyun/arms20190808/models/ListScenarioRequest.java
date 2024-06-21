// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListScenarioRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b590lhguqs@28f515462******</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the business monitoring job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pro-content</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-zhangjaikou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The scenario where the business monitoring job is used. Valid values:</p>
     * <ul>
     * <li><code>USER-DEFINED</code>: user-defined. This is the default value.</li>
     * <li><code>EDAS-ROLLOUT</code>: application release in Enterprise Distributed Application Service (EDAS)</li>
     * <li><code>OAM-ROLLOUT</code>: application release based on Open Application Model (OAM)</li>
     * <li><code>MSC-CANARY</code>: canary release based on Microservice Engine (MSE)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER-DEFINED</p>
     */
    @NameInMap("Scenario")
    public String scenario;

    /**
     * <p>The code of the business monitoring job. Set this parameter when you know the code of the business monitoring job you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>a9f8****</p>
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
