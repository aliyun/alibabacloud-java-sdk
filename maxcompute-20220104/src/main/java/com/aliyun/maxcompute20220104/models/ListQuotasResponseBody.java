// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListQuotasResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("data")
    public ListQuotasResponseBodyData data;

    @NameInMap("marker")
    public String marker;

    @NameInMap("maxItem")
    public Long maxItem;

    @NameInMap("quotaInfoList")
    public java.util.List<ListQuotasResponseBodyQuotaInfoList> quotaInfoList;

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
        @NameInMap("TagKey")
        public String tagKey;

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
        @NameInMap("billingMethod")
        public String billingMethod;

        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

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
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

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
        @NameInMap("currPlan")
        public String currPlan;

        @NameInMap("currTime")
        public String currTime;

        @NameInMap("nextPlan")
        public String nextPlan;

        @NameInMap("nextTime")
        public String nextTime;

        @NameInMap("oncePlan")
        public String oncePlan;

        @NameInMap("onceTime")
        public String onceTime;

        @NameInMap("operatorName")
        public String operatorName;

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

    }

    public static class ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListBillingPolicy extends TeaModel {
        @NameInMap("billingMethod")
        public String billingMethod;

        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

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

    public static class ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListSaleTag extends TeaModel {
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

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
        @NameInMap("currPlan")
        public String currPlan;

        @NameInMap("currTime")
        public String currTime;

        @NameInMap("nextPlan")
        public String nextPlan;

        @NameInMap("nextTime")
        public String nextTime;

        @NameInMap("oncePlan")
        public String oncePlan;

        @NameInMap("onceTime")
        public String onceTime;

        @NameInMap("operatorName")
        public String operatorName;

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

    }

    public static class ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList extends TeaModel {
        @NameInMap("billingPolicy")
        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListBillingPolicy billingPolicy;

        @NameInMap("cluster")
        public String cluster;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("creatorId")
        public String creatorId;

        @NameInMap("groupName")
        public String groupName;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("nickName")
        public String nickName;

        @NameInMap("parameter")
        public java.util.Map<String, ?> parameter;

        @NameInMap("parentId")
        public String parentId;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("saleTag")
        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListSaleTag saleTag;

        @NameInMap("scheduleInfo")
        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoListScheduleInfo scheduleInfo;

        @NameInMap("status")
        public String status;

        @NameInMap("tag")
        public String tag;

        @NameInMap("tenantId")
        public String tenantId;

        @NameInMap("type")
        public String type;

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

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
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

        public ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList setParameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.Map<String, ?> getParameter() {
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
        @NameInMap("Tags")
        public java.util.List<ListQuotasResponseBodyDataQuotaInfoListTags> tags;

        @NameInMap("billingPolicy")
        public ListQuotasResponseBodyDataQuotaInfoListBillingPolicy billingPolicy;

        @NameInMap("cluster")
        public String cluster;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("creatorId")
        public String creatorId;

        @NameInMap("groupName")
        public String groupName;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("nickName")
        public String nickName;

        @NameInMap("parameter")
        public java.util.Map<String, ?> parameter;

        @NameInMap("parentId")
        public String parentId;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("saleTag")
        public ListQuotasResponseBodyDataQuotaInfoListSaleTag saleTag;

        @NameInMap("scheduleInfo")
        public ListQuotasResponseBodyDataQuotaInfoListScheduleInfo scheduleInfo;

        @NameInMap("status")
        public String status;

        @NameInMap("subQuotaInfoList")
        public java.util.List<ListQuotasResponseBodyDataQuotaInfoListSubQuotaInfoList> subQuotaInfoList;

        @NameInMap("tag")
        public String tag;

        @NameInMap("tenantId")
        public String tenantId;

        @NameInMap("type")
        public String type;

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

        public ListQuotasResponseBodyDataQuotaInfoList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
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
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("marker")
        public String marker;

        @NameInMap("maxItem")
        public Long maxItem;

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
        @NameInMap("TagKey")
        public String tagKey;

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
        @NameInMap("billingMethod")
        public String billingMethod;

        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

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
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

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
        @NameInMap("currPlan")
        public String currPlan;

        @NameInMap("currTime")
        public String currTime;

        @NameInMap("nextPlan")
        public String nextPlan;

        @NameInMap("nextTime")
        public String nextTime;

        @NameInMap("oncePlan")
        public String oncePlan;

        @NameInMap("onceTime")
        public String onceTime;

        @NameInMap("operatorName")
        public String operatorName;

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

    }

    public static class ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy extends TeaModel {
        @NameInMap("billingMethod")
        public String billingMethod;

        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

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

    public static class ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListSaleTag extends TeaModel {
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

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
        @NameInMap("currPlan")
        public String currPlan;

        @NameInMap("currTime")
        public String currTime;

        @NameInMap("nextPlan")
        public String nextPlan;

        @NameInMap("nextTime")
        public String nextTime;

        @NameInMap("oncePlan")
        public String oncePlan;

        @NameInMap("onceTime")
        public String onceTime;

        @NameInMap("operatorName")
        public String operatorName;

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

    }

    public static class ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList extends TeaModel {
        @NameInMap("billingPolicy")
        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy billingPolicy;

        @NameInMap("cluster")
        public String cluster;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("creatorId")
        public String creatorId;

        @NameInMap("groupName")
        public String groupName;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("nickName")
        public String nickName;

        @NameInMap("parameter")
        public java.util.Map<String, ?> parameter;

        @NameInMap("parentId")
        public String parentId;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("saleTag")
        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListSaleTag saleTag;

        @NameInMap("scheduleInfo")
        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListScheduleInfo scheduleInfo;

        @NameInMap("status")
        public String status;

        @NameInMap("tag")
        public String tag;

        @NameInMap("tenantId")
        public String tenantId;

        @NameInMap("type")
        public String type;

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

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
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

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setParameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.Map<String, ?> getParameter() {
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
        @NameInMap("Tags")
        public java.util.List<ListQuotasResponseBodyQuotaInfoListTags> tags;

        @NameInMap("billingPolicy")
        public ListQuotasResponseBodyQuotaInfoListBillingPolicy billingPolicy;

        @NameInMap("cluster")
        public String cluster;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("creatorId")
        public String creatorId;

        @NameInMap("groupName")
        public String groupName;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("nickName")
        public String nickName;

        @NameInMap("parameter")
        public java.util.Map<String, ?> parameter;

        @NameInMap("parentId")
        public String parentId;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("saleTag")
        public ListQuotasResponseBodyQuotaInfoListSaleTag saleTag;

        @NameInMap("scheduleInfo")
        public ListQuotasResponseBodyQuotaInfoListScheduleInfo scheduleInfo;

        @NameInMap("status")
        public String status;

        @NameInMap("subQuotaInfoList")
        public java.util.List<ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList> subQuotaInfoList;

        @NameInMap("tag")
        public String tag;

        @NameInMap("tenantId")
        public String tenantId;

        @NameInMap("type")
        public String type;

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

        public ListQuotasResponseBodyQuotaInfoList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
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
