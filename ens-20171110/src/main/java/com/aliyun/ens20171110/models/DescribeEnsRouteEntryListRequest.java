// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRouteEntryListRequest extends TeaModel {
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    @NameInMap("NextHopId")
    public String nextHopId;

    @NameInMap("NextHopType")
    public String nextHopType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RouteEntryId")
    public String routeEntryId;

    @NameInMap("RouteEntryName")
    public String routeEntryName;

    @NameInMap("RouteEntryType")
    public String routeEntryType;

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
