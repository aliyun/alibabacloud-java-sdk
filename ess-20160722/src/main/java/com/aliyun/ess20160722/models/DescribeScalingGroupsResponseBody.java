// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class DescribeScalingGroupsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingGroups")
    public DescribeScalingGroupsResponseBodyScalingGroups scalingGroups;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeScalingGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingGroupsResponseBody self = new DescribeScalingGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScalingGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingGroupsResponseBody setScalingGroups(DescribeScalingGroupsResponseBodyScalingGroups scalingGroups) {
        this.scalingGroups = scalingGroups;
        return this;
    }
    public DescribeScalingGroupsResponseBodyScalingGroups getScalingGroups() {
        return this.scalingGroups;
    }

    public DescribeScalingGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupDBInstanceIds extends TeaModel {
        @NameInMap("DBInstanceId")
        public java.util.List<String> DBInstanceId;

        public static DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupDBInstanceIds self = new DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupDBInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupDBInstanceIds setDBInstanceId(java.util.List<String> DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public java.util.List<String> getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

    public static class DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupLoadBalancerIds extends TeaModel {
        @NameInMap("LoadBalancerId")
        public java.util.List<String> loadBalancerId;

        public static DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupLoadBalancerIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupLoadBalancerIds self = new DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupLoadBalancerIds();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupLoadBalancerIds setLoadBalancerId(java.util.List<String> loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public java.util.List<String> getLoadBalancerId() {
            return this.loadBalancerId;
        }

    }

    public static class DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupRemovalPolicies extends TeaModel {
        @NameInMap("RemovalPolicy")
        public java.util.List<String> removalPolicy;

        public static DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupRemovalPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupRemovalPolicies self = new DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupRemovalPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupRemovalPolicies setRemovalPolicy(java.util.List<String> removalPolicy) {
            this.removalPolicy = removalPolicy;
            return this;
        }
        public java.util.List<String> getRemovalPolicy() {
            return this.removalPolicy;
        }

    }

    public static class DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup extends TeaModel {
        @NameInMap("ActiveCapacity")
        public Integer activeCapacity;

        @NameInMap("ActiveScalingConfigurationId")
        public String activeScalingConfigurationId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DBInstanceIds")
        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupDBInstanceIds DBInstanceIds;

        @NameInMap("DefaultCooldown")
        public Integer defaultCooldown;

        @NameInMap("LifecycleState")
        public String lifecycleState;

        @NameInMap("LoadBalancerIds")
        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupLoadBalancerIds loadBalancerIds;

        @NameInMap("MaxSize")
        public Integer maxSize;

        @NameInMap("MinSize")
        public Integer minSize;

        @NameInMap("PendingCapacity")
        public Integer pendingCapacity;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RemovalPolicies")
        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupRemovalPolicies removalPolicies;

        @NameInMap("RemovingCapacity")
        public Integer removingCapacity;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("ScalingGroupName")
        public String scalingGroupName;

        @NameInMap("TotalCapacity")
        public Integer totalCapacity;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup self = new DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup setActiveCapacity(Integer activeCapacity) {
            this.activeCapacity = activeCapacity;
            return this;
        }
        public Integer getActiveCapacity() {
            return this.activeCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup setActiveScalingConfigurationId(String activeScalingConfigurationId) {
            this.activeScalingConfigurationId = activeScalingConfigurationId;
            return this;
        }
        public String getActiveScalingConfigurationId() {
            return this.activeScalingConfigurationId;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup setDBInstanceIds(DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupDBInstanceIds DBInstanceIds) {
            this.DBInstanceIds = DBInstanceIds;
            return this;
        }
        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupDBInstanceIds getDBInstanceIds() {
            return this.DBInstanceIds;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup setDefaultCooldown(Integer defaultCooldown) {
            this.defaultCooldown = defaultCooldown;
            return this;
        }
        public Integer getDefaultCooldown() {
            return this.defaultCooldown;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup setLifecycleState(String lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup setLoadBalancerIds(DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupLoadBalancerIds loadBalancerIds) {
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }
        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupLoadBalancerIds getLoadBalancerIds() {
            return this.loadBalancerIds;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Integer getMaxSize() {
            return this.maxSize;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup setMinSize(Integer minSize) {
            this.minSize = minSize;
            return this;
        }
        public Integer getMinSize() {
            return this.minSize;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup setPendingCapacity(Integer pendingCapacity) {
            this.pendingCapacity = pendingCapacity;
            return this;
        }
        public Integer getPendingCapacity() {
            return this.pendingCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup setRemovalPolicies(DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupRemovalPolicies removalPolicies) {
            this.removalPolicies = removalPolicies;
            return this;
        }
        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroupRemovalPolicies getRemovalPolicies() {
            return this.removalPolicies;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup setRemovingCapacity(Integer removingCapacity) {
            this.removingCapacity = removingCapacity;
            return this;
        }
        public Integer getRemovingCapacity() {
            return this.removingCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup setScalingGroupName(String scalingGroupName) {
            this.scalingGroupName = scalingGroupName;
            return this;
        }
        public String getScalingGroupName() {
            return this.scalingGroupName;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup setTotalCapacity(Integer totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }
        public Integer getTotalCapacity() {
            return this.totalCapacity;
        }

        public DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeScalingGroupsResponseBodyScalingGroups extends TeaModel {
        @NameInMap("ScalingGroup")
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup> scalingGroup;

        public static DescribeScalingGroupsResponseBodyScalingGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingGroupsResponseBodyScalingGroups self = new DescribeScalingGroupsResponseBodyScalingGroups();
            return TeaModel.build(map, self);
        }

        public DescribeScalingGroupsResponseBodyScalingGroups setScalingGroup(java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup> scalingGroup) {
            this.scalingGroup = scalingGroup;
            return this;
        }
        public java.util.List<DescribeScalingGroupsResponseBodyScalingGroupsScalingGroup> getScalingGroup() {
            return this.scalingGroup;
        }

    }

}
