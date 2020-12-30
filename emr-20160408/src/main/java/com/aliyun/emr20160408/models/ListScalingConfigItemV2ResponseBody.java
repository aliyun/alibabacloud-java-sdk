// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListScalingConfigItemV2ResponseBody extends TeaModel {
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
    public ListScalingConfigItemV2ResponseBodyItems items;

    public static ListScalingConfigItemV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScalingConfigItemV2ResponseBody self = new ListScalingConfigItemV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScalingConfigItemV2ResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListScalingConfigItemV2ResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListScalingConfigItemV2ResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListScalingConfigItemV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScalingConfigItemV2ResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListScalingConfigItemV2ResponseBody setItems(ListScalingConfigItemV2ResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public ListScalingConfigItemV2ResponseBodyItems getItems() {
        return this.items;
    }

    public static class ListScalingConfigItemV2ResponseBodyItemsItem extends TeaModel {
        @NameInMap("ConfigItemType")
        public String configItemType;

        @NameInMap("ScalingConfigItemBizId")
        public String scalingConfigItemBizId;

        @NameInMap("ScalingGroupBizId")
        public String scalingGroupBizId;

        @NameInMap("ConfigItemInformation")
        public String configItemInformation;

        public static ListScalingConfigItemV2ResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            ListScalingConfigItemV2ResponseBodyItemsItem self = new ListScalingConfigItemV2ResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public ListScalingConfigItemV2ResponseBodyItemsItem setConfigItemType(String configItemType) {
            this.configItemType = configItemType;
            return this;
        }
        public String getConfigItemType() {
            return this.configItemType;
        }

        public ListScalingConfigItemV2ResponseBodyItemsItem setScalingConfigItemBizId(String scalingConfigItemBizId) {
            this.scalingConfigItemBizId = scalingConfigItemBizId;
            return this;
        }
        public String getScalingConfigItemBizId() {
            return this.scalingConfigItemBizId;
        }

        public ListScalingConfigItemV2ResponseBodyItemsItem setScalingGroupBizId(String scalingGroupBizId) {
            this.scalingGroupBizId = scalingGroupBizId;
            return this;
        }
        public String getScalingGroupBizId() {
            return this.scalingGroupBizId;
        }

        public ListScalingConfigItemV2ResponseBodyItemsItem setConfigItemInformation(String configItemInformation) {
            this.configItemInformation = configItemInformation;
            return this;
        }
        public String getConfigItemInformation() {
            return this.configItemInformation;
        }

    }

    public static class ListScalingConfigItemV2ResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<ListScalingConfigItemV2ResponseBodyItemsItem> item;

        public static ListScalingConfigItemV2ResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListScalingConfigItemV2ResponseBodyItems self = new ListScalingConfigItemV2ResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListScalingConfigItemV2ResponseBodyItems setItem(java.util.List<ListScalingConfigItemV2ResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ListScalingConfigItemV2ResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
