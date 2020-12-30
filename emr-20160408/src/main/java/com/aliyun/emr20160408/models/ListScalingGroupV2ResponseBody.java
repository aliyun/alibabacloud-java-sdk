// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListScalingGroupV2ResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public ListScalingGroupV2ResponseBodyItems items;

    public static ListScalingGroupV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScalingGroupV2ResponseBody self = new ListScalingGroupV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScalingGroupV2ResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListScalingGroupV2ResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListScalingGroupV2ResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListScalingGroupV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScalingGroupV2ResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListScalingGroupV2ResponseBody setItems(ListScalingGroupV2ResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public ListScalingGroupV2ResponseBodyItems getItems() {
        return this.items;
    }

    public static class ListScalingGroupV2ResponseBodyItemsItem extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ScalingInMode")
        public String scalingInMode;

        @NameInMap("ScalingMaxSize")
        public Integer scalingMaxSize;

        @NameInMap("Name")
        public String name;

        @NameInMap("HostGroupBizId")
        public String hostGroupBizId;

        @NameInMap("ScalingMinSize")
        public Integer scalingMinSize;

        @NameInMap("ActiveStatus")
        public String activeStatus;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        public static ListScalingGroupV2ResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            ListScalingGroupV2ResponseBodyItemsItem self = new ListScalingGroupV2ResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public ListScalingGroupV2ResponseBodyItemsItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScalingGroupV2ResponseBodyItemsItem setScalingInMode(String scalingInMode) {
            this.scalingInMode = scalingInMode;
            return this;
        }
        public String getScalingInMode() {
            return this.scalingInMode;
        }

        public ListScalingGroupV2ResponseBodyItemsItem setScalingMaxSize(Integer scalingMaxSize) {
            this.scalingMaxSize = scalingMaxSize;
            return this;
        }
        public Integer getScalingMaxSize() {
            return this.scalingMaxSize;
        }

        public ListScalingGroupV2ResponseBodyItemsItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScalingGroupV2ResponseBodyItemsItem setHostGroupBizId(String hostGroupBizId) {
            this.hostGroupBizId = hostGroupBizId;
            return this;
        }
        public String getHostGroupBizId() {
            return this.hostGroupBizId;
        }

        public ListScalingGroupV2ResponseBodyItemsItem setScalingMinSize(Integer scalingMinSize) {
            this.scalingMinSize = scalingMinSize;
            return this;
        }
        public Integer getScalingMinSize() {
            return this.scalingMinSize;
        }

        public ListScalingGroupV2ResponseBodyItemsItem setActiveStatus(String activeStatus) {
            this.activeStatus = activeStatus;
            return this;
        }
        public String getActiveStatus() {
            return this.activeStatus;
        }

        public ListScalingGroupV2ResponseBodyItemsItem setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

    }

    public static class ListScalingGroupV2ResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<ListScalingGroupV2ResponseBodyItemsItem> item;

        public static ListScalingGroupV2ResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListScalingGroupV2ResponseBodyItems self = new ListScalingGroupV2ResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListScalingGroupV2ResponseBodyItems setItem(java.util.List<ListScalingGroupV2ResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ListScalingGroupV2ResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
