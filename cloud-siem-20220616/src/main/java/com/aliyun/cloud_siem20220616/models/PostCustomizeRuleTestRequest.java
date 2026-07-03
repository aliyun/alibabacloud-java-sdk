// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostCustomizeRuleTestRequest extends TeaModel {
    /**
     * <p>The ID of the custom rule.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The region where the Data Management center of threat analysis is located. Select the region based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland or China (Hong Kong).</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are in regions outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member that the administrator wants to impersonate to view data.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type.</p>
     * <ul>
     * <li><p>0: the view of the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>1: the view of all accounts in the enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The simulated data for the test. This parameter is required only when TestType is set to simulate.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;,&quot;key3&quot;:&quot;value3&quot;,&quot;key4&quot;:&quot;value4&quot;,&quot;key5&quot;:&quot;value5&quot;}]</p>
     */
    @NameInMap("SimulatedData")
    public String simulatedData;

    /**
     * <p>The test type. Valid values:</p>
     * <ul>
     * <li><p>simulate: tests the rule with simulated data</p>
     * </li>
     * <li><p>business: tests the rule with business data</p>
     * </li>
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
