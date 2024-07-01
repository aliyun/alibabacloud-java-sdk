// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The queried resource group.</p>
     */
    @NameInMap("GroupsInfo")
    public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfo> groupsInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A94B6C02-7BD4-5D67-9776-3AC8317E8DD3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBResourceGroupResponseBody self = new DescribeDBResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBResourceGroupResponseBody setGroupsInfo(java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfo> groupsInfo) {
        this.groupsInfo = groupsInfo;
        return this;
    }
    public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfo> getGroupsInfo() {
        return this.groupsInfo;
    }

    public DescribeDBResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfoRules extends TeaModel {
        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>user_default</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The execution duration of the query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>180000</p>
         */
        @NameInMap("QueryTime")
        public String queryTime;

        /**
         * <p>The name of the destination resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>job</p>
         */
        @NameInMap("TargetGroupName")
        public String targetGroupName;

        public static DescribeDBResourceGroupResponseBodyGroupsInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfoRules self = new DescribeDBResourceGroupResponseBodyGroupsInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRules setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRules setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRules setTargetGroupName(String targetGroupName) {
            this.targetGroupName = targetGroupName;
            return this;
        }
        public String getTargetGroupName() {
            return this.targetGroupName;
        }

    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfo extends TeaModel {
        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("ClusterMode")
        public String clusterMode;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("ClusterSizeResource")
        public String clusterSizeResource;

        /**
         * <p>The time when the resource group was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-29T03:34:30Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The minimum amount of elastic computing resources. Unit: ACUs.</p>
         * 
         * <strong>example:</strong>
         * <p>16ACU</p>
         */
        @NameInMap("ElasticMinComputeResource")
        public String elasticMinComputeResource;

        /**
         * <p>Indicates whether the preemptible instance feature is enabled for the resource group. After the preemptible instance feature is enabled, you are charged for resources at a lower unit price but the resources are probably released. Valid values:</p>
         * <ul>
         * <li><strong>True</strong></li>
         * <li><strong>False</strong></li>
         * </ul>
         * <p>The True value is returned only for job resource groups.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("EnableSpot")
        public String enableSpot;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the resource group. Valid values:</p>
         * <ul>
         * <li><strong>Interactive</strong></li>
         * <li><strong>Job</strong></li>
         * </ul>
         * <blockquote>
         * <p> For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/428610.html">Resource groups</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Job</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The Resource Access Management (RAM) user that is associated with the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>testb,testc</p>
         */
        @NameInMap("GroupUsers")
        public String groupUsers;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("MaxClusterCount")
        public Integer maxClusterCount;

        /**
         * <p>The maximum amount of reserved computing resources. Unit: ACUs.</p>
         * 
         * <strong>example:</strong>
         * <p>512ACU</p>
         */
        @NameInMap("MaxComputeResource")
        public String maxComputeResource;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("MinClusterCount")
        public Integer minClusterCount;

        /**
         * <p>The minimum amount of reserved computing resources. Unit: AnalyticDB compute units (ACUs).</p>
         * 
         * <strong>example:</strong>
         * <p>0ACU</p>
         */
        @NameInMap("MinComputeResource")
        public String minComputeResource;

        /**
         * <p>The job resubmission rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRules> rules;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("RunningClusterCount")
        public Integer runningClusterCount;

        /**
         * <p>The status of the resource group. Valid values:</p>
         * <ul>
         * <li><strong>creating</strong>: The resource group is being created.</li>
         * <li><strong>ok</strong>: The resource group is created.</li>
         * <li><strong>pendingdelete</strong>: The resource group is pending to be deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the resource group was updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-31T03:34:30Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeDBResourceGroupResponseBodyGroupsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfo self = new DescribeDBResourceGroupResponseBodyGroupsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setClusterMode(String clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public String getClusterMode() {
            return this.clusterMode;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setClusterSizeResource(String clusterSizeResource) {
            this.clusterSizeResource = clusterSizeResource;
            return this;
        }
        public String getClusterSizeResource() {
            return this.clusterSizeResource;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setElasticMinComputeResource(String elasticMinComputeResource) {
            this.elasticMinComputeResource = elasticMinComputeResource;
            return this;
        }
        public String getElasticMinComputeResource() {
            return this.elasticMinComputeResource;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setEnableSpot(String enableSpot) {
            this.enableSpot = enableSpot;
            return this;
        }
        public String getEnableSpot() {
            return this.enableSpot;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setGroupUsers(String groupUsers) {
            this.groupUsers = groupUsers;
            return this;
        }
        public String getGroupUsers() {
            return this.groupUsers;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setMaxClusterCount(Integer maxClusterCount) {
            this.maxClusterCount = maxClusterCount;
            return this;
        }
        public Integer getMaxClusterCount() {
            return this.maxClusterCount;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setMaxComputeResource(String maxComputeResource) {
            this.maxComputeResource = maxComputeResource;
            return this;
        }
        public String getMaxComputeResource() {
            return this.maxComputeResource;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setMinClusterCount(Integer minClusterCount) {
            this.minClusterCount = minClusterCount;
            return this;
        }
        public Integer getMinClusterCount() {
            return this.minClusterCount;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setMinComputeResource(String minComputeResource) {
            this.minComputeResource = minComputeResource;
            return this;
        }
        public String getMinComputeResource() {
            return this.minComputeResource;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setRules(java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRules> getRules() {
            return this.rules;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setRunningClusterCount(Integer runningClusterCount) {
            this.runningClusterCount = runningClusterCount;
            return this;
        }
        public Integer getRunningClusterCount() {
            return this.runningClusterCount;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
