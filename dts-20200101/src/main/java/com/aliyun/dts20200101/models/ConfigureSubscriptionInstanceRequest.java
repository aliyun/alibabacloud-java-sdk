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

    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SubscriptionInstanceId")
    public String subscriptionInstanceId;

    @NameInMap("SubscriptionInstanceName")
    public String subscriptionInstanceName;

    @NameInMap("SubscriptionInstanceNetworkType")
    public String subscriptionInstanceNetworkType;

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
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("IP")
        public String IP;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("OwnerID")
        public String ownerID;

        @NameInMap("Password")
        public String password;

        @NameInMap("Port")
        public String port;

        @NameInMap("Role")
        public String role;

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
        @NameInMap("DDL")
        public Boolean DDL;

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
        @NameInMap("VPCId")
        public String VPCId;

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
