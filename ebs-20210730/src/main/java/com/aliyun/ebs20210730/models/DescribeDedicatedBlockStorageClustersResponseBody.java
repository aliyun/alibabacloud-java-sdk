// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDedicatedBlockStorageClustersResponseBody extends TeaModel {
    /**
     * <p>Details about the dedicated block storage clusters.</p>
     */
    @NameInMap("DedicatedBlockStorageClusters")
    public java.util.List<DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters> dedicatedBlockStorageClusters;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
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
     * <p>11B55F58-D3A4-4A9B-9596-342420D0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDedicatedBlockStorageClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedBlockStorageClustersResponseBody self = new DescribeDedicatedBlockStorageClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedBlockStorageClustersResponseBody setDedicatedBlockStorageClusters(java.util.List<DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters> dedicatedBlockStorageClusters) {
        this.dedicatedBlockStorageClusters = dedicatedBlockStorageClusters;
        return this;
    }
    public java.util.List<DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters> getDedicatedBlockStorageClusters() {
        return this.dedicatedBlockStorageClusters;
    }

    public DescribeDedicatedBlockStorageClustersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDedicatedBlockStorageClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDedicatedBlockStorageClustersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDedicatedBlockStorageClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedBlockStorageClustersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity extends TeaModel {
        /**
         * <p>The available capacity of the dedicated block storage cluster. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>61440</p>
         */
        @NameInMap("AvailableCapacity")
        public Long availableCapacity;

        /**
         * <p>The total capacity of the dedicated block storage cluster that was delivered in disk creation orders. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>61440</p>
         */
        @NameInMap("AvailableDeviceCapacity")
        public Long availableDeviceCapacity;

        /**
         * <p>This parameter is displayed only if Thin Provision is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>40000.3</p>
         */
        @NameInMap("AvailableSpaceCapacity")
        public Double availableSpaceCapacity;

        /**
         * <p>The capacity of the dedicated block storage cluster that was delivered in orders. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>61440</p>
         */
        @NameInMap("ClusterAvailableCapacity")
        public Long clusterAvailableCapacity;

        /**
         * <p>The capacity of the dedicated block storage cluster that is to be delivered in orders. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ClusterDeliveryCapacity")
        public Long clusterDeliveryCapacity;

        /**
         * <p>The capacity to be delivered for the dedicated block storage cluster. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeliveryCapacity")
        public Long deliveryCapacity;

        /**
         * <p>The total capacity of the dedicated block storage cluster. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>61440</p>
         */
        @NameInMap("TotalCapacity")
        public Long totalCapacity;

        /**
         * <p>The total capacity of the dedicated block storage cluster that is to be delivered in disk creation orders. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>61440</p>
         */
        @NameInMap("TotalDeviceCapacity")
        public Long totalDeviceCapacity;

        /**
         * <p>This parameter is displayed only if Thin Provision is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>73728</p>
         */
        @NameInMap("TotalSpaceCapacity")
        public Long totalSpaceCapacity;

        /**
         * <p>The used capacity of the dedicated block storage cluster. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>1440</p>
         */
        @NameInMap("UsedCapacity")
        public Long usedCapacity;

        /**
         * <p>The capacity of the dedicated block storage cluster that was used to create disks. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>32000</p>
         */
        @NameInMap("UsedDeviceCapacity")
        public Long usedDeviceCapacity;

        /**
         * <p>This parameter is displayed only if Thin Provision is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>33727.7</p>
         */
        @NameInMap("UsedSpaceCapacity")
        public Double usedSpaceCapacity;

        public static DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity self = new DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity setAvailableCapacity(Long availableCapacity) {
            this.availableCapacity = availableCapacity;
            return this;
        }
        public Long getAvailableCapacity() {
            return this.availableCapacity;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity setAvailableDeviceCapacity(Long availableDeviceCapacity) {
            this.availableDeviceCapacity = availableDeviceCapacity;
            return this;
        }
        public Long getAvailableDeviceCapacity() {
            return this.availableDeviceCapacity;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity setAvailableSpaceCapacity(Double availableSpaceCapacity) {
            this.availableSpaceCapacity = availableSpaceCapacity;
            return this;
        }
        public Double getAvailableSpaceCapacity() {
            return this.availableSpaceCapacity;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity setClusterAvailableCapacity(Long clusterAvailableCapacity) {
            this.clusterAvailableCapacity = clusterAvailableCapacity;
            return this;
        }
        public Long getClusterAvailableCapacity() {
            return this.clusterAvailableCapacity;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity setClusterDeliveryCapacity(Long clusterDeliveryCapacity) {
            this.clusterDeliveryCapacity = clusterDeliveryCapacity;
            return this;
        }
        public Long getClusterDeliveryCapacity() {
            return this.clusterDeliveryCapacity;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity setDeliveryCapacity(Long deliveryCapacity) {
            this.deliveryCapacity = deliveryCapacity;
            return this;
        }
        public Long getDeliveryCapacity() {
            return this.deliveryCapacity;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity setTotalCapacity(Long totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }
        public Long getTotalCapacity() {
            return this.totalCapacity;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity setTotalDeviceCapacity(Long totalDeviceCapacity) {
            this.totalDeviceCapacity = totalDeviceCapacity;
            return this;
        }
        public Long getTotalDeviceCapacity() {
            return this.totalDeviceCapacity;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity setTotalSpaceCapacity(Long totalSpaceCapacity) {
            this.totalSpaceCapacity = totalSpaceCapacity;
            return this;
        }
        public Long getTotalSpaceCapacity() {
            return this.totalSpaceCapacity;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity setUsedCapacity(Long usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity setUsedDeviceCapacity(Long usedDeviceCapacity) {
            this.usedDeviceCapacity = usedDeviceCapacity;
            return this;
        }
        public Long getUsedDeviceCapacity() {
            return this.usedDeviceCapacity;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity setUsedSpaceCapacity(Double usedSpaceCapacity) {
            this.usedSpaceCapacity = usedSpaceCapacity;
            return this;
        }
        public Double getUsedSpaceCapacity() {
            return this.usedSpaceCapacity;
        }

    }

    public static class DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersTags extends TeaModel {
        /**
         * <p>The tag key of the dedicated block storage cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the dedicated block storage cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersTags self = new DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersTags();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345601234560***</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>The category of disks that can be created in the dedicated block storage cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time when the dedicated block storage cluster was created. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1657113211</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Details about the storage capacity of the dedicated block storage cluster.</p>
         */
        @NameInMap("DedicatedBlockStorageClusterCapacity")
        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity dedicatedBlockStorageClusterCapacity;

        /**
         * <p>The ID of the dedicated block storage cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dbsc-f8z4d3k4nsgg9okb****</p>
         */
        @NameInMap("DedicatedBlockStorageClusterId")
        public String dedicatedBlockStorageClusterId;

        /**
         * <p>The name of the dedicated block storage cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>myDBSCCluster</p>
         */
        @NameInMap("DedicatedBlockStorageClusterName")
        public String dedicatedBlockStorageClusterName;

        /**
         * <p>The description of the dedicated block storage cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether Thin Provision is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableThinProvision")
        public Boolean enableThinProvision;

        /**
         * <p>The time when the dedicated block storage cluster expires. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1673020800</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The performance level of disks. Valid values:</p>
         * <ul>
         * <li>PL0</li>
         * <li>PL1</li>
         * <li>PL2</li>
         * <li>PL3</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is valid only when the SupportedCategory value is cloud_essd.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The region ID of the dedicated block storage cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-heyuan</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the dedicated block storage cluster belongs. You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to obtain the ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzsoux****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The capacity oversold ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2</p>
         */
        @NameInMap("SizeOverSoldRatio")
        public Double sizeOverSoldRatio;

        /**
         * <p>The state of the dedicated block storage cluster. Valid values:</p>
         * <ul>
         * <li>Preparing</li>
         * <li>Running</li>
         * <li>Expired</li>
         * <li>Offline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>StorageDomain</p>
         * 
         * <strong>example:</strong>
         * <p>StorageDomain</p>
         */
        @NameInMap("StorageDomain")
        public String storageDomain;

        /**
         * <p>This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("SupportedCategory")
        public String supportedCategory;

        /**
         * <p>The tags of the dedicated block storage cluster.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersTags> tags;

        /**
         * <p>The type of the dedicated block storage cluster. Valid values:</p>
         * <ul>
         * <li>Standard: basic dedicated block storage cluster. ESSDs at performance level 0 (PL0 ESSDs) can be created in basic dedicated block storage clusters.</li>
         * <li>Premium: performance dedicated block storage cluster. ESSDs at performance level 1 (PL1 ESSDs) can be created in performance dedicated block storage clusters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The zone ID of the dedicated block storage cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-heyuan-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters self = new DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setDedicatedBlockStorageClusterCapacity(DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity dedicatedBlockStorageClusterCapacity) {
            this.dedicatedBlockStorageClusterCapacity = dedicatedBlockStorageClusterCapacity;
            return this;
        }
        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersDedicatedBlockStorageClusterCapacity getDedicatedBlockStorageClusterCapacity() {
            return this.dedicatedBlockStorageClusterCapacity;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setDedicatedBlockStorageClusterId(String dedicatedBlockStorageClusterId) {
            this.dedicatedBlockStorageClusterId = dedicatedBlockStorageClusterId;
            return this;
        }
        public String getDedicatedBlockStorageClusterId() {
            return this.dedicatedBlockStorageClusterId;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setDedicatedBlockStorageClusterName(String dedicatedBlockStorageClusterName) {
            this.dedicatedBlockStorageClusterName = dedicatedBlockStorageClusterName;
            return this;
        }
        public String getDedicatedBlockStorageClusterName() {
            return this.dedicatedBlockStorageClusterName;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setEnableThinProvision(Boolean enableThinProvision) {
            this.enableThinProvision = enableThinProvision;
            return this;
        }
        public Boolean getEnableThinProvision() {
            return this.enableThinProvision;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setSizeOverSoldRatio(Double sizeOverSoldRatio) {
            this.sizeOverSoldRatio = sizeOverSoldRatio;
            return this;
        }
        public Double getSizeOverSoldRatio() {
            return this.sizeOverSoldRatio;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setStorageDomain(String storageDomain) {
            this.storageDomain = storageDomain;
            return this;
        }
        public String getStorageDomain() {
            return this.storageDomain;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setSupportedCategory(String supportedCategory) {
            this.supportedCategory = supportedCategory;
            return this;
        }
        public String getSupportedCategory() {
            return this.supportedCategory;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setTags(java.util.List<DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClustersTags> getTags() {
            return this.tags;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDedicatedBlockStorageClustersResponseBodyDedicatedBlockStorageClusters setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
