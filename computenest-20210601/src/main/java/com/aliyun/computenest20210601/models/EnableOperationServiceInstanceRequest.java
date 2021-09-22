// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class EnableOperationServiceInstanceRequest extends TeaModel {
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static EnableOperationServiceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableOperationServiceInstanceRequest self = new EnableOperationServiceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public EnableOperationServiceInstanceRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public EnableOperationServiceInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
