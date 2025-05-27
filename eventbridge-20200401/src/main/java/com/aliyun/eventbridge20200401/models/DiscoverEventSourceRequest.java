// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DiscoverEventSourceRequest extends TeaModel {
    @NameInMap("SourceMySQLParameters")
    public DiscoverEventSourceRequestSourceMySQLParameters sourceMySQLParameters;

    public static DiscoverEventSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DiscoverEventSourceRequest self = new DiscoverEventSourceRequest();
        return TeaModel.build(map, self);
    }

    public DiscoverEventSourceRequest setSourceMySQLParameters(DiscoverEventSourceRequestSourceMySQLParameters sourceMySQLParameters) {
        this.sourceMySQLParameters = sourceMySQLParameters;
        return this;
    }
    public DiscoverEventSourceRequestSourceMySQLParameters getSourceMySQLParameters() {
        return this.sourceMySQLParameters;
    }

    public static class DiscoverEventSourceRequestSourceMySQLParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>database1</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <strong>example:</strong>
         * <p>rm-xxx.mysql.rds.aliyuncs.com</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Limit")
        public String limit;

        /**
         * <strong>example:</strong>
         * <p>PrivateNetwork</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Offset")
        public String offset;

        /**
         * <strong>example:</strong>
         * <p>1234xxx</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>sg-bp1ic0vsbwyv176e9inx</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <strong>example:</strong>
         * <p>database1.table1</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("User")
        public String user;

        /**
         * <strong>example:</strong>
         * <p>vsw-gw824tpaptxtlo256lqub</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <strong>example:</strong>
         * <p>vpc-uf6hwiei8u5uil3bfahc1</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DiscoverEventSourceRequestSourceMySQLParameters build(java.util.Map<String, ?> map) throws Exception {
            DiscoverEventSourceRequestSourceMySQLParameters self = new DiscoverEventSourceRequestSourceMySQLParameters();
            return TeaModel.build(map, self);
        }

        public DiscoverEventSourceRequestSourceMySQLParameters setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DiscoverEventSourceRequestSourceMySQLParameters setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DiscoverEventSourceRequestSourceMySQLParameters setLimit(String limit) {
            this.limit = limit;
            return this;
        }
        public String getLimit() {
            return this.limit;
        }

        public DiscoverEventSourceRequestSourceMySQLParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DiscoverEventSourceRequestSourceMySQLParameters setOffset(String offset) {
            this.offset = offset;
            return this;
        }
        public String getOffset() {
            return this.offset;
        }

        public DiscoverEventSourceRequestSourceMySQLParameters setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DiscoverEventSourceRequestSourceMySQLParameters setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DiscoverEventSourceRequestSourceMySQLParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DiscoverEventSourceRequestSourceMySQLParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DiscoverEventSourceRequestSourceMySQLParameters setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DiscoverEventSourceRequestSourceMySQLParameters setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public DiscoverEventSourceRequestSourceMySQLParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DiscoverEventSourceRequestSourceMySQLParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
