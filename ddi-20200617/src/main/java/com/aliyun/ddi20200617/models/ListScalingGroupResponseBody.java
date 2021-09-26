// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListScalingGroupResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Items")
    public ListScalingGroupResponseBodyItems items;

    public static ListScalingGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScalingGroupResponseBody self = new ListScalingGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScalingGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScalingGroupResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListScalingGroupResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListScalingGroupResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListScalingGroupResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListScalingGroupResponseBody setItems(ListScalingGroupResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public ListScalingGroupResponseBodyItems getItems() {
        return this.items;
    }

    public static class ListScalingGroupResponseBodyItemsItem extends TeaModel {
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        @NameInMap("ActiveStatus")
        public String activeStatus;

        @NameInMap("HostGroupBizId")
        public String hostGroupBizId;

        @NameInMap("ScalingInMode")
        public String scalingInMode;

        @NameInMap("ScalingMinSize")
        public String scalingMinSize;

        @NameInMap("ScalingMaxSize")
        public String scalingMaxSize;

        public static ListScalingGroupResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            ListScalingGroupResponseBodyItemsItem self = new ListScalingGroupResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public ListScalingGroupResponseBodyItemsItem setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public ListScalingGroupResponseBodyItemsItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScalingGroupResponseBodyItemsItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScalingGroupResponseBodyItemsItem setActiveStatus(String activeStatus) {
            this.activeStatus = activeStatus;
            return this;
        }
        public String getActiveStatus() {
            return this.activeStatus;
        }

        public ListScalingGroupResponseBodyItemsItem setHostGroupBizId(String hostGroupBizId) {
            this.hostGroupBizId = hostGroupBizId;
            return this;
        }
        public String getHostGroupBizId() {
            return this.hostGroupBizId;
        }

        public ListScalingGroupResponseBodyItemsItem setScalingInMode(String scalingInMode) {
            this.scalingInMode = scalingInMode;
            return this;
        }
        public String getScalingInMode() {
            return this.scalingInMode;
        }

        public ListScalingGroupResponseBodyItemsItem setScalingMinSize(String scalingMinSize) {
            this.scalingMinSize = scalingMinSize;
            return this;
        }
        public String getScalingMinSize() {
            return this.scalingMinSize;
        }

        public ListScalingGroupResponseBodyItemsItem setScalingMaxSize(String scalingMaxSize) {
            this.scalingMaxSize = scalingMaxSize;
            return this;
        }
        public String getScalingMaxSize() {
            return this.scalingMaxSize;
        }

    }

    public static class ListScalingGroupResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<ListScalingGroupResponseBodyItemsItem> item;

        public static ListScalingGroupResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListScalingGroupResponseBodyItems self = new ListScalingGroupResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListScalingGroupResponseBodyItems setItem(java.util.List<ListScalingGroupResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ListScalingGroupResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
