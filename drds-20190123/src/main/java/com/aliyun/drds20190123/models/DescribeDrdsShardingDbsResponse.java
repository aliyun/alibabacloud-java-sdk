// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsShardingDbsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ShardingDbs")
    @Validation(required = true)
    public DescribeDrdsShardingDbsResponseShardingDbs shardingDbs;

    public static DescribeDrdsShardingDbsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsShardingDbsResponse self = new DescribeDrdsShardingDbsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsShardingDbsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsShardingDbsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsShardingDbsResponse setShardingDbs(DescribeDrdsShardingDbsResponseShardingDbs shardingDbs) {
        this.shardingDbs = shardingDbs;
        return this;
    }
    public DescribeDrdsShardingDbsResponseShardingDbs getShardingDbs() {
        return this.shardingDbs;
    }

    public static class DescribeDrdsShardingDbsResponseShardingDbsShardingDb extends TeaModel {
        @NameInMap("ShardingDbName")
        @Validation(required = true)
        public String shardingDbName;

        @NameInMap("DbInstanceId")
        @Validation(required = true)
        public String dbInstanceId;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("DbStatus")
        @Validation(required = true)
        public String dbStatus;

        @NameInMap("DbType")
        @Validation(required = true)
        public String dbType;

        @NameInMap("MinPoolSize")
        @Validation(required = true)
        public Integer minPoolSize;

        @NameInMap("MaxPoolSize")
        @Validation(required = true)
        public Integer maxPoolSize;

        @NameInMap("IdleTimeOut")
        @Validation(required = true)
        public Integer idleTimeOut;

        @NameInMap("BlockingTimeout")
        @Validation(required = true)
        public Integer blockingTimeout;

        @NameInMap("ConnectionProperties")
        @Validation(required = true)
        public String connectionProperties;

        @NameInMap("PreparedStatementCacheSize")
        @Validation(required = true)
        public Integer preparedStatementCacheSize;

        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("ConnectUrl")
        @Validation(required = true)
        public String connectUrl;

        public static DescribeDrdsShardingDbsResponseShardingDbsShardingDb build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsShardingDbsResponseShardingDbsShardingDb self = new DescribeDrdsShardingDbsResponseShardingDbsShardingDb();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsShardingDbsResponseShardingDbsShardingDb setShardingDbName(String shardingDbName) {
            this.shardingDbName = shardingDbName;
            return this;
        }
        public String getShardingDbName() {
            return this.shardingDbName;
        }

        public DescribeDrdsShardingDbsResponseShardingDbsShardingDb setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public DescribeDrdsShardingDbsResponseShardingDbsShardingDb setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDrdsShardingDbsResponseShardingDbsShardingDb setDbStatus(String dbStatus) {
            this.dbStatus = dbStatus;
            return this;
        }
        public String getDbStatus() {
            return this.dbStatus;
        }

        public DescribeDrdsShardingDbsResponseShardingDbsShardingDb setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeDrdsShardingDbsResponseShardingDbsShardingDb setMinPoolSize(Integer minPoolSize) {
            this.minPoolSize = minPoolSize;
            return this;
        }
        public Integer getMinPoolSize() {
            return this.minPoolSize;
        }

        public DescribeDrdsShardingDbsResponseShardingDbsShardingDb setMaxPoolSize(Integer maxPoolSize) {
            this.maxPoolSize = maxPoolSize;
            return this;
        }
        public Integer getMaxPoolSize() {
            return this.maxPoolSize;
        }

        public DescribeDrdsShardingDbsResponseShardingDbsShardingDb setIdleTimeOut(Integer idleTimeOut) {
            this.idleTimeOut = idleTimeOut;
            return this;
        }
        public Integer getIdleTimeOut() {
            return this.idleTimeOut;
        }

        public DescribeDrdsShardingDbsResponseShardingDbsShardingDb setBlockingTimeout(Integer blockingTimeout) {
            this.blockingTimeout = blockingTimeout;
            return this;
        }
        public Integer getBlockingTimeout() {
            return this.blockingTimeout;
        }

        public DescribeDrdsShardingDbsResponseShardingDbsShardingDb setConnectionProperties(String connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }
        public String getConnectionProperties() {
            return this.connectionProperties;
        }

        public DescribeDrdsShardingDbsResponseShardingDbsShardingDb setPreparedStatementCacheSize(Integer preparedStatementCacheSize) {
            this.preparedStatementCacheSize = preparedStatementCacheSize;
            return this;
        }
        public Integer getPreparedStatementCacheSize() {
            return this.preparedStatementCacheSize;
        }

        public DescribeDrdsShardingDbsResponseShardingDbsShardingDb setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeDrdsShardingDbsResponseShardingDbsShardingDb setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

    }

    public static class DescribeDrdsShardingDbsResponseShardingDbs extends TeaModel {
        @NameInMap("ShardingDb")
        @Validation(required = true)
        public java.util.List<DescribeDrdsShardingDbsResponseShardingDbsShardingDb> shardingDb;

        public static DescribeDrdsShardingDbsResponseShardingDbs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsShardingDbsResponseShardingDbs self = new DescribeDrdsShardingDbsResponseShardingDbs();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsShardingDbsResponseShardingDbs setShardingDb(java.util.List<DescribeDrdsShardingDbsResponseShardingDbsShardingDb> shardingDb) {
            this.shardingDb = shardingDb;
            return this;
        }
        public java.util.List<DescribeDrdsShardingDbsResponseShardingDbsShardingDb> getShardingDb() {
            return this.shardingDb;
        }

    }

}
