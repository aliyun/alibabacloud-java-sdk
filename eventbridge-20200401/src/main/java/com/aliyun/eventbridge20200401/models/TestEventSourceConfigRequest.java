// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class TestEventSourceConfigRequest extends TeaModel {
    /**
     * <p>The parameters that are configured if you specify MySQL as the event source.</p>
     */
    @NameInMap("SourceMySQLParameters")
    public TestEventSourceConfigRequestSourceMySQLParameters sourceMySQLParameters;

    public static TestEventSourceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        TestEventSourceConfigRequest self = new TestEventSourceConfigRequest();
        return TeaModel.build(map, self);
    }

    public TestEventSourceConfigRequest setSourceMySQLParameters(TestEventSourceConfigRequestSourceMySQLParameters sourceMySQLParameters) {
        this.sourceMySQLParameters = sourceMySQLParameters;
        return this;
    }
    public TestEventSourceConfigRequestSourceMySQLParameters getSourceMySQLParameters() {
        return this.sourceMySQLParameters;
    }

    public static class TestEventSourceConfigRequestSourceMySQLParameters extends TeaModel {
        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>database1</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The endpoint of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1vxxx.mysql.rds.aliyuncs.com</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The network type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PrivateNetwork</li>
         * <li>PublicNetwork</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrivateNetwork</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The password that is used for authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>1234xxx</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The port that is used to connect to the database.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxx</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The table name. The name must be prefixed with the database name. ${DatabaseName}.${TableName}</p>
         * 
         * <strong>example:</strong>
         * <p>database1.table1</p>
         */
        @NameInMap("TableNames")
        public String tableNames;

        /**
         * <p>The username that is used to log on to the database.</p>
         * 
         * <strong>example:</strong>
         * <p>user***</p>
         */
        @NameInMap("User")
        public String user;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1gb7xxx</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static TestEventSourceConfigRequestSourceMySQLParameters build(java.util.Map<String, ?> map) throws Exception {
            TestEventSourceConfigRequestSourceMySQLParameters self = new TestEventSourceConfigRequestSourceMySQLParameters();
            return TeaModel.build(map, self);
        }

        public TestEventSourceConfigRequestSourceMySQLParameters setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public TestEventSourceConfigRequestSourceMySQLParameters setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public TestEventSourceConfigRequestSourceMySQLParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public TestEventSourceConfigRequestSourceMySQLParameters setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public TestEventSourceConfigRequestSourceMySQLParameters setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public TestEventSourceConfigRequestSourceMySQLParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public TestEventSourceConfigRequestSourceMySQLParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public TestEventSourceConfigRequestSourceMySQLParameters setTableNames(String tableNames) {
            this.tableNames = tableNames;
            return this;
        }
        public String getTableNames() {
            return this.tableNames;
        }

        public TestEventSourceConfigRequestSourceMySQLParameters setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public TestEventSourceConfigRequestSourceMySQLParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public TestEventSourceConfigRequestSourceMySQLParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
