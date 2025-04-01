// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRouteTablesRequest extends TeaModel {
    /**
     * <p>The type of the route table. Valid values:</p>
     * <ul>
     * <li><strong>VSwitch</strong> (default): vSwitch route table</li>
     * <li><strong>Gateway</strong>: gateway route table</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Gateway</p>
     */
    @NameInMap("AssociateType")
    public String associateType;

    /**
     * <p>The ID of the ENS node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-xian-unicom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The IDs of edge nodes. You can specify 1 to 100 IDs.</p>
     */
    @NameInMap("EnsRegionIds")
    public java.util.List<String> ensRegionIds;

    /**
     * <p>The ID of the network.</p>
     * 
     * <strong>example:</strong>
     * <p>n-257gqcdfvx6n****</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the route table.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-5p1cifr72di****</p>
     */
    @NameInMap("RouteTableId")
    public String routeTableId;

    /**
     * <p>The name of the route table that you want to query.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>tftest-nat04</p>
     */
    @NameInMap("RouteTableName")
    public String routeTableName;

    /**
     * <p>The type of the NAT.</p>
     * <ul>
     * <li>Empty: symmetric NAT.</li>
     * <li>FullCone: full cone NAT.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FullCone</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeEnsRouteTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRouteTablesRequest self = new DescribeEnsRouteTablesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRouteTablesRequest setAssociateType(String associateType) {
        this.associateType = associateType;
        return this;
    }
    public String getAssociateType() {
        return this.associateType;
    }

    public DescribeEnsRouteTablesRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeEnsRouteTablesRequest setEnsRegionIds(java.util.List<String> ensRegionIds) {
        this.ensRegionIds = ensRegionIds;
        return this;
    }
    public java.util.List<String> getEnsRegionIds() {
        return this.ensRegionIds;
    }

    public DescribeEnsRouteTablesRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public DescribeEnsRouteTablesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEnsRouteTablesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEnsRouteTablesRequest setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public DescribeEnsRouteTablesRequest setRouteTableName(String routeTableName) {
        this.routeTableName = routeTableName;
        return this;
    }
    public String getRouteTableName() {
        return this.routeTableName;
    }

    public DescribeEnsRouteTablesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
