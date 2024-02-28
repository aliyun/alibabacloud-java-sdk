// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaResponseBody extends TeaModel {
    /**
     * <p>The information about the order.</p>
     */
    @NameInMap("billingPolicy")
    public GetQuotaResponseBodyBillingPolicy billingPolicy;

    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("cluster")
    public String cluster;

    /**
     * <p>The time when the resource was created.</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The ID of the Alibaba Cloud account that is used to create the resource.</p>
     */
    @NameInMap("creatorId")
    public String creatorId;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetQuotaResponseBodyData data;

    /**
     * <p>The quota ID.</p>
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
     * <p>The region ID.</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The identifier of an object in a MaxCompute quota. This identifier is the same as the identifier in the sales bill of Alibaba Cloud. This parameter is used for tags.</p>
     */
    @NameInMap("saleTag")
    public GetQuotaResponseBodySaleTag saleTag;

    /**
     * <p>The information about the scheduling plan.</p>
     */
    @NameInMap("scheduleInfo")
    public GetQuotaResponseBodyScheduleInfo scheduleInfo;

    /**
     * <p>The status of the resource.</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The information about the level-2 quota.</p>
     */
    @NameInMap("subQuotaInfoList")
    public java.util.List<GetQuotaResponseBodySubQuotaInfoList> subQuotaInfoList;

    /**
     * <p>The tag of the resource for the quota.</p>
     */
    @NameInMap("tag")
    public String tag;

    /**
     * <p>The tenant ID.</p>
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
         * <p>The order ID.</p>
         */
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
         * <p>The order ID.</p>
         */
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
        /**
         * <p>The identifier of an object in a MaxCompute quota. This identifier exists in the sales bill of Alibaba Cloud. You can use this identifier to associate the cost of a quota object with a tag.</p>
         */
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

        /**
         * <p>The type of the object. Valid values: quota and project.</p>
         */
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
         * <p>The quota plan that immediately takes effect. If the quota plan that immediately takes effect is different from the current quota plan, this parameter is not empty.</p>
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

        /**
         * <p>The time zone of the project.</p>
         */
        @NameInMap("timezone")
        public String timezone;

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

        public GetQuotaResponseBodyDataScheduleInfo setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class GetQuotaResponseBodyDataSubQuotaInfoListBillingPolicy extends TeaModel {
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
         * <p>The order ID.</p>
         */
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
        /**
         * <p>The identifier of an object in a MaxCompute quota. This identifier exists in the sales bill of Alibaba Cloud. You can use this identifier to associate the cost of a quota object with a tag.</p>
         */
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

        /**
         * <p>The type of the object. Valid values: quota and project.</p>
         */
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
         * <p>The quota plan that immediately takes effect. If the quota plan that immediately takes effect is different from the current quota plan, this parameter is not empty.</p>
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

        /**
         * <p>The time zone of the project.</p>
         */
        @NameInMap("timezone")
        public String timezone;

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

        public GetQuotaResponseBodyDataSubQuotaInfoListScheduleInfo setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class GetQuotaResponseBodyDataSubQuotaInfoList extends TeaModel {
        /**
         * <p>The information about the order.</p>
         */
        @NameInMap("billingPolicy")
        public GetQuotaResponseBodyDataSubQuotaInfoListBillingPolicy billingPolicy;

        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>The time when the resource was created.</p>
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
         * <p>The region ID.</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The identifier of an object in a MaxCompute quota. This identifier is the same as the identifier in the sales bill of Alibaba Cloud. This parameter is used for tags.</p>
         */
        @NameInMap("saleTag")
        public GetQuotaResponseBodyDataSubQuotaInfoListSaleTag saleTag;

        /**
         * <p>The information about the scheduling plan.</p>
         */
        @NameInMap("scheduleInfo")
        public GetQuotaResponseBodyDataSubQuotaInfoListScheduleInfo scheduleInfo;

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
         * <p>The tenant ID.</p>
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
        /**
         * <p>The information about the order.</p>
         */
        @NameInMap("billingPolicy")
        public GetQuotaResponseBodyDataBillingPolicy billingPolicy;

        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>The time when the resource was created.</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to create the resource.</p>
         */
        @NameInMap("creatorId")
        public String creatorId;

        /**
         * <p>The quota ID.</p>
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
         * <p>The region ID.</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The identifier of an object in a MaxCompute quota. This identifier is the same as the identifier in the sales bill of Alibaba Cloud. This parameter is used for tags.</p>
         */
        @NameInMap("saleTag")
        public GetQuotaResponseBodyDataSaleTag saleTag;

        /**
         * <p>The information about the scheduling plan.</p>
         */
        @NameInMap("scheduleInfo")
        public GetQuotaResponseBodyDataScheduleInfo scheduleInfo;

        /**
         * <p>The status of the resource.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The information about the level-2 quota.</p>
         */
        @NameInMap("subQuotaInfoList")
        public java.util.List<GetQuotaResponseBodyDataSubQuotaInfoList> subQuotaInfoList;

        /**
         * <p>The tag of the resource for the quota.</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The tenant ID.</p>
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
        /**
         * <p>The identifier of an object in a MaxCompute quota. This identifier exists in the sales bill of Alibaba Cloud. You can use this identifier to associate the cost of a quota object with a tag.</p>
         */
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

        /**
         * <p>The type of the object. Valid values: quota and project.</p>
         */
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
         * <p>The quota plan that immediately takes effect. If the quota plan that immediately takes effect is different from the current quota plan, this parameter is not empty.</p>
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

        /**
         * <p>The time zone of the project.</p>
         */
        @NameInMap("timezone")
        public String timezone;

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

        public GetQuotaResponseBodyScheduleInfo setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class GetQuotaResponseBodySubQuotaInfoListBillingPolicy extends TeaModel {
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
         * <p>The order ID.</p>
         */
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
        /**
         * <p>The identifier of an object in a MaxCompute quota. This identifier exists in the sales bill of Alibaba Cloud. You can use this identifier to associate the cost of a quota object with a tag.</p>
         */
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

        /**
         * <p>The type of the object. Valid values: quota and project.</p>
         */
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
         * <p>The quota plan that immediately takes effect. If the quota plan that immediately takes effect is different from the current quota plan, this parameter is not empty.</p>
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

        /**
         * <p>The time zone of the project.</p>
         */
        @NameInMap("timezone")
        public String timezone;

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

        public GetQuotaResponseBodySubQuotaInfoListScheduleInfo setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class GetQuotaResponseBodySubQuotaInfoList extends TeaModel {
        /**
         * <p>The information about the order.</p>
         */
        @NameInMap("billingPolicy")
        public GetQuotaResponseBodySubQuotaInfoListBillingPolicy billingPolicy;

        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>The time when the resource was created.</p>
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
         * <p>The region ID.</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The identifier of an object in a MaxCompute quota. This identifier is the same as the identifier in the sales bill of Alibaba Cloud. This parameter is used for tags.</p>
         */
        @NameInMap("saleTag")
        public GetQuotaResponseBodySubQuotaInfoListSaleTag saleTag;

        /**
         * <p>The information about the scheduling plan.</p>
         */
        @NameInMap("scheduleInfo")
        public GetQuotaResponseBodySubQuotaInfoListScheduleInfo scheduleInfo;

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
         * <p>The tenant ID.</p>
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
