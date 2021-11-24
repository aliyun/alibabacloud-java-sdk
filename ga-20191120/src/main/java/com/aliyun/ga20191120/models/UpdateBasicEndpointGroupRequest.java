// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBasicEndpointGroupRequest extends TeaModel {
    // 客户端Token
    @NameInMap("ClientToken")
    public String clientToken;

    // 终端节点组描述
    @NameInMap("Description")
    public String description;

    // 终端节点地址
    @NameInMap("EndpointAddress")
    public String endpointAddress;

    // 终端节点组Id
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    // 终端节点类型
    @NameInMap("EndpointType")
    public String endpointType;

    // 终端节点组名称
    @NameInMap("Name")
    public String name;

    // Regionid
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateBasicEndpointGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBasicEndpointGroupRequest self = new UpdateBasicEndpointGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBasicEndpointGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateBasicEndpointGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateBasicEndpointGroupRequest setEndpointAddress(String endpointAddress) {
        this.endpointAddress = endpointAddress;
        return this;
    }
    public String getEndpointAddress() {
        return this.endpointAddress;
    }

    public UpdateBasicEndpointGroupRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public UpdateBasicEndpointGroupRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public UpdateBasicEndpointGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateBasicEndpointGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
