// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterHostGroupResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("HostGroupList")
    public ListClusterHostGroupResponseBodyHostGroupList hostGroupList;

    public static ListClusterHostGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterHostGroupResponseBody self = new ListClusterHostGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterHostGroupResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterHostGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterHostGroupResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterHostGroupResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterHostGroupResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListClusterHostGroupResponseBody setHostGroupList(ListClusterHostGroupResponseBodyHostGroupList hostGroupList) {
        this.hostGroupList = hostGroupList;
        return this;
    }
    public ListClusterHostGroupResponseBodyHostGroupList getHostGroupList() {
        return this.hostGroupList;
    }

    public static class ListClusterHostGroupResponseBodyHostGroupListHostGroup extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("HostGroupSubType")
        public String hostGroupSubType;

        @NameInMap("HostGroupType")
        public String hostGroupType;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("ScalingGroupMinNode")
        public Integer scalingGroupMinNode;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("HostGroupChangeStatus")
        public String hostGroupChangeStatus;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("DataDiskType")
        public String dataDiskType;

        @NameInMap("SystemDiskCount")
        public Integer systemDiskCount;

        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        @NameInMap("ScalingGroupBizId")
        public String scalingGroupBizId;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("ScalingGroupMaxNode")
        public Integer scalingGroupMaxNode;

        @NameInMap("HostGroupChangeType")
        public String hostGroupChangeType;

        @NameInMap("LockType")
        public String lockType;

        @NameInMap("ScalingInMode")
        public String scalingInMode;

        @NameInMap("CostSavingPercent")
        public Float costSavingPercent;

        @NameInMap("DataDiskSize")
        public Integer dataDiskSize;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("HostGroupId")
        public String hostGroupId;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("DataDiskCount")
        public Integer dataDiskCount;

        @NameInMap("ScalingGroupActiveStatus")
        public String scalingGroupActiveStatus;

        @NameInMap("NodeCount")
        public Integer nodeCount;

        @NameInMap("SystemDiskType")
        public String systemDiskType;

        @NameInMap("ScalingGroupConfigState")
        public String scalingGroupConfigState;

        @NameInMap("HostGroupName")
        public String hostGroupName;

        public static ListClusterHostGroupResponseBodyHostGroupListHostGroup build(java.util.Map<String, ?> map) throws Exception {
            ListClusterHostGroupResponseBodyHostGroupListHostGroup self = new ListClusterHostGroupResponseBodyHostGroupListHostGroup();
            return TeaModel.build(map, self);
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setHostGroupSubType(String hostGroupSubType) {
            this.hostGroupSubType = hostGroupSubType;
            return this;
        }
        public String getHostGroupSubType() {
            return this.hostGroupSubType;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setHostGroupType(String hostGroupType) {
            this.hostGroupType = hostGroupType;
            return this;
        }
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setScalingGroupMinNode(Integer scalingGroupMinNode) {
            this.scalingGroupMinNode = scalingGroupMinNode;
            return this;
        }
        public Integer getScalingGroupMinNode() {
            return this.scalingGroupMinNode;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setHostGroupChangeStatus(String hostGroupChangeStatus) {
            this.hostGroupChangeStatus = hostGroupChangeStatus;
            return this;
        }
        public String getHostGroupChangeStatus() {
            return this.hostGroupChangeStatus;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setDataDiskType(String dataDiskType) {
            this.dataDiskType = dataDiskType;
            return this;
        }
        public String getDataDiskType() {
            return this.dataDiskType;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setSystemDiskCount(Integer systemDiskCount) {
            this.systemDiskCount = systemDiskCount;
            return this;
        }
        public Integer getSystemDiskCount() {
            return this.systemDiskCount;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setScalingGroupBizId(String scalingGroupBizId) {
            this.scalingGroupBizId = scalingGroupBizId;
            return this;
        }
        public String getScalingGroupBizId() {
            return this.scalingGroupBizId;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setScalingGroupMaxNode(Integer scalingGroupMaxNode) {
            this.scalingGroupMaxNode = scalingGroupMaxNode;
            return this;
        }
        public Integer getScalingGroupMaxNode() {
            return this.scalingGroupMaxNode;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setHostGroupChangeType(String hostGroupChangeType) {
            this.hostGroupChangeType = hostGroupChangeType;
            return this;
        }
        public String getHostGroupChangeType() {
            return this.hostGroupChangeType;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setLockType(String lockType) {
            this.lockType = lockType;
            return this;
        }
        public String getLockType() {
            return this.lockType;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setScalingInMode(String scalingInMode) {
            this.scalingInMode = scalingInMode;
            return this;
        }
        public String getScalingInMode() {
            return this.scalingInMode;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setCostSavingPercent(Float costSavingPercent) {
            this.costSavingPercent = costSavingPercent;
            return this;
        }
        public Float getCostSavingPercent() {
            return this.costSavingPercent;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setDataDiskCount(Integer dataDiskCount) {
            this.dataDiskCount = dataDiskCount;
            return this;
        }
        public Integer getDataDiskCount() {
            return this.dataDiskCount;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setScalingGroupActiveStatus(String scalingGroupActiveStatus) {
            this.scalingGroupActiveStatus = scalingGroupActiveStatus;
            return this;
        }
        public String getScalingGroupActiveStatus() {
            return this.scalingGroupActiveStatus;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setSystemDiskType(String systemDiskType) {
            this.systemDiskType = systemDiskType;
            return this;
        }
        public String getSystemDiskType() {
            return this.systemDiskType;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setScalingGroupConfigState(String scalingGroupConfigState) {
            this.scalingGroupConfigState = scalingGroupConfigState;
            return this;
        }
        public String getScalingGroupConfigState() {
            return this.scalingGroupConfigState;
        }

        public ListClusterHostGroupResponseBodyHostGroupListHostGroup setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

    }

    public static class ListClusterHostGroupResponseBodyHostGroupList extends TeaModel {
        @NameInMap("HostGroup")
        public java.util.List<ListClusterHostGroupResponseBodyHostGroupListHostGroup> hostGroup;

        public static ListClusterHostGroupResponseBodyHostGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterHostGroupResponseBodyHostGroupList self = new ListClusterHostGroupResponseBodyHostGroupList();
            return TeaModel.build(map, self);
        }

        public ListClusterHostGroupResponseBodyHostGroupList setHostGroup(java.util.List<ListClusterHostGroupResponseBodyHostGroupListHostGroup> hostGroup) {
            this.hostGroup = hostGroup;
            return this;
        }
        public java.util.List<ListClusterHostGroupResponseBodyHostGroupListHostGroup> getHostGroup() {
            return this.hostGroup;
        }

    }

}
