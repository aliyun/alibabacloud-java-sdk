// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListSetupProjectsResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("SetupProject")
    public java.util.List<ListSetupProjectsResponseBodySetupProject> setupProject;

    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // 本次读取的最大数据量
    @NameInMap("MaxResults")
    public Long maxResults;

    public static ListSetupProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSetupProjectsResponseBody self = new ListSetupProjectsResponseBody();
        return TeaModel.build(map, self);
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

    public ListSetupProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSetupProjectsResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListSetupProjectsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public static class ListSetupProjectsResponseBodySetupProjectPackages extends TeaModel {
        // 角色
        @NameInMap("Role")
        public String role;

        // 设备号
        @NameInMap("DeviceNumber")
        public Long deviceNumber;

        // 厂商
        @NameInMap("Vendor")
        public String vendor;

        // 型号
        @NameInMap("Model")
        public String model;

        public static ListSetupProjectsResponseBodySetupProjectPackages build(java.util.Map<String, ?> map) throws Exception {
            ListSetupProjectsResponseBodySetupProjectPackages self = new ListSetupProjectsResponseBodySetupProjectPackages();
            return TeaModel.build(map, self);
        }

        public ListSetupProjectsResponseBodySetupProjectPackages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListSetupProjectsResponseBodySetupProjectPackages setDeviceNumber(Long deviceNumber) {
            this.deviceNumber = deviceNumber;
            return this;
        }
        public Long getDeviceNumber() {
            return this.deviceNumber;
        }

        public ListSetupProjectsResponseBodySetupProjectPackages setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public ListSetupProjectsResponseBodySetupProjectPackages setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

    }

    public static class ListSetupProjectsResponseBodySetupProject extends TeaModel {
        // 项目进展
        @NameInMap("Progress")
        public String progress;

        // 物理空间类型
        @NameInMap("SpaceType")
        public String spaceType;

        // 物理空间名称
        @NameInMap("SpaceName")
        public String spaceName;

        // 架构版本
        @NameInMap("ArchVersion")
        public String archVersion;

        // 架构id
        @NameInMap("ArchitectureId")
        public String architectureId;

        // 套餐
        @NameInMap("Packages")
        public java.util.List<ListSetupProjectsResponseBodySetupProjectPackages> packages;

        // 预计交付时间
        @NameInMap("DeliveryTime")
        public String deliveryTime;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 物理空间uId
        @NameInMap("SpaceId")
        public String spaceId;

        // 资源一级ID
        @NameInMap("SetupProjectId")
        public String setupProjectId;

        // 节点
        @NameInMap("Nodes")
        public String nodes;

        // 描述
        @NameInMap("Description")
        public String description;

        public static ListSetupProjectsResponseBodySetupProject build(java.util.Map<String, ?> map) throws Exception {
            ListSetupProjectsResponseBodySetupProject self = new ListSetupProjectsResponseBodySetupProject();
            return TeaModel.build(map, self);
        }

        public ListSetupProjectsResponseBodySetupProject setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListSetupProjectsResponseBodySetupProject setSpaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }
        public String getSpaceType() {
            return this.spaceType;
        }

        public ListSetupProjectsResponseBodySetupProject setSpaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }
        public String getSpaceName() {
            return this.spaceName;
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

        public ListSetupProjectsResponseBodySetupProject setPackages(java.util.List<ListSetupProjectsResponseBodySetupProjectPackages> packages) {
            this.packages = packages;
            return this;
        }
        public java.util.List<ListSetupProjectsResponseBodySetupProjectPackages> getPackages() {
            return this.packages;
        }

        public ListSetupProjectsResponseBodySetupProject setDeliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        public ListSetupProjectsResponseBodySetupProject setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSetupProjectsResponseBodySetupProject setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public ListSetupProjectsResponseBodySetupProject setSetupProjectId(String setupProjectId) {
            this.setupProjectId = setupProjectId;
            return this;
        }
        public String getSetupProjectId() {
            return this.setupProjectId;
        }

        public ListSetupProjectsResponseBodySetupProject setNodes(String nodes) {
            this.nodes = nodes;
            return this;
        }
        public String getNodes() {
            return this.nodes;
        }

        public ListSetupProjectsResponseBodySetupProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
