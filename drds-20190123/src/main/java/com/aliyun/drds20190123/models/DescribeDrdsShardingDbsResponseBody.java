// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsShardingDbsResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShardingDbs")
    public DescribeDrdsShardingDbsResponseBodyShardingDbs shardingDbs;

    public static DescribeDrdsShardingDbsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsShardingDbsResponseBody self = new DescribeDrdsShardingDbsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsShardingDbsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsShardingDbsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsShardingDbsResponseBody setShardingDbs(DescribeDrdsShardingDbsResponseBodyShardingDbs shardingDbs) {
        this.shardingDbs = shardingDbs;
        return this;
    }
    public DescribeDrdsShardingDbsResponseBodyShardingDbs getShardingDbs() {
        return this.shardingDbs;
    }

    public static class DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb extends TeaModel {
        @NameInMap("MinPoolSize")
        public Integer minPoolSize;

        @NameInMap("MaxPoolSize")
        public Integer maxPoolSize;

        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        @NameInMap("ConnectUrl")
        public String connectUrl;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("IdleTimeOut")
        public Integer idleTimeOut;

        @NameInMap("ShardingDbName")
        public String shardingDbName;

        @NameInMap("BlockingTimeout")
        public Integer blockingTimeout;

        @NameInMap("PreparedStatementCacheSize")
        public Integer preparedStatementCacheSize;

        @NameInMap("ConnectionProperties")
        public String connectionProperties;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("DbStatus")
        public String dbStatus;

        public static DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb self = new DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setMinPoolSize(Integer minPoolSize) {
            this.minPoolSize = minPoolSize;
            return this;
        }
        public Integer getMinPoolSize() {
            return this.minPoolSize;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setMaxPoolSize(Integer maxPoolSize) {
            this.maxPoolSize = maxPoolSize;
            return this;
        }
        public Integer getMaxPoolSize() {
            return this.maxPoolSize;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setIdleTimeOut(Integer idleTimeOut) {
            this.idleTimeOut = idleTimeOut;
            return this;
        }
        public Integer getIdleTimeOut() {
            return this.idleTimeOut;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setShardingDbName(String shardingDbName) {
            this.shardingDbName = shardingDbName;
            return this;
        }
        public String getShardingDbName() {
            return this.shardingDbName;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setBlockingTimeout(Integer blockingTimeout) {
            this.blockingTimeout = blockingTimeout;
            return this;
        }
        public Integer getBlockingTimeout() {
            return this.blockingTimeout;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setPreparedStatementCacheSize(Integer preparedStatementCacheSize) {
            this.preparedStatementCacheSize = preparedStatementCacheSize;
            return this;
        }
        public Integer getPreparedStatementCacheSize() {
            return this.preparedStatementCacheSize;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setConnectionProperties(String connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }
        public String getConnectionProperties() {
            return this.connectionProperties;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setDbStatus(String dbStatus) {
            this.dbStatus = dbStatus;
            return this;
        }
        public String getDbStatus() {
            return this.dbStatus;
        }

    }

    public static class DescribeDrdsShardingDbsResponseBodyShardingDbs extends TeaModel {
        @NameInMap("ShardingDb")
        public java.util.List<DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb> shardingDb;

        public static DescribeDrdsShardingDbsResponseBodyShardingDbs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsShardingDbsResponseBodyShardingDbs self = new DescribeDrdsShardingDbsResponseBodyShardingDbs();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbs setShardingDb(java.util.List<DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb> shardingDb) {
            this.shardingDb = shardingDb;
            return this;
        }
        public java.util.List<DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb> getShardingDb() {
            return this.shardingDb;
        }

    }

}
