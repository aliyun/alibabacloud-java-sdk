// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetServiceTemplateParameterConstraintsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. Generate a unique value from your client for each request. The token can contain only ASCII characters and cannot be more than 64 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The deployment region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DeployRegionId")
    public String deployRegionId;

    /**
     * <p>Indicates whether PrivateLink is enabled. Valid values:</p>
     * <ul>
     * <li><p>true: enabled</p>
     * </li>
     * <li><p>false: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnablePrivateVpcConnection")
    public Boolean enablePrivateVpcConnection;

    /**
     * <p>The configuration parameters of the service instance.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<GetServiceTemplateParameterConstraintsRequestParameters> parameters;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
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
     * <p>service-731f788406024axxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The service instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>si-461ee95f46ca46xxxxxx</p>
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
     * <p>The specification name.</p>
     * 
     * <strong>example:</strong>
     * <p>Package 1</p>
     */
    @NameInMap("SpecificationName")
    public String specificationName;

    /**
     * <p>The template name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Template 1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The usage type. Valid values:</p>
     * <ul>
     * <li><p>Trial: The service supports a trial.</p>
     * </li>
     * <li><p>NotTrial: The service does not support a trial.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NotTrial</p>
     */
    @NameInMap("TrialType")
    public String trialType;

    public static GetServiceTemplateParameterConstraintsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceTemplateParameterConstraintsRequest self = new GetServiceTemplateParameterConstraintsRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceTemplateParameterConstraintsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetServiceTemplateParameterConstraintsRequest setDeployRegionId(String deployRegionId) {
        this.deployRegionId = deployRegionId;
        return this;
    }
    public String getDeployRegionId() {
        return this.deployRegionId;
    }

    public GetServiceTemplateParameterConstraintsRequest setEnablePrivateVpcConnection(Boolean enablePrivateVpcConnection) {
        this.enablePrivateVpcConnection = enablePrivateVpcConnection;
        return this;
    }
    public Boolean getEnablePrivateVpcConnection() {
        return this.enablePrivateVpcConnection;
    }

    public GetServiceTemplateParameterConstraintsRequest setParameters(java.util.List<GetServiceTemplateParameterConstraintsRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetServiceTemplateParameterConstraintsRequestParameters> getParameters() {
        return this.parameters;
    }

    public GetServiceTemplateParameterConstraintsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetServiceTemplateParameterConstraintsRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceTemplateParameterConstraintsRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public GetServiceTemplateParameterConstraintsRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public GetServiceTemplateParameterConstraintsRequest setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
        return this;
    }
    public String getSpecificationName() {
        return this.specificationName;
    }

    public GetServiceTemplateParameterConstraintsRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetServiceTemplateParameterConstraintsRequest setTrialType(String trialType) {
        this.trialType = trialType;
        return this;
    }
    public String getTrialType() {
        return this.trialType;
    }

    public static class GetServiceTemplateParameterConstraintsRequestParameters extends TeaModel {
        /**
         * <p>The name of the parameter. If you do not specify the name and value of the parameter, Resource Orchestration Service (ROS) uses the default value that is specified in the template.</p>
         * <blockquote>
         * <p>The Parameters parameter is optional. If you specify Parameters, ParameterKey is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>InstanceType</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter that is defined in the template.</p>
         * <blockquote>
         * <p>The Parameters parameter is optional. If you specify Parameters, ParameterValue is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static GetServiceTemplateParameterConstraintsRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetServiceTemplateParameterConstraintsRequestParameters self = new GetServiceTemplateParameterConstraintsRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetServiceTemplateParameterConstraintsRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetServiceTemplateParameterConstraintsRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
