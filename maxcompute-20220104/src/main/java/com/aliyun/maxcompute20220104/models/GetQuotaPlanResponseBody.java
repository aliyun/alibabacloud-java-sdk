// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaPlanResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetQuotaPlanResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The billing method of the quota. Valid values:</p>
         * <br>
         * <p>*   subscription: a subscription quota.</p>
         * <p>*   payasyougo: a pay-as-you-go quota.</p>
         */
        @NameInMap("billingMethod")
        public String billingMethod;

        /**
         * <p>The specifications of the order.</p>
         */
        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        /**
         * <p>The ID of the order.</p>
         */
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
        /**
         * <p>The quota plan that takes effect based on the scheduling plan.</p>
         */
        @NameInMap("currPlan")
        public String currPlan;

        /**
         * <p>The time when the current quota plan is scheduled.</p>
         */
        @NameInMap("currTime")
        public String currTime;

        /**
         * <p>The next quota plan that will take effect based on the scheduling plan.</p>
         */
        @NameInMap("nextPlan")
        public String nextPlan;

        /**
         * <p>The time when the next quota plan is scheduled.</p>
         */
        @NameInMap("nextTime")
        public String nextTime;

        /**
         * <p>If the quota plan that immediately takes effect is different from the current quota plan, this parameter is not empty.</p>
         */
        @NameInMap("oncePlan")
        public String oncePlan;

        /**
         * <p>The time when the quota plan immediately takes effect.</p>
         */
        @NameInMap("onceTime")
        public String onceTime;

        /**
         * <p>The name of the operator.</p>
         */
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
        /**
         * <p>The billing method of the quota. Valid values:</p>
         * <br>
         * <p>*   subscription: a subscription quota.</p>
         * <p>*   payasyougo: a pay-as-you-go quota.</p>
         */
        @NameInMap("billingMethod")
        public String billingMethod;

        /**
         * <p>The specifications of the order.</p>
         */
        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        /**
         * <p>The ID of the order.</p>
         */
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
        /**
         * <p>The quota plan that takes effect based on the scheduling plan.</p>
         */
        @NameInMap("currPlan")
        public String currPlan;

        /**
         * <p>The time when the current quota plan is scheduled.</p>
         */
        @NameInMap("currTime")
        public String currTime;

        /**
         * <p>The next quota plan that will take effect based on the scheduling plan.</p>
         */
        @NameInMap("nextPlan")
        public String nextPlan;

        /**
         * <p>The time when the next quota plan is scheduled.</p>
         */
        @NameInMap("nextTime")
        public String nextTime;

        /**
         * <p>If the quota plan that immediately takes effect is different from the current quota plan, this parameter is not empty.</p>
         */
        @NameInMap("oncePlan")
        public String oncePlan;

        /**
         * <p>The time when the quota plan immediately takes effect.</p>
         */
        @NameInMap("onceTime")
        public String onceTime;

        /**
         * <p>The name of the operator.</p>
         */
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
        /**
         * <p>The information of the order.</p>
         */
        @NameInMap("billingPolicy")
        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListBillingPolicy billingPolicy;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>The time when the resource was created.</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The ID of the user who created the quota plan.</p>
         */
        @NameInMap("creatorId")
        public String creatorId;

        /**
         * <p>The ID of the level-2 quota.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the level-2 quota.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The alias of the level-2 quota.</p>
         */
        @NameInMap("nickName")
        public String nickName;

        /**
         * <p>The description of the quota.</p>
         */
        @NameInMap("parameter")
        public java.util.Map<String, ?> parameter;

        /**
         * <p>The ID of the parent resource.</p>
         */
        @NameInMap("parentId")
        public String parentId;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The information of the scheduling plan.</p>
         */
        @NameInMap("scheduleInfo")
        public GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoListScheduleInfo scheduleInfo;

        /**
         * <p>The status of the resource.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The tag of the resource for the quota.</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>The type of the resource system. This parameter corresponds to the resourceSystemType parameter of the cluster.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The version number.</p>
         */
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
        /**
         * <p>The information of the order.</p>
         */
        @NameInMap("billingPolicy")
        public GetQuotaPlanResponseBodyDataQuotaBillingPolicy billingPolicy;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>The time when the quota plan was created.</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to create the resource.</p>
         */
        @NameInMap("creatorId")
        public String creatorId;

        /**
         * <p>The ID of the quota.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the quota.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The alias of the quota.</p>
         */
        @NameInMap("nickName")
        public String nickName;

        /**
         * <p>The description of the quota.</p>
         */
        @NameInMap("parameter")
        public java.util.Map<String, ?> parameter;

        /**
         * <p>The ID of the parent resource.</p>
         */
        @NameInMap("parentId")
        public String parentId;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The information of the scheduling plan.</p>
         */
        @NameInMap("scheduleInfo")
        public GetQuotaPlanResponseBodyDataQuotaScheduleInfo scheduleInfo;

        /**
         * <p>The status of the resource.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The information of the level-2 quota.</p>
         */
        @NameInMap("subQuotaInfoList")
        public java.util.List<GetQuotaPlanResponseBodyDataQuotaSubQuotaInfoList> subQuotaInfoList;

        /**
         * <p>The tag of the resource for the quota.</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>The type of the resource system. This parameter corresponds to the resourceSystemType parameter of the cluster.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The version number.</p>
         */
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
        /**
         * <p>The time when the quota plan was created.</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The name of the quota plan.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The details of the quota.</p>
         */
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
