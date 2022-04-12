// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaPairsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ReplicaPairs")
    public java.util.List<DescribeDiskReplicaPairsResponseBodyReplicaPairs> replicaPairs;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiskReplicaPairsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskReplicaPairsResponseBody self = new DescribeDiskReplicaPairsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiskReplicaPairsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiskReplicaPairsResponseBody setReplicaPairs(java.util.List<DescribeDiskReplicaPairsResponseBodyReplicaPairs> replicaPairs) {
        this.replicaPairs = replicaPairs;
        return this;
    }
    public java.util.List<DescribeDiskReplicaPairsResponseBodyReplicaPairs> getReplicaPairs() {
        return this.replicaPairs;
    }

    public DescribeDiskReplicaPairsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDiskReplicaPairsResponseBodyReplicaPairs extends TeaModel {
        @NameInMap("Bandwidth")
        public Long bandwidth;

        @NameInMap("ChargeType")
        public String chargeType;

        // 创建时间。1970年1月1日0点0分以来的毫秒数
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationDiskId")
        public String destinationDiskId;

        @NameInMap("DestinationRegion")
        public String destinationRegion;

        @NameInMap("DestinationZoneId")
        public String destinationZoneId;

        @NameInMap("LastRecoverPoint")
        public Long lastRecoverPoint;

        @NameInMap("PairName")
        public String pairName;

        // pair的初始源地域
        @NameInMap("PrimaryRegion")
        public String primaryRegion;

        // pair的初始源可用区
        @NameInMap("PrimaryZone")
        public String primaryZone;

        @NameInMap("RPO")
        public Long RPO;

        @NameInMap("ReplicaGroupId")
        public String replicaGroupId;

        @NameInMap("ReplicaGroupName")
        public String replicaGroupName;

        @NameInMap("ReplicaPairId")
        public String replicaPairId;

        // pair信息的后端站点来源，production或backup
        @NameInMap("Site")
        public String site;

        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        @NameInMap("SourceRegion")
        public String sourceRegion;

        @NameInMap("SourceZoneId")
        public String sourceZoneId;

        // pair的初始目的地域
        @NameInMap("StandbyRegion")
        public String standbyRegion;

        // pair的初始目的可用区
        @NameInMap("StandbyZone")
        public String standbyZone;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusMessage")
        public String statusMessage;

        public static DescribeDiskReplicaPairsResponseBodyReplicaPairs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskReplicaPairsResponseBodyReplicaPairs self = new DescribeDiskReplicaPairsResponseBodyReplicaPairs();
            return TeaModel.build(map, self);
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setDestinationDiskId(String destinationDiskId) {
            this.destinationDiskId = destinationDiskId;
            return this;
        }
        public String getDestinationDiskId() {
            return this.destinationDiskId;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setDestinationRegion(String destinationRegion) {
            this.destinationRegion = destinationRegion;
            return this;
        }
        public String getDestinationRegion() {
            return this.destinationRegion;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setDestinationZoneId(String destinationZoneId) {
            this.destinationZoneId = destinationZoneId;
            return this;
        }
        public String getDestinationZoneId() {
            return this.destinationZoneId;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setLastRecoverPoint(Long lastRecoverPoint) {
            this.lastRecoverPoint = lastRecoverPoint;
            return this;
        }
        public Long getLastRecoverPoint() {
            return this.lastRecoverPoint;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setPairName(String pairName) {
            this.pairName = pairName;
            return this;
        }
        public String getPairName() {
            return this.pairName;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setPrimaryRegion(String primaryRegion) {
            this.primaryRegion = primaryRegion;
            return this;
        }
        public String getPrimaryRegion() {
            return this.primaryRegion;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setPrimaryZone(String primaryZone) {
            this.primaryZone = primaryZone;
            return this;
        }
        public String getPrimaryZone() {
            return this.primaryZone;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setRPO(Long RPO) {
            this.RPO = RPO;
            return this;
        }
        public Long getRPO() {
            return this.RPO;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setReplicaGroupId(String replicaGroupId) {
            this.replicaGroupId = replicaGroupId;
            return this;
        }
        public String getReplicaGroupId() {
            return this.replicaGroupId;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setReplicaGroupName(String replicaGroupName) {
            this.replicaGroupName = replicaGroupName;
            return this;
        }
        public String getReplicaGroupName() {
            return this.replicaGroupName;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setReplicaPairId(String replicaPairId) {
            this.replicaPairId = replicaPairId;
            return this;
        }
        public String getReplicaPairId() {
            return this.replicaPairId;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setSourceZoneId(String sourceZoneId) {
            this.sourceZoneId = sourceZoneId;
            return this;
        }
        public String getSourceZoneId() {
            return this.sourceZoneId;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setStandbyRegion(String standbyRegion) {
            this.standbyRegion = standbyRegion;
            return this;
        }
        public String getStandbyRegion() {
            return this.standbyRegion;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setStandbyZone(String standbyZone) {
            this.standbyZone = standbyZone;
            return this;
        }
        public String getStandbyZone() {
            return this.standbyZone;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

    }

}
