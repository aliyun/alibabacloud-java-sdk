// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListScalingConfigItemResponseBody extends TeaModel {
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
    public ListScalingConfigItemResponseBodyItems items;

    public static ListScalingConfigItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScalingConfigItemResponseBody self = new ListScalingConfigItemResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScalingConfigItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScalingConfigItemResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListScalingConfigItemResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListScalingConfigItemResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListScalingConfigItemResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListScalingConfigItemResponseBody setItems(ListScalingConfigItemResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public ListScalingConfigItemResponseBodyItems getItems() {
        return this.items;
    }

    public static class ListScalingConfigItemResponseBodyItemsItems extends TeaModel {
        @NameInMap("ConfigItemType")
        public String configItemType;

        @NameInMap("ScalingGroupBizId")
        public String scalingGroupBizId;

        @NameInMap("ScalingConfigItemBizId")
        public String scalingConfigItemBizId;

        @NameInMap("ConfigItemInformation")
        public String configItemInformation;

        public static ListScalingConfigItemResponseBodyItemsItems build(java.util.Map<String, ?> map) throws Exception {
            ListScalingConfigItemResponseBodyItemsItems self = new ListScalingConfigItemResponseBodyItemsItems();
            return TeaModel.build(map, self);
        }

        public ListScalingConfigItemResponseBodyItemsItems setConfigItemType(String configItemType) {
            this.configItemType = configItemType;
            return this;
        }
        public String getConfigItemType() {
            return this.configItemType;
        }

        public ListScalingConfigItemResponseBodyItemsItems setScalingGroupBizId(String scalingGroupBizId) {
            this.scalingGroupBizId = scalingGroupBizId;
            return this;
        }
        public String getScalingGroupBizId() {
            return this.scalingGroupBizId;
        }

        public ListScalingConfigItemResponseBodyItemsItems setScalingConfigItemBizId(String scalingConfigItemBizId) {
            this.scalingConfigItemBizId = scalingConfigItemBizId;
            return this;
        }
        public String getScalingConfigItemBizId() {
            return this.scalingConfigItemBizId;
        }

        public ListScalingConfigItemResponseBodyItemsItems setConfigItemInformation(String configItemInformation) {
            this.configItemInformation = configItemInformation;
            return this;
        }
        public String getConfigItemInformation() {
            return this.configItemInformation;
        }

    }

    public static class ListScalingConfigItemResponseBodyItems extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListScalingConfigItemResponseBodyItemsItems> items;

        public static ListScalingConfigItemResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListScalingConfigItemResponseBodyItems self = new ListScalingConfigItemResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListScalingConfigItemResponseBodyItems setItems(java.util.List<ListScalingConfigItemResponseBodyItemsItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListScalingConfigItemResponseBodyItemsItems> getItems() {
            return this.items;
        }

    }

}
