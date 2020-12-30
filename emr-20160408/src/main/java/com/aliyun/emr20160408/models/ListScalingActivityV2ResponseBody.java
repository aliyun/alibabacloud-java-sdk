// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListScalingActivityV2ResponseBody extends TeaModel {
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
    public ListScalingActivityV2ResponseBodyItems items;

    public static ListScalingActivityV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScalingActivityV2ResponseBody self = new ListScalingActivityV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScalingActivityV2ResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListScalingActivityV2ResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListScalingActivityV2ResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListScalingActivityV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScalingActivityV2ResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListScalingActivityV2ResponseBody setItems(ListScalingActivityV2ResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public ListScalingActivityV2ResponseBodyItems getItems() {
        return this.items;
    }

    public static class ListScalingActivityV2ResponseBodyItemsItem extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("TotalCapacity")
        public Integer totalCapacity;

        @NameInMap("ExpectNum")
        public Integer expectNum;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("InstanceIds")
        public String instanceIds;

        @NameInMap("HostGroupBizId")
        public String hostGroupBizId;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ScalingRuleName")
        public String scalingRuleName;

        @NameInMap("ScalingRuleId")
        public String scalingRuleId;

        @NameInMap("Cause")
        public String cause;

        @NameInMap("HostGroupName")
        public String hostGroupName;

        @NameInMap("Transition")
        public String transition;

        public static ListScalingActivityV2ResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            ListScalingActivityV2ResponseBodyItemsItem self = new ListScalingActivityV2ResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public ListScalingActivityV2ResponseBodyItemsItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListScalingActivityV2ResponseBodyItemsItem setTotalCapacity(Integer totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }
        public Integer getTotalCapacity() {
            return this.totalCapacity;
        }

        public ListScalingActivityV2ResponseBodyItemsItem setExpectNum(Integer expectNum) {
            this.expectNum = expectNum;
            return this;
        }
        public Integer getExpectNum() {
            return this.expectNum;
        }

        public ListScalingActivityV2ResponseBodyItemsItem setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListScalingActivityV2ResponseBodyItemsItem setInstanceIds(String instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public String getInstanceIds() {
            return this.instanceIds;
        }

        public ListScalingActivityV2ResponseBodyItemsItem setHostGroupBizId(String hostGroupBizId) {
            this.hostGroupBizId = hostGroupBizId;
            return this;
        }
        public String getHostGroupBizId() {
            return this.hostGroupBizId;
        }

        public ListScalingActivityV2ResponseBodyItemsItem setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListScalingActivityV2ResponseBodyItemsItem setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListScalingActivityV2ResponseBodyItemsItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScalingActivityV2ResponseBodyItemsItem setScalingRuleName(String scalingRuleName) {
            this.scalingRuleName = scalingRuleName;
            return this;
        }
        public String getScalingRuleName() {
            return this.scalingRuleName;
        }

        public ListScalingActivityV2ResponseBodyItemsItem setScalingRuleId(String scalingRuleId) {
            this.scalingRuleId = scalingRuleId;
            return this;
        }
        public String getScalingRuleId() {
            return this.scalingRuleId;
        }

        public ListScalingActivityV2ResponseBodyItemsItem setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public ListScalingActivityV2ResponseBodyItemsItem setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        public ListScalingActivityV2ResponseBodyItemsItem setTransition(String transition) {
            this.transition = transition;
            return this;
        }
        public String getTransition() {
            return this.transition;
        }

    }

    public static class ListScalingActivityV2ResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<ListScalingActivityV2ResponseBodyItemsItem> item;

        public static ListScalingActivityV2ResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListScalingActivityV2ResponseBodyItems self = new ListScalingActivityV2ResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListScalingActivityV2ResponseBodyItems setItem(java.util.List<ListScalingActivityV2ResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ListScalingActivityV2ResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
