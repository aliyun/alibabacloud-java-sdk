// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class ConfigureSynchronizationJobRequest extends TeaModel {
    @NameInMap("DestinationEndpoint")
    public ConfigureSynchronizationJobRequestDestinationEndpoint destinationEndpoint;

    @NameInMap("PartitionKey")
    public ConfigureSynchronizationJobRequestPartitionKey partitionKey;

    @NameInMap("SourceEndpoint")
    public ConfigureSynchronizationJobRequestSourceEndpoint sourceEndpoint;

    @NameInMap("Checkpoint")
    public String checkpoint;

    @NameInMap("DataInitialization")
    public Boolean dataInitialization;

    @NameInMap("MigrationReserved")
    public String migrationReserved;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("StructureInitialization")
    public Boolean structureInitialization;

    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    @NameInMap("SynchronizationJobName")
    public String synchronizationJobName;

    @NameInMap("SynchronizationObjects")
    public String synchronizationObjects;

    public static ConfigureSynchronizationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSynchronizationJobRequest self = new ConfigureSynchronizationJobRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureSynchronizationJobRequest setDestinationEndpoint(ConfigureSynchronizationJobRequestDestinationEndpoint destinationEndpoint) {
        this.destinationEndpoint = destinationEndpoint;
        return this;
    }
    public ConfigureSynchronizationJobRequestDestinationEndpoint getDestinationEndpoint() {
        return this.destinationEndpoint;
    }

    public ConfigureSynchronizationJobRequest setPartitionKey(ConfigureSynchronizationJobRequestPartitionKey partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }
    public ConfigureSynchronizationJobRequestPartitionKey getPartitionKey() {
        return this.partitionKey;
    }

    public ConfigureSynchronizationJobRequest setSourceEndpoint(ConfigureSynchronizationJobRequestSourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }
    public ConfigureSynchronizationJobRequestSourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    public ConfigureSynchronizationJobRequest setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public String getCheckpoint() {
        return this.checkpoint;
    }

    public ConfigureSynchronizationJobRequest setDataInitialization(Boolean dataInitialization) {
        this.dataInitialization = dataInitialization;
        return this;
    }
    public Boolean getDataInitialization() {
        return this.dataInitialization;
    }

    public ConfigureSynchronizationJobRequest setMigrationReserved(String migrationReserved) {
        this.migrationReserved = migrationReserved;
        return this;
    }
    public String getMigrationReserved() {
        return this.migrationReserved;
    }

    public ConfigureSynchronizationJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ConfigureSynchronizationJobRequest setStructureInitialization(Boolean structureInitialization) {
        this.structureInitialization = structureInitialization;
        return this;
    }
    public Boolean getStructureInitialization() {
        return this.structureInitialization;
    }

    public ConfigureSynchronizationJobRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public ConfigureSynchronizationJobRequest setSynchronizationJobName(String synchronizationJobName) {
        this.synchronizationJobName = synchronizationJobName;
        return this;
    }
    public String getSynchronizationJobName() {
        return this.synchronizationJobName;
    }

    public ConfigureSynchronizationJobRequest setSynchronizationObjects(String synchronizationObjects) {
        this.synchronizationObjects = synchronizationObjects;
        return this;
    }
    public String getSynchronizationObjects() {
        return this.synchronizationObjects;
    }

    public static class ConfigureSynchronizationJobRequestDestinationEndpoint extends TeaModel {
        @NameInMap("IP")
        public String IP;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Password")
        public String password;

        @NameInMap("Port")
        public String port;

        @NameInMap("UserName")
        public String userName;

        public static ConfigureSynchronizationJobRequestDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ConfigureSynchronizationJobRequestDestinationEndpoint self = new ConfigureSynchronizationJobRequestDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public ConfigureSynchronizationJobRequestDestinationEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ConfigureSynchronizationJobRequestDestinationEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ConfigureSynchronizationJobRequestDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ConfigureSynchronizationJobRequestDestinationEndpoint setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ConfigureSynchronizationJobRequestDestinationEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ConfigureSynchronizationJobRequestDestinationEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ConfigureSynchronizationJobRequestPartitionKey extends TeaModel {
        @NameInMap("ModifyTime_Day")
        public Boolean modifyTimeDay;

        @NameInMap("ModifyTime_Hour")
        public Boolean modifyTimeHour;

        @NameInMap("ModifyTime_Minute")
        public Boolean modifyTimeMinute;

        @NameInMap("ModifyTime_Month")
        public Boolean modifyTimeMonth;

        @NameInMap("ModifyTime_Year")
        public Boolean modifyTimeYear;

        public static ConfigureSynchronizationJobRequestPartitionKey build(java.util.Map<String, ?> map) throws Exception {
            ConfigureSynchronizationJobRequestPartitionKey self = new ConfigureSynchronizationJobRequestPartitionKey();
            return TeaModel.build(map, self);
        }

        public ConfigureSynchronizationJobRequestPartitionKey setModifyTimeDay(Boolean modifyTimeDay) {
            this.modifyTimeDay = modifyTimeDay;
            return this;
        }
        public Boolean getModifyTimeDay() {
            return this.modifyTimeDay;
        }

        public ConfigureSynchronizationJobRequestPartitionKey setModifyTimeHour(Boolean modifyTimeHour) {
            this.modifyTimeHour = modifyTimeHour;
            return this;
        }
        public Boolean getModifyTimeHour() {
            return this.modifyTimeHour;
        }

        public ConfigureSynchronizationJobRequestPartitionKey setModifyTimeMinute(Boolean modifyTimeMinute) {
            this.modifyTimeMinute = modifyTimeMinute;
            return this;
        }
        public Boolean getModifyTimeMinute() {
            return this.modifyTimeMinute;
        }

        public ConfigureSynchronizationJobRequestPartitionKey setModifyTimeMonth(Boolean modifyTimeMonth) {
            this.modifyTimeMonth = modifyTimeMonth;
            return this;
        }
        public Boolean getModifyTimeMonth() {
            return this.modifyTimeMonth;
        }

        public ConfigureSynchronizationJobRequestPartitionKey setModifyTimeYear(Boolean modifyTimeYear) {
            this.modifyTimeYear = modifyTimeYear;
            return this;
        }
        public Boolean getModifyTimeYear() {
            return this.modifyTimeYear;
        }

    }

    public static class ConfigureSynchronizationJobRequestSourceEndpoint extends TeaModel {
        @NameInMap("IP")
        public String IP;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

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

        public static ConfigureSynchronizationJobRequestSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ConfigureSynchronizationJobRequestSourceEndpoint self = new ConfigureSynchronizationJobRequestSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public ConfigureSynchronizationJobRequestSourceEndpoint setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ConfigureSynchronizationJobRequestSourceEndpoint setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ConfigureSynchronizationJobRequestSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ConfigureSynchronizationJobRequestSourceEndpoint setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public ConfigureSynchronizationJobRequestSourceEndpoint setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ConfigureSynchronizationJobRequestSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ConfigureSynchronizationJobRequestSourceEndpoint setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ConfigureSynchronizationJobRequestSourceEndpoint setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
