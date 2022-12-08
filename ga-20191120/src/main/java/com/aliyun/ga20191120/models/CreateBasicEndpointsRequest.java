// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicEndpointsRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    @NameInMap("Endpoints")
    public java.util.List<CreateBasicEndpointsRequestEndpoints> endpoints;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateBasicEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicEndpointsRequest self = new CreateBasicEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public CreateBasicEndpointsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateBasicEndpointsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBasicEndpointsRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public CreateBasicEndpointsRequest setEndpoints(java.util.List<CreateBasicEndpointsRequestEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<CreateBasicEndpointsRequestEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public CreateBasicEndpointsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateBasicEndpointsRequestEndpoints extends TeaModel {
        @NameInMap("EndpointAddress")
        public String endpointAddress;

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

        public static CreateBasicEndpointsRequestEndpoints build(java.util.Map<String, ?> map) throws Exception {
            CreateBasicEndpointsRequestEndpoints self = new CreateBasicEndpointsRequestEndpoints();
            return TeaModel.build(map, self);
        }

        public CreateBasicEndpointsRequestEndpoints setEndpointAddress(String endpointAddress) {
            this.endpointAddress = endpointAddress;
            return this;
        }
        public String getEndpointAddress() {
            return this.endpointAddress;
        }

        public CreateBasicEndpointsRequestEndpoints setEndpointSubAddress(String endpointSubAddress) {
            this.endpointSubAddress = endpointSubAddress;
            return this;
        }
        public String getEndpointSubAddress() {
            return this.endpointSubAddress;
        }

        public CreateBasicEndpointsRequestEndpoints setEndpointSubAddressType(String endpointSubAddressType) {
            this.endpointSubAddressType = endpointSubAddressType;
            return this;
        }
        public String getEndpointSubAddressType() {
            return this.endpointSubAddressType;
        }

        public CreateBasicEndpointsRequestEndpoints setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public CreateBasicEndpointsRequestEndpoints setEndpointZoneId(String endpointZoneId) {
            this.endpointZoneId = endpointZoneId;
            return this;
        }
        public String getEndpointZoneId() {
            return this.endpointZoneId;
        }

        public CreateBasicEndpointsRequestEndpoints setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
