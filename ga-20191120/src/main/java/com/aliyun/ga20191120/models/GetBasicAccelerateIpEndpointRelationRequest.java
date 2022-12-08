// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAccelerateIpEndpointRelationRequest extends TeaModel {
    @NameInMap("AccelerateIpId")
    public String accelerateIpId;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetBasicAccelerateIpEndpointRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBasicAccelerateIpEndpointRelationRequest self = new GetBasicAccelerateIpEndpointRelationRequest();
        return TeaModel.build(map, self);
    }

    public GetBasicAccelerateIpEndpointRelationRequest setAccelerateIpId(String accelerateIpId) {
        this.accelerateIpId = accelerateIpId;
        return this;
    }
    public String getAccelerateIpId() {
        return this.accelerateIpId;
    }

    public GetBasicAccelerateIpEndpointRelationRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public GetBasicAccelerateIpEndpointRelationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetBasicAccelerateIpEndpointRelationRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public GetBasicAccelerateIpEndpointRelationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
