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
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter is discontinued.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the region in which the change tracking instance resides. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("SubscriptionInstanceId")
    public String subscriptionInstanceId;

    /**
     * <p>The ID of the change tracking instance. You can call the [DescribeSubscriptionInstances](~~49442~~) operation to query the instance ID.</p>
     */
    @NameInMap("SubscriptionInstanceName")
    public String subscriptionInstanceName;

    /**
     * <p>The network type of the change tracking instance. Set the value to **vpc**. A value of vpc indicates the Virtual Private Cloud (VPC) network type.</p>
     * <br>
     * <p>> </p>
     * <p>*   To use the new version of the change tracking feature, you must specify the SubscriptionInstanceNetworkType parameter. You must also specify the **SubscriptionInstance.VPCId** and **SubscriptionInstance.VSwitchID** parameters. If you do not specify the SubscriptionInstanceNetworkType parameter, the previous version of the change tracking feature is used.</p>
     * <p>*   The previous version of the change tracking feature supports self-managed MySQL databases, ApsaraDB RDS for MySQL instances, and PolarDB-X 1.0 instances. The new version of the change tracking feature supports self-managed MySQL databases, ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and Oracle databases.</p>
     */
    @NameInMap("SubscriptionInstanceNetworkType")
    public String subscriptionInstanceNetworkType;

    /**
     * <p>The objects for which you want to track data changes. The value is a JSON string and can contain regular expressions. For more information, see [SubscriptionObjects](~~141902~~).</p>
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
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The IP address of the source database.</p>
         * <br>
         * <p>>  This parameter is required only when the source database is a self-managed database.</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the source database.</p>
         * <br>
         * <p>>  This parameter is required only when the source database is an ApsaraDB RDS for MySQL instance, a PolarDB-X 1.0 instance, or a PolarDB for MySQL cluster.</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The type of the source database. Valid values:</p>
         * <br>
         * <p>*   **RDS**: ApsaraDB RDS for MySQL instance</p>
         * <p>*   **PolarDB**: PolarDB for MySQL cluster</p>
         * <p>*   **LocalInstance**: self-managed database with a public IP address</p>
         * <p>*   **ECS**: self-managed database hosted on an Elastic Compute Service (ECS) instance</p>
         * <p>*   **Express**: self-managed database connected over Express Connect</p>
         * <p>*   **CEN**: self-managed database connected over Cloud Enterprise Network (CEN)</p>
         * <p>*   **dg**: self-managed database connected over Database Gateway</p>
         * <br>
         * <p>>  The engine of a self-managed database can be MySQL or Oracle. You must specify the engine type when you call the [CreateSubscriptionInstance](~~49436~~) operation.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The system ID (SID) of the Oracle database.</p>
         * <br>
         * <p>>  This parameter is required only when the source database is a self-managed Oracle database and is not deployed in the Real Application Clusters (RAC) architecture.</p>
         */
        @NameInMap("OracleSID")
        public String oracleSID;

        /**
         * <p>The ID of the Alibaba Cloud account to which the source database belongs.</p>
         * <br>
         * <p>>  This parameter is required only when you track data changes across different Alibaba Cloud accounts.</p>
         */
        @NameInMap("OwnerID")
        public String ownerID;

        /**
         * <p>The password of the account that is used to connect to the source database.</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The service port number of the source database.</p>
         * <br>
         * <p>>  This parameter is required only when the source database is a self-managed database.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The RAM role that is authorized to access the source database. This parameter is required if the source database does not belong to the Alibaba Cloud account that you use to configure the change tracking instance. In this case, you must authorize the Alibaba Cloud account to access the source database by using a RAM role.</p>
         * <br>
         * <p>>  For more information about the permissions that are required for the RAM role and how to grant permissions to the RAM role, see [Configure RAM authorization for cross-account data migration and synchronization](~~48468~~).</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The username of the account that is used to connect to the source database.</p>
         * <br>
         * <p>>  The permissions that are required for the database account vary with the change tracking scenario. For more information, see [Overview of change tracking scenarios](~~145715~~).</p>
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
         * <br>
         * <p>*   **true**: tracks DDL statements.</p>
         * <p>*   **false**: does not track DDL statements.</p>
         */
        @NameInMap("DDL")
        public Boolean DDL;

        /**
         * <p>Specifies whether to track DML statements. Default value: true. Valid values:</p>
         * <br>
         * <p>*   **true**: tracks DML statements.</p>
         * <p>*   **false**: does not tack DML statements.</p>
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
         * <br>
         * <p>>  This parameter is required only when the **SubscriptionInstanceNetworkType** parameter is set to **vpc**.</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The ID of the vSwitch in the specified VPC.</p>
         * <br>
         * <p>>  This parameter is required only when the **SubscriptionInstanceNetworkType** parameter is set to **vpc**.</p>
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
