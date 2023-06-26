// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaGroupsResponseBody extends TeaModel {
    /**
     * <p>The ID of the replication pair-consistent group.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region in which the primary site is deployed.</p>
     */
    @NameInMap("ReplicaGroups")
    public java.util.List<DescribeDiskReplicaGroupsResponseBodyReplicaGroups> replicaGroups;

    /**
     * <p>Details about the replication pair-consistent groups.</p>
     */
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

    public static class DescribeDiskReplicaGroupsResponseBodyReplicaGroupsTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeDiskReplicaGroupsResponseBodyReplicaGroupsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskReplicaGroupsResponseBodyReplicaGroupsTags self = new DescribeDiskReplicaGroupsResponseBodyReplicaGroupsTags();
            return TeaModel.build(map, self);
        }

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroupsTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroupsTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDiskReplicaGroupsResponseBodyReplicaGroups extends TeaModel {
        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The recovery point objective (RPO) of the replication pair-consistent group. Unit: seconds.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the replication pair-consistent group.</p>
         */
        @NameInMap("DestinationRegionId")
        public String destinationRegionId;

        /**
         * <p>The description of the replication pair-consistent group.</p>
         */
        @NameInMap("DestinationZoneId")
        public String destinationZoneId;

        /**
         * <p>The state of the replication pair-consistent group. Valid values:</p>
         * <br>
         * <p>*   invalid: The replication pair-consistent group is invalid, which indicates that abnormal replication pairs are present in the replication pair-consistent group.</p>
         * <p>*   creating: The replication pair-consistent group is being created.</p>
         * <p>*   created: The replication pair-consistent group is created.</p>
         * <p>*   create_failed: The replication pair-consistent group cannot be created.</p>
         * <p>*   manual_syncing: Data is being manually synchronized between the disks in the replication pair-consistent group. The first time data is being manually synchronized between the disks in a replication pair-consistent group, the replication pair-consistent group is in this state.</p>
         * <p>*   syncing: Data is being synchronized between the disks in the replication pair-consistent group. While data is being asynchronously replicated from the primary disks to the secondary disks not for the first time, the replication pair-consistent group is in this state.</p>
         * <p>*   normal: The replication pair-consistent group is working as expected. When the system finishes replicating data from the primary disks to the secondary disks within the current replication cycle, the replication pair-consistent group enters this state.</p>
         * <p>*   stopping: The replication pair-consistent group is being stopped.</p>
         * <p>*   stopped: The replication pair-consistent group is stopped.</p>
         * <p>*   stop_failed: The replication pair-consistent group cannot be stopped.</p>
         * <p>*   failovering: A failover is being performed.</p>
         * <p>*   failovered: A failover is performed.</p>
         * <p>*   failover_failed: A failover cannot be performed.</p>
         * <p>*   reprotecting: A reverse replication is being performed.</p>
         * <p>*   reprotect_failed: A reverse replication cannot be performed.</p>
         * <p>*   deleting: The replication pair-consistent group is being deleted.</p>
         * <p>*   delete_failed: The replication pair-consistent group cannot be deleted.</p>
         * <p>*   deleted: The replication pair-consistent group is deleted.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The IDs of the replications pairs that belong to the replication pair-consistent group.</p>
         */
        @NameInMap("LastRecoverPoint")
        public Long lastRecoverPoint;

        /**
         * <p>The initial source region (primary region) of the replication pair-consistent group.</p>
         */
        @NameInMap("PairIds")
        public java.util.List<byte[]> pairIds;

        /**
         * <p>The initial destination region (secondary region) of the replication pair-consistent group.</p>
         */
        @NameInMap("PairNumber")
        public Long pairNumber;

        /**
         * <p>The initial source zone (primary zone) of the replication pair-consistent group.</p>
         */
        @NameInMap("PrimaryRegion")
        public String primaryRegion;

        /**
         * <p>The bandwidth value. Unit: Mbit/s. This parameter is unavailable and has a system-preset value.</p>
         */
        @NameInMap("PrimaryZone")
        public String primaryZone;

        /**
         * <p>The type of the site from which the information of the replication pair and replication pair-consistent group is obtained. Valid values:</p>
         * <br>
         * <p>*   production: primary site</p>
         * <p>*   backup: secondary site</p>
         */
        @NameInMap("RPO")
        public Long RPO;

        /**
         * <p>The ID of the zone in which the primary site is deployed.</p>
         */
        @NameInMap("ReplicaGroupId")
        public String replicaGroupId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The number of replications pairs that belong to the replication pair-consistent group.</p>
         */
        @NameInMap("Site")
        public String site;

        /**
         * <p>The ID of the region in which the secondary site is deployed.</p>
         */
        @NameInMap("SourceRegionId")
        public String sourceRegionId;

        /**
         * <p>The ID of the zone in which the secondary site is deployed.</p>
         */
        @NameInMap("SourceZoneId")
        public String sourceZoneId;

        /**
         * <p>The initial destination zone (secondary zone) of the replication pair-consistent group.</p>
         */
        @NameInMap("StandbyRegion")
        public String standbyRegion;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("StandbyZone")
        public String standbyZone;

        /**
         * <p>The time when data was last replicated from the primary disks to the secondary disks in the replication pair-consistent group. The value of this parameter is a timestamp. Unit: seconds.</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<DescribeDiskReplicaGroupsResponseBodyReplicaGroupsTags> tags;

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

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setTags(java.util.List<DescribeDiskReplicaGroupsResponseBodyReplicaGroupsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDiskReplicaGroupsResponseBodyReplicaGroupsTags> getTags() {
            return this.tags;
        }

    }

}
