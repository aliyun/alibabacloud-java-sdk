// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetSetupProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SetupProject")
    public GetSetupProjectResponseBodySetupProject setupProject;

    public static GetSetupProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSetupProjectResponseBody self = new GetSetupProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSetupProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSetupProjectResponseBody setSetupProject(GetSetupProjectResponseBodySetupProject setupProject) {
        this.setupProject = setupProject;
        return this;
    }
    public GetSetupProjectResponseBodySetupProject getSetupProject() {
        return this.setupProject;
    }

    public static class GetSetupProjectResponseBodySetupProjectPackages extends TeaModel {
        @NameInMap("DeviceNumber")
        public String deviceNumber;

        @NameInMap("Model")
        public String model;

        @NameInMap("Role")
        public String role;

        @NameInMap("Vendor")
        public String vendor;

        public static GetSetupProjectResponseBodySetupProjectPackages build(java.util.Map<String, ?> map) throws Exception {
            GetSetupProjectResponseBodySetupProjectPackages self = new GetSetupProjectResponseBodySetupProjectPackages();
            return TeaModel.build(map, self);
        }

        public GetSetupProjectResponseBodySetupProjectPackages setDeviceNumber(String deviceNumber) {
            this.deviceNumber = deviceNumber;
            return this;
        }
        public String getDeviceNumber() {
            return this.deviceNumber;
        }

        public GetSetupProjectResponseBodySetupProjectPackages setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetSetupProjectResponseBodySetupProjectPackages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetSetupProjectResponseBodySetupProjectPackages setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class GetSetupProjectResponseBodySetupProject extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeliveryTime")
        public String deliveryTime;

        @NameInMap("Nodes")
        public String nodes;

        @NameInMap("Packages")
        public java.util.List<GetSetupProjectResponseBodySetupProjectPackages> packages;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("SetupProjectId")
        public String setupProjectId;

        @NameInMap("SpaceId")
        public String spaceId;

        @NameInMap("SpaceName")
        public String spaceName;

        @NameInMap("SpaceType")
        public String spaceType;

        public static GetSetupProjectResponseBodySetupProject build(java.util.Map<String, ?> map) throws Exception {
            GetSetupProjectResponseBodySetupProject self = new GetSetupProjectResponseBodySetupProject();
            return TeaModel.build(map, self);
        }

        public GetSetupProjectResponseBodySetupProject setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSetupProjectResponseBodySetupProject setDeliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        public GetSetupProjectResponseBodySetupProject setNodes(String nodes) {
            this.nodes = nodes;
            return this;
        }
        public String getNodes() {
            return this.nodes;
        }

        public GetSetupProjectResponseBodySetupProject setPackages(java.util.List<GetSetupProjectResponseBodySetupProjectPackages> packages) {
            this.packages = packages;
            return this;
        }
        public java.util.List<GetSetupProjectResponseBodySetupProjectPackages> getPackages() {
            return this.packages;
        }

        public GetSetupProjectResponseBodySetupProject setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetSetupProjectResponseBodySetupProject setSetupProjectId(String setupProjectId) {
            this.setupProjectId = setupProjectId;
            return this;
        }
        public String getSetupProjectId() {
            return this.setupProjectId;
        }

        public GetSetupProjectResponseBodySetupProject setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public GetSetupProjectResponseBodySetupProject setSpaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }
        public String getSpaceName() {
            return this.spaceName;
        }

        public GetSetupProjectResponseBodySetupProject setSpaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }
        public String getSpaceType() {
            return this.spaceType;
        }

    }

}
