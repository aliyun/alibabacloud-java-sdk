// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceAttributeRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static UpdateServiceInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceInstanceAttributeRequest self = new UpdateServiceInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceInstanceAttributeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateServiceInstanceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateServiceInstanceAttributeRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

}
