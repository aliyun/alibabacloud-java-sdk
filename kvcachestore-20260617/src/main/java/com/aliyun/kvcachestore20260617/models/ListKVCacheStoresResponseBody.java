// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class ListKVCacheStoresResponseBody extends TeaModel {
    /**
     * <p>The list of KVCacheStore instances. Each element contains the following fields: KvcsId, Name, Status, ExtraStatus, RegionId, ZoneId, HpnZone, Type, Capacity, PaymentType, MountPointId, CreateTime, and Description.</p>
     */
    @NameInMap("KVCacheStores")
    public java.util.List<ListKVCacheStoresResponseBodyKVCacheStores> KVCacheStores;

    /**
     * <p>The maximum number of entries returned per pagination request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. This value is empty when no more data is available. This parameter is valid only for cursor-based pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The current page number. This parameter is valid only for page number-based pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. This parameter is valid only for page number-based pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The total number of pages. This value is returned only for page number-based pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageTotal")
    public Integer pageTotal;

    /**
     * <p>The request ID. A request ID is returned regardless of whether the API call succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>56AC37CD-388E-5D21-951B-C50D16D8E812</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instances. This value is returned only for page number-based pagination. For cursor-based pagination, the value is -1.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListKVCacheStoresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKVCacheStoresResponseBody self = new ListKVCacheStoresResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKVCacheStoresResponseBody setKVCacheStores(java.util.List<ListKVCacheStoresResponseBodyKVCacheStores> KVCacheStores) {
        this.KVCacheStores = KVCacheStores;
        return this;
    }
    public java.util.List<ListKVCacheStoresResponseBodyKVCacheStores> getKVCacheStores() {
        return this.KVCacheStores;
    }

    public ListKVCacheStoresResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKVCacheStoresResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListKVCacheStoresResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListKVCacheStoresResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListKVCacheStoresResponseBody setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
        return this;
    }
    public Integer getPageTotal() {
        return this.pageTotal;
    }

    public ListKVCacheStoresResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKVCacheStoresResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListKVCacheStoresResponseBodyKVCacheStoresTags extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>chapter</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>test-value-1766542011</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListKVCacheStoresResponseBodyKVCacheStoresTags build(java.util.Map<String, ?> map) throws Exception {
            ListKVCacheStoresResponseBodyKVCacheStoresTags self = new ListKVCacheStoresResponseBodyKVCacheStoresTags();
            return TeaModel.build(map, self);
        }

        public ListKVCacheStoresResponseBodyKVCacheStoresTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListKVCacheStoresResponseBodyKVCacheStoresTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListKVCacheStoresResponseBodyKVCacheStores extends TeaModel {
        /**
         * <p>The storage capacity. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The creation time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-18T10:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>production kvcachestore</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The extra status information. Valid values: CapacityExpanding, CapacityExpandSuccess, and CapacityExpandFail.</p>
         * 
         * <strong>example:</strong>
         * <p>CapacityExpanding</p>
         */
        @NameInMap("ExtraStatus")
        public String extraStatus;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("HpnZone")
        public String hpnZone;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>kvcs-xxxxx</p>
         */
        @NameInMap("KvcsId")
        public String kvcsId;

        /**
         * <p>The file system-level mount point ID. Instances under the same file system share this mount point. For more information, call ListKVCacheInstanceAttachInfo.</p>
         * 
         * <strong>example:</strong>
         * <p>mp-xxxxx</p>
         */
        @NameInMap("MountPointId")
        public String mountPointId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>production-instance</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The payment type. Valid values: PREPAY and POSTPAY.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek3dnrvdxj2dvq</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The instance status. Valid values: Creating, Available, InUse, Stopping, Stopped, and Deleting.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of resource tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListKVCacheStoresResponseBodyKVCacheStoresTags> tags;

        /**
         * <p>The instance type. Valid values: kvcs (KVCacheStore, CPFS).</p>
         * 
         * <strong>example:</strong>
         * <p>preview</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListKVCacheStoresResponseBodyKVCacheStores build(java.util.Map<String, ?> map) throws Exception {
            ListKVCacheStoresResponseBodyKVCacheStores self = new ListKVCacheStoresResponseBodyKVCacheStores();
            return TeaModel.build(map, self);
        }

        public ListKVCacheStoresResponseBodyKVCacheStores setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public ListKVCacheStoresResponseBodyKVCacheStores setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListKVCacheStoresResponseBodyKVCacheStores setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListKVCacheStoresResponseBodyKVCacheStores setExtraStatus(String extraStatus) {
            this.extraStatus = extraStatus;
            return this;
        }
        public String getExtraStatus() {
            return this.extraStatus;
        }

        public ListKVCacheStoresResponseBodyKVCacheStores setHpnZone(String hpnZone) {
            this.hpnZone = hpnZone;
            return this;
        }
        public String getHpnZone() {
            return this.hpnZone;
        }

        public ListKVCacheStoresResponseBodyKVCacheStores setKvcsId(String kvcsId) {
            this.kvcsId = kvcsId;
            return this;
        }
        public String getKvcsId() {
            return this.kvcsId;
        }

        public ListKVCacheStoresResponseBodyKVCacheStores setMountPointId(String mountPointId) {
            this.mountPointId = mountPointId;
            return this;
        }
        public String getMountPointId() {
            return this.mountPointId;
        }

        public ListKVCacheStoresResponseBodyKVCacheStores setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListKVCacheStoresResponseBodyKVCacheStores setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListKVCacheStoresResponseBodyKVCacheStores setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListKVCacheStoresResponseBodyKVCacheStores setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListKVCacheStoresResponseBodyKVCacheStores setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListKVCacheStoresResponseBodyKVCacheStores setTags(java.util.List<ListKVCacheStoresResponseBodyKVCacheStoresTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListKVCacheStoresResponseBodyKVCacheStoresTags> getTags() {
            return this.tags;
        }

        public ListKVCacheStoresResponseBodyKVCacheStores setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListKVCacheStoresResponseBodyKVCacheStores setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
