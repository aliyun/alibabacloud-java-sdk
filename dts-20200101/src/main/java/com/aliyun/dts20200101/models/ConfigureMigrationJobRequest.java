// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureMigrationJobRequest extends TeaModel {
    @NameInMap("SourceEndpoint")
    public ConfigureMigrationJobRequestSourceEndpoint sourceEndpoint;

    @NameInMap("DestinationEndpoint")
    public ConfigureMigrationJobRequestDestinationEndpoint destinationEndpoint;

    @NameInMap("MigrationMode")
    public ConfigureMigrationJobRequestMigrationMode migrationMode;

    @NameInMap("MigrationJobId")
    public String migrationJobId;

    @NameInMap("MigrationJobName")
    public String migrationJobName;

    @NameInMap("MigrationObject")
    public String migrationObject;

    @NameInMap("MigrationReserved")
    public String migrationReserved;

    @NameInMap("Checkpoint")
    public String checkpoint;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("AccountId")
    public String accountId;

    public static ConfigureMigrationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureMigrationJobRequest self = new ConfigureMigrationJobRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureMigrationJobRequest setSourceEndpoint(ConfigureMigrationJobRequestSourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }
    public ConfigureMigrationJobRequestSourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    public ConfigureMigrationJobRequest setDestinationEndpoint(ConfigureMigrationJobRequestDestinationEndpoint destinationEndpoint) {
        this.destinationEndpoint = destinationEndpoint;
        return this;
    }
    public ConfigureMigrationJobRequestDestinationEndpoint getDestinationEndpoint() {
        return this.destinationEndpoint;
    }

    public ConfigureMigrationJobRequest setMigrationMode(ConfigureMigrationJobRequestMigrationMode migrationMode) {
        this.migrationMode = migrationMode;
        return this;
    }
    public ConfigureMigrationJobRequestMigrationMode getMigrationMode() {
        return this.migrationMode;
    }

    public ConfigureMigrationJobRequest setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    public ConfigureMigrationJobRequest setMigrationJobName(String migrationJobName) {
        this.migrationJobName = migrationJobName;
        return this;
    }
    public String getMigrationJobName() {
        return this.migrationJobName;
    }

    public ConfigureMigrationJobRequest setMigrationObject(String migrationObject) {
        this.migrationObject = migrationObject;
        return this;
    }
    public String getMigrationObject() {
        return this.migrationObject;
    }

    public ConfigureMigrationJobRequest setMigrationReserved(String migrationReserved) {
        this.migrationReserved = migrationReserved;
        return this;
    }
    public String getMigrationReserved() {
        return this.migrationReserved;
    }

    public ConfigureMigrationJobRequest setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public String getCheckpoint() {
        return this.checkpoint;
    }

    public ConfigureMigrationJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ConfigureMigrationJobRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public static class ConfigureMigrationJobRequestSourceEndpoint extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("Region")
        public String region;

        @NameInMap("IP")
        public String IP;

        @NameInMap("Port")
        public String port;

        @NameInMap("OracleSID")
        public String oracleSID;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("Password")
        public String password;

        @NameInMap("OwnerID")
        public String ownerID;

        @NameInMap("Role")
        public String role;

        public static ConfigureMigrationJobRequestSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ConfigureMigrationJobRequestSourceEndpoint self = new ConfigureMigrationJobRequestSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public ConfigureMigrationJobRequestSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public ConfigureMigrationJobRequestSourceEndpoint setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class ConfigureMigrationJobRequestDestinationEndpoint extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("Region")
        public String region;

        @NameInMap("IP")
        public String IP;

        @NameInMap("Port")
        public String port;

        @NameInMap("DataBaseName")
        public String dataBaseName;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("Password")
        public String password;

        @NameInMap("OracleSID")
        public String oracleSID;

        public static ConfigureMigrationJobRequestDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ConfigureMigrationJobRequestDestinationEndpoint self = new ConfigureMigrationJobRequestDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setDataBaseName(String dataBaseName) {
            this.dataBaseName = dataBaseName;
            return this;
        }
        public String getDataBaseName() {
            return this.dataBaseName;
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ConfigureMigrationJobRequestDestinationEndpoint setOracleSID(String oracleSID) {
            this.oracleSID = oracleSID;
            return this;
        }
        public String getOracleSID() {
            return this.oracleSID;
        }

    }

    public static class ConfigureMigrationJobRequestMigrationMode extends TeaModel {
        @NameInMap("StructureIntialization")
        public Boolean structureIntialization;

        @NameInMap("DataIntialization")
        public Boolean dataIntialization;

        @NameInMap("DataSynchronization")
        public Boolean dataSynchronization;

        public static ConfigureMigrationJobRequestMigrationMode build(java.util.Map<String, ?> map) throws Exception {
            ConfigureMigrationJobRequestMigrationMode self = new ConfigureMigrationJobRequestMigrationMode();
            return TeaModel.build(map, self);
        }

        public ConfigureMigrationJobRequestMigrationMode setStructureIntialization(Boolean structureIntialization) {
            this.structureIntialization = structureIntialization;
            return this;
        }
        public Boolean getStructureIntialization() {
            return this.structureIntialization;
        }

        public ConfigureMigrationJobRequestMigrationMode setDataIntialization(Boolean dataIntialization) {
            this.dataIntialization = dataIntialization;
            return this;
        }
        public Boolean getDataIntialization() {
            return this.dataIntialization;
        }

        public ConfigureMigrationJobRequestMigrationMode setDataSynchronization(Boolean dataSynchronization) {
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

    }

}
