// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceDiagnosisSummaryResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeDBInstanceDiagnosisSummaryResponseBodyItems> items;

    @NameInMap("MasterStatusInfo")
    public DescribeDBInstanceDiagnosisSummaryResponseBodyMasterStatusInfo masterStatusInfo;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SegmentStatusInfo")
    public DescribeDBInstanceDiagnosisSummaryResponseBodySegmentStatusInfo segmentStatusInfo;

    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeDBInstanceDiagnosisSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceDiagnosisSummaryResponseBody self = new DescribeDBInstanceDiagnosisSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceDiagnosisSummaryResponseBody setItems(java.util.List<DescribeDBInstanceDiagnosisSummaryResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDBInstanceDiagnosisSummaryResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDBInstanceDiagnosisSummaryResponseBody setMasterStatusInfo(DescribeDBInstanceDiagnosisSummaryResponseBodyMasterStatusInfo masterStatusInfo) {
        this.masterStatusInfo = masterStatusInfo;
        return this;
    }
    public DescribeDBInstanceDiagnosisSummaryResponseBodyMasterStatusInfo getMasterStatusInfo() {
        return this.masterStatusInfo;
    }

    public DescribeDBInstanceDiagnosisSummaryResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstanceDiagnosisSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceDiagnosisSummaryResponseBody setSegmentStatusInfo(DescribeDBInstanceDiagnosisSummaryResponseBodySegmentStatusInfo segmentStatusInfo) {
        this.segmentStatusInfo = segmentStatusInfo;
        return this;
    }
    public DescribeDBInstanceDiagnosisSummaryResponseBodySegmentStatusInfo getSegmentStatusInfo() {
        return this.segmentStatusInfo;
    }

    public DescribeDBInstanceDiagnosisSummaryResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDBInstanceDiagnosisSummaryResponseBodyItems extends TeaModel {
        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("NodeAddress")
        public String nodeAddress;

        @NameInMap("NodeCID")
        public String nodeCID;

        @NameInMap("NodeID")
        public String nodeID;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodePort")
        public String nodePort;

        @NameInMap("NodePreferredRole")
        public String nodePreferredRole;

        @NameInMap("NodeReplicationMode")
        public String nodeReplicationMode;

        @NameInMap("NodeRole")
        public String nodeRole;

        @NameInMap("NodeStatus")
        public String nodeStatus;

        @NameInMap("NodeType")
        public String nodeType;

        public static DescribeDBInstanceDiagnosisSummaryResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceDiagnosisSummaryResponseBodyItems self = new DescribeDBInstanceDiagnosisSummaryResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodyItems setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodyItems setNodeAddress(String nodeAddress) {
            this.nodeAddress = nodeAddress;
            return this;
        }
        public String getNodeAddress() {
            return this.nodeAddress;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodyItems setNodeCID(String nodeCID) {
            this.nodeCID = nodeCID;
            return this;
        }
        public String getNodeCID() {
            return this.nodeCID;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodyItems setNodeID(String nodeID) {
            this.nodeID = nodeID;
            return this;
        }
        public String getNodeID() {
            return this.nodeID;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodyItems setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodyItems setNodePort(String nodePort) {
            this.nodePort = nodePort;
            return this;
        }
        public String getNodePort() {
            return this.nodePort;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodyItems setNodePreferredRole(String nodePreferredRole) {
            this.nodePreferredRole = nodePreferredRole;
            return this;
        }
        public String getNodePreferredRole() {
            return this.nodePreferredRole;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodyItems setNodeReplicationMode(String nodeReplicationMode) {
            this.nodeReplicationMode = nodeReplicationMode;
            return this;
        }
        public String getNodeReplicationMode() {
            return this.nodeReplicationMode;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodyItems setNodeRole(String nodeRole) {
            this.nodeRole = nodeRole;
            return this;
        }
        public String getNodeRole() {
            return this.nodeRole;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodyItems setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodyItems setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

    }

    public static class DescribeDBInstanceDiagnosisSummaryResponseBodyMasterStatusInfo extends TeaModel {
        @NameInMap("ExceptionNodeNum")
        public Integer exceptionNodeNum;

        @NameInMap("NormalNodeNum")
        public Integer normalNodeNum;

        @NameInMap("NotPreferredNodeNum")
        public Integer notPreferredNodeNum;

        @NameInMap("NotSyncingNodeNum")
        public Integer notSyncingNodeNum;

        @NameInMap("PreferredNodeNum")
        public Integer preferredNodeNum;

        @NameInMap("SyncedNodeNum")
        public Integer syncedNodeNum;

        public static DescribeDBInstanceDiagnosisSummaryResponseBodyMasterStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceDiagnosisSummaryResponseBodyMasterStatusInfo self = new DescribeDBInstanceDiagnosisSummaryResponseBodyMasterStatusInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodyMasterStatusInfo setExceptionNodeNum(Integer exceptionNodeNum) {
            this.exceptionNodeNum = exceptionNodeNum;
            return this;
        }
        public Integer getExceptionNodeNum() {
            return this.exceptionNodeNum;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodyMasterStatusInfo setNormalNodeNum(Integer normalNodeNum) {
            this.normalNodeNum = normalNodeNum;
            return this;
        }
        public Integer getNormalNodeNum() {
            return this.normalNodeNum;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodyMasterStatusInfo setNotPreferredNodeNum(Integer notPreferredNodeNum) {
            this.notPreferredNodeNum = notPreferredNodeNum;
            return this;
        }
        public Integer getNotPreferredNodeNum() {
            return this.notPreferredNodeNum;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodyMasterStatusInfo setNotSyncingNodeNum(Integer notSyncingNodeNum) {
            this.notSyncingNodeNum = notSyncingNodeNum;
            return this;
        }
        public Integer getNotSyncingNodeNum() {
            return this.notSyncingNodeNum;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodyMasterStatusInfo setPreferredNodeNum(Integer preferredNodeNum) {
            this.preferredNodeNum = preferredNodeNum;
            return this;
        }
        public Integer getPreferredNodeNum() {
            return this.preferredNodeNum;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodyMasterStatusInfo setSyncedNodeNum(Integer syncedNodeNum) {
            this.syncedNodeNum = syncedNodeNum;
            return this;
        }
        public Integer getSyncedNodeNum() {
            return this.syncedNodeNum;
        }

    }

    public static class DescribeDBInstanceDiagnosisSummaryResponseBodySegmentStatusInfo extends TeaModel {
        @NameInMap("ExceptionNodeNum")
        public Integer exceptionNodeNum;

        @NameInMap("NormalNodeNum")
        public Integer normalNodeNum;

        @NameInMap("NotPreferredNodeNum")
        public Integer notPreferredNodeNum;

        @NameInMap("NotSyncingNodeNum")
        public Integer notSyncingNodeNum;

        @NameInMap("PreferredNodeNum")
        public Integer preferredNodeNum;

        @NameInMap("SyncedNodeNum")
        public Integer syncedNodeNum;

        public static DescribeDBInstanceDiagnosisSummaryResponseBodySegmentStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceDiagnosisSummaryResponseBodySegmentStatusInfo self = new DescribeDBInstanceDiagnosisSummaryResponseBodySegmentStatusInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodySegmentStatusInfo setExceptionNodeNum(Integer exceptionNodeNum) {
            this.exceptionNodeNum = exceptionNodeNum;
            return this;
        }
        public Integer getExceptionNodeNum() {
            return this.exceptionNodeNum;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodySegmentStatusInfo setNormalNodeNum(Integer normalNodeNum) {
            this.normalNodeNum = normalNodeNum;
            return this;
        }
        public Integer getNormalNodeNum() {
            return this.normalNodeNum;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodySegmentStatusInfo setNotPreferredNodeNum(Integer notPreferredNodeNum) {
            this.notPreferredNodeNum = notPreferredNodeNum;
            return this;
        }
        public Integer getNotPreferredNodeNum() {
            return this.notPreferredNodeNum;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodySegmentStatusInfo setNotSyncingNodeNum(Integer notSyncingNodeNum) {
            this.notSyncingNodeNum = notSyncingNodeNum;
            return this;
        }
        public Integer getNotSyncingNodeNum() {
            return this.notSyncingNodeNum;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodySegmentStatusInfo setPreferredNodeNum(Integer preferredNodeNum) {
            this.preferredNodeNum = preferredNodeNum;
            return this;
        }
        public Integer getPreferredNodeNum() {
            return this.preferredNodeNum;
        }

        public DescribeDBInstanceDiagnosisSummaryResponseBodySegmentStatusInfo setSyncedNodeNum(Integer syncedNodeNum) {
            this.syncedNodeNum = syncedNodeNum;
            return this;
        }
        public Integer getSyncedNodeNum() {
            return this.syncedNodeNum;
        }

    }

}
