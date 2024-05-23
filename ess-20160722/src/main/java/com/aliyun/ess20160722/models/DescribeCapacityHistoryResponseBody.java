// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class DescribeCapacityHistoryResponseBody extends TeaModel {
    @NameInMap("CapacityHistoryItems")
    public DescribeCapacityHistoryResponseBodyCapacityHistoryItems capacityHistoryItems;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCapacityHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityHistoryResponseBody self = new DescribeCapacityHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityHistoryResponseBody setCapacityHistoryItems(DescribeCapacityHistoryResponseBodyCapacityHistoryItems capacityHistoryItems) {
        this.capacityHistoryItems = capacityHistoryItems;
        return this;
    }
    public DescribeCapacityHistoryResponseBodyCapacityHistoryItems getCapacityHistoryItems() {
        return this.capacityHistoryItems;
    }

    public DescribeCapacityHistoryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCapacityHistoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCapacityHistoryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCapacityHistoryResponseBodyCapacityHistoryItemsCapacityHistoryModel extends TeaModel {
        @NameInMap("AttachedCapacity")
        public Integer attachedCapacity;

        @NameInMap("AutoCreatedCapacity")
        public Integer autoCreatedCapacity;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("TotalCapacity")
        public Integer totalCapacity;

        public static DescribeCapacityHistoryResponseBodyCapacityHistoryItemsCapacityHistoryModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityHistoryResponseBodyCapacityHistoryItemsCapacityHistoryModel self = new DescribeCapacityHistoryResponseBodyCapacityHistoryItemsCapacityHistoryModel();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityHistoryResponseBodyCapacityHistoryItemsCapacityHistoryModel setAttachedCapacity(Integer attachedCapacity) {
            this.attachedCapacity = attachedCapacity;
            return this;
        }
        public Integer getAttachedCapacity() {
            return this.attachedCapacity;
        }

        public DescribeCapacityHistoryResponseBodyCapacityHistoryItemsCapacityHistoryModel setAutoCreatedCapacity(Integer autoCreatedCapacity) {
            this.autoCreatedCapacity = autoCreatedCapacity;
            return this;
        }
        public Integer getAutoCreatedCapacity() {
            return this.autoCreatedCapacity;
        }

        public DescribeCapacityHistoryResponseBodyCapacityHistoryItemsCapacityHistoryModel setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeCapacityHistoryResponseBodyCapacityHistoryItemsCapacityHistoryModel setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public DescribeCapacityHistoryResponseBodyCapacityHistoryItemsCapacityHistoryModel setTotalCapacity(Integer totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }
        public Integer getTotalCapacity() {
            return this.totalCapacity;
        }

    }

    public static class DescribeCapacityHistoryResponseBodyCapacityHistoryItems extends TeaModel {
        @NameInMap("CapacityHistoryModel")
        public java.util.List<DescribeCapacityHistoryResponseBodyCapacityHistoryItemsCapacityHistoryModel> capacityHistoryModel;

        public static DescribeCapacityHistoryResponseBodyCapacityHistoryItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityHistoryResponseBodyCapacityHistoryItems self = new DescribeCapacityHistoryResponseBodyCapacityHistoryItems();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityHistoryResponseBodyCapacityHistoryItems setCapacityHistoryModel(java.util.List<DescribeCapacityHistoryResponseBodyCapacityHistoryItemsCapacityHistoryModel> capacityHistoryModel) {
            this.capacityHistoryModel = capacityHistoryModel;
            return this;
        }
        public java.util.List<DescribeCapacityHistoryResponseBodyCapacityHistoryItemsCapacityHistoryModel> getCapacityHistoryModel() {
            return this.capacityHistoryModel;
        }

    }

}
