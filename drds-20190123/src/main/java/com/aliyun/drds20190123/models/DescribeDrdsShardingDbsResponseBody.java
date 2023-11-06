// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsShardingDbsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of database shards returned per page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of returned database shards.</p>
     */
    @NameInMap("ShardingDbs")
    public DescribeDrdsShardingDbsResponseBodyShardingDbs shardingDbs;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The number of returned database shards.</p>
     */
    @NameInMap("Total")
    public String total;

    public static DescribeDrdsShardingDbsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsShardingDbsResponseBody self = new DescribeDrdsShardingDbsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsShardingDbsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDrdsShardingDbsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
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

    public DescribeDrdsShardingDbsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsShardingDbsResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb extends TeaModel {
        /**
         * <p>The timeout period for a transaction to wait for the release of the data lock.</p>
         */
        @NameInMap("BlockingTimeout")
        public Integer blockingTimeout;

        /**
         * <p>The URL that is used to access the Apsara RDS for MySQL instance.</p>
         */
        @NameInMap("ConnectUrl")
        public String connectUrl;

        /**
         * <p>The properties of the connection string.</p>
         */
        @NameInMap("ConnectionProperties")
        public String connectionProperties;

        /**
         * <p>The ID of the Apsara RDS for MySQL instance that is used as the storage of the database shard.</p>
         */
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        /**
         * <p>The status of the database.</p>
         */
        @NameInMap("DbStatus")
        public String dbStatus;

        /**
         * <p>The engine of the database.</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The name of group on which the database shard is stored.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The timeout period of an idle connection.</p>
         */
        @NameInMap("IdleTimeOut")
        public Integer idleTimeOut;

        /**
         * <p>The maximum size of the connection pool.</p>
         */
        @NameInMap("MaxPoolSize")
        public Integer maxPoolSize;

        /**
         * <p>The minimum size of the connection pool.</p>
         */
        @NameInMap("MinPoolSize")
        public Integer minPoolSize;

        /**
         * <p>The size of cache for the returned results.</p>
         */
        @NameInMap("PreparedStatementCacheSize")
        public Integer preparedStatementCacheSize;

        /**
         * <p>The name of the database shard.</p>
         */
        @NameInMap("ShardingDbName")
        public String shardingDbName;

        /**
         * <p>The username that is used to connect to the ApsaraDB RDS for MySQL instance.</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb self = new DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setBlockingTimeout(Integer blockingTimeout) {
            this.blockingTimeout = blockingTimeout;
            return this;
        }
        public Integer getBlockingTimeout() {
            return this.blockingTimeout;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setConnectionProperties(String connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }
        public String getConnectionProperties() {
            return this.connectionProperties;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setDbStatus(String dbStatus) {
            this.dbStatus = dbStatus;
            return this;
        }
        public String getDbStatus() {
            return this.dbStatus;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setIdleTimeOut(Integer idleTimeOut) {
            this.idleTimeOut = idleTimeOut;
            return this;
        }
        public Integer getIdleTimeOut() {
            return this.idleTimeOut;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setMaxPoolSize(Integer maxPoolSize) {
            this.maxPoolSize = maxPoolSize;
            return this;
        }
        public Integer getMaxPoolSize() {
            return this.maxPoolSize;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setMinPoolSize(Integer minPoolSize) {
            this.minPoolSize = minPoolSize;
            return this;
        }
        public Integer getMinPoolSize() {
            return this.minPoolSize;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setPreparedStatementCacheSize(Integer preparedStatementCacheSize) {
            this.preparedStatementCacheSize = preparedStatementCacheSize;
            return this;
        }
        public Integer getPreparedStatementCacheSize() {
            return this.preparedStatementCacheSize;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setShardingDbName(String shardingDbName) {
            this.shardingDbName = shardingDbName;
            return this;
        }
        public String getShardingDbName() {
            return this.shardingDbName;
        }

        public DescribeDrdsShardingDbsResponseBodyShardingDbsShardingDb setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
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
