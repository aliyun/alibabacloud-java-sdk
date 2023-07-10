// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceDiagnosisSummaryResponseBody extends TeaModel {
    /**
     * <p>Details of instance nodes.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDBInstanceDiagnosisSummaryResponseBodyItems> items;

    /**
     * <p>State statistics of the coordinator node.</p>
     */
    @NameInMap("MasterStatusInfo")
    public DescribeDBInstanceDiagnosisSummaryResponseBodyMasterStatusInfo masterStatusInfo;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>State statistics of compute nodes.</p>
     */
    @NameInMap("SegmentStatusInfo")
    public DescribeDBInstanceDiagnosisSummaryResponseBodySegmentStatusInfo segmentStatusInfo;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The IP address of the node.</p>
         */
        @NameInMap("NodeAddress")
        public String nodeAddress;

        /**
         * <p>The ID of the node group.</p>
         */
        @NameInMap("NodeCID")
        public String nodeCID;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("NodeID")
        public String nodeID;

        /**
         * <p>The name of the host where the node resides.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The port number of the node.</p>
         */
        @NameInMap("NodePort")
        public String nodePort;

        /**
         * <p>The initial role of the node. Valid values:</p>
         * <br>
         * <p>*   **primary**: primary node</p>
         * <p>*   **mirror**: secondary node</p>
         * <br>
         * <p>If the value of this parameter is the same as that of **NodeRole**, no primary/secondary switchover occurs. If the value of this parameter is not the same as that of **NodeRole**, a primary/secondary switchover occurs.</p>
         */
        @NameInMap("NodePreferredRole")
        public String nodePreferredRole;

        /**
         * <p>The data synchronization state of the node. Valid values:</p>
         * <br>
         * <p>*   **Synced**: The node data is synchronized.</p>
         * <p>*   **Not Syncing**: The node data is not synchronized.</p>
         * <p>*   **No sync required**: Data synchronization is not required. This value may be returned only for the coordinator node.</p>
         */
        @NameInMap("NodeReplicationMode")
        public String nodeReplicationMode;

        /**
         * <p>The current role of the node. Valid values:</p>
         * <br>
         * <p>*   **primary**: primary node</p>
         * <p>*   **mirror**: secondary node</p>
         */
        @NameInMap("NodeRole")
        public String nodeRole;

        /**
         * <p>The running state of the node. Valid values:</p>
         * <br>
         * <p>*   **UP**: The node is running.</p>
         * <p>*   **DOWN**: The node is faulty.</p>
         */
        @NameInMap("NodeStatus")
        public String nodeStatus;

        /**
         * <p>The type of the node. Valid values:</p>
         * <br>
         * <p>*   **master**: primary coordinator node</p>
         * <p>*   **slave**: standby coordinator node</p>
         * <p>*   **segment**: compute node</p>
         */
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
        /**
         * <p>The number of abnormal nodes.</p>
         */
        @NameInMap("ExceptionNodeNum")
        public Integer exceptionNodeNum;

        /**
         * <p>The number of normal nodes.</p>
         */
        @NameInMap("NormalNodeNum")
        public Integer normalNodeNum;

        /**
         * <p>The number of nodes whose roles are reversed.</p>
         */
        @NameInMap("NotPreferredNodeNum")
        public Integer notPreferredNodeNum;

        /**
         * <p>The number of unsynchronized nodes.</p>
         */
        @NameInMap("NotSyncingNodeNum")
        public Integer notSyncingNodeNum;

        /**
         * <p>The number of nodes whose roles are normal.</p>
         */
        @NameInMap("PreferredNodeNum")
        public Integer preferredNodeNum;

        /**
         * <p>The number of synchronized nodes.</p>
         */
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
        /**
         * <p>The number of abnormal nodes.</p>
         */
        @NameInMap("ExceptionNodeNum")
        public Integer exceptionNodeNum;

        /**
         * <p>The number of normal nodes.</p>
         */
        @NameInMap("NormalNodeNum")
        public Integer normalNodeNum;

        /**
         * <p>The number of nodes whose roles are reversed.</p>
         */
        @NameInMap("NotPreferredNodeNum")
        public Integer notPreferredNodeNum;

        /**
         * <p>The number of unsynchronized nodes.</p>
         */
        @NameInMap("NotSyncingNodeNum")
        public Integer notSyncingNodeNum;

        /**
         * <p>The number of nodes whose roles are normal.</p>
         */
        @NameInMap("PreferredNodeNum")
        public Integer preferredNodeNum;

        /**
         * <p>The number of synchronized nodes.</p>
         */
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
