// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageCapacityUnitsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about the SCUs.</p>
     */
    @NameInMap("StorageCapacityUnits")
    public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits storageCapacityUnits;

    /**
     * <p>The total number of SCUs.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeStorageCapacityUnitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageCapacityUnitsResponseBody self = new DescribeStorageCapacityUnitsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStorageCapacityUnitsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStorageCapacityUnitsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStorageCapacityUnitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStorageCapacityUnitsResponseBody setStorageCapacityUnits(DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits storageCapacityUnits) {
        this.storageCapacityUnits = storageCapacityUnits;
        return this;
    }
    public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits getStorageCapacityUnits() {
        return this.storageCapacityUnits;
    }

    public DescribeStorageCapacityUnitsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnitTagsTag extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of tag N.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnitTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnitTagsTag self = new DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnitTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnitTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnitTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnitTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnitTagsTag> tag;

        public static DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnitTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnitTags self = new DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnitTags();
            return TeaModel.build(map, self);
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnitTags setTag(java.util.List<DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnitTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnitTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnit extends TeaModel {
        /**
         * <p>Indicates the allocation state of the SCU when the AllocationType parameter is set to Shared. Valid values:</p>
         * <br>
         * <p>*   allocated: The SCU is allocated to other accounts.</p>
         * <p>*   BeAllocated: The SCU is allocated from another account.</p>
         */
        @NameInMap("AllocationStatus")
        public String allocationStatus;

        /**
         * <p>The capacity of the SCU.</p>
         */
        @NameInMap("Capacity")
        public Integer capacity;

        /**
         * <p>The time when the SCU was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the SCU.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the SCU expires.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The name of the SCU.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region ID of the SCU.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The time when the SCU took effect.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state of the SCU.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the SCU.</p>
         */
        @NameInMap("StorageCapacityUnitId")
        public String storageCapacityUnitId;

        /**
         * <p>The tag key-value pairs of the SCU.</p>
         */
        @NameInMap("Tags")
        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnitTags tags;

        public static DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnit build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnit self = new DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnit();
            return TeaModel.build(map, self);
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnit setAllocationStatus(String allocationStatus) {
            this.allocationStatus = allocationStatus;
            return this;
        }
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnit setCapacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Integer getCapacity() {
            return this.capacity;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnit setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnit setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnit setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnit setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnit setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnit setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnit setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnit setStorageCapacityUnitId(String storageCapacityUnitId) {
            this.storageCapacityUnitId = storageCapacityUnitId;
            return this;
        }
        public String getStorageCapacityUnitId() {
            return this.storageCapacityUnitId;
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnit setTags(DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnitTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnitTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits extends TeaModel {
        @NameInMap("StorageCapacityUnit")
        public java.util.List<DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnit> storageCapacityUnit;

        public static DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits self = new DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits();
            return TeaModel.build(map, self);
        }

        public DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnits setStorageCapacityUnit(java.util.List<DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnit> storageCapacityUnit) {
            this.storageCapacityUnit = storageCapacityUnit;
            return this;
        }
        public java.util.List<DescribeStorageCapacityUnitsResponseBodyStorageCapacityUnitsStorageCapacityUnit> getStorageCapacityUnit() {
            return this.storageCapacityUnit;
        }

    }

}
