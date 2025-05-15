// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageSetsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about the storage sets. The value of this parameter is an array that consists of StorageSet data.</p>
     */
    @NameInMap("StorageSets")
    public DescribeStorageSetsResponseBodyStorageSets storageSets;

    /**
     * <p>The total number of storage sets.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeStorageSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageSetsResponseBody self = new DescribeStorageSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStorageSetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStorageSetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStorageSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStorageSetsResponseBody setStorageSets(DescribeStorageSetsResponseBodyStorageSets storageSets) {
        this.storageSets = storageSets;
        return this;
    }
    public DescribeStorageSetsResponseBodyStorageSets getStorageSets() {
        return this.storageSets;
    }

    public DescribeStorageSetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeStorageSetsResponseBodyStorageSetsStorageSetTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeStorageSetsResponseBodyStorageSetsStorageSetTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageSetsResponseBodyStorageSetsStorageSetTagsTag self = new DescribeStorageSetsResponseBodyStorageSetsStorageSetTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSetTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSetTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeStorageSetsResponseBodyStorageSetsStorageSetTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeStorageSetsResponseBodyStorageSetsStorageSetTagsTag> tag;

        public static DescribeStorageSetsResponseBodyStorageSetsStorageSetTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageSetsResponseBodyStorageSetsStorageSetTags self = new DescribeStorageSetsResponseBodyStorageSetsStorageSetTags();
            return TeaModel.build(map, self);
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSetTags setTag(java.util.List<DescribeStorageSetsResponseBodyStorageSetsStorageSetTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeStorageSetsResponseBodyStorageSetsStorageSetTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeStorageSetsResponseBodyStorageSetsStorageSet extends TeaModel {
        /**
         * <p>The time when the storage set was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-01T00:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the storage set.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the region to which the storage set belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the storage set.</p>
         * 
         * <strong>example:</strong>
         * <p>ss-bp1d6tsvznfghy7y****</p>
         */
        @NameInMap("StorageSetId")
        public String storageSetId;

        /**
         * <p>The name of the storage set.</p>
         * 
         * <strong>example:</strong>
         * <p>testStorageSetName</p>
         */
        @NameInMap("StorageSetName")
        public String storageSetName;

        /**
         * <p>The maximum number of partitions supported by the storage set.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("StorageSetPartitionNumber")
        public Integer storageSetPartitionNumber;

        @NameInMap("Tags")
        public DescribeStorageSetsResponseBodyStorageSetsStorageSetTags tags;

        /**
         * <p>The ID of the zone to which the storage set belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeStorageSetsResponseBodyStorageSetsStorageSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageSetsResponseBodyStorageSetsStorageSet self = new DescribeStorageSetsResponseBodyStorageSetsStorageSet();
            return TeaModel.build(map, self);
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSet setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSet setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSet setStorageSetId(String storageSetId) {
            this.storageSetId = storageSetId;
            return this;
        }
        public String getStorageSetId() {
            return this.storageSetId;
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSet setStorageSetName(String storageSetName) {
            this.storageSetName = storageSetName;
            return this;
        }
        public String getStorageSetName() {
            return this.storageSetName;
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSet setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSet setTags(DescribeStorageSetsResponseBodyStorageSetsStorageSetTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeStorageSetsResponseBodyStorageSetsStorageSetTags getTags() {
            return this.tags;
        }

        public DescribeStorageSetsResponseBodyStorageSetsStorageSet setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeStorageSetsResponseBodyStorageSets extends TeaModel {
        @NameInMap("StorageSet")
        public java.util.List<DescribeStorageSetsResponseBodyStorageSetsStorageSet> storageSet;

        public static DescribeStorageSetsResponseBodyStorageSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageSetsResponseBodyStorageSets self = new DescribeStorageSetsResponseBodyStorageSets();
            return TeaModel.build(map, self);
        }

        public DescribeStorageSetsResponseBodyStorageSets setStorageSet(java.util.List<DescribeStorageSetsResponseBodyStorageSetsStorageSet> storageSet) {
            this.storageSet = storageSet;
            return this;
        }
        public java.util.List<DescribeStorageSetsResponseBodyStorageSetsStorageSet> getStorageSet() {
            return this.storageSet;
        }

    }

}
