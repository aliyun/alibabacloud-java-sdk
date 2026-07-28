// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class ModifyEmbodiedAIPlatformRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DeviceCount")
    public String deviceCount;

    /**
     * <p>The name of the embodied intelligence multimodal data platform.</p>
     * <blockquote>
     * <p>The name can contain lowercase letters, digits, and underscores (_). It must start with a letter and end with a letter or digit. The name can be up to 16 characters in length.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eap_platform</p>
     */
    @NameInMap("PlatformName")
    public String platformName;

    /**
     * <p>The Ray specification information of the platform.</p>
     */
    @NameInMap("RayConfig")
    public ModifyEmbodiedAIPlatformRequestRayConfig rayConfig;

    @NameInMap("RayTrainConfig")
    public ModifyEmbodiedAIPlatformRequestRayTrainConfig rayTrainConfig;

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
     * <p>The Webserver specification of the platform.</p>
     * 
     * <strong>example:</strong>
     * <p>large</p>
     */
    @NameInMap("WebserverSpecName")
    public String webserverSpecName;

    public static ModifyEmbodiedAIPlatformRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEmbodiedAIPlatformRequest self = new ModifyEmbodiedAIPlatformRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEmbodiedAIPlatformRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyEmbodiedAIPlatformRequest setDeviceCount(String deviceCount) {
        this.deviceCount = deviceCount;
        return this;
    }
    public String getDeviceCount() {
        return this.deviceCount;
    }

    public ModifyEmbodiedAIPlatformRequest setPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }
    public String getPlatformName() {
        return this.platformName;
    }

    public ModifyEmbodiedAIPlatformRequest setRayConfig(ModifyEmbodiedAIPlatformRequestRayConfig rayConfig) {
        this.rayConfig = rayConfig;
        return this;
    }
    public ModifyEmbodiedAIPlatformRequestRayConfig getRayConfig() {
        return this.rayConfig;
    }

    public ModifyEmbodiedAIPlatformRequest setRayTrainConfig(ModifyEmbodiedAIPlatformRequestRayTrainConfig rayTrainConfig) {
        this.rayTrainConfig = rayTrainConfig;
        return this;
    }
    public ModifyEmbodiedAIPlatformRequestRayTrainConfig getRayTrainConfig() {
        return this.rayTrainConfig;
    }

    public ModifyEmbodiedAIPlatformRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyEmbodiedAIPlatformRequest setWebserverSpecName(String webserverSpecName) {
        this.webserverSpecName = webserverSpecName;
        return this;
    }
    public String getWebserverSpecName() {
        return this.webserverSpecName;
    }

    public static class ModifyEmbodiedAIPlatformRequestRayConfigWorkerGroups extends TeaModel {
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

        public static ModifyEmbodiedAIPlatformRequestRayConfigWorkerGroups build(java.util.Map<String, ?> map) throws Exception {
            ModifyEmbodiedAIPlatformRequestRayConfigWorkerGroups self = new ModifyEmbodiedAIPlatformRequestRayConfigWorkerGroups();
            return TeaModel.build(map, self);
        }

        public ModifyEmbodiedAIPlatformRequestRayConfigWorkerGroups setAllocateUnit(String allocateUnit) {
            this.allocateUnit = allocateUnit;
            return this;
        }
        public String getAllocateUnit() {
            return this.allocateUnit;
        }

        public ModifyEmbodiedAIPlatformRequestRayConfigWorkerGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ModifyEmbodiedAIPlatformRequestRayConfigWorkerGroups setMaxWorkerQuantity(Integer maxWorkerQuantity) {
            this.maxWorkerQuantity = maxWorkerQuantity;
            return this;
        }
        public Integer getMaxWorkerQuantity() {
            return this.maxWorkerQuantity;
        }

        public ModifyEmbodiedAIPlatformRequestRayConfigWorkerGroups setMinWorkerQuantity(Integer minWorkerQuantity) {
            this.minWorkerQuantity = minWorkerQuantity;
            return this;
        }
        public Integer getMinWorkerQuantity() {
            return this.minWorkerQuantity;
        }

        public ModifyEmbodiedAIPlatformRequestRayConfigWorkerGroups setWorkerDiskCapacity(String workerDiskCapacity) {
            this.workerDiskCapacity = workerDiskCapacity;
            return this;
        }
        public String getWorkerDiskCapacity() {
            return this.workerDiskCapacity;
        }

        public ModifyEmbodiedAIPlatformRequestRayConfigWorkerGroups setWorkerSpecName(String workerSpecName) {
            this.workerSpecName = workerSpecName;
            return this;
        }
        public String getWorkerSpecName() {
            return this.workerSpecName;
        }

        public ModifyEmbodiedAIPlatformRequestRayConfigWorkerGroups setWorkerSpecType(String workerSpecType) {
            this.workerSpecType = workerSpecType;
            return this;
        }
        public String getWorkerSpecType() {
            return this.workerSpecType;
        }

    }

    public static class ModifyEmbodiedAIPlatformRequestRayConfig extends TeaModel {
        /**
         * <p>The type of the Ray cluster. Valid values:</p>
         * <ul>
         * <li><p>BASIC: basic type, which does not support high availability.</p>
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
         * <p>The configuration information of Ray worker groups.</p>
         */
        @NameInMap("WorkerGroups")
        public java.util.List<ModifyEmbodiedAIPlatformRequestRayConfigWorkerGroups> workerGroups;

        public static ModifyEmbodiedAIPlatformRequestRayConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyEmbodiedAIPlatformRequestRayConfig self = new ModifyEmbodiedAIPlatformRequestRayConfig();
            return TeaModel.build(map, self);
        }

        public ModifyEmbodiedAIPlatformRequestRayConfig setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyEmbodiedAIPlatformRequestRayConfig setHeadSpec(String headSpec) {
            this.headSpec = headSpec;
            return this;
        }
        public String getHeadSpec() {
            return this.headSpec;
        }

        public ModifyEmbodiedAIPlatformRequestRayConfig setWorkerGroups(java.util.List<ModifyEmbodiedAIPlatformRequestRayConfigWorkerGroups> workerGroups) {
            this.workerGroups = workerGroups;
            return this;
        }
        public java.util.List<ModifyEmbodiedAIPlatformRequestRayConfigWorkerGroups> getWorkerGroups() {
            return this.workerGroups;
        }

    }

    public static class ModifyEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs extends TeaModel {
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
         * <p>ADB.MLTensor.2</p>
         */
        @NameInMap("SpecName")
        public String specName;

        public static ModifyEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs build(java.util.Map<String, ?> map) throws Exception {
            ModifyEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs self = new ModifyEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs();
            return TeaModel.build(map, self);
        }

        public ModifyEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs setAllocateUnit(String allocateUnit) {
            this.allocateUnit = allocateUnit;
            return this;
        }
        public String getAllocateUnit() {
            return this.allocateUnit;
        }

        public ModifyEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ModifyEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

    }

    public static class ModifyEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i-8vb32jdd306b50rodza7</p>
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

        public static ModifyEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig self = new ModifyEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig();
            return TeaModel.build(map, self);
        }

        public ModifyEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig setNamespaces(java.util.List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

        public ModifyEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig setRegistry(String registry) {
            this.registry = registry;
            return this;
        }
        public String getRegistry() {
            return this.registry;
        }

    }

    public static class ModifyEmbodiedAIPlatformRequestRayTrainConfigTerminalConfig extends TeaModel {
        @NameInMap("AcrConfig")
        public ModifyEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig acrConfig;

        public static ModifyEmbodiedAIPlatformRequestRayTrainConfigTerminalConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyEmbodiedAIPlatformRequestRayTrainConfigTerminalConfig self = new ModifyEmbodiedAIPlatformRequestRayTrainConfigTerminalConfig();
            return TeaModel.build(map, self);
        }

        public ModifyEmbodiedAIPlatformRequestRayTrainConfigTerminalConfig setAcrConfig(ModifyEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig acrConfig) {
            this.acrConfig = acrConfig;
            return this;
        }
        public ModifyEmbodiedAIPlatformRequestRayTrainConfigTerminalConfigAcrConfig getAcrConfig() {
            return this.acrConfig;
        }

    }

    public static class ModifyEmbodiedAIPlatformRequestRayTrainConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CpuAcu")
        public Long cpuAcu;

        @NameInMap("GpuSpecs")
        public java.util.List<ModifyEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs> gpuSpecs;

        @NameInMap("TerminalConfig")
        public ModifyEmbodiedAIPlatformRequestRayTrainConfigTerminalConfig terminalConfig;

        public static ModifyEmbodiedAIPlatformRequestRayTrainConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyEmbodiedAIPlatformRequestRayTrainConfig self = new ModifyEmbodiedAIPlatformRequestRayTrainConfig();
            return TeaModel.build(map, self);
        }

        public ModifyEmbodiedAIPlatformRequestRayTrainConfig setCpuAcu(Long cpuAcu) {
            this.cpuAcu = cpuAcu;
            return this;
        }
        public Long getCpuAcu() {
            return this.cpuAcu;
        }

        public ModifyEmbodiedAIPlatformRequestRayTrainConfig setGpuSpecs(java.util.List<ModifyEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs> gpuSpecs) {
            this.gpuSpecs = gpuSpecs;
            return this;
        }
        public java.util.List<ModifyEmbodiedAIPlatformRequestRayTrainConfigGpuSpecs> getGpuSpecs() {
            return this.gpuSpecs;
        }

        public ModifyEmbodiedAIPlatformRequestRayTrainConfig setTerminalConfig(ModifyEmbodiedAIPlatformRequestRayTrainConfigTerminalConfig terminalConfig) {
            this.terminalConfig = terminalConfig;
            return this;
        }
        public ModifyEmbodiedAIPlatformRequestRayTrainConfigTerminalConfig getTerminalConfig() {
            return this.terminalConfig;
        }

    }

}
