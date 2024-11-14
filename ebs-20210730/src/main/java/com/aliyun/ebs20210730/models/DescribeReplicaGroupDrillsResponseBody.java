// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeReplicaGroupDrillsResponseBody extends TeaModel {
    /**
     * <p>The information of disaster recovery drills that were performed on the replication pair-consistent group.</p>
     */
    @NameInMap("Drills")
    public java.util.List<DescribeReplicaGroupDrillsResponseBodyDrills> drills;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C123F94F-4E38-19AE-942A-A8D6F44F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeReplicaGroupDrillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicaGroupDrillsResponseBody self = new DescribeReplicaGroupDrillsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReplicaGroupDrillsResponseBody setDrills(java.util.List<DescribeReplicaGroupDrillsResponseBodyDrills> drills) {
        this.drills = drills;
        return this;
    }
    public java.util.List<DescribeReplicaGroupDrillsResponseBodyDrills> getDrills() {
        return this.drills;
    }

    public DescribeReplicaGroupDrillsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeReplicaGroupDrillsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeReplicaGroupDrillsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeReplicaGroupDrillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReplicaGroupDrillsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeReplicaGroupDrillsResponseBodyDrillsPairsInfo extends TeaModel {
        /**
         * <p>The ID of the drill disk.</p>
         * 
         * <strong>example:</strong>
         * <p>d-xxx</p>
         */
        @NameInMap("DrillDiskId")
        public String drillDiskId;

        /**
         * <p>The status of the drill disk. Valid values:</p>
         * <ul>
         * <li>created</li>
         * <li>deleted</li>
         * <li>creating</li>
         * <li>deleting</li>
         * </ul>
         * <blockquote>
         * <p> This parameter can also display error code details if your drill disk fails to be created or deleted.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("DrillDiskStatus")
        public String drillDiskStatus;

        /**
         * <p>The ID of the replication pair.</p>
         * 
         * <strong>example:</strong>
         * <p>pair-xxx</p>
         */
        @NameInMap("PairId")
        public String pairId;

        public static DescribeReplicaGroupDrillsResponseBodyDrillsPairsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicaGroupDrillsResponseBodyDrillsPairsInfo self = new DescribeReplicaGroupDrillsResponseBodyDrillsPairsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeReplicaGroupDrillsResponseBodyDrillsPairsInfo setDrillDiskId(String drillDiskId) {
            this.drillDiskId = drillDiskId;
            return this;
        }
        public String getDrillDiskId() {
            return this.drillDiskId;
        }

        public DescribeReplicaGroupDrillsResponseBodyDrillsPairsInfo setDrillDiskStatus(String drillDiskStatus) {
            this.drillDiskStatus = drillDiskStatus;
            return this;
        }
        public String getDrillDiskStatus() {
            return this.drillDiskStatus;
        }

        public DescribeReplicaGroupDrillsResponseBodyDrillsPairsInfo setPairId(String pairId) {
            this.pairId = pairId;
            return this;
        }
        public String getPairId() {
            return this.pairId;
        }

    }

    public static class DescribeReplicaGroupDrillsResponseBodyDrills extends TeaModel {
        /**
         * <p>The ID of the drill.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-drill-xxx</p>
         */
        @NameInMap("DrillId")
        public String drillId;

        /**
         * <p>The ID of the replication pair-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxx</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The information of replication pairs.</p>
         */
        @NameInMap("PairsInfo")
        public java.util.List<DescribeReplicaGroupDrillsResponseBodyDrillsPairsInfo> pairsInfo;

        /**
         * <p>The recovery point of the drill. The value of this parameter is a timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1691114995</p>
         */
        @NameInMap("RecoverPoint")
        public Long recoverPoint;

        /**
         * <p>The beginning time of the drill. The value of this parameter is a timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649750977</p>
         */
        @NameInMap("StartAt")
        public Long startAt;

        /**
         * <p>The status of the drill. Valid values:</p>
         * <ul>
         * <li>execute_failed</li>
         * <li>executed</li>
         * <li>executing</li>
         * <li>clear_failed</li>
         * <li>clearing</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>executed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The error message that appears if the drill fails to be executed.</p>
         * 
         * <strong>example:</strong>
         * <p>GROUP_SYNCPOINT_NOT_FOUND</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        public static DescribeReplicaGroupDrillsResponseBodyDrills build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicaGroupDrillsResponseBodyDrills self = new DescribeReplicaGroupDrillsResponseBodyDrills();
            return TeaModel.build(map, self);
        }

        public DescribeReplicaGroupDrillsResponseBodyDrills setDrillId(String drillId) {
            this.drillId = drillId;
            return this;
        }
        public String getDrillId() {
            return this.drillId;
        }

        public DescribeReplicaGroupDrillsResponseBodyDrills setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeReplicaGroupDrillsResponseBodyDrills setPairsInfo(java.util.List<DescribeReplicaGroupDrillsResponseBodyDrillsPairsInfo> pairsInfo) {
            this.pairsInfo = pairsInfo;
            return this;
        }
        public java.util.List<DescribeReplicaGroupDrillsResponseBodyDrillsPairsInfo> getPairsInfo() {
            return this.pairsInfo;
        }

        public DescribeReplicaGroupDrillsResponseBodyDrills setRecoverPoint(Long recoverPoint) {
            this.recoverPoint = recoverPoint;
            return this;
        }
        public Long getRecoverPoint() {
            return this.recoverPoint;
        }

        public DescribeReplicaGroupDrillsResponseBodyDrills setStartAt(Long startAt) {
            this.startAt = startAt;
            return this;
        }
        public Long getStartAt() {
            return this.startAt;
        }

        public DescribeReplicaGroupDrillsResponseBodyDrills setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeReplicaGroupDrillsResponseBodyDrills setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

    }

}
