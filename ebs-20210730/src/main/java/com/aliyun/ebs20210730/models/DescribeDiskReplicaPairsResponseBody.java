// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaPairsResponseBody extends TeaModel {
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
     * <p>Details about the replication pairs.</p>
     */
    @NameInMap("ReplicaPairs")
    public java.util.List<DescribeDiskReplicaPairsResponseBodyReplicaPairs> replicaPairs;

    /**
     * <p>The ID of the request.</p>
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

    public DescribeDiskReplicaPairsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDiskReplicaPairsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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

    public DescribeDiskReplicaPairsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDiskReplicaPairsResponseBodyReplicaPairsTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeDiskReplicaPairsResponseBodyReplicaPairsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskReplicaPairsResponseBodyReplicaPairsTags self = new DescribeDiskReplicaPairsResponseBodyReplicaPairsTags();
            return TeaModel.build(map, self);
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairsTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDiskReplicaPairsResponseBodyReplicaPairsTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDiskReplicaPairsResponseBodyReplicaPairs extends TeaModel {
        /**
         * <p>The bandwidth used to asynchronously replicate data from the primary disk to the secondary disk. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The billing method of the replication pair. Valid values:</p>
         * <ul>
         * <li>PREPAY: subscription</li>
         * <li>POSTPAY: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the replication pair was created. The value of this parameter is a timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649750977</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the replication pair.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the secondary disk.</p>
         * 
         * <strong>example:</strong>
         * <p>d-asdfjl2342kj2l3k4****</p>
         */
        @NameInMap("DestinationDiskId")
        public String destinationDiskId;

        /**
         * <p>The region ID of the secondary disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("DestinationRegion")
        public String destinationRegion;

        /**
         * <p>The zone ID of the secondary disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-b</p>
         */
        @NameInMap("DestinationZoneId")
        public String destinationZoneId;

        /**
         * <p>The time when the replication pair expires. The value of this parameter is a timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649750977</p>
         */
        @NameInMap("ExpiredTime")
        public Long expiredTime;

        /**
         * <p>The time when data was last replicated from the primary disk to the secondary disk in the replication pair. The value of this parameter is a timestamp. Unit: seconds. 86,400 seconds is equivalent to 24 hours.</p>
         * 
         * <strong>example:</strong>
         * <p>1649751977</p>
         */
        @NameInMap("LastRecoverPoint")
        public Long lastRecoverPoint;

        /**
         * <p>The name of the replication pair.</p>
         * 
         * <strong>example:</strong>
         * <p>TestReplicaPair</p>
         */
        @NameInMap("PairName")
        public String pairName;

        /**
         * <p>The initial source region (primary region) of the replication pair.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("PrimaryRegion")
        public String primaryRegion;

        /**
         * <p>The initial source zone (primary zone) of the replication pair.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-a</p>
         */
        @NameInMap("PrimaryZone")
        public String primaryZone;

        /**
         * <p>The recovery point objective (RPO) of the replication pair. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("RPO")
        public Long RPO;

        /**
         * <p>The ID of the replication pair-consistent group to which the replication pair belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxx****</p>
         */
        @NameInMap("ReplicaGroupId")
        public String replicaGroupId;

        /**
         * <p>The name of the replication pair-consistent group to which the replication pair belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-name****</p>
         */
        @NameInMap("ReplicaGroupName")
        public String replicaGroupName;

        /**
         * <p>The ID of the replication pair.</p>
         * 
         * <strong>example:</strong>
         * <p>pair-cn-dsa****</p>
         */
        @NameInMap("ReplicaPairId")
        public String replicaPairId;

        /**
         * <p>The ID of the resource group to which the replication pair belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmvs*****</p>
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
         * <p>The ID of the primary disk.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp131n0q38u3a4zi****</p>
         */
        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        /**
         * <p>The region ID of the primary disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("SourceRegion")
        public String sourceRegion;

        /**
         * <p>The zone ID of the primary disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-a</p>
         */
        @NameInMap("SourceZoneId")
        public String sourceZoneId;

        /**
         * <p>The initial destination region (secondary region) of the replication pair.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("StandbyRegion")
        public String standbyRegion;

        /**
         * <p>The initial destination zone (secondary zone) of the replication pair.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-b</p>
         */
        @NameInMap("StandbyZone")
        public String standbyZone;

        /**
         * <p>The status of the replication pair. Valid values:</p>
         * <ul>
         * <li>invalid: The replication pair was invalid. When a replication pair becomes abnormal, it enters this state.</li>
         * <li>creating: The replication pair was being created.</li>
         * <li>created: The replication pair was created.</li>
         * <li>create_failed: The replication pair failed to be created.</li>
         * <li>initial_syncing: Data was synchronized from the primary disk to the secondary disk for the first time. After a replication pair is created and activated, the replication pair is in this state the first time data is synchronized from the primary disk to the secondary disk.</li>
         * <li>manual_syncing: Data was being manually synchronized from the primary disk to the secondary disk. After data is manually synchronized from the primary disk to the secondary disk, the replication pair returns to the stopped state. The first time data is manually synchronized from the primary disk to the secondary disk, the replication pair is in the manual_syncing state during the synchronization.</li>
         * <li>syncing: Data was being synchronized from the primary disk to the secondary disk. When data is being asynchronously replicated from the primary disk to the secondary disk again in subsequent operations, the replication pair is in this state.</li>
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
         * <p>The message that describes the state of the replication pair. This parameter has a value when <code>Status</code> has a value of invalid or <code>create_failed</code>. Valid values:</p>
         * <ul>
         * <li>PrePayOrderExpired: The replication pair has expired.</li>
         * <li>PostPayOrderCeaseService: The pay-as-you-go replication pair has been stopped due to an overdue payment.</li>
         * <li>DeviceRemoved: The primary or secondary disk has been deleted.</li>
         * <li>DeviceKeyChanged: The <code>DeviceKey</code> mapping of the primary or secondary disk has changed.</li>
         * <li>DeviceSizeChanged: The <code>DeviceSize</code> value of the primary or secondary disk has changed.</li>
         * <li>OperationDenied.QuotaExceed: The maximum number of replication pairs that can be created has been reached.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePayOrderExpired</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        /**
         * <p>The tags of the replication pair.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeDiskReplicaPairsResponseBodyReplicaPairsTags> tags;

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

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
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

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setTags(java.util.List<DescribeDiskReplicaPairsResponseBodyReplicaPairsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDiskReplicaPairsResponseBodyReplicaPairsTags> getTags() {
            return this.tags;
        }

    }

}
