// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class InitDtsRdsInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("EndpointInstanceType")
    public String endpointInstanceType;

    @NameInMap("EndpointRegion")
    public String endpointRegion;

    @NameInMap("EndpointInstanceId")
    public String endpointInstanceId;

    @NameInMap("EndpointCenId")
    public String endpointCenId;

    public static InitDtsRdsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        InitDtsRdsInstanceRequest self = new InitDtsRdsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public InitDtsRdsInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InitDtsRdsInstanceRequest setEndpointInstanceType(String endpointInstanceType) {
        this.endpointInstanceType = endpointInstanceType;
        return this;
    }
    public String getEndpointInstanceType() {
        return this.endpointInstanceType;
    }

    public InitDtsRdsInstanceRequest setEndpointRegion(String endpointRegion) {
        this.endpointRegion = endpointRegion;
        return this;
    }
    public String getEndpointRegion() {
        return this.endpointRegion;
    }

    public InitDtsRdsInstanceRequest setEndpointInstanceId(String endpointInstanceId) {
        this.endpointInstanceId = endpointInstanceId;
        return this;
    }
    public String getEndpointInstanceId() {
        return this.endpointInstanceId;
    }

    public InitDtsRdsInstanceRequest setEndpointCenId(String endpointCenId) {
        this.endpointCenId = endpointCenId;
        return this;
    }
    public String getEndpointCenId() {
        return this.endpointCenId;
    }

}
