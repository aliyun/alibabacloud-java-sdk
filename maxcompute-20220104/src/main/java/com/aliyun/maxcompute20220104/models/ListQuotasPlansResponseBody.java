// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListQuotasPlansResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListQuotasPlansResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListQuotasPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuotasPlansResponseBody self = new ListQuotasPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuotasPlansResponseBody setData(ListQuotasPlansResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListQuotasPlansResponseBodyData getData() {
        return this.data;
    }

    public ListQuotasPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListQuotasPlansResponseBodyDataPlanListQuotaBillingPolicy extends TeaModel {
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

        public static ListQuotasPlansResponseBodyDataPlanListQuotaBillingPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasPlansResponseBodyDataPlanListQuotaBillingPolicy self = new ListQuotasPlansResponseBodyDataPlanListQuotaBillingPolicy();
            return TeaModel.build(map, self);
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaBillingPolicy setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaBillingPolicy setOdpsSpecCode(String odpsSpecCode) {
            this.odpsSpecCode = odpsSpecCode;
            return this;
        }
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaBillingPolicy setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class ListQuotasPlansResponseBodyDataPlanListQuotaScheduleInfo extends TeaModel {
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

        public static ListQuotasPlansResponseBodyDataPlanListQuotaScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasPlansResponseBodyDataPlanListQuotaScheduleInfo self = new ListQuotasPlansResponseBodyDataPlanListQuotaScheduleInfo();
            return TeaModel.build(map, self);
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaScheduleInfo setCurrPlan(String currPlan) {
            this.currPlan = currPlan;
            return this;
        }
        public String getCurrPlan() {
            return this.currPlan;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaScheduleInfo setCurrTime(String currTime) {
            this.currTime = currTime;
            return this;
        }
        public String getCurrTime() {
            return this.currTime;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaScheduleInfo setNextPlan(String nextPlan) {
            this.nextPlan = nextPlan;
            return this;
        }
        public String getNextPlan() {
            return this.nextPlan;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaScheduleInfo setNextTime(String nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public String getNextTime() {
            return this.nextTime;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaScheduleInfo setOncePlan(String oncePlan) {
            this.oncePlan = oncePlan;
            return this;
        }
        public String getOncePlan() {
            return this.oncePlan;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaScheduleInfo setOnceTime(String onceTime) {
            this.onceTime = onceTime;
            return this;
        }
        public String getOnceTime() {
            return this.onceTime;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaScheduleInfo setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

    }

    public static class ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListBillingPolicy extends TeaModel {
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

        public static ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListBillingPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListBillingPolicy self = new ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListBillingPolicy();
            return TeaModel.build(map, self);
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListBillingPolicy setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListBillingPolicy setOdpsSpecCode(String odpsSpecCode) {
            this.odpsSpecCode = odpsSpecCode;
            return this;
        }
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListBillingPolicy setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListScheduleInfo extends TeaModel {
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

        public static ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListScheduleInfo self = new ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListScheduleInfo();
            return TeaModel.build(map, self);
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListScheduleInfo setCurrPlan(String currPlan) {
            this.currPlan = currPlan;
            return this;
        }
        public String getCurrPlan() {
            return this.currPlan;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListScheduleInfo setCurrTime(String currTime) {
            this.currTime = currTime;
            return this;
        }
        public String getCurrTime() {
            return this.currTime;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListScheduleInfo setNextPlan(String nextPlan) {
            this.nextPlan = nextPlan;
            return this;
        }
        public String getNextPlan() {
            return this.nextPlan;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListScheduleInfo setNextTime(String nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public String getNextTime() {
            return this.nextTime;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListScheduleInfo setOncePlan(String oncePlan) {
            this.oncePlan = oncePlan;
            return this;
        }
        public String getOncePlan() {
            return this.oncePlan;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListScheduleInfo setOnceTime(String onceTime) {
            this.onceTime = onceTime;
            return this;
        }
        public String getOnceTime() {
            return this.onceTime;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListScheduleInfo setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

    }

    public static class ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList extends TeaModel {
        /**
         * <p>The information of the order.</p>
         */
        @NameInMap("billingPolicy")
        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListBillingPolicy billingPolicy;

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
         * <p>The nickname of the level-2 quota.</p>
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
        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListScheduleInfo scheduleInfo;

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

        public static ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList self = new ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList setBillingPolicy(ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListBillingPolicy billingPolicy) {
            this.billingPolicy = billingPolicy;
            return this;
        }
        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListBillingPolicy getBillingPolicy() {
            return this.billingPolicy;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList setParameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.Map<String, ?> getParameter() {
            return this.parameter;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList setScheduleInfo(ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoListScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListQuotasPlansResponseBodyDataPlanListQuota extends TeaModel {
        /**
         * <p>The information of the order.</p>
         */
        @NameInMap("billingPolicy")
        public ListQuotasPlansResponseBodyDataPlanListQuotaBillingPolicy billingPolicy;

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
        public ListQuotasPlansResponseBodyDataPlanListQuotaScheduleInfo scheduleInfo;

        /**
         * <p>The status of the resource.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The information of the level-2 quota.</p>
         */
        @NameInMap("subQuotaInfoList")
        public java.util.List<ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList> subQuotaInfoList;

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

        public static ListQuotasPlansResponseBodyDataPlanListQuota build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasPlansResponseBodyDataPlanListQuota self = new ListQuotasPlansResponseBodyDataPlanListQuota();
            return TeaModel.build(map, self);
        }

        public ListQuotasPlansResponseBodyDataPlanListQuota setBillingPolicy(ListQuotasPlansResponseBodyDataPlanListQuotaBillingPolicy billingPolicy) {
            this.billingPolicy = billingPolicy;
            return this;
        }
        public ListQuotasPlansResponseBodyDataPlanListQuotaBillingPolicy getBillingPolicy() {
            return this.billingPolicy;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuota setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuota setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuota setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuota setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuota setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuota setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuota setParameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.Map<String, ?> getParameter() {
            return this.parameter;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuota setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuota setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuota setScheduleInfo(ListQuotasPlansResponseBodyDataPlanListQuotaScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public ListQuotasPlansResponseBodyDataPlanListQuotaScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuota setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuota setSubQuotaInfoList(java.util.List<ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList> subQuotaInfoList) {
            this.subQuotaInfoList = subQuotaInfoList;
            return this;
        }
        public java.util.List<ListQuotasPlansResponseBodyDataPlanListQuotaSubQuotaInfoList> getSubQuotaInfoList() {
            return this.subQuotaInfoList;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuota setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuota setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuota setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListQuotasPlansResponseBodyDataPlanListQuota setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListQuotasPlansResponseBodyDataPlanList extends TeaModel {
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
        public ListQuotasPlansResponseBodyDataPlanListQuota quota;

        public static ListQuotasPlansResponseBodyDataPlanList build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasPlansResponseBodyDataPlanList self = new ListQuotasPlansResponseBodyDataPlanList();
            return TeaModel.build(map, self);
        }

        public ListQuotasPlansResponseBodyDataPlanList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListQuotasPlansResponseBodyDataPlanList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQuotasPlansResponseBodyDataPlanList setQuota(ListQuotasPlansResponseBodyDataPlanListQuota quota) {
            this.quota = quota;
            return this;
        }
        public ListQuotasPlansResponseBodyDataPlanListQuota getQuota() {
            return this.quota;
        }

    }

    public static class ListQuotasPlansResponseBodyData extends TeaModel {
        /**
         * <p>The list of quota plans.</p>
         */
        @NameInMap("planList")
        public java.util.List<ListQuotasPlansResponseBodyDataPlanList> planList;

        public static ListQuotasPlansResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasPlansResponseBodyData self = new ListQuotasPlansResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQuotasPlansResponseBodyData setPlanList(java.util.List<ListQuotasPlansResponseBodyDataPlanList> planList) {
            this.planList = planList;
            return this;
        }
        public java.util.List<ListQuotasPlansResponseBodyDataPlanList> getPlanList() {
            return this.planList;
        }

    }

}
