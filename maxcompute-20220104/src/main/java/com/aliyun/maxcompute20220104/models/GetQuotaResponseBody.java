// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaResponseBody extends TeaModel {
    @NameInMap("billingPolicy")
    public GetQuotaResponseBodyBillingPolicy billingPolicy;

    @NameInMap("cluster")
    public String cluster;

    @NameInMap("createTime")
    public Long createTime;

    @NameInMap("creatorId")
    public String creatorId;

    @NameInMap("data")
    public GetQuotaResponseBodyData data;

    /**
     * <p>quota ID</p>
     */
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

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("saleTag")
    public GetQuotaResponseBodySaleTag saleTag;

    @NameInMap("scheduleInfo")
    public GetQuotaResponseBodyScheduleInfo scheduleInfo;

    @NameInMap("status")
    public String status;

    @NameInMap("subQuotaInfoList")
    public java.util.List<GetQuotaResponseBodySubQuotaInfoList> subQuotaInfoList;

    @NameInMap("tag")
    public String tag;

    @NameInMap("tenantId")
    public String tenantId;

    @NameInMap("type")
    public String type;

    @NameInMap("version")
    public String version;

    public static GetQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaResponseBody self = new GetQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuotaResponseBody setBillingPolicy(GetQuotaResponseBodyBillingPolicy billingPolicy) {
        this.billingPolicy = billingPolicy;
        return this;
    }
    public GetQuotaResponseBodyBillingPolicy getBillingPolicy() {
        return this.billingPolicy;
    }

    public GetQuotaResponseBody setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public GetQuotaResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetQuotaResponseBody setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public GetQuotaResponseBody setData(GetQuotaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQuotaResponseBodyData getData() {
        return this.data;
    }

    public GetQuotaResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetQuotaResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetQuotaResponseBody setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public GetQuotaResponseBody setParameter(java.util.Map<String, ?> parameter) {
        this.parameter = parameter;
        return this;
    }
    public java.util.Map<String, ?> getParameter() {
        return this.parameter;
    }

    public GetQuotaResponseBody setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public GetQuotaResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQuotaResponseBody setSaleTag(GetQuotaResponseBodySaleTag saleTag) {
        this.saleTag = saleTag;
        return this;
    }
    public GetQuotaResponseBodySaleTag getSaleTag() {
        return this.saleTag;
    }

    public GetQuotaResponseBody setScheduleInfo(GetQuotaResponseBodyScheduleInfo scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
        return this;
    }
    public GetQuotaResponseBodyScheduleInfo getScheduleInfo() {
        return this.scheduleInfo;
    }

    public GetQuotaResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetQuotaResponseBody setSubQuotaInfoList(java.util.List<GetQuotaResponseBodySubQuotaInfoList> subQuotaInfoList) {
        this.subQuotaInfoList = subQuotaInfoList;
        return this;
    }
    public java.util.List<GetQuotaResponseBodySubQuotaInfoList> getSubQuotaInfoList() {
        return this.subQuotaInfoList;
    }

    public GetQuotaResponseBody setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public GetQuotaResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetQuotaResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetQuotaResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class GetQuotaResponseBodyBillingPolicy extends TeaModel {
        @NameInMap("billingMethod")
        public String billingMethod;

        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        @NameInMap("orderId")
        public String orderId;

        public static GetQuotaResponseBodyBillingPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodyBillingPolicy self = new GetQuotaResponseBodyBillingPolicy();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodyBillingPolicy setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public GetQuotaResponseBodyBillingPolicy setOdpsSpecCode(String odpsSpecCode) {
            this.odpsSpecCode = odpsSpecCode;
            return this;
        }
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

        public GetQuotaResponseBodyBillingPolicy setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class GetQuotaResponseBodyDataBillingPolicy extends TeaModel {
        @NameInMap("billingMethod")
        public String billingMethod;

        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        @NameInMap("orderId")
        public String orderId;

        public static GetQuotaResponseBodyDataBillingPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodyDataBillingPolicy self = new GetQuotaResponseBodyDataBillingPolicy();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodyDataBillingPolicy setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public GetQuotaResponseBodyDataBillingPolicy setOdpsSpecCode(String odpsSpecCode) {
            this.odpsSpecCode = odpsSpecCode;
            return this;
        }
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

        public GetQuotaResponseBodyDataBillingPolicy setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class GetQuotaResponseBodyDataSaleTag extends TeaModel {
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

        @NameInMap("resourceType")
        public String resourceType;

        public static GetQuotaResponseBodyDataSaleTag build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodyDataSaleTag self = new GetQuotaResponseBodyDataSaleTag();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodyDataSaleTag setResourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        public GetQuotaResponseBodyDataSaleTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetQuotaResponseBodyDataScheduleInfo extends TeaModel {
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

        public static GetQuotaResponseBodyDataScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodyDataScheduleInfo self = new GetQuotaResponseBodyDataScheduleInfo();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodyDataScheduleInfo setCurrPlan(String currPlan) {
            this.currPlan = currPlan;
            return this;
        }
        public String getCurrPlan() {
            return this.currPlan;
        }

        public GetQuotaResponseBodyDataScheduleInfo setCurrTime(String currTime) {
            this.currTime = currTime;
            return this;
        }
        public String getCurrTime() {
            return this.currTime;
        }

        public GetQuotaResponseBodyDataScheduleInfo setNextPlan(String nextPlan) {
            this.nextPlan = nextPlan;
            return this;
        }
        public String getNextPlan() {
            return this.nextPlan;
        }

        public GetQuotaResponseBodyDataScheduleInfo setNextTime(String nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public String getNextTime() {
            return this.nextTime;
        }

        public GetQuotaResponseBodyDataScheduleInfo setOncePlan(String oncePlan) {
            this.oncePlan = oncePlan;
            return this;
        }
        public String getOncePlan() {
            return this.oncePlan;
        }

        public GetQuotaResponseBodyDataScheduleInfo setOnceTime(String onceTime) {
            this.onceTime = onceTime;
            return this;
        }
        public String getOnceTime() {
            return this.onceTime;
        }

        public GetQuotaResponseBodyDataScheduleInfo setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

    }

    public static class GetQuotaResponseBodyDataSubQuotaInfoListBillingPolicy extends TeaModel {
        @NameInMap("billingMethod")
        public String billingMethod;

        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        @NameInMap("orderId")
        public String orderId;

        public static GetQuotaResponseBodyDataSubQuotaInfoListBillingPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodyDataSubQuotaInfoListBillingPolicy self = new GetQuotaResponseBodyDataSubQuotaInfoListBillingPolicy();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodyDataSubQuotaInfoListBillingPolicy setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoListBillingPolicy setOdpsSpecCode(String odpsSpecCode) {
            this.odpsSpecCode = odpsSpecCode;
            return this;
        }
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoListBillingPolicy setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class GetQuotaResponseBodyDataSubQuotaInfoListSaleTag extends TeaModel {
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

        @NameInMap("resourceType")
        public String resourceType;

        public static GetQuotaResponseBodyDataSubQuotaInfoListSaleTag build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodyDataSubQuotaInfoListSaleTag self = new GetQuotaResponseBodyDataSubQuotaInfoListSaleTag();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodyDataSubQuotaInfoListSaleTag setResourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoListSaleTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetQuotaResponseBodyDataSubQuotaInfoListScheduleInfo extends TeaModel {
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

        public static GetQuotaResponseBodyDataSubQuotaInfoListScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodyDataSubQuotaInfoListScheduleInfo self = new GetQuotaResponseBodyDataSubQuotaInfoListScheduleInfo();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodyDataSubQuotaInfoListScheduleInfo setCurrPlan(String currPlan) {
            this.currPlan = currPlan;
            return this;
        }
        public String getCurrPlan() {
            return this.currPlan;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoListScheduleInfo setCurrTime(String currTime) {
            this.currTime = currTime;
            return this;
        }
        public String getCurrTime() {
            return this.currTime;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoListScheduleInfo setNextPlan(String nextPlan) {
            this.nextPlan = nextPlan;
            return this;
        }
        public String getNextPlan() {
            return this.nextPlan;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoListScheduleInfo setNextTime(String nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public String getNextTime() {
            return this.nextTime;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoListScheduleInfo setOncePlan(String oncePlan) {
            this.oncePlan = oncePlan;
            return this;
        }
        public String getOncePlan() {
            return this.oncePlan;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoListScheduleInfo setOnceTime(String onceTime) {
            this.onceTime = onceTime;
            return this;
        }
        public String getOnceTime() {
            return this.onceTime;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoListScheduleInfo setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

    }

    public static class GetQuotaResponseBodyDataSubQuotaInfoList extends TeaModel {
        @NameInMap("billingPolicy")
        public GetQuotaResponseBodyDataSubQuotaInfoListBillingPolicy billingPolicy;

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
        public GetQuotaResponseBodyDataSubQuotaInfoListSaleTag saleTag;

        @NameInMap("scheduleInfo")
        public GetQuotaResponseBodyDataSubQuotaInfoListScheduleInfo scheduleInfo;

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

        public static GetQuotaResponseBodyDataSubQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodyDataSubQuotaInfoList self = new GetQuotaResponseBodyDataSubQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodyDataSubQuotaInfoList setBillingPolicy(GetQuotaResponseBodyDataSubQuotaInfoListBillingPolicy billingPolicy) {
            this.billingPolicy = billingPolicy;
            return this;
        }
        public GetQuotaResponseBodyDataSubQuotaInfoListBillingPolicy getBillingPolicy() {
            return this.billingPolicy;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoList setParameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.Map<String, ?> getParameter() {
            return this.parameter;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoList setSaleTag(GetQuotaResponseBodyDataSubQuotaInfoListSaleTag saleTag) {
            this.saleTag = saleTag;
            return this;
        }
        public GetQuotaResponseBodyDataSubQuotaInfoListSaleTag getSaleTag() {
            return this.saleTag;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoList setScheduleInfo(GetQuotaResponseBodyDataSubQuotaInfoListScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public GetQuotaResponseBodyDataSubQuotaInfoListScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetQuotaResponseBodyDataSubQuotaInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetQuotaResponseBodyData extends TeaModel {
        @NameInMap("billingPolicy")
        public GetQuotaResponseBodyDataBillingPolicy billingPolicy;

        @NameInMap("cluster")
        public String cluster;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("creatorId")
        public String creatorId;

        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>quota ID</p>
         */
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
        public GetQuotaResponseBodyDataSaleTag saleTag;

        @NameInMap("scheduleInfo")
        public GetQuotaResponseBodyDataScheduleInfo scheduleInfo;

        @NameInMap("status")
        public String status;

        @NameInMap("subQuotaInfoList")
        public java.util.List<GetQuotaResponseBodyDataSubQuotaInfoList> subQuotaInfoList;

        @NameInMap("tag")
        public String tag;

        @NameInMap("tenantId")
        public String tenantId;

        @NameInMap("type")
        public String type;

        @NameInMap("version")
        public String version;

        public static GetQuotaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodyData self = new GetQuotaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodyData setBillingPolicy(GetQuotaResponseBodyDataBillingPolicy billingPolicy) {
            this.billingPolicy = billingPolicy;
            return this;
        }
        public GetQuotaResponseBodyDataBillingPolicy getBillingPolicy() {
            return this.billingPolicy;
        }

        public GetQuotaResponseBodyData setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetQuotaResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetQuotaResponseBodyData setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetQuotaResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetQuotaResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetQuotaResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQuotaResponseBodyData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetQuotaResponseBodyData setParameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.Map<String, ?> getParameter() {
            return this.parameter;
        }

        public GetQuotaResponseBodyData setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public GetQuotaResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetQuotaResponseBodyData setSaleTag(GetQuotaResponseBodyDataSaleTag saleTag) {
            this.saleTag = saleTag;
            return this;
        }
        public GetQuotaResponseBodyDataSaleTag getSaleTag() {
            return this.saleTag;
        }

        public GetQuotaResponseBodyData setScheduleInfo(GetQuotaResponseBodyDataScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public GetQuotaResponseBodyDataScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public GetQuotaResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetQuotaResponseBodyData setSubQuotaInfoList(java.util.List<GetQuotaResponseBodyDataSubQuotaInfoList> subQuotaInfoList) {
            this.subQuotaInfoList = subQuotaInfoList;
            return this;
        }
        public java.util.List<GetQuotaResponseBodyDataSubQuotaInfoList> getSubQuotaInfoList() {
            return this.subQuotaInfoList;
        }

        public GetQuotaResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetQuotaResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetQuotaResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetQuotaResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetQuotaResponseBodySaleTag extends TeaModel {
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

        @NameInMap("resourceType")
        public String resourceType;

        public static GetQuotaResponseBodySaleTag build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodySaleTag self = new GetQuotaResponseBodySaleTag();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodySaleTag setResourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        public GetQuotaResponseBodySaleTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetQuotaResponseBodyScheduleInfo extends TeaModel {
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

        public static GetQuotaResponseBodyScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodyScheduleInfo self = new GetQuotaResponseBodyScheduleInfo();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodyScheduleInfo setCurrPlan(String currPlan) {
            this.currPlan = currPlan;
            return this;
        }
        public String getCurrPlan() {
            return this.currPlan;
        }

        public GetQuotaResponseBodyScheduleInfo setCurrTime(String currTime) {
            this.currTime = currTime;
            return this;
        }
        public String getCurrTime() {
            return this.currTime;
        }

        public GetQuotaResponseBodyScheduleInfo setNextPlan(String nextPlan) {
            this.nextPlan = nextPlan;
            return this;
        }
        public String getNextPlan() {
            return this.nextPlan;
        }

        public GetQuotaResponseBodyScheduleInfo setNextTime(String nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public String getNextTime() {
            return this.nextTime;
        }

        public GetQuotaResponseBodyScheduleInfo setOncePlan(String oncePlan) {
            this.oncePlan = oncePlan;
            return this;
        }
        public String getOncePlan() {
            return this.oncePlan;
        }

        public GetQuotaResponseBodyScheduleInfo setOnceTime(String onceTime) {
            this.onceTime = onceTime;
            return this;
        }
        public String getOnceTime() {
            return this.onceTime;
        }

        public GetQuotaResponseBodyScheduleInfo setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

    }

    public static class GetQuotaResponseBodySubQuotaInfoListBillingPolicy extends TeaModel {
        @NameInMap("billingMethod")
        public String billingMethod;

        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        @NameInMap("orderId")
        public String orderId;

        public static GetQuotaResponseBodySubQuotaInfoListBillingPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodySubQuotaInfoListBillingPolicy self = new GetQuotaResponseBodySubQuotaInfoListBillingPolicy();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodySubQuotaInfoListBillingPolicy setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public GetQuotaResponseBodySubQuotaInfoListBillingPolicy setOdpsSpecCode(String odpsSpecCode) {
            this.odpsSpecCode = odpsSpecCode;
            return this;
        }
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

        public GetQuotaResponseBodySubQuotaInfoListBillingPolicy setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class GetQuotaResponseBodySubQuotaInfoListSaleTag extends TeaModel {
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

        @NameInMap("resourceType")
        public String resourceType;

        public static GetQuotaResponseBodySubQuotaInfoListSaleTag build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodySubQuotaInfoListSaleTag self = new GetQuotaResponseBodySubQuotaInfoListSaleTag();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodySubQuotaInfoListSaleTag setResourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        public GetQuotaResponseBodySubQuotaInfoListSaleTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetQuotaResponseBodySubQuotaInfoListScheduleInfo extends TeaModel {
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

        public static GetQuotaResponseBodySubQuotaInfoListScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodySubQuotaInfoListScheduleInfo self = new GetQuotaResponseBodySubQuotaInfoListScheduleInfo();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodySubQuotaInfoListScheduleInfo setCurrPlan(String currPlan) {
            this.currPlan = currPlan;
            return this;
        }
        public String getCurrPlan() {
            return this.currPlan;
        }

        public GetQuotaResponseBodySubQuotaInfoListScheduleInfo setCurrTime(String currTime) {
            this.currTime = currTime;
            return this;
        }
        public String getCurrTime() {
            return this.currTime;
        }

        public GetQuotaResponseBodySubQuotaInfoListScheduleInfo setNextPlan(String nextPlan) {
            this.nextPlan = nextPlan;
            return this;
        }
        public String getNextPlan() {
            return this.nextPlan;
        }

        public GetQuotaResponseBodySubQuotaInfoListScheduleInfo setNextTime(String nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public String getNextTime() {
            return this.nextTime;
        }

        public GetQuotaResponseBodySubQuotaInfoListScheduleInfo setOncePlan(String oncePlan) {
            this.oncePlan = oncePlan;
            return this;
        }
        public String getOncePlan() {
            return this.oncePlan;
        }

        public GetQuotaResponseBodySubQuotaInfoListScheduleInfo setOnceTime(String onceTime) {
            this.onceTime = onceTime;
            return this;
        }
        public String getOnceTime() {
            return this.onceTime;
        }

        public GetQuotaResponseBodySubQuotaInfoListScheduleInfo setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

    }

    public static class GetQuotaResponseBodySubQuotaInfoList extends TeaModel {
        @NameInMap("billingPolicy")
        public GetQuotaResponseBodySubQuotaInfoListBillingPolicy billingPolicy;

        @NameInMap("cluster")
        public String cluster;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("creatorId")
        public String creatorId;

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
        public GetQuotaResponseBodySubQuotaInfoListSaleTag saleTag;

        @NameInMap("scheduleInfo")
        public GetQuotaResponseBodySubQuotaInfoListScheduleInfo scheduleInfo;

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

        public static GetQuotaResponseBodySubQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodySubQuotaInfoList self = new GetQuotaResponseBodySubQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodySubQuotaInfoList setBillingPolicy(GetQuotaResponseBodySubQuotaInfoListBillingPolicy billingPolicy) {
            this.billingPolicy = billingPolicy;
            return this;
        }
        public GetQuotaResponseBodySubQuotaInfoListBillingPolicy getBillingPolicy() {
            return this.billingPolicy;
        }

        public GetQuotaResponseBodySubQuotaInfoList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetQuotaResponseBodySubQuotaInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetQuotaResponseBodySubQuotaInfoList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetQuotaResponseBodySubQuotaInfoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetQuotaResponseBodySubQuotaInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQuotaResponseBodySubQuotaInfoList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetQuotaResponseBodySubQuotaInfoList setParameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.Map<String, ?> getParameter() {
            return this.parameter;
        }

        public GetQuotaResponseBodySubQuotaInfoList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public GetQuotaResponseBodySubQuotaInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetQuotaResponseBodySubQuotaInfoList setSaleTag(GetQuotaResponseBodySubQuotaInfoListSaleTag saleTag) {
            this.saleTag = saleTag;
            return this;
        }
        public GetQuotaResponseBodySubQuotaInfoListSaleTag getSaleTag() {
            return this.saleTag;
        }

        public GetQuotaResponseBodySubQuotaInfoList setScheduleInfo(GetQuotaResponseBodySubQuotaInfoListScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public GetQuotaResponseBodySubQuotaInfoListScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public GetQuotaResponseBodySubQuotaInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetQuotaResponseBodySubQuotaInfoList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetQuotaResponseBodySubQuotaInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetQuotaResponseBodySubQuotaInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetQuotaResponseBodySubQuotaInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
