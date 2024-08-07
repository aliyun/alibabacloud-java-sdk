// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostCustomizeRuleTestRequest extends TeaModel {
    /**
     * <p>The ID of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the region in which your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions inside China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the account that you switch from the management account.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view. Valid values:</p>
     * <ul>
     * <li>0: the current Alibaba Cloud account</li>
     * <li>1: the global account</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The simulation data for the test. This parameter is available only when TestType is set to simulate.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;,&quot;key3&quot;:&quot;value3&quot;,&quot;key4&quot;:&quot;value4&quot;,&quot;key5&quot;:&quot;value5&quot;}]</p>
     */
    @NameInMap("SimulatedData")
    public String simulatedData;

    /**
     * <p>The test type. Valid values:</p>
     * <ul>
     * <li>simulate: simulation data test</li>
     * <li>business: business data test</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>simulate</p>
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

    public PostCustomizeRuleTestRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public PostCustomizeRuleTestRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
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
