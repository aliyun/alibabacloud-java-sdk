// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSubscriptionInstanceRequest extends TeaModel {
    @NameInMap("SourceEndpoint")
    public ConfigureSubscriptionInstanceRequestSourceEndpoint sourceEndpoint;

    @NameInMap("SubscriptionDataType")
    public ConfigureSubscriptionInstanceRequestSubscriptionDataType subscriptionDataType;

    @NameInMap("SubscriptionInstance")
    public ConfigureSubscriptionInstanceRequestSubscriptionInstance subscriptionInstance;

    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter is about to be discontinued.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>资源组ID。</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the change tracking instance. You can call the <a href="https://help.aliyun.com/document_detail/49442.html">DescribeSubscriptionInstances</a> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtshp8n2ze4r5x****</p>
     */
    @NameInMap("SubscriptionInstanceId")
    public String subscriptionInstanceId;

    /**
     * <p>The name of the change tracking instance.</p>
     * <blockquote>
     * <p>We recommend that you specify a descriptive name for easy identification. You do not need to use a unique name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MySQL Subscription</p>
     */
    @NameInMap("SubscriptionInstanceName")
    public String subscriptionInstanceName;

    /**
     * <p>The network type of the change tracking instance. Set the value to <strong>vpc</strong>, which specifies the Virtual Private Cloud (VPC) network type.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>To use the new version of the change tracking feature, you must specify the SubscriptionInstanceNetworkType parameter. You must also specify the <strong>SubscriptionInstance.VPCId</strong> and <strong>SubscriptionInstance.VSwitchID</strong> parameters. If you do not specify the SubscriptionInstanceNetworkType parameter, the previous version of the change tracking feature is used.</p>
     * </li>
     * <li><p>The previous version of the change tracking feature supports self-managed MySQL databases, ApsaraDB RDS for MySQL instances, and PolarDB-X 1.0 instances. The new version of the change tracking feature supports self-managed MySQL databases, ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and Oracle databases.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("SubscriptionInstanceNetworkType")
    public String subscriptionInstanceNetworkType;

    /**
     * <p>The objects for which you want to track data changes. The value is a JSON string and can contain regular expressions. For more information, see <a href="https://help.aliyun.com/document_detail/141902.html">SubscriptionObjects</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{     &quot;DBName&quot;: &quot;dtstestdata&quot; }]</p>
     */
    @NameInMap("SubscriptionObject")
    public String subscriptionObject;

    public static ConfigureSubscriptionInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSubscriptionInstanceRequest self = new ConfigureSubscriptionInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureSubscriptionInstanceRequest setSourceEndpoint(ConfigureSubscriptionInstanceRequestSourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }
    public ConfigureSubscriptionInstanceRequestSourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    public ConfigureSubscriptionInstanceRequest setSubscriptionDataType(ConfigureSubscriptionInstanceRequestSubscriptionDataType subscriptionDataType) {
        this.subscriptionDataType = subscriptionDataType;
        return this;
    }
    public ConfigureSubscriptionInstanceRequestSubscriptionDataType getSubscriptionDataType() {
        return this.subscriptionDataType;
    }

    public ConfigureSubscriptionInstanceRequest setSubscriptionInstance(ConfigureSubscriptionInstanceRequestSubscriptionInstance subscriptionInstance) {
        this.subscriptionInstance = subscriptionInstance;
        return this;
    }
    public ConfigureSubscriptionInstanceRequestSubscriptionInstance getSubscriptionInstance() {
        return this.subscriptionInstance;
    }

    public ConfigureSubscriptionInstanceRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ConfigureSubscriptionInstanceRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ConfigureSubscriptionInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigureSubscriptionInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ConfigureSubscriptionInstanceRequest setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    public ConfigureSubscriptionInstanceRequest setSubscriptionInstanceName(String subscriptionInstanceName) {
        this.subscriptionInstanceName = subscriptionInstanceName;
        return this;
    }
    public String getSubscriptionInstanceName() {
        return this.subscriptionInstanceName;
    }

    public ConfigureSubscriptionInstanceRequest setSubscriptionInstanceNetworkType(String subscriptionInstanceNetworkType) {
        this.subscriptionInstanceNetworkType = subscriptionInstanceNetworkType;
        return this;
    }
    public String getSubscriptionInstanceNetworkType() {
        return this.subscriptionInstanceNetworkType;
    }

    public ConfigureSubscriptionInstanceRequest setSubscriptionObject(String subscriptionObject) {
        this.subscriptionObject = subscriptionObject;
        return this;
    }
    public String getSubscriptionObject() {
        return this.subscriptionObject;
    }

    public static class ConfigureSubscriptionInstanceRequestSourceEndpoint extends TeaModel {
        /**
         * <p>The name of the source database.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The endpoint of the source database.</p>
         * <blockquote>
         * <p>This parameter is available and required only if the source database is a self-managed database.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.88.***</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the source instance.</p>
         * <blockquote>
         * <p>This parameter is available and required only if the source instance is an ApsaraDB RDS for MySQL instance, a PolarDB-X 1.0 instance, or a PolarDB for MySQL cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1zc3iyqe3qw****</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The type of the source instance. Valid values:</p>
         * <ul>
         * <li><strong>RDS</strong>: ApsaraDB RDS for MySQL instance</li>
         * <li><strong>PolarDB</strong>: PolarDB for MySQL cluster.</li>
         * <li><strong>LocalInstance</strong>: self-managed database with a public IP address</li>
         * <li><strong>ECS</strong>: self-managed database hosted on an Elastic Compute Service (ECS) instance</li>
         * <li><strong>Express</strong>: self-managed database connected over Express Connect</li>
         * <li><strong>CEN</strong>: self-managed database connected over Cloud Enterprise Network (CEN)</li>
         * <li><strong>dg</strong>: self-managed database connected over Database Gateway</li>
         * </ul>
         * <blockquote>
         * <p>The engine of a self-managed database can be MySQL or Oracle. You must specify the engine type when you call the <a href="https://help.aliyun.com/document_detail/49436.html">CreateSubscriptionInstance</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The system ID (SID) of the Oracle database.</p>
         * <blockquote>
         * <p>This parameter is available and required only if the source database is a self-managed Oracle database and the Oracle database is deployed in a non-RAC architecture.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testsid</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The ID of the Alibaba Cloud account to which the source database belongs.</p>
         * <blockquote>
         * <p>This parameter is available and required only if you track data changes across different Alibaba Cloud accounts.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>140692647406****</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>The password of the account that is used to connect to the source database.</p>
         * 
         * <strong>example:</strong>
         * <p>Test123456</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The service port number of the source database.</p>
         * <blockquote>
         * <p>This parameter is available and required only if the source database is a self-managed database.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The RAM role that is authorized to access the source database. This parameter is required if the source database does not belong to the Alibaba Cloud account that you use to configure the change tracking task. In this case, you must authorize the Alibaba Cloud account to access the source database by using a RAM role.</p>
         * <blockquote>
         * <p>For more information about the permissions that are required for the RAM role and how to grant permissions to the RAM role, see <a href="https://help.aliyun.com/document_detail/48468.html">Configure RAM authorization for cross-account data migration and synchronization</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ram-for-dts</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The username of the account that is used to connect to the source database.</p>
         * <blockquote>
         * <p>The permissions that are required for the database account vary based on change tracking scenarios. For more information, see <a href="https://help.aliyun.com/document_detail/145715.html">Overview of change tracking scenarios</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dtstestaccount</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ConfigureSubscriptionInstanceRequestSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ConfigureSubscriptionInstanceRequestSourceEndpoint self = new ConfigureSubscriptionInstanceRequestSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ConfigureSubscriptionInstanceRequestSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ConfigureSubscriptionInstanceRequestSubscriptionDataType extends TeaModel {
        /**
         * <p>Specifies whether to track DDL statements. Default value: true. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: tracks DDL statements.</li>
         * <li><strong>false</strong>: does not track DDL statements.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DDL")
        public Boolean DDL;

        /**
         * <p>Specifies whether to track DML statements. Default value: true. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: tracks DML statements.</li>
         * <li><strong>false</strong>: does not track DML statements.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DML")
        public Boolean DML;

        public static ConfigureSubscriptionInstanceRequestSubscriptionDataType build(java.util.Map<String, ?> map) throws Exception {
            ConfigureSubscriptionInstanceRequestSubscriptionDataType self = new ConfigureSubscriptionInstanceRequestSubscriptionDataType();
            return TeaModel.build(map, self);
        }

        public ConfigureSubscriptionInstanceRequestSubscriptionDataType setDDL(Boolean DDL) {
            this.DDL = DDL;
            return this;
        }
        public Boolean getDDL() {
            return this.DDL;
        }

        public ConfigureSubscriptionInstanceRequestSubscriptionDataType setDML(Boolean DML) {
            this.DML = DML;
            return this;
        }
        public Boolean getDML() {
            return this.DML;
        }

    }

    public static class ConfigureSubscriptionInstanceRequestSubscriptionInstance extends TeaModel {
        /**
         * <p>The ID of the VPC in which the change tracking instance is deployed.</p>
         * <blockquote>
         * <p>This parameter is available and required only if the <strong>SubscriptionInstanceNetworkType</strong> parameter is set to <strong>vpc</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1vwnn14rqpyiczj****</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The ID of the vSwitch in the specified VPC.</p>
         * <blockquote>
         * <p>This parameter is available and required only if the <strong>SubscriptionInstanceNetworkType</strong> parameter is set to <strong>vpc</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp10df3mxae6lpmku****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static ConfigureSubscriptionInstanceRequestSubscriptionInstance build(java.util.Map<String, ?> map) throws Exception {
            ConfigureSubscriptionInstanceRequestSubscriptionInstance self = new ConfigureSubscriptionInstanceRequestSubscriptionInstance();
            return TeaModel.build(map, self);
        }

        public ConfigureSubscriptionInstanceRequestSubscriptionInstance setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public ConfigureSubscriptionInstanceRequestSubscriptionInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

}
