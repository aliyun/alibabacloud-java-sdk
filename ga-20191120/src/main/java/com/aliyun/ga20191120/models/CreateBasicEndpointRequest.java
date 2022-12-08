// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicEndpointRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EndpointAddress")
    public String endpointAddress;

    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    @NameInMap("EndpointSubAddress")
    public String endpointSubAddress;

    @NameInMap("EndpointSubAddressType")
    public String endpointSubAddressType;

    @NameInMap("EndpointType")
    public String endpointType;

    @NameInMap("EndpointZoneId")
    public String endpointZoneId;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateBasicEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicEndpointRequest self = new CreateBasicEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateBasicEndpointRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateBasicEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBasicEndpointRequest setEndpointAddress(String endpointAddress) {
        this.endpointAddress = endpointAddress;
        return this;
    }
    public String getEndpointAddress() {
        return this.endpointAddress;
    }

    public CreateBasicEndpointRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public CreateBasicEndpointRequest setEndpointSubAddress(String endpointSubAddress) {
        this.endpointSubAddress = endpointSubAddress;
        return this;
    }
    public String getEndpointSubAddress() {
        return this.endpointSubAddress;
    }

    public CreateBasicEndpointRequest setEndpointSubAddressType(String endpointSubAddressType) {
        this.endpointSubAddressType = endpointSubAddressType;
        return this;
    }
    public String getEndpointSubAddressType() {
        return this.endpointSubAddressType;
    }

    public CreateBasicEndpointRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public CreateBasicEndpointRequest setEndpointZoneId(String endpointZoneId) {
        this.endpointZoneId = endpointZoneId;
        return this;
    }
    public String getEndpointZoneId() {
        return this.endpointZoneId;
    }

    public CreateBasicEndpointRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBasicEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
