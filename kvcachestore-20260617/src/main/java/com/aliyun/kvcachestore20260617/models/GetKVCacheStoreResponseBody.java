// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class GetKVCacheStoreResponseBody extends TeaModel {
    @NameInMap("KvCacheStore")
    public GetKVCacheStoreResponseBodyKvCacheStore kvCacheStore;

    /**
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
         * <strong>example:</strong>
         * <p>ac-cus-tag-6</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
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
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <strong>example:</strong>
         * <p>2026-06-18T10:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>production kvcachestore</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>CapacityExpanding</p>
         */
        @NameInMap("ExtraStatus")
        public String extraStatus;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("HpnZone")
        public String hpnZone;

        /**
         * <strong>example:</strong>
         * <p>kvcs-xxxxx</p>
         */
        @NameInMap("KvcsId")
        public String kvcsId;

        /**
         * <strong>example:</strong>
         * <p>mp-xxxxx</p>
         */
        @NameInMap("MountPointId")
        public String mountPointId;

        /**
         * <strong>example:</strong>
         * <p>production-instance</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>rg-aekzrwkxbdvkctq</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<GetKVCacheStoreResponseBodyKvCacheStoreTags> tags;

        /**
         * <strong>example:</strong>
         * <p>kvcs</p>
         */
        @NameInMap("Type")
        public String type;

        /**
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
