// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetServiceEstimateCostShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>qwertyuiop</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The information about the subscription duration.</p>
     */
    @NameInMap("Commodity")
    public String commodityShrink;

    /**
     * <p>The name of the configuration change operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter change</p>
     */
    @NameInMap("OperationName")
    public String operationName;

    /**
     * <p>The parameters that are specified to deploy the service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>{ \&quot;RegionId\&quot;: \&quot;cn-hangzhou\&quot;, \&quot;InstanceType\&quot;: \&quot;ecs.g5.large\&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

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
     * <p>service-12xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The service instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>si-d6ab3a63ccbb4b17xxxx</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    /**
     * <p>The service version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    /**
     * <p>The name of the package specification.</p>
     * 
     * <strong>example:</strong>
     * <p>Package 1</p>
     */
    @NameInMap("SpecificationName")
    public String specificationName;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>Template 1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The trial policy. Valid values:</p>
     * <ul>
     * <li>Trial: Trials are supported.</li>
     * <li>NotTrial: Trials are not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NotTrial</p>
     */
    @NameInMap("TrialType")
    public String trialType;

    public static GetServiceEstimateCostShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceEstimateCostShrinkRequest self = new GetServiceEstimateCostShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceEstimateCostShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetServiceEstimateCostShrinkRequest setCommodityShrink(String commodityShrink) {
        this.commodityShrink = commodityShrink;
        return this;
    }
    public String getCommodityShrink() {
        return this.commodityShrink;
    }

    public GetServiceEstimateCostShrinkRequest setOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }
    public String getOperationName() {
        return this.operationName;
    }

    public GetServiceEstimateCostShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public GetServiceEstimateCostShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetServiceEstimateCostShrinkRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceEstimateCostShrinkRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public GetServiceEstimateCostShrinkRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public GetServiceEstimateCostShrinkRequest setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
        return this;
    }
    public String getSpecificationName() {
        return this.specificationName;
    }

    public GetServiceEstimateCostShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetServiceEstimateCostShrinkRequest setTrialType(String trialType) {
        this.trialType = trialType;
        return this;
    }
    public String getTrialType() {
        return this.trialType;
    }

}
