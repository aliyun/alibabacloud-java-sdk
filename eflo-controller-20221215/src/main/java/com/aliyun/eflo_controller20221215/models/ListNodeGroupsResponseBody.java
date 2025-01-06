// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListNodeGroupsResponseBody extends TeaModel {
    /**
     * <p>Cluster group information</p>
     */
    @NameInMap("Groups")
    public java.util.List<ListNodeGroupsResponseBodyGroups> groups;

    /**
     * <p>NextToken for the next page, include this value when requesting the next page</p>
     * 
     * <strong>example:</strong>
     * <p>563d42ae0b17572449ec8c97f7f66069</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>887FA855-89F4-5DB3-B305-C5879EC480E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListNodeGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeGroupsResponseBody self = new ListNodeGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeGroupsResponseBody setGroups(java.util.List<ListNodeGroupsResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<ListNodeGroupsResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public ListNodeGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNodeGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNodeGroupsResponseBodyGroups extends TeaModel {
        /**
         * <p>Cluster ID</p>
         * 
         * <strong>example:</strong>
         * <p>i113952461729854708648</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>Cluster name</p>
         * 
         * <strong>example:</strong>
         * <p>wzq-exclusivelite-71</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-02-27T13:16:31.599</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>created by ga2_prepare</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>238276221</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>Group name.</p>
         * 
         * <strong>example:</strong>
         * <p>backend-group</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Image ID</p>
         * 
         * <strong>example:</strong>
         * <p>i194015071707321240258</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>Image name</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS_7.9_x86_64_FULL_20221110</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>Machine type</p>
         * 
         * <strong>example:</strong>
         * <p>efg1.nvga1n</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        /**
         * <p>Number of nodes</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NodeCount")
        public Long nodeCount;

        /**
         * <p>Update time</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-22T00:03:05.114</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>可用区id</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-c</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListNodeGroupsResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            ListNodeGroupsResponseBodyGroups self = new ListNodeGroupsResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public ListNodeGroupsResponseBodyGroups setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListNodeGroupsResponseBodyGroups setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListNodeGroupsResponseBodyGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListNodeGroupsResponseBodyGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListNodeGroupsResponseBodyGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListNodeGroupsResponseBodyGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListNodeGroupsResponseBodyGroups setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListNodeGroupsResponseBodyGroups setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListNodeGroupsResponseBodyGroups setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public ListNodeGroupsResponseBodyGroups setNodeCount(Long nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Long getNodeCount() {
            return this.nodeCount;
        }

        public ListNodeGroupsResponseBodyGroups setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListNodeGroupsResponseBodyGroups setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
