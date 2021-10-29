// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeShardDbConnectionInfoResponseBody extends TeaModel {
    @NameInMap("ConnectionInfo")
    public DescribeShardDbConnectionInfoResponseBodyConnectionInfo connectionInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeShardDbConnectionInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeShardDbConnectionInfoResponseBody self = new DescribeShardDbConnectionInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeShardDbConnectionInfoResponseBody setConnectionInfo(DescribeShardDbConnectionInfoResponseBodyConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }
    public DescribeShardDbConnectionInfoResponseBodyConnectionInfo getConnectionInfo() {
        return this.connectionInfo;
    }

    public DescribeShardDbConnectionInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeShardDbConnectionInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeShardDbConnectionInfoResponseBodyConnectionInfo extends TeaModel {
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceUrl")
        public String instanceUrl;

        @NameInMap("blockingTimeout")
        public Integer blockingTimeout;

        @NameInMap("connectionProperties")
        public String connectionProperties;

        @NameInMap("dbStatus")
        public String dbStatus;

        @NameInMap("dbType")
        public String dbType;

        @NameInMap("idleTimeOut")
        public Integer idleTimeOut;

        @NameInMap("maxPoolSize")
        public Integer maxPoolSize;

        @NameInMap("minPoolSize")
        public Integer minPoolSize;

        @NameInMap("preparedStatementCacheSize")
        public Integer preparedStatementCacheSize;

        @NameInMap("subDbName")
        public String subDbName;

        @NameInMap("userName")
        public String userName;

        public static DescribeShardDbConnectionInfoResponseBodyConnectionInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardDbConnectionInfoResponseBodyConnectionInfo self = new DescribeShardDbConnectionInfoResponseBodyConnectionInfo();
            return TeaModel.build(map, self);
        }

        public DescribeShardDbConnectionInfoResponseBodyConnectionInfo setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeShardDbConnectionInfoResponseBodyConnectionInfo setInstanceUrl(String instanceUrl) {
            this.instanceUrl = instanceUrl;
            return this;
        }
        public String getInstanceUrl() {
            return this.instanceUrl;
        }

        public DescribeShardDbConnectionInfoResponseBodyConnectionInfo setBlockingTimeout(Integer blockingTimeout) {
            this.blockingTimeout = blockingTimeout;
            return this;
        }
        public Integer getBlockingTimeout() {
            return this.blockingTimeout;
        }

        public DescribeShardDbConnectionInfoResponseBodyConnectionInfo setConnectionProperties(String connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }
        public String getConnectionProperties() {
            return this.connectionProperties;
        }

        public DescribeShardDbConnectionInfoResponseBodyConnectionInfo setDbStatus(String dbStatus) {
            this.dbStatus = dbStatus;
            return this;
        }
        public String getDbStatus() {
            return this.dbStatus;
        }

        public DescribeShardDbConnectionInfoResponseBodyConnectionInfo setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeShardDbConnectionInfoResponseBodyConnectionInfo setIdleTimeOut(Integer idleTimeOut) {
            this.idleTimeOut = idleTimeOut;
            return this;
        }
        public Integer getIdleTimeOut() {
            return this.idleTimeOut;
        }

        public DescribeShardDbConnectionInfoResponseBodyConnectionInfo setMaxPoolSize(Integer maxPoolSize) {
            this.maxPoolSize = maxPoolSize;
            return this;
        }
        public Integer getMaxPoolSize() {
            return this.maxPoolSize;
        }

        public DescribeShardDbConnectionInfoResponseBodyConnectionInfo setMinPoolSize(Integer minPoolSize) {
            this.minPoolSize = minPoolSize;
            return this;
        }
        public Integer getMinPoolSize() {
            return this.minPoolSize;
        }

        public DescribeShardDbConnectionInfoResponseBodyConnectionInfo setPreparedStatementCacheSize(Integer preparedStatementCacheSize) {
            this.preparedStatementCacheSize = preparedStatementCacheSize;
            return this;
        }
        public Integer getPreparedStatementCacheSize() {
            return this.preparedStatementCacheSize;
        }

        public DescribeShardDbConnectionInfoResponseBodyConnectionInfo setSubDbName(String subDbName) {
            this.subDbName = subDbName;
            return this;
        }
        public String getSubDbName() {
            return this.subDbName;
        }

        public DescribeShardDbConnectionInfoResponseBodyConnectionInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
