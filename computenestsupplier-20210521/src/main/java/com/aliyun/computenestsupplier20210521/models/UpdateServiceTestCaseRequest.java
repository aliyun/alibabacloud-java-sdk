// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateServiceTestCaseRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service test case id.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stc-2deec15c20b24aaf9f16</p>
     */
    @NameInMap("TestCaseId")
    public String testCaseId;

    /**
     * <p>The service test case name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>case1</p>
     */
    @NameInMap("TestCaseName")
    public String testCaseName;

    /**
     * <p>The service test config.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     * <p>parameters:
     *   PayType: &quot;PostPaid&quot;
     *   EcsInstanceType: &quot;$[iact3-auto]&quot;
     *   InstancePassword: &quot;$[iact3-auto]&quot;</p>
     */
    @NameInMap("TestConfig")
    public String testConfig;

    public static UpdateServiceTestCaseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceTestCaseRequest self = new UpdateServiceTestCaseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceTestCaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateServiceTestCaseRequest setTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
        return this;
    }
    public String getTestCaseId() {
        return this.testCaseId;
    }

    public UpdateServiceTestCaseRequest setTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
        return this;
    }
    public String getTestCaseName() {
        return this.testCaseName;
    }

    public UpdateServiceTestCaseRequest setTestConfig(String testConfig) {
        this.testConfig = testConfig;
        return this;
    }
    public String getTestConfig() {
        return this.testConfig;
    }

}
