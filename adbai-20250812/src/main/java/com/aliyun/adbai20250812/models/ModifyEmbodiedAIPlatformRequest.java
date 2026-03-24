// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class ModifyEmbodiedAIPlatformRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eap_platform</p>
     */
    @NameInMap("PlatformName")
    public String platformName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RayConfig")
    public ModifyEmbodiedAIPlatformRequestRayConfig rayConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
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

}
