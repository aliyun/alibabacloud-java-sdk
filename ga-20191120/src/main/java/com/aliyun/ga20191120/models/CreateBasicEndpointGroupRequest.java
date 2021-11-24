// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicEndpointGroupRequest extends TeaModel {
    // 全球加速实例Id
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    // 客户端Token
    @NameInMap("ClientToken")
    public String clientToken;

    // 终端节点组描述
    @NameInMap("Description")
    public String description;

    // 终端节点地址
    @NameInMap("EndpointAddress")
    public String endpointAddress;

    // 终端节点组所在地域
    @NameInMap("EndpointGroupRegion")
    public String endpointGroupRegion;

    // 终端节点类型
    @NameInMap("EndpointType")
    public String endpointType;

    // 终端节点组名称
    @NameInMap("Name")
    public String name;

    // Regionid
    @NameInMap("RegionId")
    public String regionId;

    public static CreateBasicEndpointGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicEndpointGroupRequest self = new CreateBasicEndpointGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateBasicEndpointGroupRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateBasicEndpointGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBasicEndpointGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBasicEndpointGroupRequest setEndpointAddress(String endpointAddress) {
        this.endpointAddress = endpointAddress;
        return this;
    }
    public String getEndpointAddress() {
        return this.endpointAddress;
    }

    public CreateBasicEndpointGroupRequest setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
        return this;
    }
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    public CreateBasicEndpointGroupRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public CreateBasicEndpointGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBasicEndpointGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
