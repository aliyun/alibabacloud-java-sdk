// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListSetupProjectsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public Integer nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SetupProject")
    public java.util.List<ListSetupProjectsResponseBodySetupProject> setupProject;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSetupProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSetupProjectsResponseBody self = new ListSetupProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSetupProjectsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListSetupProjectsResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListSetupProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSetupProjectsResponseBody setSetupProject(java.util.List<ListSetupProjectsResponseBodySetupProject> setupProject) {
        this.setupProject = setupProject;
        return this;
    }
    public java.util.List<ListSetupProjectsResponseBodySetupProject> getSetupProject() {
        return this.setupProject;
    }

    public ListSetupProjectsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSetupProjectsResponseBodySetupProjectPackages extends TeaModel {
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

        public static ListSetupProjectsResponseBodySetupProjectPackages build(java.util.Map<String, ?> map) throws Exception {
            ListSetupProjectsResponseBodySetupProjectPackages self = new ListSetupProjectsResponseBodySetupProjectPackages();
            return TeaModel.build(map, self);
        }

        public ListSetupProjectsResponseBodySetupProjectPackages setDeviceNumber(Long deviceNumber) {
            this.deviceNumber = deviceNumber;
            return this;
        }
        public Long getDeviceNumber() {
            return this.deviceNumber;
        }

        public ListSetupProjectsResponseBodySetupProjectPackages setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListSetupProjectsResponseBodySetupProjectPackages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListSetupProjectsResponseBodySetupProjectPackages setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class ListSetupProjectsResponseBodySetupProject extends TeaModel {
        /**
         * <p>架构id</p>
         */
        @NameInMap("ArchVersion")
        public String archVersion;

        @NameInMap("ArchitectureId")
        public String architectureId;

        /**
         * <p>代表创建时间的资源属性字段</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>预计交付时间</p>
         */
        @NameInMap("DeliveryTime")
        public String deliveryTime;

        @NameInMap("Description")
        public String description;

        /**
         * <p>节点</p>
         */
        @NameInMap("Nodes")
        public String nodes;

        /**
         * <p>套餐</p>
         */
        @NameInMap("Packages")
        public java.util.List<ListSetupProjectsResponseBodySetupProjectPackages> packages;

        @NameInMap("Progress")
        public String progress;

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

        @NameInMap("SpaceName")
        public String spaceName;

        @NameInMap("SpaceType")
        public String spaceType;

        public static ListSetupProjectsResponseBodySetupProject build(java.util.Map<String, ?> map) throws Exception {
            ListSetupProjectsResponseBodySetupProject self = new ListSetupProjectsResponseBodySetupProject();
            return TeaModel.build(map, self);
        }

        public ListSetupProjectsResponseBodySetupProject setArchVersion(String archVersion) {
            this.archVersion = archVersion;
            return this;
        }
        public String getArchVersion() {
            return this.archVersion;
        }

        public ListSetupProjectsResponseBodySetupProject setArchitectureId(String architectureId) {
            this.architectureId = architectureId;
            return this;
        }
        public String getArchitectureId() {
            return this.architectureId;
        }

        public ListSetupProjectsResponseBodySetupProject setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSetupProjectsResponseBodySetupProject setDeliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        public ListSetupProjectsResponseBodySetupProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSetupProjectsResponseBodySetupProject setNodes(String nodes) {
            this.nodes = nodes;
            return this;
        }
        public String getNodes() {
            return this.nodes;
        }

        public ListSetupProjectsResponseBodySetupProject setPackages(java.util.List<ListSetupProjectsResponseBodySetupProjectPackages> packages) {
            this.packages = packages;
            return this;
        }
        public java.util.List<ListSetupProjectsResponseBodySetupProjectPackages> getPackages() {
            return this.packages;
        }

        public ListSetupProjectsResponseBodySetupProject setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListSetupProjectsResponseBodySetupProject setSetupProjectId(String setupProjectId) {
            this.setupProjectId = setupProjectId;
            return this;
        }
        public String getSetupProjectId() {
            return this.setupProjectId;
        }

        public ListSetupProjectsResponseBodySetupProject setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public ListSetupProjectsResponseBodySetupProject setSpaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }
        public String getSpaceName() {
            return this.spaceName;
        }

        public ListSetupProjectsResponseBodySetupProject setSpaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }
        public String getSpaceType() {
            return this.spaceType;
        }

    }

}
