// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceTemplateParameterConstraintsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeployRegionId")
    public String deployRegionId;

    @NameInMap("EnablePrivateVpcConnection")
    public Boolean enablePrivateVpcConnection;

    @NameInMap("Parameters")
    public java.util.List<GetServiceTemplateParameterConstraintsRequestParameters> parameters;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    @NameInMap("TemplateName")
    public String templateName;

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

    public GetServiceTemplateParameterConstraintsRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public static class GetServiceTemplateParameterConstraintsRequestParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

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
