// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaGroupsResponseBody extends TeaModel {
    /**
     * <p>The query token returned in this call.</p>
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
         * <p>The key of the tag of the replication group.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag of the replication group.</p>
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
         * <p>The bandwidth. Unit: Kbit/s. This parameter is not yet available. The return value is preset by the system.</p>
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
         * <p>The region ID of the disaster recovery site.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("DestinationRegionId")
        public String destinationRegionId;

        /**
         * <p>The zone ID of the disaster recovery site.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-e</p>
         */
        @NameInMap("DestinationZoneId")
        public String destinationZoneId;

        /**
         * <p>Specifies whether to enable replication time control (RTC). Valid values:</p>
         * <ul>
         * <li><p>false: Disables RTC.</p>
         * </li>
         * <li><p>true: Enables RTC.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you set this parameter to true, RTC is enabled for the replication pair-consistent group and all asynchronous replication pairs that are added to the group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableRtc")
        public Boolean enableRtc;

        /**
         * <p>The name of the replication pair-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>myreplicagrouptest</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The time when the last asynchronous replication was completed for the replication pair-consistent group. This parameter is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1637835114</p>
         */
        @NameInMap("LastRecoverPoint")
        public Long lastRecoverPoint;

        /**
         * <p>The list of replication pair IDs in the replication pair-consistent group.</p>
         */
        @NameInMap("PairIds")
        public java.util.List<byte[]> pairIds;

        /**
         * <p>The number of replication pairs in the replication pair-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PairNumber")
        public Long pairNumber;

        /**
         * <p>The initial source region of the replication group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("PrimaryRegion")
        public String primaryRegion;

        /**
         * <p>The initial source zone of the replication group.</p>
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
         * <p>The ID of the replication pair-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-myreplica****</p>
         */
        @NameInMap("ReplicaGroupId")
        public String replicaGroupId;

        /**
         * <p>The ID of the resource group to which the replication group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2a*******</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The site of the replication pair and the replication pair-consistent group. Valid values:</p>
         * <ul>
         * <li><p>production: The production site.</p>
         * </li>
         * <li><p>backup: The disaster recovery site.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>production</p>
         */
        @NameInMap("Site")
        public String site;

        /**
         * <p>The region ID of the production site.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("SourceRegionId")
        public String sourceRegionId;

        /**
         * <p>The zone ID of the production site.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-f</p>
         */
        @NameInMap("SourceZoneId")
        public String sourceZoneId;

        /**
         * <p>The initial destination region of the replication group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("StandbyRegion")
        public String standbyRegion;

        /**
         * <p>The initial destination zone of the replication group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-e</p>
         */
        @NameInMap("StandbyZone")
        public String standbyZone;

        /**
         * <p>The status of the replication pair-consistent group. Valid values:</p>
         * <ul>
         * <li><p>invalid: The replication pair-consistent group is invalid. This status indicates that a replication pair in the group is abnormal.</p>
         * </li>
         * <li><p>creating: The replication pair-consistent group is being created.</p>
         * </li>
         * <li><p>created: The replication pair-consistent group is created.</p>
         * </li>
         * <li><p>create_failed: The replication pair-consistent group failed to be created.</p>
         * </li>
         * <li><p>manual_syncing: The replication pair-consistent group is performing a one-time synchronization. The group is also in this state during the first one-time synchronization.</p>
         * </li>
         * <li><p>syncing: The replication pair-consistent group is synchronizing data. The group is in this state when data is asynchronously replicated from the primary disk to the secondary disk for a subsequent time.</p>
         * </li>
         * <li><p>normal: Normal. When data replication is complete in the current asynchronous replication cycle, the group is in this state.</p>
         * </li>
         * <li><p>stopping: The replication pair-consistent group is being stopped.</p>
         * </li>
         * <li><p>stopped: The replication pair-consistent group is stopped.</p>
         * </li>
         * <li><p>stop_failed: The replication pair-consistent group failed to be stopped.</p>
         * </li>
         * <li><p>failovering: A failover is being performed.</p>
         * </li>
         * <li><p>failovered: The failover is complete.</p>
         * </li>
         * <li><p>failover_failed: The failover failed.</p>
         * </li>
         * <li><p>reprotecting: A reverse replication is being performed.</p>
         * </li>
         * <li><p>reprotect_failed: The reverse replication failed.</p>
         * </li>
         * <li><p>deleting: The replication pair-consistent group is being deleted.</p>
         * </li>
         * <li><p>delete_failed: The replication pair-consistent group failed to be deleted.</p>
         * </li>
         * <li><p>deleted: The replication pair-consistent group is deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the replication group.</p>
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

        public DescribeDiskReplicaGroupsResponseBodyReplicaGroups setEnableRtc(Boolean enableRtc) {
            this.enableRtc = enableRtc;
            return this;
        }
        public Boolean getEnableRtc() {
            return this.enableRtc;
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
