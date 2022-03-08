// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class SetupProject extends TeaModel {
    // 架构id
    @NameInMap("ArchId")
    public String archId;

    // 架构版本
    @NameInMap("ArchVersion")
    public String archVersion;

    // 架构id
    @NameInMap("ArchitectureId")
    public String architectureId;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 预计交付时间
    @NameInMap("DeliveryTime")
    public String deliveryTime;

    // 描述
    @NameInMap("Description")
    public String description;

    // 节点
    @NameInMap("Nodes")
    public String nodes;

    // 套餐
    @NameInMap("Packages")
    public java.util.List<SetupProjectPackages> packages;

    // 资源一级ID
    @NameInMap("SetupProjectId")
    public String setupProjectId;

    // 资源名称
    @NameInMap("SetupProjectName")
    public String setupProjectName;

    // 物理空间uId
    @NameInMap("SpaceId")
    public String spaceId;

    // 物理空间名称
    @NameInMap("SpaceName")
    public String spaceName;

    // 物理空间类型
    @NameInMap("SpaceType")
    public String spaceType;

    // 状态
    @NameInMap("Status")
    public String status;

    public static SetupProject build(java.util.Map<String, ?> map) throws Exception {
        SetupProject self = new SetupProject();
        return TeaModel.build(map, self);
    }

    public SetupProject setArchId(String archId) {
        this.archId = archId;
        return this;
    }
    public String getArchId() {
        return this.archId;
    }

    public SetupProject setArchVersion(String archVersion) {
        this.archVersion = archVersion;
        return this;
    }
    public String getArchVersion() {
        return this.archVersion;
    }

    public SetupProject setArchitectureId(String architectureId) {
        this.architectureId = architectureId;
        return this;
    }
    public String getArchitectureId() {
        return this.architectureId;
    }

    public SetupProject setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public SetupProject setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
        return this;
    }
    public String getDeliveryTime() {
        return this.deliveryTime;
    }

    public SetupProject setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetupProject setNodes(String nodes) {
        this.nodes = nodes;
        return this;
    }
    public String getNodes() {
        return this.nodes;
    }

    public SetupProject setPackages(java.util.List<SetupProjectPackages> packages) {
        this.packages = packages;
        return this;
    }
    public java.util.List<SetupProjectPackages> getPackages() {
        return this.packages;
    }

    public SetupProject setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public SetupProject setSetupProjectName(String setupProjectName) {
        this.setupProjectName = setupProjectName;
        return this;
    }
    public String getSetupProjectName() {
        return this.setupProjectName;
    }

    public SetupProject setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public SetupProject setSpaceName(String spaceName) {
        this.spaceName = spaceName;
        return this;
    }
    public String getSpaceName() {
        return this.spaceName;
    }

    public SetupProject setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

    public SetupProject setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class SetupProjectPackages extends TeaModel {
        // 设备号
        @NameInMap("DeviceNumber")
        public String deviceNumber;

        // 型号
        @NameInMap("Model")
        public String model;

        // 角色
        @NameInMap("Role")
        public String role;

        // 厂商
        @NameInMap("Vendor")
        public String vendor;

        public static SetupProjectPackages build(java.util.Map<String, ?> map) throws Exception {
            SetupProjectPackages self = new SetupProjectPackages();
            return TeaModel.build(map, self);
        }

        public SetupProjectPackages setDeviceNumber(String deviceNumber) {
            this.deviceNumber = deviceNumber;
            return this;
        }
        public String getDeviceNumber() {
            return this.deviceNumber;
        }

        public SetupProjectPackages setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public SetupProjectPackages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public SetupProjectPackages setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
