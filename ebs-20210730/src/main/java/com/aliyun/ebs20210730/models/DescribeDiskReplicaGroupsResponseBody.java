// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaGroupsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ReplicaGroups")
    public java.util.List<DescribeDiskReplicaGroupsResponseBodyReplicaGroups> replicaGroups;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

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

    public DescribeDiskReplicaGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDiskReplicaGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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

    public DescribeDiskReplicaGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDiskReplicaGroupsResponseBodyReplicaGroups extends TeaModel {
        @NameInMap("Bandwidth")
        public Long bandwidth;

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

        @NameInMap("PairNumber")
        public Long pairNumber;

        @NameInMap("PrimaryRegion")
        public String primaryRegion;

        @NameInMap("PrimaryZone")
        public String primaryZone;

        @NameInMap("RPO")
        public Long RPO;

        @NameInMap("ReplicaGroupId")
        public String replicaGroupId;

        @NameInMap("Site")
        public String site;

        @NameInMap("SourceRegionId")
        public String sourceRegionId;

        @NameInMap("SourceZoneId")
        public String sourceZoneId;

        @NameInMap("StandbyRegion")
        public String standbyRegion;

        @NameInMap("StandbyZone")
        public String standbyZone;

        @NameInMap("Status")
        public String status;

        public static DescribeDiskReplicaGroupsResponseBodyReplicaGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskReplicaGroupsResponseBodyReplicaGroups self = new DescribeDiskReplicaGroupsResponseBodyReplicaGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
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

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setPrimaryRegion(String primaryRegion) {
            this.primaryRegion = primaryRegion;
            return this;
        }
        public String getPrimaryRegion() {
            return this.primaryRegion;
        }

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setPrimaryZone(String primaryZone) {
            this.primaryZone = primaryZone;
            return this;
        }
        public String getPrimaryZone() {
            return this.primaryZone;
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

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setStandbyRegion(String standbyRegion) {
            this.standbyRegion = standbyRegion;
            return this;
        }
        public String getStandbyRegion() {
            return this.standbyRegion;
        }

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setStandbyZone(String standbyZone) {
            this.standbyZone = standbyZone;
            return this;
        }
        public String getStandbyZone() {
            return this.standbyZone;
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
