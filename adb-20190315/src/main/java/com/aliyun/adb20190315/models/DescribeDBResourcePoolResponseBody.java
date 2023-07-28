// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBResourcePoolResponseBody extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Details of the resource group.</p>
     */
    @NameInMap("PoolsInfo")
    public java.util.List<DescribeDBResourcePoolResponseBodyPoolsInfo> poolsInfo;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBResourcePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBResourcePoolResponseBody self = new DescribeDBResourcePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBResourcePoolResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBResourcePoolResponseBody setPoolsInfo(java.util.List<DescribeDBResourcePoolResponseBodyPoolsInfo> poolsInfo) {
        this.poolsInfo = poolsInfo;
        return this;
    }
    public java.util.List<DescribeDBResourcePoolResponseBodyPoolsInfo> getPoolsInfo() {
        return this.poolsInfo;
    }

    public DescribeDBResourcePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBResourcePoolResponseBodyPoolsInfo extends TeaModel {
        /**
         * <p>The time when the resource group was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The number of nodes.</p>
         * <br>
         * <p>>  Each node consumes 16 cores and 64 GB memory.</p>
         */
        @NameInMap("NodeNum")
        public Integer nodeNum;

        /**
         * <p>The name of the resource group.</p>
         */
        @NameInMap("PoolName")
        public String poolName;

        /**
         * <p>The database accounts that are associated with the resource group.</p>
         */
        @NameInMap("PoolUsers")
        public String poolUsers;

        /**
         * <p>The mode in which SQL statements are executed.</p>
         * <br>
         * <p>*   **batch**</p>
         * <p>*   **interactive**</p>
         * <br>
         * <p>>  For more information, see [Query execution modes](~~189502~~).</p>
         */
        @NameInMap("QueryType")
        public String queryType;

        /**
         * <p>The time when the resource group was updated.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeDBResourcePoolResponseBodyPoolsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourcePoolResponseBodyPoolsInfo self = new DescribeDBResourcePoolResponseBodyPoolsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourcePoolResponseBodyPoolsInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBResourcePoolResponseBodyPoolsInfo setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        public DescribeDBResourcePoolResponseBodyPoolsInfo setPoolName(String poolName) {
            this.poolName = poolName;
            return this;
        }
        public String getPoolName() {
            return this.poolName;
        }

        public DescribeDBResourcePoolResponseBodyPoolsInfo setPoolUsers(String poolUsers) {
            this.poolUsers = poolUsers;
            return this;
        }
        public String getPoolUsers() {
            return this.poolUsers;
        }

        public DescribeDBResourcePoolResponseBodyPoolsInfo setQueryType(String queryType) {
            this.queryType = queryType;
            return this;
        }
        public String getQueryType() {
            return this.queryType;
        }

        public DescribeDBResourcePoolResponseBodyPoolsInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
