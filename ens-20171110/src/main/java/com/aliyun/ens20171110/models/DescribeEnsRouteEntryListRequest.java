// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRouteEntryListRequest extends TeaModel {
    /**
     * <p>The destination Classless Inter-Domain Routing (CIDR) block of the route entry.</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>The ID of the next hop.</p>
     */
    @NameInMap("NextHopId")
    public String nextHopId;

    /**
     * <p>The type of next hop of the custom route entry. Valid values:</p>
     * <br>
     * <p>*   Instance: an ENS instance.</p>
     */
    @NameInMap("NextHopType")
    public String nextHopType;

    /**
     * <p>The page number of the returned page. Valid values: integers that are greater than 0. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Valid values: 10 to 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the route that you want to query.</p>
     */
    @NameInMap("RouteEntryId")
    public String routeEntryId;

    /**
     * <p>The name of the route.</p>
     */
    @NameInMap("RouteEntryName")
    public String routeEntryName;

    /**
     * <p>The route type. Valid values:</p>
     * <br>
     * <p>*   Custom: custom route</p>
     * <p>*   System: system route</p>
     */
    @NameInMap("RouteEntryType")
    public String routeEntryType;

    /**
     * <p>The ID of the route table that you want to query.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
