// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class CreateEmbodiedAIPlatformRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DeviceCount")
    public Integer deviceCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>platform1</p>
     */
    @NameInMap("PlatformName")
    public String platformName;

    @NameInMap("RayConfig")
    public CreateEmbodiedAIPlatformRequestRayConfig rayConfig;

    @NameInMap("RayTrainConfig")
    public CreateEmbodiedAIPlatformRequestRayTrainConfig rayTrainConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>large</p>
     */
    @NameInMap("WebserverSpecName")
    public String webserverSpecName;

    public static CreateEmbodiedAIPlatformRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEmbodiedAIPlatformRequest self = new CreateEmbodiedAIPlatformRequest();
        return TeaModel.build(map, self);
    }

    public CreateEmbodiedAIPlatformRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateEmbodiedAIPlatformRequest setDeviceCount(Integer deviceCount) {
        this.deviceCount = deviceCount;
        return this;
    }
    public Integer getDeviceCount() {
        return this.deviceCount;
    }

    public CreateEmbodiedAIPlatformRequest setPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }
    public String getPlatformName() {
        return this.platformName;
    }

    public CreateEmbodiedAIPlatformRequest setRayConfig(CreateEmbodiedAIPlatformRequestRayConfig rayConfig) {
        this.rayConfig = rayConfig;
        return this;
    }
    public CreateEmbodiedAIPlatformRequestRayConfig getRayConfig() {
        return this.rayConfig;
    }

    public CreateEmbodiedAIPlatformRequest setRayTrainConfig(CreateEmbodiedAIPlatformRequestRayTrainConfig rayTrainConfig) {
        this.rayTrainConfig = rayTrainConfig;
        return this;
    }
    public CreateEmbodiedAIPlatformRequestRayTrainConfig getRayTrainConfig() {
        return this.rayTrainConfig;
    }

    public CreateEmbodiedAIPlatformRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEmbodiedAIPlatformRequest setWebserverSpecName(String webserverSpecName) {
        this.webserverSpecName = webserverSpecName;
        return this;
    }
    public String getWebserverSpecName() {
        return this.webserverSpecName;
    }

    public static class CreateEmbodiedAIPlatformRequestRayConfigWorkerGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllocateUnit")
        public String allocateUnit;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxWorkerQuantity")
        public Integer maxWorkerQuantity;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinWorkerQuantity")
        public Integer minWorkerQuantity;

        /**
         * <strong>example:</strong>
         * <p>100G</p>
         */
        @NameInMap("WorkerDiskCapacity")
        public String workerDiskCapacity;

        /**
         * <strong>example:</strong>
         * <p>xlarge</p>
         */
        @NameInMap("WorkerSpecName")
        public String workerSpecName;

        /**
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        @NameInMap("WorkerSpecType")
        public String workerSpecType;

        public static CreateEmbodiedAIPlatformRequestRayConfigWorkerGroups build(java.util.Map<String, ?> map) throws Exception {
            CreateEmbodiedAIPlatformRequestRayConfigWorkerGroups self = new CreateEmbodiedAIPlatformRequestRayConfigWorkerGroups();
            return TeaModel.build(map, self);
        }

        public CreateEmbodiedAIPlatformRequestRayConfigWorkerGroups setAllocateUnit(String allocateUnit) {
            this.allocateUnit = allocateUnit;
            return this;
        }
        public String getAllocateUnit() {
            return this.allocateUnit;
        }

        public CreateEmbodiedAIPlatformRequestRayConfigWorkerGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateEmbodiedAIPlatformRequestRayConfigWorkerGroups setMaxWorkerQuantity(Integer maxWorkerQuantity) {
            this.maxWorkerQuantity = maxWorkerQuantity;
            return this;
        }
        public Integer getMaxWorkerQuantity() {
            return this.maxWorkerQuantity;
        }

        public CreateEmbodiedAIPlatformRequestRayConfigWorkerGroups setMinWorkerQuantity(Integer minWorkerQuantity) {
            this.minWorkerQuantity = minWorkerQuantity;
            return this;
        }
        public Integer getMinWorkerQuantity() {
            return this.minWorkerQuantity;
        }

        public CreateEmbodiedAIPlatformRequestRayConfigWorkerGroups setWorkerDiskCapacity(String workerDiskCapacity) {
            this.workerDiskCapacity = workerDiskCapacity;
            return this;
        }
        public String getWorkerDiskCapacity() {
            return this.workerDiskCapacity;
        }

        public CreateEmbodiedAIPlatformRequestRayConfigWorkerGroups setWorkerSpecName(String workerSpecName) {
            this.workerSpecName = workerSpecName;
            return this;
        }
        public String getWorkerSpecName() {
            return this.workerSpecName;
        }

        public CreateEmbodiedAIPlatformRequestRayConfigWorkerGroups setWorkerSpecType(String workerSpecType) {
            this.workerSpecType = workerSpecType;
            return this;
        }
        public String getWorkerSpecType() {
            return this.workerSpecType;
        }

    }

    public static class CreateEmbodiedAIPlatformRequestRayConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>xlarge</p>
         */
        @NameInMap("HeadSpec")
        public String headSpec;

        @NameInMap("WorkerGroups")
        public java.util.List<CreateEmbodiedAIPlatformRequestRayConfigWorkerGroups> workerGroups;

        public static CreateEmbodiedAIPlatformRequestRayConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateEmbodiedAIPlatformRequestRayConfig self = new CreateEmbodiedAIPlatformRequestRayConfig();
            return TeaModel.build(map, self);
        }

        public CreateEmbodiedAIPlatformRequestRayConfig setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateEmbodiedAIPlatformRequestRayConfig setHeadSpec(String headSpec) {
            this.headSpec = headSpec;
            return this;
        }
        public String getHeadSpec() {
            return this.headSpec;
        }

        public CreateEmbodiedAIPlatformRequestRayConfig setWorkerGroups(java.util.List<CreateEmbodiedAIPlatformRequestRayConfigWorkerGroups> workerGroups) {
            this.workerGroups = workerGroups;
            return this;
        }
        public java.util.List<CreateEmbodiedAIPlatformRequestRayConfigWorkerGroups> getWorkerGroups() {
            return this.workerGroups;
        }

    }

    public static class CreateEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;1&quot;</p>
         */
        @NameInMap("AllocateUnit")
        public String allocateUnit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>ADB.MLGrand.4</p>
         */
        @NameInMap("SpecName")
        public String specName;

        public static CreateEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs build(java.util.Map<String, ?> map) throws Exception {
            CreateEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs self = new CreateEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs();
            return TeaModel.build(map, self);
        }

        public CreateEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs setAllocateUnit(String allocateUnit) {
            this.allocateUnit = allocateUnit;
            return this;
        }
        public String getAllocateUnit() {
            return this.allocateUnit;
        }

        public CreateEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public CreateEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

    }

    public static class CreateEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cri-***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Namespaces")
        public java.util.List<String> namespaces;

        /**
         * <strong>example:</strong>
         * <p>example-vpc.example-region.cr.aliyuncs.com</p>
         */
        @NameInMap("Registry")
        public String registry;

        public static CreateEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig self = new CreateEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig();
            return TeaModel.build(map, self);
        }

        public CreateEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig setNamespaces(java.util.List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

        public CreateEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig setRegistry(String registry) {
            this.registry = registry;
            return this;
        }
        public String getRegistry() {
            return this.registry;
        }

    }

    public static class CreateEmbodiedAIPlatformRequestRayTrainConfigTerminalConfig extends TeaModel {
        @NameInMap("AcrConfig")
        public CreateEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig acrConfig;

        public static CreateEmbodiedAIPlatformRequestRayTrainConfigTerminalConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateEmbodiedAIPlatformRequestRayTrainConfigTerminalConfig self = new CreateEmbodiedAIPlatformRequestRayTrainConfigTerminalConfig();
            return TeaModel.build(map, self);
        }

        public CreateEmbodiedAIPlatformRequestRayTrainConfigTerminalConfig setAcrConfig(CreateEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig acrConfig) {
            this.acrConfig = acrConfig;
            return this;
        }
        public CreateEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig getAcrConfig() {
            return this.acrConfig;
        }

    }

    public static class CreateEmbodiedAIPlatformRequestRayTrainConfig extends TeaModel {
        @NameInMap("CpuAcu")
        public Long cpuAcu;

        @NameInMap("GpuSpecs")
        public java.util.List<CreateEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs> gpuSpecs;

        @NameInMap("TerminalConfig")
        public CreateEmbodiedAIPlatformRequestRayTrainConfigTerminalConfig terminalConfig;

        public static CreateEmbodiedAIPlatformRequestRayTrainConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateEmbodiedAIPlatformRequestRayTrainConfig self = new CreateEmbodiedAIPlatformRequestRayTrainConfig();
            return TeaModel.build(map, self);
        }

        public CreateEmbodiedAIPlatformRequestRayTrainConfig setCpuAcu(Long cpuAcu) {
            this.cpuAcu = cpuAcu;
            return this;
        }
        public Long getCpuAcu() {
            return this.cpuAcu;
        }

        public CreateEmbodiedAIPlatformRequestRayTrainConfig setGpuSpecs(java.util.List<CreateEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs> gpuSpecs) {
            this.gpuSpecs = gpuSpecs;
            return this;
        }
        public java.util.List<CreateEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs> getGpuSpecs() {
            return this.gpuSpecs;
        }

        public CreateEmbodiedAIPlatformRequestRayTrainConfig setTerminalConfig(CreateEmbodiedAIPlatformRequestRayTrainConfigTerminalConfig terminalConfig) {
            this.terminalConfig = terminalConfig;
            return this;
        }
        public CreateEmbodiedAIPlatformRequestRayTrainConfigTerminalConfig getTerminalConfig() {
            return this.terminalConfig;
        }

    }

}
