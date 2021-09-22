// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateDeploymentVersionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeploymentId")
    public String deploymentId;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("Version")
    public String version;

    @NameInMap("DeployType")
    public String deployType;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    public static CreateDeploymentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentVersionResponseBody self = new CreateDeploymentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeploymentVersionResponseBody setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public CreateDeploymentVersionResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateDeploymentVersionResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateDeploymentVersionResponseBody setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public CreateDeploymentVersionResponseBody setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

}
