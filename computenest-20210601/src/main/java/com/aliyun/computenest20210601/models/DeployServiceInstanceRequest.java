// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class DeployServiceInstanceRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeployServiceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployServiceInstanceRequest self = new DeployServiceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeployServiceInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeployServiceInstanceRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public DeployServiceInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
