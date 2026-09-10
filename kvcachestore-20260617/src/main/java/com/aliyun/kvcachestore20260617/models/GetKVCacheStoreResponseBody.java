// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class GetKVCacheStoreResponseBody extends TeaModel {
    /**
     * <p>The details of the KvCacheStore instance.</p>
     */
    @NameInMap("KvCacheStore")
    public GetKVCacheStoreResponseBodyKvCacheStore kvCacheStore;

    /**
     * <p>The request ID. A request ID is returned regardless of whether the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>019FB5E9-F9E8-52F5-9C56-2CDF479CBEB2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetKVCacheStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKVCacheStoreResponseBody self = new GetKVCacheStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKVCacheStoreResponseBody setKvCacheStore(GetKVCacheStoreResponseBodyKvCacheStore kvCacheStore) {
        this.kvCacheStore = kvCacheStore;
        return this;
    }
    public GetKVCacheStoreResponseBodyKvCacheStore getKvCacheStore() {
        return this.kvCacheStore;
    }

    public GetKVCacheStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetKVCacheStoreResponseBodyKvCacheStoreTags extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-cus-tag-6</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>advanced</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetKVCacheStoreResponseBodyKvCacheStoreTags build(java.util.Map<String, ?> map) throws Exception {
            GetKVCacheStoreResponseBodyKvCacheStoreTags self = new GetKVCacheStoreResponseBodyKvCacheStoreTags();
            return TeaModel.build(map, self);
        }

        public GetKVCacheStoreResponseBodyKvCacheStoreTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetKVCacheStoreResponseBodyKvCacheStoreTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetKVCacheStoreResponseBodyKvCacheStore extends TeaModel {
        /**
         * <p>The storage capacity, in GiB.</p>
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
         * <p>The extra status information. Valid values:</p>
         * <ul>
         * <li>CapacityExpanding</li>
         * <li>CapacityExpandSuccess</li>
         * <li>CapacityExpandFail</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CapacityExpanding</p>
         */
        @NameInMap("ExtraStatus")
        public String extraStatus;

        /**
         * <p>The cluster number.</p>
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
         * <p>The file system-level mount point ID. Instances under the same file system share this mount point. For more information, use ListKVCacheInstanceAttachInfo.</p>
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
         * <p>The payment type. Valid values:</p>
         * <ul>
         * <li>PREPAY</li>
         * <li>POSTPAY</li>
         * </ul>
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
         * <p>rg-aekzrwkxbdvkctq</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li>Creating</li>
         * <li>Available</li>
         * <li>InUse</li>
         * <li>Stopping</li>
         * <li>Stopped</li>
         * <li>Deleting</li>
         * </ul>
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
        public java.util.List<GetKVCacheStoreResponseBodyKvCacheStoreTags> tags;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li>kvcs: KVCacheStore (CPFS).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>kvcs</p>
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

        public static GetKVCacheStoreResponseBodyKvCacheStore build(java.util.Map<String, ?> map) throws Exception {
            GetKVCacheStoreResponseBodyKvCacheStore self = new GetKVCacheStoreResponseBodyKvCacheStore();
            return TeaModel.build(map, self);
        }

        public GetKVCacheStoreResponseBodyKvCacheStore setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public GetKVCacheStoreResponseBodyKvCacheStore setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetKVCacheStoreResponseBodyKvCacheStore setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetKVCacheStoreResponseBodyKvCacheStore setExtraStatus(String extraStatus) {
            this.extraStatus = extraStatus;
            return this;
        }
        public String getExtraStatus() {
            return this.extraStatus;
        }

        public GetKVCacheStoreResponseBodyKvCacheStore setHpnZone(String hpnZone) {
            this.hpnZone = hpnZone;
            return this;
        }
        public String getHpnZone() {
            return this.hpnZone;
        }

        public GetKVCacheStoreResponseBodyKvCacheStore setKvcsId(String kvcsId) {
            this.kvcsId = kvcsId;
            return this;
        }
        public String getKvcsId() {
            return this.kvcsId;
        }

        public GetKVCacheStoreResponseBodyKvCacheStore setMountPointId(String mountPointId) {
            this.mountPointId = mountPointId;
            return this;
        }
        public String getMountPointId() {
            return this.mountPointId;
        }

        public GetKVCacheStoreResponseBodyKvCacheStore setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetKVCacheStoreResponseBodyKvCacheStore setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public GetKVCacheStoreResponseBodyKvCacheStore setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetKVCacheStoreResponseBodyKvCacheStore setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetKVCacheStoreResponseBodyKvCacheStore setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetKVCacheStoreResponseBodyKvCacheStore setTags(java.util.List<GetKVCacheStoreResponseBodyKvCacheStoreTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetKVCacheStoreResponseBodyKvCacheStoreTags> getTags() {
            return this.tags;
        }

        public GetKVCacheStoreResponseBodyKvCacheStore setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetKVCacheStoreResponseBodyKvCacheStore setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
