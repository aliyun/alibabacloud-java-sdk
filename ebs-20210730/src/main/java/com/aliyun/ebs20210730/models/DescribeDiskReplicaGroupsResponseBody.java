// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaGroupsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ReplicaGroups")
    public java.util.List<DescribeDiskReplicaGroupsResponseBodyReplicaGroups> replicaGroups;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiskReplicaGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskReplicaGroupsResponseBody self = new DescribeDiskReplicaGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiskReplicaGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiskReplicaGroupsResponseBody setReplicaGroups(java.util.List<DescribeDiskReplicaGroupsResponseBodyReplicaGroups> replicaGroups) {
        this.replicaGroups = replicaGroups;
        return this;
    }
    public java.util.List<DescribeDiskReplicaGroupsResponseBodyReplicaGroups> getReplicaGroups() {
        return this.replicaGroups;
    }

    public DescribeDiskReplicaGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDiskReplicaGroupsResponseBodyReplicaGroups extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationRegionId")
        public String destinationRegionId;

        @NameInMap("DestinationZoneId")
        public String destinationZoneId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("LastRecoverPoint")
        public Long lastRecoverPoint;

        @NameInMap("PairIds")
        public java.util.List<byte[]> pairIds;

        // 复制组中的复制对个数
        @NameInMap("PairNumber")
        public Long pairNumber;

        @NameInMap("RPO")
        public Long RPO;

        @NameInMap("ReplicaGroupId")
        public String replicaGroupId;

        // pair信息的后端站点来源，production或backup
        @NameInMap("Site")
        public String site;

        @NameInMap("SourceRegionId")
        public String sourceRegionId;

        @NameInMap("SourceZoneId")
        public String sourceZoneId;

        @NameInMap("Status")
        public String status;

        public static DescribeDiskReplicaGroupsResponseBodyReplicaGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskReplicaGroupsResponseBodyReplicaGroups self = new DescribeDiskReplicaGroupsResponseBodyReplicaGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setDestinationRegionId(String destinationRegionId) {
            this.destinationRegionId = destinationRegionId;
            return this;
        }
        public String getDestinationRegionId() {
            return this.destinationRegionId;
        }

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setDestinationZoneId(String destinationZoneId) {
            this.destinationZoneId = destinationZoneId;
            return this;
        }
        public String getDestinationZoneId() {
            return this.destinationZoneId;
        }

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setLastRecoverPoint(Long lastRecoverPoint) {
            this.lastRecoverPoint = lastRecoverPoint;
            return this;
        }
        public Long getLastRecoverPoint() {
            return this.lastRecoverPoint;
        }

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setPairIds(java.util.List<byte[]> pairIds) {
            this.pairIds = pairIds;
            return this;
        }
        public java.util.List<byte[]> getPairIds() {
            return this.pairIds;
        }

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setPairNumber(Long pairNumber) {
            this.pairNumber = pairNumber;
            return this;
        }
        public Long getPairNumber() {
            return this.pairNumber;
        }

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setRPO(Long RPO) {
            this.RPO = RPO;
            return this;
        }
        public Long getRPO() {
            return this.RPO;
        }

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setReplicaGroupId(String replicaGroupId) {
            this.replicaGroupId = replicaGroupId;
            return this;
        }
        public String getReplicaGroupId() {
            return this.replicaGroupId;
        }

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setSourceRegionId(String sourceRegionId) {
            this.sourceRegionId = sourceRegionId;
            return this;
        }
        public String getSourceRegionId() {
            return this.sourceRegionId;
        }

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setSourceZoneId(String sourceZoneId) {
            this.sourceZoneId = sourceZoneId;
            return this;
        }
        public String getSourceZoneId() {
            return this.sourceZoneId;
        }

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
