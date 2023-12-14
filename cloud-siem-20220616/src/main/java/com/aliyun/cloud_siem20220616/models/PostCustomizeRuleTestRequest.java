// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostCustomizeRuleTestRequest extends TeaModel {
    /**
     * <p>The ID of the rule.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the region in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions inside China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The simulation data for the testing. This parameter is available only when TestType is set to simulate.</p>
     */
    @NameInMap("SimulatedData")
    public String simulatedData;

    /**
     * <p>The testing type. Valid values:</p>
     * <br>
     * <p>*   simulate: simulation data test</p>
     * <p>*   business: business data test</p>
     */
    @NameInMap("TestType")
    public String testType;

    public static PostCustomizeRuleTestRequest build(java.util.Map<String, ?> map) throws Exception {
        PostCustomizeRuleTestRequest self = new PostCustomizeRuleTestRequest();
        return TeaModel.build(map, self);
    }

    public PostCustomizeRuleTestRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PostCustomizeRuleTestRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PostCustomizeRuleTestRequest setSimulatedData(String simulatedData) {
        this.simulatedData = simulatedData;
        return this;
    }
    public String getSimulatedData() {
        return this.simulatedData;
    }

    public PostCustomizeRuleTestRequest setTestType(String testType) {
        this.testType = testType;
        return this;
    }
    public String getTestType() {
        return this.testType;
    }

}
