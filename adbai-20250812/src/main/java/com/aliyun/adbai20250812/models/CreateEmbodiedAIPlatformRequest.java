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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>platform1</p>
     */
    @NameInMap("PlatformName")
    public String platformName;

    @NameInMap("RayConfig")
    public CreateEmbodiedAIPlatformRequestRayConfig rayConfig;

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

}
