// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListScalingActivityResponseBody extends TeaModel {
    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // pageNumber
    @NameInMap("PageNumber")
    public Long pageNumber;

    // pageSize
    @NameInMap("PageSize")
    public Long pageSize;

    // totalCount
    @NameInMap("TotalCount")
    public Long totalCount;

    // nextToken
    @NameInMap("NextToken")
    public Long nextToken;

    @NameInMap("Items")
    public ListScalingActivityResponseBodyItems items;

    public static ListScalingActivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScalingActivityResponseBody self = new ListScalingActivityResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScalingActivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScalingActivityResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListScalingActivityResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListScalingActivityResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListScalingActivityResponseBody setNextToken(Long nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Long getNextToken() {
        return this.nextToken;
    }

    public ListScalingActivityResponseBody setItems(ListScalingActivityResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public ListScalingActivityResponseBodyItems getItems() {
        return this.items;
    }

    public static class ListScalingActivityResponseBodyItemsItem extends TeaModel {
        // bizId
        @NameInMap("BizId")
        public String bizId;

        // startTime
        @NameInMap("StartTime")
        public Long startTime;

        // endTime
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("ExpectNum")
        public Long expectNum;

        // instanceIds
        @NameInMap("InstanceIds")
        public String instanceIds;

        // totalCapacity
        @NameInMap("TotalCapacity")
        public Long totalCapacity;

        // cause
        @NameInMap("Cause")
        public String cause;

        // description
        @NameInMap("Description")
        public String description;

        // transition
        @NameInMap("Transition")
        public String transition;

        // status
        @NameInMap("Status")
        public String status;

        // scalingRuleId
        @NameInMap("ScalingRuleId")
        public String scalingRuleId;

        // scalingRuleName
        @NameInMap("ScalingRuleName")
        public String scalingRuleName;

        // hostGroupBizId
        @NameInMap("HostGroupBizId")
        public String hostGroupBizId;

        // hostGroupName
        @NameInMap("HostGroupName")
        public String hostGroupName;

        public static ListScalingActivityResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            ListScalingActivityResponseBodyItemsItem self = new ListScalingActivityResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public ListScalingActivityResponseBodyItemsItem setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListScalingActivityResponseBodyItemsItem setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListScalingActivityResponseBodyItemsItem setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListScalingActivityResponseBodyItemsItem setExpectNum(Long expectNum) {
            this.expectNum = expectNum;
            return this;
        }
        public Long getExpectNum() {
            return this.expectNum;
        }

        public ListScalingActivityResponseBodyItemsItem setInstanceIds(String instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public String getInstanceIds() {
            return this.instanceIds;
        }

        public ListScalingActivityResponseBodyItemsItem setTotalCapacity(Long totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }
        public Long getTotalCapacity() {
            return this.totalCapacity;
        }

        public ListScalingActivityResponseBodyItemsItem setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public ListScalingActivityResponseBodyItemsItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScalingActivityResponseBodyItemsItem setTransition(String transition) {
            this.transition = transition;
            return this;
        }
        public String getTransition() {
            return this.transition;
        }

        public ListScalingActivityResponseBodyItemsItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListScalingActivityResponseBodyItemsItem setScalingRuleId(String scalingRuleId) {
            this.scalingRuleId = scalingRuleId;
            return this;
        }
        public String getScalingRuleId() {
            return this.scalingRuleId;
        }

        public ListScalingActivityResponseBodyItemsItem setScalingRuleName(String scalingRuleName) {
            this.scalingRuleName = scalingRuleName;
            return this;
        }
        public String getScalingRuleName() {
            return this.scalingRuleName;
        }

        public ListScalingActivityResponseBodyItemsItem setHostGroupBizId(String hostGroupBizId) {
            this.hostGroupBizId = hostGroupBizId;
            return this;
        }
        public String getHostGroupBizId() {
            return this.hostGroupBizId;
        }

        public ListScalingActivityResponseBodyItemsItem setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

    }

    public static class ListScalingActivityResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<ListScalingActivityResponseBodyItemsItem> item;

        public static ListScalingActivityResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListScalingActivityResponseBodyItems self = new ListScalingActivityResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListScalingActivityResponseBodyItems setItem(java.util.List<ListScalingActivityResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ListScalingActivityResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
