// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaGroupsResponseBody extends TeaModel {
    /**
     * <p>A pagination token.</p>
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
     * <p>The information about the replication pair-consistent groups.</p>
     */
    @NameInMap("ReplicaGroups")
    public java.util.List<DescribeDiskReplicaGroupsResponseBodyReplicaGroups> replicaGroups;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AAA478A0-BEE6-1D42-BEB6-A9CFEAD6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
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
        /**
         * <p>The tag key of the replication pair-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the replication pair-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
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
         * <p>The bandwidth value. Unit: Kbit/s. This parameter is not publicly available and has a system-preset value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The description of the replication pair-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the region in which the secondary site is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("DestinationRegionId")
        public String destinationRegionId;

        /**
         * <p>The ID of the zone in which the secondary site is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-e</p>
         */
        @NameInMap("DestinationZoneId")
        public String destinationZoneId;

        /**
         * <p>The name of the replication pair-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>myreplicagrouptest</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The time when data was last replicated from the primary disks to the secondary disks in the replication pair-consistent group. The value of this parameter is a timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1637835114</p>
         */
        @NameInMap("LastRecoverPoint")
        public Long lastRecoverPoint;

        /**
         * <p>The IDs of replication pairs that belong to the replication pair-consistent group.</p>
         */
        @NameInMap("PairIds")
        public java.util.List<byte[]> pairIds;

        /**
         * <p>The number of replication pairs that belong to the replication pair-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PairNumber")
        public Long pairNumber;

        /**
         * <p>The initial source region (primary region) of the replication pair-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("PrimaryRegion")
        public String primaryRegion;

        /**
         * <p>The initial source zone (primary zone) of the replication pair-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
         */
        @NameInMap("PrimaryZone")
        public String primaryZone;

        /**
         * <p>The recovery point objective (RPO) of the replication pair-consistent group. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("RPO")
        public Long RPO;

        /**
         * <p>The IDs of the replication pair-consistent groups.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-myreplica****</p>
         */
        @NameInMap("ReplicaGroupId")
        public String replicaGroupId;

        /**
         * <p>The ID of the resource group to which the replication pair-consistent group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2a*******</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The type of the site from which the information about the replication pairs and replication pair-consistent group was obtained. Valid values:</p>
         * <ul>
         * <li>production: primary site</li>
         * <li>backup: secondary site</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>production</p>
         */
        @NameInMap("Site")
        public String site;

        /**
         * <p>The ID of the region in which the primary site is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("SourceRegionId")
        public String sourceRegionId;

        /**
         * <p>The ID of the zone in which the primary site is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-f</p>
         */
        @NameInMap("SourceZoneId")
        public String sourceZoneId;

        /**
         * <p>The initial destination region (secondary region) of the replication pair-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("StandbyRegion")
        public String standbyRegion;

        /**
         * <p>The initial destination zone (secondary zone) of the replication pair-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-e</p>
         */
        @NameInMap("StandbyZone")
        public String standbyZone;

        /**
         * <p>The status of the replication pair-consistent group. Valid values:</p>
         * <ul>
         * <li>invalid: The replication pair-consistent group is invalid, which indicates that abnormal replication pairs are present in the replication pair-consistent group.</li>
         * <li>creating: The replication pair-consistent group is being created.</li>
         * <li>created: The replication pair-consistent group was created.</li>
         * <li>create_failed: The replication pair-consistent group failed to be created.</li>
         * <li>manual_syncing: Data was being manually synchronized between the disks in the replication pair-consistent group. When data was being manually synchronized for the first time, the replication pair is in this state.</li>
         * <li>syncing: Data was being synchronized between the disks. When data is being asynchronously replicated from the primary disk to the secondary disk again in subsequent operations, the replication pair is in this state.</li>
         * <li>normal: The replication pair was working as expected. When the system finishes replicating data from the primary disk to the secondary disk within the current replication cycle, the replication pair enters this state.</li>
         * <li>stopping: The replication pair was being stopped.</li>
         * <li>stopped: The replication pair was stopped.</li>
         * <li>stop_failed: The replication pair failed to be stopped.</li>
         * <li>failovering: A failover was being performed.</li>
         * <li>failovered: A failover was performed.</li>
         * <li>failover_failed: A failover failed to be performed.</li>
         * <li>reprotecting: A reverse replication was being performed.</li>
         * <li>reprotect_failed: A reverse replication failed to be performed.</li>
         * <li>deleting: The replication pair was being deleted.</li>
         * <li>delete_failed: The replication pair failed to be deleted.</li>
         * <li>deleted: The replication pair was deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the replication pair-consistent group.</p>
         */
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
