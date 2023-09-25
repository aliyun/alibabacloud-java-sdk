// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class ConfigurationSynchronizationJobRequest extends TeaModel {
    @NameInMap("DestinationEndpoint")
    public ConfigurationSynchronizationJobRequestDestinationEndpoint destinationEndpoint;

    @NameInMap("Initialization")
    public ConfigurationSynchronizationJobRequestInitialization initialization;

    @NameInMap("SourceEndpoint")
    public ConfigurationSynchronizationJobRequestSourceEndpoint sourceEndpoint;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    @NameInMap("SynchronizationJobName")
    public String synchronizationJobName;

    @NameInMap("SynchronizationObject")
    public String synchronizationObject;

    public static ConfigurationSynchronizationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigurationSynchronizationJobRequest self = new ConfigurationSynchronizationJobRequest();
        return TeaModel.build(map, self);
    }

    public ConfigurationSynchronizationJobRequest setDestinationEndpoint(ConfigurationSynchronizationJobRequestDestinationEndpoint destinationEndpoint) {
        this.destinationEndpoint = destinationEndpoint;
        return this;
    }
    public ConfigurationSynchronizationJobRequestDestinationEndpoint getDestinationEndpoint() {
        return this.destinationEndpoint;
    }

    public ConfigurationSynchronizationJobRequest setInitialization(ConfigurationSynchronizationJobRequestInitialization initialization) {
        this.initialization = initialization;
        return this;
    }
    public ConfigurationSynchronizationJobRequestInitialization getInitialization() {
        return this.initialization;
    }

    public ConfigurationSynchronizationJobRequest setSourceEndpoint(ConfigurationSynchronizationJobRequestSourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }
    public ConfigurationSynchronizationJobRequestSourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    public ConfigurationSynchronizationJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ConfigurationSynchronizationJobRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public ConfigurationSynchronizationJobRequest setSynchronizationJobName(String synchronizationJobName) {
        this.synchronizationJobName = synchronizationJobName;
        return this;
    }
    public String getSynchronizationJobName() {
        return this.synchronizationJobName;
    }

    public ConfigurationSynchronizationJobRequest setSynchronizationObject(String synchronizationObject) {
        this.synchronizationObject = synchronizationObject;
        return this;
    }
    public String getSynchronizationObject() {
        return this.synchronizationObject;
    }

    public static class ConfigurationSynchronizationJobRequestDestinationEndpoint extends TeaModel {
        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        public static ConfigurationSynchronizationJobRequestDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ConfigurationSynchronizationJobRequestDestinationEndpoint self = new ConfigurationSynchronizationJobRequestDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public ConfigurationSynchronizationJobRequestDestinationEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public ConfigurationSynchronizationJobRequestDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class ConfigurationSynchronizationJobRequestInitialization extends TeaModel {
        @NameInMap("DataLoad")
        public Boolean dataLoad;

        @NameInMap("StructureLoad")
        public Boolean structureLoad;

        public static ConfigurationSynchronizationJobRequestInitialization build(java.util.Map<String, ?> map) throws Exception {
            ConfigurationSynchronizationJobRequestInitialization self = new ConfigurationSynchronizationJobRequestInitialization();
            return TeaModel.build(map, self);
        }

        public ConfigurationSynchronizationJobRequestInitialization setDataLoad(Boolean dataLoad) {
            this.dataLoad = dataLoad;
            return this;
        }
        public Boolean getDataLoad() {
            return this.dataLoad;
        }

        public ConfigurationSynchronizationJobRequestInitialization setStructureLoad(Boolean structureLoad) {
            this.structureLoad = structureLoad;
            return this;
        }
        public Boolean getStructureLoad() {
            return this.structureLoad;
        }

    }

    public static class ConfigurationSynchronizationJobRequestSourceEndpoint extends TeaModel {
        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        public static ConfigurationSynchronizationJobRequestSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ConfigurationSynchronizationJobRequestSourceEndpoint self = new ConfigurationSynchronizationJobRequestSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public ConfigurationSynchronizationJobRequestSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public ConfigurationSynchronizationJobRequestSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

}
