// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateSetupProjectRequest extends TeaModel {
    @NameInMap("ArchitectureId")
    public String architectureId;

    @NameInMap("DeliveryTime")
    public String deliveryTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Nodes")
    public String nodes;

    @NameInMap("Packages")
    public java.util.List<UpdateSetupProjectRequestPackages> packages;

    @NameInMap("SetupProjectId")
    public String setupProjectId;

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
        @NameInMap("DeviceNumber")
        public Long deviceNumber;

        @NameInMap("Model")
        public String model;

        @NameInMap("Role")
        public String role;

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
