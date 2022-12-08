// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAccelerateIpEndpointRelationResponseBody extends TeaModel {
    @NameInMap("AccelerateIpId")
    public String accelerateIpId;

    @NameInMap("EndpointAddress")
    public String endpointAddress;

    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("EndpointName")
    public String endpointName;

    @NameInMap("EndpointSubAddress")
    public String endpointSubAddress;

    @NameInMap("EndpointSubAddressType")
    public String endpointSubAddressType;

    @NameInMap("EndpointType")
    public String endpointType;

    @NameInMap("EndpointZoneId")
    public String endpointZoneId;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public String state;

    public static GetBasicAccelerateIpEndpointRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBasicAccelerateIpEndpointRelationResponseBody self = new GetBasicAccelerateIpEndpointRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setAccelerateIpId(String accelerateIpId) {
        this.accelerateIpId = accelerateIpId;
        return this;
    }
    public String getAccelerateIpId() {
        return this.accelerateIpId;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointAddress(String endpointAddress) {
        this.endpointAddress = endpointAddress;
        return this;
    }
    public String getEndpointAddress() {
        return this.endpointAddress;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointSubAddress(String endpointSubAddress) {
        this.endpointSubAddress = endpointSubAddress;
        return this;
    }
    public String getEndpointSubAddress() {
        return this.endpointSubAddress;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointSubAddressType(String endpointSubAddressType) {
        this.endpointSubAddressType = endpointSubAddressType;
        return this;
    }
    public String getEndpointSubAddressType() {
        return this.endpointSubAddressType;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setEndpointZoneId(String endpointZoneId) {
        this.endpointZoneId = endpointZoneId;
        return this;
    }
    public String getEndpointZoneId() {
        return this.endpointZoneId;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBasicAccelerateIpEndpointRelationResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
