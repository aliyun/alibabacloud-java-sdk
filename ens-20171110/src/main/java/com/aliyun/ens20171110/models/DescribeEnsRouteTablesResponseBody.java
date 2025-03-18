// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRouteTablesResponseBody extends TeaModel {
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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DC51ACB0-460D-5CA0-BA2D-E1F3B5547AE9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the route tables.</p>
     */
    @NameInMap("RouteTables")
    public java.util.List<DescribeEnsRouteTablesResponseBodyRouteTables> routeTables;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEnsRouteTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRouteTablesResponseBody self = new DescribeEnsRouteTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRouteTablesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEnsRouteTablesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEnsRouteTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnsRouteTablesResponseBody setRouteTables(java.util.List<DescribeEnsRouteTablesResponseBodyRouteTables> routeTables) {
        this.routeTables = routeTables;
        return this;
    }
    public java.util.List<DescribeEnsRouteTablesResponseBodyRouteTables> getRouteTables() {
        return this.routeTables;
    }

    public DescribeEnsRouteTablesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEnsRouteTablesResponseBodyRouteTables extends TeaModel {
        @NameInMap("AssociateType")
        public String associateType;

        /**
         * <p>The time when the route table was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-08T08:35:18Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the edge node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-15</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("IsDefaultGatewayRouteTable")
        public Boolean isDefaultGatewayRouteTable;

        /**
         * <p>The ID of the network.</p>
         * 
         * <strong>example:</strong>
         * <p>n-5v9lufsezl4g****</p>
         */
        @NameInMap("NetworkId")
        public String networkId;

        /**
         * <p>The ID of the route table.</p>
         * 
         * <strong>example:</strong>
         * <p>rt-5xde2bit9****</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        /**
         * <strong>example:</strong>
         * <p>test-tf-vtb7</p>
         */
        @NameInMap("RouteTableName")
        public String routeTableName;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>Available: The route table is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the route table. Valid values:</p>
         * <ul>
         * <li>Custom: custom route table.</li>
         * <li>System: system route table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The vSwitches that are associated with the route table.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        public static DescribeEnsRouteTablesResponseBodyRouteTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsRouteTablesResponseBodyRouteTables self = new DescribeEnsRouteTablesResponseBodyRouteTables();
            return TeaModel.build(map, self);
        }

        public DescribeEnsRouteTablesResponseBodyRouteTables setAssociateType(String associateType) {
            this.associateType = associateType;
            return this;
        }
        public String getAssociateType() {
            return this.associateType;
        }

        public DescribeEnsRouteTablesResponseBodyRouteTables setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeEnsRouteTablesResponseBodyRouteTables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEnsRouteTablesResponseBodyRouteTables setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeEnsRouteTablesResponseBodyRouteTables setIsDefaultGatewayRouteTable(Boolean isDefaultGatewayRouteTable) {
            this.isDefaultGatewayRouteTable = isDefaultGatewayRouteTable;
            return this;
        }
        public Boolean getIsDefaultGatewayRouteTable() {
            return this.isDefaultGatewayRouteTable;
        }

        public DescribeEnsRouteTablesResponseBodyRouteTables setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DescribeEnsRouteTablesResponseBodyRouteTables setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeEnsRouteTablesResponseBodyRouteTables setRouteTableName(String routeTableName) {
            this.routeTableName = routeTableName;
            return this;
        }
        public String getRouteTableName() {
            return this.routeTableName;
        }

        public DescribeEnsRouteTablesResponseBodyRouteTables setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEnsRouteTablesResponseBodyRouteTables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEnsRouteTablesResponseBodyRouteTables setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

}
