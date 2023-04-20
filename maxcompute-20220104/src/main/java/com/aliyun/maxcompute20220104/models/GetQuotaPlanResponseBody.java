// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaPlanResponseBody extends TeaModel {
    @NameInMap("data")
    public GetQuotaPlanResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    public static GetQuotaPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaPlanResponseBody self = new GetQuotaPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuotaPlanResponseBody setData(GetQuotaPlanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQuotaPlanResponseBodyData getData() {
        return this.data;
    }

    public GetQuotaPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetQuotaPlanResponseBodyDataQuotaBillingPolicy extends TeaModel {
        @NameInMap("billingMethod")
        public String billingMethod;

        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        @NameInMap("orderId")
        public String orderId;

        public static GetQuotaPlanResponseBodyDataQuotaBillingPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaPlanResponseBodyDataQuotaBillingPolicy self = new GetQuotaPlanResponseBodyDataQuotaBillingPolicy();
            return TeaModel.build(map, self);
        }

        public GetQuotaPlanResponseBodyDataQuotaBillingPolicy setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public GetQuotaPlanResponseBodyDataQuotaBillingPolicy setOdpsSpecCode(String odpsSpecCode) {
            this.odpsSpecCode = odpsSpecCode;
            return this;
        }
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

        public GetQuotaPlanResponseBodyDataQuotaBillingPolicy setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class GetQuotaPlanResponseBodyDataQuotaScheduleInfo extends TeaModel {
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

        public static GetQuotaPlanResponseBodyDataQuotaScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaPlanResponseBodyDataQuotaScheduleInfo self = new GetQuotaPlanResponseBodyDataQuotaScheduleInfo();
            return TeaModel.build(map, self);
        }

        public GetQuotaPlanResponseBodyDataQuotaScheduleInfo setCurrPlan(String currPlan) {
            this.currPlan = currPlan;
            return this;
        }
        public String getCurrPlan() {
            return this.currPlan;
        }

        public GetQuotaPlanResponseBodyDataQuotaScheduleInfo setCurrTime(String currTime) {
            this.currTime = currTime;
            return this;
        }
        public String getCurrTime() {
            return this.currTime;
        }

        public GetQuotaPlanResponseBodyDataQuotaScheduleInfo setNextPlan(String nextPlan) {
            this.nextPlan = nextPlan;
            return this;
        }
        public String getNextPlan() {
            return this.nextPlan;
        }

        public GetQuotaPlanResponseBodyDataQuotaScheduleInfo setNextTime(String nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public String getNextTime() {
            return this.nextTime;
        }

        public GetQuotaPlanResponseBodyDataQuotaScheduleInfo setOncePlan(String oncePlan) {
            this.oncePlan = oncePlan;
            return this;
        }
        public String getOncePlan() {
            return this.oncePlan;
        }

        public GetQuotaPlanResponseBodyDataQuotaScheduleInfo setOnceTime(String onceTime) {
            this.onceTime = onceTime;
            return this;
        }
        public String getOnceTime() {
            return this.onceTime;
        }

        public GetQuotaPlanResponseBodyDataQuotaScheduleInfo setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

    }

    public static class GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListBillingPolicy extends TeaModel {
        @NameInMap("billingMethod")
        public String billingMethod;

        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        @NameInMap("orderId")
        public String orderId;

        public static GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListBillingPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListBillingPolicy self = new GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListBillingPolicy();
            return TeaModel.build(map, self);
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListBillingPolicy setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListBillingPolicy setOdpsSpecCode(String odpsSpecCode) {
            this.odpsSpecCode = odpsSpecCode;
            return this;
        }
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListBillingPolicy setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListScheduleInfo extends TeaModel {
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

        public static GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListScheduleInfo self = new GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListScheduleInfo();
            return TeaModel.build(map, self);
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListScheduleInfo setCurrPlan(String currPlan) {
            this.currPlan = currPlan;
            return this;
        }
        public String getCurrPlan() {
            return this.currPlan;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListScheduleInfo setCurrTime(String currTime) {
            this.currTime = currTime;
            return this;
        }
        public String getCurrTime() {
            return this.currTime;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListScheduleInfo setNextPlan(String nextPlan) {
            this.nextPlan = nextPlan;
            return this;
        }
        public String getNextPlan() {
            return this.nextPlan;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListScheduleInfo setNextTime(String nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public String getNextTime() {
            return this.nextTime;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListScheduleInfo setOncePlan(String oncePlan) {
            this.oncePlan = oncePlan;
            return this;
        }
        public String getOncePlan() {
            return this.oncePlan;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListScheduleInfo setOnceTime(String onceTime) {
            this.onceTime = onceTime;
            return this;
        }
        public String getOnceTime() {
            return this.onceTime;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListScheduleInfo setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

    }

    public static class GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList extends TeaModel {
        @NameInMap("billingPolicy")
        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListBillingPolicy billingPolicy;

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

        @NameInMap("scheduleInfo")
        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListScheduleInfo scheduleInfo;

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

        public static GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList self = new GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setBillingPolicy(GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListBillingPolicy billingPolicy) {
            this.billingPolicy = billingPolicy;
            return this;
        }
        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListBillingPolicy getBillingPolicy() {
            return this.billingPolicy;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setParameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.Map<String, ?> getParameter() {
            return this.parameter;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setScheduleInfo(GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetQuotaPlanResponseBodyDataQuota extends TeaModel {
        @NameInMap("billingPolicy")
        public GetQuotaPlanResponseBodyDataQuotaBillingPolicy billingPolicy;

        @NameInMap("cluster")
        public String cluster;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("creatorId")
        public String creatorId;

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

        @NameInMap("scheduleInfo")
        public GetQuotaPlanResponseBodyDataQuotaScheduleInfo scheduleInfo;

        @NameInMap("status")
        public String status;

        @NameInMap("subQuotaInfoList")
        public java.util.List<GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList> subQuotaInfoList;

        @NameInMap("tag")
        public String tag;

        @NameInMap("tenantId")
        public String tenantId;

        @NameInMap("type")
        public String type;

        @NameInMap("version")
        public String version;

        public static GetQuotaPlanResponseBodyDataQuota build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaPlanResponseBodyDataQuota self = new GetQuotaPlanResponseBodyDataQuota();
            return TeaModel.build(map, self);
        }

        public GetQuotaPlanResponseBodyDataQuota setBillingPolicy(GetQuotaPlanResponseBodyDataQuotaBillingPolicy billingPolicy) {
            this.billingPolicy = billingPolicy;
            return this;
        }
        public GetQuotaPlanResponseBodyDataQuotaBillingPolicy getBillingPolicy() {
            return this.billingPolicy;
        }

        public GetQuotaPlanResponseBodyDataQuota setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetQuotaPlanResponseBodyDataQuota setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetQuotaPlanResponseBodyDataQuota setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetQuotaPlanResponseBodyDataQuota setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetQuotaPlanResponseBodyDataQuota setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQuotaPlanResponseBodyDataQuota setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetQuotaPlanResponseBodyDataQuota setParameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.Map<String, ?> getParameter() {
            return this.parameter;
        }

        public GetQuotaPlanResponseBodyDataQuota setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public GetQuotaPlanResponseBodyDataQuota setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetQuotaPlanResponseBodyDataQuota setScheduleInfo(GetQuotaPlanResponseBodyDataQuotaScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public GetQuotaPlanResponseBodyDataQuotaScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public GetQuotaPlanResponseBodyDataQuota setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetQuotaPlanResponseBodyDataQuota setSubQuotaInfoList(java.util.List<GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList> subQuotaInfoList) {
            this.subQuotaInfoList = subQuotaInfoList;
            return this;
        }
        public java.util.List<GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList> getSubQuotaInfoList() {
            return this.subQuotaInfoList;
        }

        public GetQuotaPlanResponseBodyDataQuota setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetQuotaPlanResponseBodyDataQuota setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetQuotaPlanResponseBodyDataQuota setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetQuotaPlanResponseBodyDataQuota setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetQuotaPlanResponseBodyData extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("name")
        public String name;

        @NameInMap("quota")
        public GetQuotaPlanResponseBodyDataQuota quota;

        public static GetQuotaPlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaPlanResponseBodyData self = new GetQuotaPlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQuotaPlanResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQuotaPlanResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQuotaPlanResponseBodyData setQuota(GetQuotaPlanResponseBodyDataQuota quota) {
            this.quota = quota;
            return this;
        }
        public GetQuotaPlanResponseBodyDataQuota getQuota() {
            return this.quota;
        }

    }

}
