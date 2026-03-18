// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryQuotaResponseBody extends TeaModel {
    @NameInMap("data")
    public QueryQuotaResponseBodyData data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("httpCode")
    public Integer httpCode;

    @NameInMap("requestId")
    public String requestId;

    public static QueryQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryQuotaResponseBody self = new QueryQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryQuotaResponseBody setData(QueryQuotaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryQuotaResponseBodyData getData() {
        return this.data;
    }

    public QueryQuotaResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryQuotaResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryQuotaResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public QueryQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryQuotaResponseBodyDataBillingPolicy extends TeaModel {
        @NameInMap("billingMethod")
        public String billingMethod;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        @NameInMap("orderId")
        public String orderId;

        public static QueryQuotaResponseBodyDataBillingPolicy build(java.util.Map<String, ?> map) throws Exception {
            QueryQuotaResponseBodyDataBillingPolicy self = new QueryQuotaResponseBodyDataBillingPolicy();
            return TeaModel.build(map, self);
        }

        public QueryQuotaResponseBodyDataBillingPolicy setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public QueryQuotaResponseBodyDataBillingPolicy setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryQuotaResponseBodyDataBillingPolicy setOdpsSpecCode(String odpsSpecCode) {
            this.odpsSpecCode = odpsSpecCode;
            return this;
        }
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

        public QueryQuotaResponseBodyDataBillingPolicy setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class QueryQuotaResponseBodyDataSaleTag extends TeaModel {
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

        @NameInMap("resourceType")
        public String resourceType;

        public static QueryQuotaResponseBodyDataSaleTag build(java.util.Map<String, ?> map) throws Exception {
            QueryQuotaResponseBodyDataSaleTag self = new QueryQuotaResponseBodyDataSaleTag();
            return TeaModel.build(map, self);
        }

        public QueryQuotaResponseBodyDataSaleTag setResourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        public QueryQuotaResponseBodyDataSaleTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class QueryQuotaResponseBodyDataScheduleInfo extends TeaModel {
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

        @NameInMap("timezone")
        public String timezone;

        public static QueryQuotaResponseBodyDataScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryQuotaResponseBodyDataScheduleInfo self = new QueryQuotaResponseBodyDataScheduleInfo();
            return TeaModel.build(map, self);
        }

        public QueryQuotaResponseBodyDataScheduleInfo setCurrPlan(String currPlan) {
            this.currPlan = currPlan;
            return this;
        }
        public String getCurrPlan() {
            return this.currPlan;
        }

        public QueryQuotaResponseBodyDataScheduleInfo setCurrTime(String currTime) {
            this.currTime = currTime;
            return this;
        }
        public String getCurrTime() {
            return this.currTime;
        }

        public QueryQuotaResponseBodyDataScheduleInfo setNextPlan(String nextPlan) {
            this.nextPlan = nextPlan;
            return this;
        }
        public String getNextPlan() {
            return this.nextPlan;
        }

        public QueryQuotaResponseBodyDataScheduleInfo setNextTime(String nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public String getNextTime() {
            return this.nextTime;
        }

        public QueryQuotaResponseBodyDataScheduleInfo setOncePlan(String oncePlan) {
            this.oncePlan = oncePlan;
            return this;
        }
        public String getOncePlan() {
            return this.oncePlan;
        }

        public QueryQuotaResponseBodyDataScheduleInfo setOnceTime(String onceTime) {
            this.onceTime = onceTime;
            return this;
        }
        public String getOnceTime() {
            return this.onceTime;
        }

        public QueryQuotaResponseBodyDataScheduleInfo setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public QueryQuotaResponseBodyDataScheduleInfo setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class QueryQuotaResponseBodyDataSubQuotaInfoListBillingPolicy extends TeaModel {
        @NameInMap("billingMethod")
        public String billingMethod;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        @NameInMap("orderId")
        public String orderId;

        public static QueryQuotaResponseBodyDataSubQuotaInfoListBillingPolicy build(java.util.Map<String, ?> map) throws Exception {
            QueryQuotaResponseBodyDataSubQuotaInfoListBillingPolicy self = new QueryQuotaResponseBodyDataSubQuotaInfoListBillingPolicy();
            return TeaModel.build(map, self);
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoListBillingPolicy setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoListBillingPolicy setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoListBillingPolicy setOdpsSpecCode(String odpsSpecCode) {
            this.odpsSpecCode = odpsSpecCode;
            return this;
        }
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoListBillingPolicy setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class QueryQuotaResponseBodyDataSubQuotaInfoListSaleTag extends TeaModel {
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

        @NameInMap("resourceType")
        public String resourceType;

        public static QueryQuotaResponseBodyDataSubQuotaInfoListSaleTag build(java.util.Map<String, ?> map) throws Exception {
            QueryQuotaResponseBodyDataSubQuotaInfoListSaleTag self = new QueryQuotaResponseBodyDataSubQuotaInfoListSaleTag();
            return TeaModel.build(map, self);
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoListSaleTag setResourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoListSaleTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class QueryQuotaResponseBodyDataSubQuotaInfoListScheduleInfo extends TeaModel {
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

        @NameInMap("timezone")
        public String timezone;

        public static QueryQuotaResponseBodyDataSubQuotaInfoListScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryQuotaResponseBodyDataSubQuotaInfoListScheduleInfo self = new QueryQuotaResponseBodyDataSubQuotaInfoListScheduleInfo();
            return TeaModel.build(map, self);
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoListScheduleInfo setCurrPlan(String currPlan) {
            this.currPlan = currPlan;
            return this;
        }
        public String getCurrPlan() {
            return this.currPlan;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoListScheduleInfo setCurrTime(String currTime) {
            this.currTime = currTime;
            return this;
        }
        public String getCurrTime() {
            return this.currTime;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoListScheduleInfo setNextPlan(String nextPlan) {
            this.nextPlan = nextPlan;
            return this;
        }
        public String getNextPlan() {
            return this.nextPlan;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoListScheduleInfo setNextTime(String nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public String getNextTime() {
            return this.nextTime;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoListScheduleInfo setOncePlan(String oncePlan) {
            this.oncePlan = oncePlan;
            return this;
        }
        public String getOncePlan() {
            return this.oncePlan;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoListScheduleInfo setOnceTime(String onceTime) {
            this.onceTime = onceTime;
            return this;
        }
        public String getOnceTime() {
            return this.onceTime;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoListScheduleInfo setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoListScheduleInfo setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class QueryQuotaResponseBodyDataSubQuotaInfoList extends TeaModel {
        @NameInMap("billingPolicy")
        public QueryQuotaResponseBodyDataSubQuotaInfoListBillingPolicy billingPolicy;

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
        public QueryQuotaResponseBodyDataSubQuotaInfoListSaleTag saleTag;

        @NameInMap("scheduleInfo")
        public QueryQuotaResponseBodyDataSubQuotaInfoListScheduleInfo scheduleInfo;

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

        public static QueryQuotaResponseBodyDataSubQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryQuotaResponseBodyDataSubQuotaInfoList self = new QueryQuotaResponseBodyDataSubQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoList setBillingPolicy(QueryQuotaResponseBodyDataSubQuotaInfoListBillingPolicy billingPolicy) {
            this.billingPolicy = billingPolicy;
            return this;
        }
        public QueryQuotaResponseBodyDataSubQuotaInfoListBillingPolicy getBillingPolicy() {
            return this.billingPolicy;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoList setParameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.Map<String, ?> getParameter() {
            return this.parameter;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoList setSaleTag(QueryQuotaResponseBodyDataSubQuotaInfoListSaleTag saleTag) {
            this.saleTag = saleTag;
            return this;
        }
        public QueryQuotaResponseBodyDataSubQuotaInfoListSaleTag getSaleTag() {
            return this.saleTag;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoList setScheduleInfo(QueryQuotaResponseBodyDataSubQuotaInfoListScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public QueryQuotaResponseBodyDataSubQuotaInfoListScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryQuotaResponseBodyDataSubQuotaInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryQuotaResponseBodyData extends TeaModel {
        @NameInMap("billingPolicy")
        public QueryQuotaResponseBodyDataBillingPolicy billingPolicy;

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
        public QueryQuotaResponseBodyDataSaleTag saleTag;

        @NameInMap("scheduleInfo")
        public QueryQuotaResponseBodyDataScheduleInfo scheduleInfo;

        @NameInMap("status")
        public String status;

        @NameInMap("subQuotaInfoList")
        public java.util.List<QueryQuotaResponseBodyDataSubQuotaInfoList> subQuotaInfoList;

        @NameInMap("tag")
        public String tag;

        @NameInMap("tenantId")
        public String tenantId;

        @NameInMap("type")
        public String type;

        @NameInMap("version")
        public String version;

        public static QueryQuotaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryQuotaResponseBodyData self = new QueryQuotaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryQuotaResponseBodyData setBillingPolicy(QueryQuotaResponseBodyDataBillingPolicy billingPolicy) {
            this.billingPolicy = billingPolicy;
            return this;
        }
        public QueryQuotaResponseBodyDataBillingPolicy getBillingPolicy() {
            return this.billingPolicy;
        }

        public QueryQuotaResponseBodyData setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public QueryQuotaResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryQuotaResponseBodyData setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public QueryQuotaResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryQuotaResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryQuotaResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryQuotaResponseBodyData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryQuotaResponseBodyData setParameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.Map<String, ?> getParameter() {
            return this.parameter;
        }

        public QueryQuotaResponseBodyData setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public QueryQuotaResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryQuotaResponseBodyData setSaleTag(QueryQuotaResponseBodyDataSaleTag saleTag) {
            this.saleTag = saleTag;
            return this;
        }
        public QueryQuotaResponseBodyDataSaleTag getSaleTag() {
            return this.saleTag;
        }

        public QueryQuotaResponseBodyData setScheduleInfo(QueryQuotaResponseBodyDataScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public QueryQuotaResponseBodyDataScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public QueryQuotaResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryQuotaResponseBodyData setSubQuotaInfoList(java.util.List<QueryQuotaResponseBodyDataSubQuotaInfoList> subQuotaInfoList) {
            this.subQuotaInfoList = subQuotaInfoList;
            return this;
        }
        public java.util.List<QueryQuotaResponseBodyDataSubQuotaInfoList> getSubQuotaInfoList() {
            return this.subQuotaInfoList;
        }

        public QueryQuotaResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public QueryQuotaResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryQuotaResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryQuotaResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
