// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicEndpointGroupResponseBody extends TeaModel {
    // 全球加速实例Id
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    // 终端节点组描述
    @NameInMap("Description")
    public String description;

    // 终端节点组地址
    @NameInMap("EndpointAddress")
    public String endpointAddress;

    // 终端节点组Id
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    // 终端节点组所在地域
    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    // 终端节点类型
    @NameInMap("EndpointType")
    public String endpointType;

    // 终端节点组名称
    @NameInMap("Name")
    public String name;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 终端节点组状态
    @NameInMap("State")
    public String state;

    public static GetBasicEndpointGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBasicEndpointGroupResponseBody self = new GetBasicEndpointGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBasicEndpointGroupResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public GetBasicEndpointGroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetBasicEndpointGroupResponseBody setEndpointAddress(String endpointAddress) {
        this.endpointAddress = endpointAddress;
        return this;
    }
    public String getEndpointAddress() {
        return this.endpointAddress;
    }

    public GetBasicEndpointGroupResponseBody setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public GetBasicEndpointGroupResponseBody setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
        return this;
    }
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    public GetBasicEndpointGroupResponseBody setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public GetBasicEndpointGroupResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetBasicEndpointGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBasicEndpointGroupResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
