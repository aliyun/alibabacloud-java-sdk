// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ContinueDeployServiceInstanceRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static ContinueDeployServiceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ContinueDeployServiceInstanceRequest self = new ContinueDeployServiceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ContinueDeployServiceInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ContinueDeployServiceInstanceRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ContinueDeployServiceInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ContinueDeployServiceInstanceRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

}
