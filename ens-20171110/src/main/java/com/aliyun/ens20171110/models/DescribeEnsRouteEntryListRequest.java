// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRouteEntryListRequest extends TeaModel {
    // 路由条目的目标网段
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    // 下一跳实例ID。
    @NameInMap("NextHopId")
    public String nextHopId;

    // 下一跳类型
    @NameInMap("NextHopType")
    public String nextHopType;

    // 列表的页码，默认值为1。
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页查询时每页的行数，最大值为100，默认值为10。
    @NameInMap("PageSize")
    public Integer pageSize;

    // 要查询的路由条目的ID。
    @NameInMap("RouteEntryId")
    public String routeEntryId;

    // 路由条目的名称。
    @NameInMap("RouteEntryName")
    public String routeEntryName;

    // 路由条目的类型
    @NameInMap("RouteEntryType")
    public String routeEntryType;

    // 要查询的路由表的ID。
    @NameInMap("RouteTableId")
    public String routeTableId;

    public static DescribeEnsRouteEntryListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRouteEntryListRequest self = new DescribeEnsRouteEntryListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRouteEntryListRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public DescribeEnsRouteEntryListRequest setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }
    public String getNextHopId() {
        return this.nextHopId;
    }

    public DescribeEnsRouteEntryListRequest setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }
    public String getNextHopType() {
        return this.nextHopType;
    }

    public DescribeEnsRouteEntryListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEnsRouteEntryListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEnsRouteEntryListRequest setRouteEntryId(String routeEntryId) {
        this.routeEntryId = routeEntryId;
        return this;
    }
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

    public DescribeEnsRouteEntryListRequest setRouteEntryName(String routeEntryName) {
        this.routeEntryName = routeEntryName;
        return this;
    }
    public String getRouteEntryName() {
        return this.routeEntryName;
    }

    public DescribeEnsRouteEntryListRequest setRouteEntryType(String routeEntryType) {
        this.routeEntryType = routeEntryType;
        return this;
    }
    public String getRouteEntryType() {
        return this.routeEntryType;
    }

    public DescribeEnsRouteEntryListRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

}
