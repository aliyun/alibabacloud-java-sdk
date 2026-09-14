// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaPairsResponseBody extends TeaModel {
    /**
     * <p>The query token returned from this call.</p>
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
     * <p>The replication pairs.</p>
     */
    @NameInMap("ReplicaPairs")
    public java.util.List<DescribeDiskReplicaPairsResponseBodyReplicaPairs> replicaPairs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AAA478A0-BEE6-1D42-BEB6-A9CFEAD6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
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
         * <p>The bandwidth used for asynchronous replication. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The billing method of the replication pair.
         * Valid values:</p>
         * <ul>
         * <li><p>PREPAY: subscription.</p>
         * </li>
         * <li><p>POSTPAY: pay-as-you-go.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The creation time. This value is a UNIX timestamp. Unit: seconds.</p>
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
         * <p>The region of the secondary disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("DestinationRegion")
        public String destinationRegion;

        /**
         * <p>The zone of the secondary disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-b</p>
         */
        @NameInMap("DestinationZoneId")
        public String destinationZoneId;

        /**
         * <p>Specifies whether real-time control (RTC) is enabled. Valid values:</p>
         * <ul>
         * <li><p>false: Disabled.</p>
         * </li>
         * <li><p>true: Enabled.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the replication pair is in a replication pair-consistent group, the value of this parameter is the same as that of the group.</p>
         * </blockquote>
         */
        @NameInMap("EnableRtc")
        public Boolean enableRtc;

        /**
         * <p>The expiration time of the replication pair. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649750977</p>
         */
        @NameInMap("ExpiredTime")
        public Long expiredTime;

        /**
         * <p>The time when the last asynchronous replication was completed. This value is a UNIX timestamp. Unit: seconds.</p>
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
         * <p>The initial source region of the replication pair.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("PrimaryRegion")
        public String primaryRegion;

        /**
         * <p>The initial source zone of the replication pair.</p>
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
         * <p>The site type of the replication pair or replication pair-consistent group. Valid values:</p>
         * <ul>
         * <li><p>production: the production site.</p>
         * </li>
         * <li><p>backup: the disaster recovery site.</p>
         * </li>
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
         * <p>The region of the primary disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("SourceRegion")
        public String sourceRegion;

        /**
         * <p>The zone of the primary disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-a</p>
         */
        @NameInMap("SourceZoneId")
        public String sourceZoneId;

        /**
         * <p>The initial destination region of the replication pair.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("StandbyRegion")
        public String standbyRegion;

        /**
         * <p>The initial destination zone of the replication pair.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-b</p>
         */
        @NameInMap("StandbyZone")
        public String standbyZone;

        /**
         * <p>The status of the replication pair. Valid values:</p>
         * <ul>
         * <li><p>invalid: The replication pair is invalid. This status indicates that the replication pair is not working correctly.</p>
         * </li>
         * <li><p>creating: The replication pair is being created.</p>
         * </li>
         * <li><p>created: The replication pair is created.</p>
         * </li>
         * <li><p>create_failed: The replication pair failed to be created.</p>
         * </li>
         * <li><p>initial_syncing: The replication pair is in the initial synchronization state. After a replication pair is created and started, it enters this state during the first asynchronous replication of data from the primary disk to the secondary disk.</p>
         * </li>
         * <li><p>manual_syncing: The replication pair is being manually synchronized. After the manual synchronization is complete, the replication pair returns to the stopped state. If it is the first one-time synchronization, the status is also manual_syncing.</p>
         * </li>
         * <li><p>syncing: The replication pair is synchronizing data. The replication pair is in this state when data is asynchronously replicated from the primary disk to the secondary disk for a second or subsequent time.</p>
         * </li>
         * <li><p>normal: The replication pair is in the normal state. The replication pair enters this state when data replication is complete in the current replication cycle.</p>
         * </li>
         * <li><p>stopping: The replication pair is being stopped.</p>
         * </li>
         * <li><p>stopped: The replication pair is stopped.</p>
         * </li>
         * <li><p>stop_failed: The replication pair failed to be stopped.</p>
         * </li>
         * <li><p>failovering: A failover is in progress.</p>
         * </li>
         * <li><p>failovered: The failover is complete.</p>
         * </li>
         * <li><p>failover_failed: The failover failed.</p>
         * </li>
         * <li><p>reprotecting: A reverse replication is in progress.</p>
         * </li>
         * <li><p>reprotect_failed: The reverse replication failed.</p>
         * </li>
         * <li><p>deleting: The replication pair is being deleted.</p>
         * </li>
         * <li><p>delete_failed: The replication pair failed to be deleted.</p>
         * </li>
         * <li><p>deleted: The replication pair is deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The status message of the replication pair. This parameter is returned when the Status is <code>invalid</code> or <code>create_failed</code>. Valid values:</p>
         * <ul>
         * <li><p>PrePayOrderExpired: The subscription replication pair has expired.</p>
         * </li>
         * <li><p>PostPayOrderCeaseService: The service for the pay-as-you-go replication pair is suspended, usually due to an overdue payment.</p>
         * </li>
         * <li><p>DeviceRemoved: The primary or secondary disk is deleted.</p>
         * </li>
         * <li><p>DeviceKeyChanged: The <code>DeviceKey</code> mapping of the primary or secondary disk has changed.</p>
         * </li>
         * <li><p>DeviceSizeChanged: The <code>DeviceSize</code> of the primary or secondary disk has changed.</p>
         * </li>
         * <li><p>OperationDenied.QuotaExceed: The number of created replication pairs exceeds the quota.</p>
         * </li>
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

        public DescribeDiskReplicaPairsResponseBodyReplicaPairs setEnableRtc(Boolean enableRtc) {
            this.enableRtc = enableRtc;
            return this;
        }
        public Boolean getEnableRtc() {
            return this.enableRtc;
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
