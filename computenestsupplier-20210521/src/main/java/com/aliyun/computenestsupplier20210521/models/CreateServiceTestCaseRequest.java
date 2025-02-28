// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateServiceTestCaseRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-0e6fca6a51a544xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The service version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>draft</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    /**
     * <p>The template name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom_Image_Ecs</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>Service Test case name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>case1</p>
     */
    @NameInMap("TestCaseName")
    public String testCaseName;

    /**
     * <p>The service test config</p>
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

    public static CreateServiceTestCaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceTestCaseRequest self = new CreateServiceTestCaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceTestCaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateServiceTestCaseRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateServiceTestCaseRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public CreateServiceTestCaseRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateServiceTestCaseRequest setTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
        return this;
    }
    public String getTestCaseName() {
        return this.testCaseName;
    }

    public CreateServiceTestCaseRequest setTestConfig(String testConfig) {
        this.testConfig = testConfig;
        return this;
    }
    public String getTestConfig() {
        return this.testConfig;
    }

}
