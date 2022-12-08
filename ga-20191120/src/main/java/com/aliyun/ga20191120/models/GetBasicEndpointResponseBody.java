// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicEndpointResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("EndPointId")
    public String endPointId;

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

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public String state;

    public static GetBasicEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBasicEndpointResponseBody self = new GetBasicEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBasicEndpointResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public GetBasicEndpointResponseBody setEndPointId(String endPointId) {
        this.endPointId = endPointId;
        return this;
    }
    public String getEndPointId() {
        return this.endPointId;
    }

    public GetBasicEndpointResponseBody setEndpointAddress(String endpointAddress) {
        this.endpointAddress = endpointAddress;
        return this;
    }
    public String getEndpointAddress() {
        return this.endpointAddress;
    }

    public GetBasicEndpointResponseBody setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public GetBasicEndpointResponseBody setEndpointSubAddress(String endpointSubAddress) {
        this.endpointSubAddress = endpointSubAddress;
        return this;
    }
    public String getEndpointSubAddress() {
        return this.endpointSubAddress;
    }

    public GetBasicEndpointResponseBody setEndpointSubAddressType(String endpointSubAddressType) {
        this.endpointSubAddressType = endpointSubAddressType;
        return this;
    }
    public String getEndpointSubAddressType() {
        return this.endpointSubAddressType;
    }

    public GetBasicEndpointResponseBody setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public GetBasicEndpointResponseBody setEndpointZoneId(String endpointZoneId) {
        this.endpointZoneId = endpointZoneId;
        return this;
    }
    public String getEndpointZoneId() {
        return this.endpointZoneId;
    }

    public GetBasicEndpointResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetBasicEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBasicEndpointResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
