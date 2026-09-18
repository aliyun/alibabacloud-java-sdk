// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListQuotasResponseBody extends TeaModel {
    /**
     * <p>The token for the next page of results. This operation supports only consecutive paging. If the returned value is not empty, more data is available. To get the next page, use the returned value in your next request.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2w6Olxc+cMPjUtUMo/CvPe4IK7f7kIQFrIZjyc</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public ListQuotasResponseBodyData data;

    /**
     * <p>The token that specifies the position from which to start returning results. The results are sorted in alphabetical order.</p>
     * 
     * <strong>example:</strong>
     * <p>cHlvZHBzX3VkZl8xMDExNV8xNDU3NDI4NDkzKg==</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The maximum number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxItem")
    public Long maxItem;

    /**
     * <p>The list of quotas.</p>
     */
    @NameInMap("quotaInfoList")
    public java.util.List<ListQuotasResponseBodyQuotaInfoList> quotaInfoList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc12e6f16677875480593081d2956</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListQuotasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuotasResponseBody self = new ListQuotasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuotasResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQuotasResponseBody setData(ListQuotasResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListQuotasResponseBodyData getData() {
        return this.data;
    }

    public ListQuotasResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListQuotasResponseBody setMaxItem(Long maxItem) {
        this.maxItem = maxItem;
        return this;
    }
    public Long getMaxItem() {
        return this.maxItem;
    }

    public ListQuotasResponseBody setQuotaInfoList(java.util.List<ListQuotasResponseBodyQuotaInfoList> quotaInfoList) {
        this.quotaInfoList = quotaInfoList;
        return this;
    }
    public java.util.List<ListQuotasResponseBodyQuotaInfoList> getQuotaInfoList() {
        return this.quotaInfoList;
    }

    public ListQuotasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListQuotasResponseBodyDataQuotaInfoListTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>Department</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>a12351qHDP6YEQMt</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListQuotasResponseBodyDataQuotaInfoListTags build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyDataQuotaInfoListTags self = new ListQuotasResponseBodyDataQuotaInfoListTags();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyDataQuotaInfoListTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListQuotasResponseBodyDataQuotaInfoListTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListQuotasResponseBodyDataQuotaInfoListBillingPolicy extends TeaModel {
        /**
         * <p>The billing method.</p>
         * <ul>
         * <li><p>subscription: The subscription billing method.</p>
         * </li>
         * <li><p>payasyougo: The pay-as-you-go billing method.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>subscription</p>
         */
        @NameInMap("billingMethod")
        public String billingMethod;

        /**
         * <p>The specifications of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>OdpsStandard</p>
         */
        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>45245678</p>
         */
        @NameInMap("orderId")
        public String orderId;

        public static ListQuotasResponseBodyDataQuotaInfoListBillingPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyDataQuotaInfoListBillingPolicy self = new ListQuotasResponseBodyDataQuotaInfoListBillingPolicy();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyDataQuotaInfoListBillingPolicy setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public ListQuotasResponseBodyDataQuotaInfoListBillingPolicy setOdpsSpecCode(String odpsSpecCode) {
            this.odpsSpecCode = odpsSpecCode;
            return this;
        }
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

        public ListQuotasResponseBodyDataQuotaInfoListBillingPolicy setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class ListQuotasResponseBodyDataQuotaInfoListSaleTag extends TeaModel {
        /**
         * <p>The IDs of the resources. This ID is also used in the billing system. You can use this ID to associate the costs of a quota with a tag.</p>
         */
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

        /**
         * <p>The type of the resource. Valid values: quota and project.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;quota&quot;</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static ListQuotasResponseBodyDataQuotaInfoListSaleTag build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyDataQuotaInfoListSaleTag self = new ListQuotasResponseBodyDataQuotaInfoListSaleTag();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyDataQuotaInfoListSaleTag setResourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSaleTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListQuotasResponseBodyDataQuotaInfoListScheduleInfo extends TeaModel {
        /**
         * <p>The quota plan that is currently in effect.</p>
         * 
         * <strong>example:</strong>
         * <p>planA</p>
         */
        @NameInMap("currPlan")
        public String currPlan;

        /**
         * <p>The time when the current plan took effect.</p>
         * 
         * <strong>example:</strong>
         * <p>0800</p>
         */
        @NameInMap("currTime")
        public String currTime;

        /**
         * <p>The next quota plan that is scheduled to take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>planB</p>
         */
        @NameInMap("nextPlan")
        public String nextPlan;

        /**
         * <p>The time when the next plan is scheduled to take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1700</p>
         */
        @NameInMap("nextTime")
        public String nextTime;

        /**
         * <p>The quota plan that takes effect immediately. This parameter is returned only when a user triggers an immediate plan that is different from the current plan.</p>
         * 
         * <strong>example:</strong>
         * <p>planC</p>
         */
        @NameInMap("oncePlan")
        public String oncePlan;

        /**
         * <p>The time when the immediate plan was triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("onceTime")
        public String onceTime;

        /**
         * <p>The name of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>userA</p>
         */
        @NameInMap("operatorName")
        public String operatorName;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>UTC+8</p>
         */
        @NameInMap("timezone")
        public String timezone;

        public static ListQuotasResponseBodyDataQuotaInfoListScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyDataQuotaInfoListScheduleInfo self = new ListQuotasResponseBodyDataQuotaInfoListScheduleInfo();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyDataQuotaInfoListScheduleInfo setCurrPlan(String currPlan) {
            this.currPlan = currPlan;
            return this;
        }
        public String getCurrPlan() {
            return this.currPlan;
        }

        public ListQuotasResponseBodyDataQuotaInfoListScheduleInfo setCurrTime(String currTime) {
            this.currTime = currTime;
            return this;
        }
        public String getCurrTime() {
            return this.currTime;
        }

        public ListQuotasResponseBodyDataQuotaInfoListScheduleInfo setNextPlan(String nextPlan) {
            this.nextPlan = nextPlan;
            return this;
        }
        public String getNextPlan() {
            return this.nextPlan;
        }

        public ListQuotasResponseBodyDataQuotaInfoListScheduleInfo setNextTime(String nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public String getNextTime() {
            return this.nextTime;
        }

        public ListQuotasResponseBodyDataQuotaInfoListScheduleInfo setOncePlan(String oncePlan) {
            this.oncePlan = oncePlan;
            return this;
        }
        public String getOncePlan() {
            return this.oncePlan;
        }

        public ListQuotasResponseBodyDataQuotaInfoListScheduleInfo setOnceTime(String onceTime) {
            this.onceTime = onceTime;
            return this;
        }
        public String getOnceTime() {
            return this.onceTime;
        }

        public ListQuotasResponseBodyDataQuotaInfoListScheduleInfo setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public ListQuotasResponseBodyDataQuotaInfoListScheduleInfo setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListBillingPolicy extends TeaModel {
        /**
         * <p>The billing method.</p>
         * <ul>
         * <li><p>subscription: The subscription billing method.</p>
         * </li>
         * <li><p>payasyougo: The pay-as-you-go billing method.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>subscription</p>
         */
        @NameInMap("billingMethod")
        public String billingMethod;

        /**
         * <p>The specifications of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>OdpsStandard</p>
         */
        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>45245678</p>
         */
        @NameInMap("orderId")
        public String orderId;

        public static ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListBillingPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListBillingPolicy self = new ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListBillingPolicy();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListBillingPolicy setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListBillingPolicy setOdpsSpecCode(String odpsSpecCode) {
            this.odpsSpecCode = odpsSpecCode;
            return this;
        }
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListBillingPolicy setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter extends TeaModel {
        @NameInMap("adhocSlot")
        public Long adhocSlot;

        @NameInMap("autoScaleCPULimit")
        public Long autoScaleCPULimit;

        /**
         * <p>The value of elastically reserved CUs.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("elasticReservedCU")
        public Long elasticReservedCU;

        /**
         * <p>Specifies whether to enable priority-based scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enablePriority")
        public Boolean enablePriority;

        /**
         * <p>Specifies whether the resource is exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("forceReservedMin")
        public Boolean forceReservedMin;

        /**
         * <p>The upper limit of reserved CUs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("maxCU")
        public Long maxCU;

        @NameInMap("maxGu")
        public Long maxGu;

        /**
         * <p>The minimum number of guaranteed reserved CUs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("minCU")
        public Long minCU;

        @NameInMap("minGu")
        public Long minGu;

        /**
         * <p>The scheduling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Fifo/Fair</p>
         */
        @NameInMap("schedulerType")
        public String schedulerType;

        /**
         * <p>The upper limit of CUs for a single job.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("singleJobCULimit")
        public Long singleJobCULimit;

        @NameInMap("slotNum")
        public Long slotNum;

        public static ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter self = new ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter setAdhocSlot(Long adhocSlot) {
            this.adhocSlot = adhocSlot;
            return this;
        }
        public Long getAdhocSlot() {
            return this.adhocSlot;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter setAutoScaleCPULimit(Long autoScaleCPULimit) {
            this.autoScaleCPULimit = autoScaleCPULimit;
            return this;
        }
        public Long getAutoScaleCPULimit() {
            return this.autoScaleCPULimit;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter setElasticReservedCU(Long elasticReservedCU) {
            this.elasticReservedCU = elasticReservedCU;
            return this;
        }
        public Long getElasticReservedCU() {
            return this.elasticReservedCU;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter setEnablePriority(Boolean enablePriority) {
            this.enablePriority = enablePriority;
            return this;
        }
        public Boolean getEnablePriority() {
            return this.enablePriority;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter setForceReservedMin(Boolean forceReservedMin) {
            this.forceReservedMin = forceReservedMin;
            return this;
        }
        public Boolean getForceReservedMin() {
            return this.forceReservedMin;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter setMaxCU(Long maxCU) {
            this.maxCU = maxCU;
            return this;
        }
        public Long getMaxCU() {
            return this.maxCU;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter setMaxGu(Long maxGu) {
            this.maxGu = maxGu;
            return this;
        }
        public Long getMaxGu() {
            return this.maxGu;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter setMinCU(Long minCU) {
            this.minCU = minCU;
            return this;
        }
        public Long getMinCU() {
            return this.minCU;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter setMinGu(Long minGu) {
            this.minGu = minGu;
            return this;
        }
        public Long getMinGu() {
            return this.minGu;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter setSingleJobCULimit(Long singleJobCULimit) {
            this.singleJobCULimit = singleJobCULimit;
            return this;
        }
        public Long getSingleJobCULimit() {
            return this.singleJobCULimit;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter setSlotNum(Long slotNum) {
            this.slotNum = slotNum;
            return this;
        }
        public Long getSlotNum() {
            return this.slotNum;
        }

    }

    public static class ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListSaleTag extends TeaModel {
        /**
         * <p>The identifier of the MaxCompute quota object. This identifier also exists in the Alibaba Cloud sales subsystem. It associates the costs of the quota object with a tag.</p>
         */
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

        /**
         * <p>The type of the object. Only \<code>quota\\</code> and \<code>project\\</code> are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;quota&quot;</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListSaleTag build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListSaleTag self = new ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListSaleTag();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListSaleTag setResourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListSaleTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListScheduleInfo extends TeaModel {
        /**
         * <p>The quota plan that is currently in effect.</p>
         * 
         * <strong>example:</strong>
         * <p>planA</p>
         */
        @NameInMap("currPlan")
        public String currPlan;

        /**
         * <p>The time when the current plan took effect.</p>
         * 
         * <strong>example:</strong>
         * <p>0800</p>
         */
        @NameInMap("currTime")
        public String currTime;

        /**
         * <p>The next quota plan that is scheduled to take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>planB</p>
         */
        @NameInMap("nextPlan")
        public String nextPlan;

        /**
         * <p>The time when the next plan is scheduled to take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1700</p>
         */
        @NameInMap("nextTime")
        public String nextTime;

        /**
         * <p>The quota plan that takes effect immediately. This parameter is returned only if a user triggers an immediate plan that is different from <code>currPlan</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>planC</p>
         */
        @NameInMap("oncePlan")
        public String oncePlan;

        /**
         * <p>The time when the immediate-effect plan was triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("onceTime")
        public String onceTime;

        /**
         * <p>The name of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>userA</p>
         */
        @NameInMap("operatorName")
        public String operatorName;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>UTC+8</p>
         */
        @NameInMap("timezone")
        public String timezone;

        public static ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListScheduleInfo self = new ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListScheduleInfo();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListScheduleInfo setCurrPlan(String currPlan) {
            this.currPlan = currPlan;
            return this;
        }
        public String getCurrPlan() {
            return this.currPlan;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListScheduleInfo setCurrTime(String currTime) {
            this.currTime = currTime;
            return this;
        }
        public String getCurrTime() {
            return this.currTime;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListScheduleInfo setNextPlan(String nextPlan) {
            this.nextPlan = nextPlan;
            return this;
        }
        public String getNextPlan() {
            return this.nextPlan;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListScheduleInfo setNextTime(String nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public String getNextTime() {
            return this.nextTime;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListScheduleInfo setOncePlan(String oncePlan) {
            this.oncePlan = oncePlan;
            return this;
        }
        public String getOncePlan() {
            return this.oncePlan;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListScheduleInfo setOnceTime(String onceTime) {
            this.onceTime = onceTime;
            return this;
        }
        public String getOnceTime() {
            return this.onceTime;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListScheduleInfo setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListScheduleInfo setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList extends TeaModel {
        /**
         * <p>The billing information.</p>
         */
        @NameInMap("billingPolicy")
        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListBillingPolicy billingPolicy;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>AT-120N</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>The time when the resource was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-06T02:14:44Z</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The creator of the resource. This is the UID of an Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>672863518</p>
         */
        @NameInMap("creatorId")
        public String creatorId;

        /**
         * <p>The ID of the sub-quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1000048</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the sub-quota.</p>
         * 
         * <strong>example:</strong>
         * <p>subquotaA</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The alias of the sub-quota.</p>
         * 
         * <strong>example:</strong>
         * <p>subquotaA</p>
         */
        @NameInMap("nickName")
        public String nickName;

        /**
         * <p>The description of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;minCU&quot;:10,	
         * &quot;adhocCU&quot;:0,
         * &quot;maxCU&quot;:10,
         * &quot;schedulerType&quot;:&quot;Fair&quot;,
         * }</p>
         */
        @NameInMap("parameter")
        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter parameter;

        /**
         * <p>The ID of the parent resource.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("parentId")
        public String parentId;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The identifier of the MaxCompute quota object. This identifier is the same as the one in the Alibaba Cloud bill and is used in tagging scenarios.</p>
         */
        @NameInMap("saleTag")
        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListSaleTag saleTag;

        /**
         * <p>The time-based scheduling information.</p>
         */
        @NameInMap("scheduleInfo")
        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListScheduleInfo scheduleInfo;

        /**
         * <p>The status of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The resource tag of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>280747109771520</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>The type of the resource system. This parameter corresponds to the resourceSystemType parameter of the control cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>FUXI_ONLINE</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public String version;

        public static ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList self = new ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setBillingPolicy(ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListBillingPolicy billingPolicy) {
            this.billingPolicy = billingPolicy;
            return this;
        }
        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListBillingPolicy getBillingPolicy() {
            return this.billingPolicy;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setParameter(ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListParameter getParameter() {
            return this.parameter;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setSaleTag(ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListSaleTag saleTag) {
            this.saleTag = saleTag;
            return this;
        }
        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListSaleTag getSaleTag() {
            return this.saleTag;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setScheduleInfo(ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListQuotasResponseBodyDataQuotaInfoList extends TeaModel {
        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListQuotasResponseBodyDataQuotaInfoListTags> tags;

        /**
         * <p>The billing information.</p>
         */
        @NameInMap("billingPolicy")
        public ListQuotasResponseBodyDataQuotaInfoListBillingPolicy billingPolicy;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>AT-120N</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>The time when the quota was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-06T02:14:44Z</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The ID of the account that created the quota. This ID is an Alibaba Cloud account UID.</p>
         * 
         * <strong>example:</strong>
         * <p>672863518</p>
         */
        @NameInMap("creatorId")
        public String creatorId;

        /**
         * <p>The ID of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>quota_a</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The alias of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>quota_nickname</p>
         */
        @NameInMap("nickName")
        public String nickName;

        /**
         * <p>The quota description.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;minCU&quot;:10,	
         * &quot;adhocCU&quot;:0,
         * &quot;maxCU&quot;:10,
         * &quot;schedulerType&quot;:&quot;Fair&quot;,
         * }</p>
         */
        @NameInMap("parameter")
        public java.util.Map<String, ?> parameter;

        /**
         * <p>The ID of the parent resource.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("parentId")
        public String parentId;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The sales tag of the quota. This tag is the same as the billing identifier and is used for cost allocation.</p>
         */
        @NameInMap("saleTag")
        public ListQuotasResponseBodyDataQuotaInfoListSaleTag saleTag;

        /**
         * <p>The time-based scheduling information.</p>
         */
        @NameInMap("scheduleInfo")
        public ListQuotasResponseBodyDataQuotaInfoListScheduleInfo scheduleInfo;

        /**
         * <p>The status of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The information about the sub-quotas.</p>
         */
        @NameInMap("subQuotaInfoList")
        public java.util.List<ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList> subQuotaInfoList;

        /**
         * <p>The tag of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>280747109771520</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>The type of the resource system. This parameter corresponds to the resourceSystemType parameter of the control cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>FUXI_ONLINE</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public String version;

        public static ListQuotasResponseBodyDataQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyDataQuotaInfoList self = new ListQuotasResponseBodyDataQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyDataQuotaInfoList setTags(java.util.List<ListQuotasResponseBodyDataQuotaInfoListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListQuotasResponseBodyDataQuotaInfoListTags> getTags() {
            return this.tags;
        }

        public ListQuotasResponseBodyDataQuotaInfoList setBillingPolicy(ListQuotasResponseBodyDataQuotaInfoListBillingPolicy billingPolicy) {
            this.billingPolicy = billingPolicy;
            return this;
        }
        public ListQuotasResponseBodyDataQuotaInfoListBillingPolicy getBillingPolicy() {
            return this.billingPolicy;
        }

        public ListQuotasResponseBodyDataQuotaInfoList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListQuotasResponseBodyDataQuotaInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListQuotasResponseBodyDataQuotaInfoList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListQuotasResponseBodyDataQuotaInfoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListQuotasResponseBodyDataQuotaInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQuotasResponseBodyDataQuotaInfoList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListQuotasResponseBodyDataQuotaInfoList setParameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.Map<String, ?> getParameter() {
            return this.parameter;
        }

        public ListQuotasResponseBodyDataQuotaInfoList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListQuotasResponseBodyDataQuotaInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListQuotasResponseBodyDataQuotaInfoList setSaleTag(ListQuotasResponseBodyDataQuotaInfoListSaleTag saleTag) {
            this.saleTag = saleTag;
            return this;
        }
        public ListQuotasResponseBodyDataQuotaInfoListSaleTag getSaleTag() {
            return this.saleTag;
        }

        public ListQuotasResponseBodyDataQuotaInfoList setScheduleInfo(ListQuotasResponseBodyDataQuotaInfoListScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public ListQuotasResponseBodyDataQuotaInfoListScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public ListQuotasResponseBodyDataQuotaInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListQuotasResponseBodyDataQuotaInfoList setSubQuotaInfoList(java.util.List<ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList> subQuotaInfoList) {
            this.subQuotaInfoList = subQuotaInfoList;
            return this;
        }
        public java.util.List<ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList> getSubQuotaInfoList() {
            return this.subQuotaInfoList;
        }

        public ListQuotasResponseBodyDataQuotaInfoList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListQuotasResponseBodyDataQuotaInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListQuotasResponseBodyDataQuotaInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListQuotasResponseBodyDataQuotaInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListQuotasResponseBodyData extends TeaModel {
        /**
         * <p>The token for the next page of results. If this parameter has a value, more results are available. To get the next page, include this value in the \<code>NextToken\\</code> parameter of the next request.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;abcde&quot;</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The results are returned in alphabetical order, starting from the entry after the marker.</p>
         * 
         * <strong>example:</strong>
         * <p>cHlvZHBzX3VkZl8xMDExNV8xNDU3NDI4NDkzKg==</p>
         */
        @NameInMap("marker")
        public String marker;

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxItem")
        public Long maxItem;

        /**
         * <p>The list of quotas.</p>
         */
        @NameInMap("quotaInfoList")
        public java.util.List<ListQuotasResponseBodyDataQuotaInfoList> quotaInfoList;

        public static ListQuotasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyData self = new ListQuotasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListQuotasResponseBodyData setMarker(String marker) {
            this.marker = marker;
            return this;
        }
        public String getMarker() {
            return this.marker;
        }

        public ListQuotasResponseBodyData setMaxItem(Long maxItem) {
            this.maxItem = maxItem;
            return this;
        }
        public Long getMaxItem() {
            return this.maxItem;
        }

        public ListQuotasResponseBodyData setQuotaInfoList(java.util.List<ListQuotasResponseBodyDataQuotaInfoList> quotaInfoList) {
            this.quotaInfoList = quotaInfoList;
            return this;
        }
        public java.util.List<ListQuotasResponseBodyDataQuotaInfoList> getQuotaInfoList() {
            return this.quotaInfoList;
        }

    }

    public static class ListQuotasResponseBodyQuotaInfoListTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Department</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListQuotasResponseBodyQuotaInfoListTags build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyQuotaInfoListTags self = new ListQuotasResponseBodyQuotaInfoListTags();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyQuotaInfoListTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListQuotasResponseBodyQuotaInfoListTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListQuotasResponseBodyQuotaInfoListBillingPolicy extends TeaModel {
        /**
         * <p>The billing method.</p>
         * <ul>
         * <li><p>subscription: The subscription billing method.</p>
         * </li>
         * <li><p>payasyougo: The pay-as-you-go billing method.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>subscription</p>
         */
        @NameInMap("billingMethod")
        public String billingMethod;

        /**
         * <p>The specifications of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>OdpsStandard</p>
         */
        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>45245678</p>
         */
        @NameInMap("orderId")
        public String orderId;

        public static ListQuotasResponseBodyQuotaInfoListBillingPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyQuotaInfoListBillingPolicy self = new ListQuotasResponseBodyQuotaInfoListBillingPolicy();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyQuotaInfoListBillingPolicy setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public ListQuotasResponseBodyQuotaInfoListBillingPolicy setOdpsSpecCode(String odpsSpecCode) {
            this.odpsSpecCode = odpsSpecCode;
            return this;
        }
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

        public ListQuotasResponseBodyQuotaInfoListBillingPolicy setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class ListQuotasResponseBodyQuotaInfoListSaleTag extends TeaModel {
        /**
         * <p>The IDs of the resources. This ID is also used in the billing system. You can use this ID to associate the costs of a quota with a tag.</p>
         */
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

        /**
         * <p>The type of the resource. Valid values: quota and project.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;project&quot;</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static ListQuotasResponseBodyQuotaInfoListSaleTag build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyQuotaInfoListSaleTag self = new ListQuotasResponseBodyQuotaInfoListSaleTag();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyQuotaInfoListSaleTag setResourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        public ListQuotasResponseBodyQuotaInfoListSaleTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListQuotasResponseBodyQuotaInfoListScheduleInfo extends TeaModel {
        /**
         * <p>The quota plan that is currently in effect.</p>
         * 
         * <strong>example:</strong>
         * <p>planA</p>
         */
        @NameInMap("currPlan")
        public String currPlan;

        /**
         * <p>The time when the current plan took effect.</p>
         * 
         * <strong>example:</strong>
         * <p>0800</p>
         */
        @NameInMap("currTime")
        public String currTime;

        /**
         * <p>The next quota plan that is scheduled to take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>planB</p>
         */
        @NameInMap("nextPlan")
        public String nextPlan;

        /**
         * <p>The time when the next plan is scheduled to take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1700</p>
         */
        @NameInMap("nextTime")
        public String nextTime;

        /**
         * <p>The quota plan that takes effect immediately. This parameter is returned only when a user triggers an immediate plan that is different from the current plan.</p>
         * 
         * <strong>example:</strong>
         * <p>planC</p>
         */
        @NameInMap("oncePlan")
        public String oncePlan;

        /**
         * <p>The time when the immediate plan was triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("onceTime")
        public String onceTime;

        /**
         * <p>The name of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>userA</p>
         */
        @NameInMap("operatorName")
        public String operatorName;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>UTC+8</p>
         */
        @NameInMap("timezone")
        public String timezone;

        public static ListQuotasResponseBodyQuotaInfoListScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyQuotaInfoListScheduleInfo self = new ListQuotasResponseBodyQuotaInfoListScheduleInfo();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyQuotaInfoListScheduleInfo setCurrPlan(String currPlan) {
            this.currPlan = currPlan;
            return this;
        }
        public String getCurrPlan() {
            return this.currPlan;
        }

        public ListQuotasResponseBodyQuotaInfoListScheduleInfo setCurrTime(String currTime) {
            this.currTime = currTime;
            return this;
        }
        public String getCurrTime() {
            return this.currTime;
        }

        public ListQuotasResponseBodyQuotaInfoListScheduleInfo setNextPlan(String nextPlan) {
            this.nextPlan = nextPlan;
            return this;
        }
        public String getNextPlan() {
            return this.nextPlan;
        }

        public ListQuotasResponseBodyQuotaInfoListScheduleInfo setNextTime(String nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public String getNextTime() {
            return this.nextTime;
        }

        public ListQuotasResponseBodyQuotaInfoListScheduleInfo setOncePlan(String oncePlan) {
            this.oncePlan = oncePlan;
            return this;
        }
        public String getOncePlan() {
            return this.oncePlan;
        }

        public ListQuotasResponseBodyQuotaInfoListScheduleInfo setOnceTime(String onceTime) {
            this.onceTime = onceTime;
            return this;
        }
        public String getOnceTime() {
            return this.onceTime;
        }

        public ListQuotasResponseBodyQuotaInfoListScheduleInfo setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public ListQuotasResponseBodyQuotaInfoListScheduleInfo setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy extends TeaModel {
        /**
         * <p>The billing method.</p>
         * <ul>
         * <li><p>subscription: The subscription billing method.</p>
         * </li>
         * <li><p>payasyougo: The pay-as-you-go billing method.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>subscription</p>
         */
        @NameInMap("billingMethod")
        public String billingMethod;

        /**
         * <p>The specifications of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>OdpsStandard</p>
         */
        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>45245678</p>
         */
        @NameInMap("orderId")
        public String orderId;

        public static ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy self = new ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy setOdpsSpecCode(String odpsSpecCode) {
            this.odpsSpecCode = odpsSpecCode;
            return this;
        }
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter extends TeaModel {
        @NameInMap("adhocSlot")
        public Long adhocSlot;

        @NameInMap("autoScaleCPULimit")
        public Long autoScaleCPULimit;

        /**
         * <p>The elastically reserved CUs.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("elasticReservedCU")
        public Long elasticReservedCU;

        /**
         * <p>Indicates whether to enable priority-based scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enablePriority")
        public Boolean enablePriority;

        /**
         * <p>Indicates whether the resource is exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("forceReservedMin")
        public Boolean forceReservedMin;

        /**
         * <p>The maximum reserved computing units (CUs).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("maxCU")
        public Long maxCU;

        @NameInMap("maxGu")
        public Long maxGu;

        /**
         * <p>The minimum reserved CUs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("minCU")
        public Long minCU;

        @NameInMap("minGu")
        public Long minGu;

        /**
         * <p>The scheduling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Fifo/Fair</p>
         */
        @NameInMap("schedulerType")
        public String schedulerType;

        /**
         * <p>The maximum CUs for a single job.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("singleJobCULimit")
        public Long singleJobCULimit;

        @NameInMap("slotNum")
        public Long slotNum;

        public static ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter self = new ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter setAdhocSlot(Long adhocSlot) {
            this.adhocSlot = adhocSlot;
            return this;
        }
        public Long getAdhocSlot() {
            return this.adhocSlot;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter setAutoScaleCPULimit(Long autoScaleCPULimit) {
            this.autoScaleCPULimit = autoScaleCPULimit;
            return this;
        }
        public Long getAutoScaleCPULimit() {
            return this.autoScaleCPULimit;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter setElasticReservedCU(Long elasticReservedCU) {
            this.elasticReservedCU = elasticReservedCU;
            return this;
        }
        public Long getElasticReservedCU() {
            return this.elasticReservedCU;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter setEnablePriority(Boolean enablePriority) {
            this.enablePriority = enablePriority;
            return this;
        }
        public Boolean getEnablePriority() {
            return this.enablePriority;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter setForceReservedMin(Boolean forceReservedMin) {
            this.forceReservedMin = forceReservedMin;
            return this;
        }
        public Boolean getForceReservedMin() {
            return this.forceReservedMin;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter setMaxCU(Long maxCU) {
            this.maxCU = maxCU;
            return this;
        }
        public Long getMaxCU() {
            return this.maxCU;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter setMaxGu(Long maxGu) {
            this.maxGu = maxGu;
            return this;
        }
        public Long getMaxGu() {
            return this.maxGu;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter setMinCU(Long minCU) {
            this.minCU = minCU;
            return this;
        }
        public Long getMinCU() {
            return this.minCU;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter setMinGu(Long minGu) {
            this.minGu = minGu;
            return this;
        }
        public Long getMinGu() {
            return this.minGu;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter setSingleJobCULimit(Long singleJobCULimit) {
            this.singleJobCULimit = singleJobCULimit;
            return this;
        }
        public Long getSingleJobCULimit() {
            return this.singleJobCULimit;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter setSlotNum(Long slotNum) {
            this.slotNum = slotNum;
            return this;
        }
        public Long getSlotNum() {
            return this.slotNum;
        }

    }

    public static class ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListSaleTag extends TeaModel {
        /**
         * <p>The IDs of the resources. This ID is also used in the billing system. You can use this ID to associate the costs of a quota with a tag.</p>
         */
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

        /**
         * <p>The type of the resource. Valid values: quota and project.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;quota&quot;</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListSaleTag build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListSaleTag self = new ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListSaleTag();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListSaleTag setResourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListSaleTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListScheduleInfo extends TeaModel {
        /**
         * <p>The quota plan that is currently in effect.</p>
         * 
         * <strong>example:</strong>
         * <p>planA</p>
         */
        @NameInMap("currPlan")
        public String currPlan;

        /**
         * <p>The time when the current plan took effect.</p>
         * 
         * <strong>example:</strong>
         * <p>0800</p>
         */
        @NameInMap("currTime")
        public String currTime;

        /**
         * <p>The next quota plan that is scheduled to take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>planB</p>
         */
        @NameInMap("nextPlan")
        public String nextPlan;

        /**
         * <p>The time when the next plan is scheduled to take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1700</p>
         */
        @NameInMap("nextTime")
        public String nextTime;

        /**
         * <p>The quota plan that takes effect immediately. This parameter is returned only when a user triggers an immediate plan that is different from the current plan.</p>
         * 
         * <strong>example:</strong>
         * <p>planC</p>
         */
        @NameInMap("oncePlan")
        public String oncePlan;

        /**
         * <p>The time when the immediate plan was triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("onceTime")
        public String onceTime;

        /**
         * <p>The name of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>userA</p>
         */
        @NameInMap("operatorName")
        public String operatorName;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>UTC+8</p>
         */
        @NameInMap("timezone")
        public String timezone;

        public static ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListScheduleInfo self = new ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListScheduleInfo();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListScheduleInfo setCurrPlan(String currPlan) {
            this.currPlan = currPlan;
            return this;
        }
        public String getCurrPlan() {
            return this.currPlan;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListScheduleInfo setCurrTime(String currTime) {
            this.currTime = currTime;
            return this;
        }
        public String getCurrTime() {
            return this.currTime;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListScheduleInfo setNextPlan(String nextPlan) {
            this.nextPlan = nextPlan;
            return this;
        }
        public String getNextPlan() {
            return this.nextPlan;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListScheduleInfo setNextTime(String nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public String getNextTime() {
            return this.nextTime;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListScheduleInfo setOncePlan(String oncePlan) {
            this.oncePlan = oncePlan;
            return this;
        }
        public String getOncePlan() {
            return this.oncePlan;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListScheduleInfo setOnceTime(String onceTime) {
            this.onceTime = onceTime;
            return this;
        }
        public String getOnceTime() {
            return this.onceTime;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListScheduleInfo setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListScheduleInfo setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList extends TeaModel {
        /**
         * <p>The billing information.</p>
         */
        @NameInMap("billingPolicy")
        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy billingPolicy;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>AT-120N</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>The time when the quota was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-06T02:14:44Z</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The ID of the account that created the quota. This ID is an Alibaba Cloud account UID.</p>
         * 
         * <strong>example:</strong>
         * <p>672863518</p>
         */
        @NameInMap("creatorId")
        public String creatorId;

        /**
         * <p>The ID of the sub-quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1000048</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the sub-quota.</p>
         * 
         * <strong>example:</strong>
         * <p>subquotaA</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The alias of the sub-quota.</p>
         * 
         * <strong>example:</strong>
         * <p>subquotaA</p>
         */
        @NameInMap("nickName")
        public String nickName;

        /**
         * <p>The quota description.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;minCU&quot;:10,	
         * &quot;adhocCU&quot;:0,
         * &quot;maxCU&quot;:10,
         * &quot;schedulerType&quot;:&quot;Fair&quot;,
         * }</p>
         */
        @NameInMap("parameter")
        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter parameter;

        /**
         * <p>The ID of the parent resource.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("parentId")
        public String parentId;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The sales tag of the quota. This tag is the same as the billing identifier and is used for cost allocation.</p>
         */
        @NameInMap("saleTag")
        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListSaleTag saleTag;

        /**
         * <p>The time-based scheduling information.</p>
         */
        @NameInMap("scheduleInfo")
        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListScheduleInfo scheduleInfo;

        /**
         * <p>The status of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The tag of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>280747109771520</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>The type of the resource system. This parameter corresponds to the resourceSystemType parameter of the control cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>FUXI_ONLINE</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public String version;

        public static ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList self = new ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setBillingPolicy(ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy billingPolicy) {
            this.billingPolicy = billingPolicy;
            return this;
        }
        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy getBillingPolicy() {
            return this.billingPolicy;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setParameter(ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListParameter getParameter() {
            return this.parameter;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setSaleTag(ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListSaleTag saleTag) {
            this.saleTag = saleTag;
            return this;
        }
        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListSaleTag getSaleTag() {
            return this.saleTag;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setScheduleInfo(ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListQuotasResponseBodyQuotaInfoList extends TeaModel {
        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListQuotasResponseBodyQuotaInfoListTags> tags;

        /**
         * <p>The billing information.</p>
         */
        @NameInMap("billingPolicy")
        public ListQuotasResponseBodyQuotaInfoListBillingPolicy billingPolicy;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>AT-120N</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>The time when the quota was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-06T02:14:44Z</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The ID of the account that created the quota. This ID is an Alibaba Cloud account UID.</p>
         * 
         * <strong>example:</strong>
         * <p>672863518</p>
         */
        @NameInMap("creatorId")
        public String creatorId;

        /**
         * <p>The ID of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>quota_a</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The alias of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>quota_nickname</p>
         */
        @NameInMap("nickName")
        public String nickName;

        /**
         * <p>The parameters of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;minCU&quot;:10,	
         * &quot;adhocCU&quot;:0,
         * &quot;maxCU&quot;:10,
         * &quot;schedulerType&quot;:&quot;Fair&quot;,
         * }</p>
         */
        @NameInMap("parameter")
        public java.util.Map<String, ?> parameter;

        /**
         * <p>The ID of the parent resource.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("parentId")
        public String parentId;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The sales tag of the quota. This tag is the same as the billing identifier and is used for cost allocation.</p>
         */
        @NameInMap("saleTag")
        public ListQuotasResponseBodyQuotaInfoListSaleTag saleTag;

        /**
         * <p>The time-based scheduling information.</p>
         */
        @NameInMap("scheduleInfo")
        public ListQuotasResponseBodyQuotaInfoListScheduleInfo scheduleInfo;

        /**
         * <p>The status of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The information about the sub-quotas.</p>
         */
        @NameInMap("subQuotaInfoList")
        public java.util.List<ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList> subQuotaInfoList;

        /**
         * <p>The tag of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>280747109771520</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>The type of the resource system. This parameter corresponds to the resourceSystemType parameter of the control cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>FUXI_ONLINE</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public String version;

        public static ListQuotasResponseBodyQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyQuotaInfoList self = new ListQuotasResponseBodyQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyQuotaInfoList setTags(java.util.List<ListQuotasResponseBodyQuotaInfoListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListQuotasResponseBodyQuotaInfoListTags> getTags() {
            return this.tags;
        }

        public ListQuotasResponseBodyQuotaInfoList setBillingPolicy(ListQuotasResponseBodyQuotaInfoListBillingPolicy billingPolicy) {
            this.billingPolicy = billingPolicy;
            return this;
        }
        public ListQuotasResponseBodyQuotaInfoListBillingPolicy getBillingPolicy() {
            return this.billingPolicy;
        }

        public ListQuotasResponseBodyQuotaInfoList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListQuotasResponseBodyQuotaInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListQuotasResponseBodyQuotaInfoList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListQuotasResponseBodyQuotaInfoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListQuotasResponseBodyQuotaInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQuotasResponseBodyQuotaInfoList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListQuotasResponseBodyQuotaInfoList setParameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.Map<String, ?> getParameter() {
            return this.parameter;
        }

        public ListQuotasResponseBodyQuotaInfoList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListQuotasResponseBodyQuotaInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListQuotasResponseBodyQuotaInfoList setSaleTag(ListQuotasResponseBodyQuotaInfoListSaleTag saleTag) {
            this.saleTag = saleTag;
            return this;
        }
        public ListQuotasResponseBodyQuotaInfoListSaleTag getSaleTag() {
            return this.saleTag;
        }

        public ListQuotasResponseBodyQuotaInfoList setScheduleInfo(ListQuotasResponseBodyQuotaInfoListScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public ListQuotasResponseBodyQuotaInfoListScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public ListQuotasResponseBodyQuotaInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListQuotasResponseBodyQuotaInfoList setSubQuotaInfoList(java.util.List<ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList> subQuotaInfoList) {
            this.subQuotaInfoList = subQuotaInfoList;
            return this;
        }
        public java.util.List<ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList> getSubQuotaInfoList() {
            return this.subQuotaInfoList;
        }

        public ListQuotasResponseBodyQuotaInfoList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListQuotasResponseBodyQuotaInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListQuotasResponseBodyQuotaInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListQuotasResponseBodyQuotaInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
