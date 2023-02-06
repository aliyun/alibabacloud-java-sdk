// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static GetServiceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceInstanceRequest self = new GetServiceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetServiceInstanceRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

}
