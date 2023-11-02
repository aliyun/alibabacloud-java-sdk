// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostCustomizeRuleTestRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SimulatedData")
    public String simulatedData;

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
