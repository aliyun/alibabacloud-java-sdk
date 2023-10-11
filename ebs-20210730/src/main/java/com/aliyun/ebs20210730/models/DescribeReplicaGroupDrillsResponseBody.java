// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeReplicaGroupDrillsResponseBody extends TeaModel {
    @NameInMap("Drills")
    public java.util.List<DescribeReplicaGroupDrillsResponseBodyDrills> drills;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DrillDiskId")
        public String drillDiskId;

        @NameInMap("DrillDiskStatus")
        public String drillDiskStatus;

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
        @NameInMap("DrillId")
        public String drillId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("PairsInfo")
        public java.util.List<DescribeReplicaGroupDrillsResponseBodyDrillsPairsInfo> pairsInfo;

        @NameInMap("RecoverPoint")
        public Long recoverPoint;

        @NameInMap("StartAt")
        public Long startAt;

        @NameInMap("Status")
        public String status;

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
