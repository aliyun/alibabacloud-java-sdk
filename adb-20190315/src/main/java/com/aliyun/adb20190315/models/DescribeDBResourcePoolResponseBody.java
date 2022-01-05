// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBResourcePoolResponseBody extends TeaModel {
    @NameInMap("PoolsInfo")
    public java.util.List<DescribeDBResourcePoolResponseBodyPoolsInfo> poolsInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBResourcePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBResourcePoolResponseBody self = new DescribeDBResourcePoolResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("NodeNum")
        public Integer nodeNum;

        @NameInMap("PoolName")
        public String poolName;

        @NameInMap("PoolUsers")
        public String poolUsers;

        @NameInMap("QueryType")
        public String queryType;

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
