// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class CreateEmbodiedAIPlatformRequest extends TeaModel {
    /**
     * <p>The instance cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ontology count.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DeviceCount")
    public Integer deviceCount;

    /**
     * <p>The name of the embodied intelligence multimodal data platform.</p>
     * <blockquote>
     * <p>The name can contain lowercase letters, digits, and underscores. It must start with a letter and end with a letter or digit. The name can be up to 16 characters in length.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>platform1</p>
     */
    @NameInMap("PlatformName")
    public String platformName;

    /**
     * <p>The Ray specification information of the platform.</p>
     */
    @NameInMap("RayConfig")
    public CreateEmbodiedAIPlatformRequestRayConfig rayConfig;

    /**
     * <p>The development and training resource configuration.</p>
     */
    @NameInMap("RayTrainConfig")
    public CreateEmbodiedAIPlatformRequestRayTrainConfig rayTrainConfig;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the DescribeRegions operation to query the region ID of a specified Data Lakehouse Edition cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The webserver specification of the platform.</p>
     * 
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
         * <p>The allocation unit.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllocateUnit")
        public String allocateUnit;

        /**
         * <p>The name of the worker group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The maximum number of workers.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxWorkerQuantity")
        public Integer maxWorkerQuantity;

        /**
         * <p>The minimum number of workers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinWorkerQuantity")
        public Integer minWorkerQuantity;

        /**
         * <p>The disk size of the worker node.</p>
         * 
         * <strong>example:</strong>
         * <p>100G</p>
         */
        @NameInMap("WorkerDiskCapacity")
        public String workerDiskCapacity;

        /**
         * <p>The node specifications of the worker node.</p>
         * 
         * <strong>example:</strong>
         * <p>xlarge</p>
         */
        @NameInMap("WorkerSpecName")
        public String workerSpecName;

        /**
         * <p>The resource type of the worker node.</p>
         * 
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
         * <p>The Ray cluster type. Valid values:</p>
         * <ul>
         * <li><p>BASIC: basic type, non-high-availability.</p>
         * </li>
         * <li><p>HIGH_AVAILABILITY: high-availability type.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The node specifications of the head node.</p>
         * 
         * <strong>example:</strong>
         * <p>xlarge</p>
         */
        @NameInMap("HeadSpec")
        public String headSpec;

        /**
         * <p>The list of Ray worker group configurations.</p>
         */
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
         * <p>The allocation unit.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;1&quot;</p>
         */
        @NameInMap("AllocateUnit")
        public String allocateUnit;

        /**
         * <p>The number of GPU cards.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The GPU model.</p>
         * 
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
         * <p>The instance ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The list of namespaces.</p>
         */
        @NameInMap("Namespaces")
        public java.util.List<String> namespaces;

        /**
         * <p>The address of the image repository instance.</p>
         * 
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
        /**
         * <p>The image repository configuration.</p>
         */
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
        /**
         * <p>The number of CPU ACUs to purchase.</p>
         */
        @NameInMap("CpuAcu")
        public Long cpuAcu;

        /**
         * <p>The list of GPU model specifications to purchase.</p>
         */
        @NameInMap("GpuSpecs")
        public java.util.List<CreateEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs> gpuSpecs;

        /**
         * <p>The development machine configuration.</p>
         */
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
