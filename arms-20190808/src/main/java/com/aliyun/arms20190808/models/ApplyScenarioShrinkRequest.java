// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ApplyScenarioShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b590lhguqs@28f515462f******</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The configuration of the business monitoring job. The value is a JSON string. For more information about this parameter, see the following additional information about the <strong>Config</strong> parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;rpcType&quot;:&quot;0&quot;,&quot;nameMatchType&quot;:&quot;EQUALS&quot;,&quot;service&quot;:&quot;/api/pop/test&quot;,&quot;operator&quot;:&quot;and&quot;,&quot;filterItems&quot;:[{&quot;type&quot;:&quot;HttpHeaders&quot;,&quot;key&quot;:&quot;uid&quot;,&quot;opt&quot;:&quot;==&quot;,&quot;value&quot;:&quot;123456789&quot;}],&quot;group&quot;:{&quot;type&quot;:&quot;HttpRequestParameters&quot;,&quot;key&quot;:&quot;name&quot;}}</p>
     */
    @NameInMap("Config")
    public String configShrink;

    /**
     * <p>The name of the business monitoring job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ScenarioName</p>
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
     * <p>The scenario where you want to use the business monitoring job. Valid values:</p>
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
     * <p>The code of the business monitoring job. This parameter is not required when you create a business monitoring job. However, this parameter is required when you update a business monitoring job.</p>
     * 
     * <strong>example:</strong>
     * <p>a9f8****</p>
     */
    @NameInMap("Sign")
    public String sign;

    /**
     * <p>Specifies whether to record business parameters to the trace marked with the coloring sign.</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code>: This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SnDump")
    public Boolean snDump;

    /**
     * <p>Specifies whether traffic in the trace marked with the coloring sign is all collected.</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code>: This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SnForce")
    public Boolean snForce;

    /**
     * <p>Specifies whether to count traffic based on the coloring sign.</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code>: This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SnStat")
    public Boolean snStat;

    /**
     * <p>Specifies whether the coloring sign is transparently passed down to downstream application nodes in the trace.</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code>: This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SnTransfer")
    public Boolean snTransfer;

    /**
     * <p>Specifies whether the operation is an update operation.</p>
     * <ul>
     * <li><code>true</code>: update</li>
     * <li><code>false</code>: insert</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
