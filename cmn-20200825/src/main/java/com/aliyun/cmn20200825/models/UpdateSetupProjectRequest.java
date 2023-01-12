// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateSetupProjectRequest extends TeaModel {
    /**
     * <p>架构id</p>
     */
    @NameInMap("ArchitectureId")
    public String architectureId;

    /**
     * <p>预计交付时间</p>
     */
    @NameInMap("DeliveryTime")
    public String deliveryTime;

    /**
     * <p>描述</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>节点</p>
     */
    @NameInMap("Nodes")
    public String nodes;

    /**
     * <p>套餐</p>
     */
    @NameInMap("Packages")
    public java.util.List<UpdateSetupProjectRequestPackages> packages;

    /**
     * <p>代表资源一级ID的资源属性字段</p>
     */
    @NameInMap("SetupProjectId")
    public String setupProjectId;

    /**
     * <p>物理空间uId</p>
     */
    @NameInMap("SpaceId")
    public String spaceId;

    public static UpdateSetupProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSetupProjectRequest self = new UpdateSetupProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSetupProjectRequest setArchitectureId(String architectureId) {
        this.architectureId = architectureId;
        return this;
    }
    public String getArchitectureId() {
        return this.architectureId;
    }

    public UpdateSetupProjectRequest setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
        return this;
    }
    public String getDeliveryTime() {
        return this.deliveryTime;
    }

    public UpdateSetupProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSetupProjectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSetupProjectRequest setNodes(String nodes) {
        this.nodes = nodes;
        return this;
    }
    public String getNodes() {
        return this.nodes;
    }

    public UpdateSetupProjectRequest setPackages(java.util.List<UpdateSetupProjectRequestPackages> packages) {
        this.packages = packages;
        return this;
    }
    public java.util.List<UpdateSetupProjectRequestPackages> getPackages() {
        return this.packages;
    }

    public UpdateSetupProjectRequest setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public UpdateSetupProjectRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public static class UpdateSetupProjectRequestPackages extends TeaModel {
        /**
         * <p>设备号</p>
         */
        @NameInMap("DeviceNumber")
        public Long deviceNumber;

        /**
         * <p>型号</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>角色</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>厂商</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        public static UpdateSetupProjectRequestPackages build(java.util.Map<String, ?> map) throws Exception {
            UpdateSetupProjectRequestPackages self = new UpdateSetupProjectRequestPackages();
            return TeaModel.build(map, self);
        }

        public UpdateSetupProjectRequestPackages setDeviceNumber(Long deviceNumber) {
            this.deviceNumber = deviceNumber;
            return this;
        }
        public Long getDeviceNumber() {
            return this.deviceNumber;
        }

        public UpdateSetupProjectRequestPackages setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public UpdateSetupProjectRequestPackages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public UpdateSetupProjectRequestPackages setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
