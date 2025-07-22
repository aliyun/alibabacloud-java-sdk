// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRouteTableListRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RouteTableId")
    public String routeTableId;

    @NameInMap("RouteTableName")
    public String routeTableName;

    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeRouteTableListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteTableListRequest self = new DescribeRouteTableListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRouteTableListRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeRouteTableListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRouteTableListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRouteTableListRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public DescribeRouteTableListRequest setRouteTableName(String routeTableName) {
        this.routeTableName = routeTableName;
        return this;
    }
    public String getRouteTableName() {
        return this.routeTableName;
    }

    public DescribeRouteTableListRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
