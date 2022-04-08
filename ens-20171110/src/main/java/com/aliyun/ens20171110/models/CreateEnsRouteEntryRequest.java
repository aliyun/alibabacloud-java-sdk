// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEnsRouteEntryRequest extends TeaModel {
    // 自定义路由条目的描述信息。
    @NameInMap("Description")
    public String description;

    // 自定义路由条目的目标网段。
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    // 自定义路由条目的下一跳实例的ID。
    @NameInMap("NextHopId")
    public String nextHopId;

    // 自定义路由条目的下一跳的类型
    @NameInMap("NextHopType")
    public String nextHopType;

    // 要创建的自定义路由条目的名称。
    @NameInMap("RouteEntryName")
    public String routeEntryName;

    // 要创建自定义路由条目的路由表ID。
    @NameInMap("RouteTableId")
    public String routeTableId;

    public static CreateEnsRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnsRouteEntryRequest self = new CreateEnsRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnsRouteEntryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEnsRouteEntryRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public CreateEnsRouteEntryRequest setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }
    public String getNextHopId() {
        return this.nextHopId;
    }

    public CreateEnsRouteEntryRequest setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }
    public String getNextHopType() {
        return this.nextHopType;
    }

    public CreateEnsRouteEntryRequest setRouteEntryName(String routeEntryName) {
        this.routeEntryName = routeEntryName;
        return this;
    }
    public String getRouteEntryName() {
        return this.routeEntryName;
    }

    public CreateEnsRouteEntryRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

}
