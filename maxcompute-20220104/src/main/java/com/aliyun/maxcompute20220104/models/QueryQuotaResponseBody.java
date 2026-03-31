// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryQuotaResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public QueryQuotaResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Exception information</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1eeed16675342848904412e08dd</p>
     */
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
        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>subscription: the subscription quota.</li>
         * <li>payasyougo: the pay-as-you-go quota.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>subscription</p>
         */
        @NameInMap("billingMethod")
        public String billingMethod;

        /**
         * <p>In MaxCompute, instanceId and orderId are considered the same.</p>
         * 
         * <strong>example:</strong>
         * <p>880c0d0d-5d79-4217-b683-8e8bdd2a2523</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The order specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>OdpsStandard</p>
         */
        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>880c0d0d-5d79-4217-b683-8e8bdd2a2523</p>
         */
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
        /**
         * <p>The identifier of a MaxCompute quota object. This identifier exists in the Alibaba Cloud sales bill. You can use this identifier to associate the cost of a quota object with a tag.</p>
         */
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

        /**
         * <p>The object type. Valid values: quota and project.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
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
        /**
         * <p>The current quota plan that has taken effect based on the scheduling plan.</p>
         * 
         * <strong>example:</strong>
         * <p>planA</p>
         */
        @NameInMap("currPlan")
        public String currPlan;

        /**
         * <p>The time when the plan specified by currPlan is scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>0800</p>
         */
        @NameInMap("currTime")
        public String currTime;

        /**
         * <p>The quota plan that will take effect based on the scheduling plan.</p>
         * 
         * <strong>example:</strong>
         * <p>planB</p>
         */
        @NameInMap("nextPlan")
        public String nextPlan;

        /**
         * <p>The time when the plan specified by nextPlan is scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>1700</p>
         */
        @NameInMap("nextTime")
        public String nextTime;

        /**
         * <p>The quota plan that immediately takes effect. If the quota plan specified by this parameter is triggered and the plan is different from the plan specified by currPlan, this parameter is not empty.</p>
         * 
         * <strong>example:</strong>
         * <p>planC</p>
         */
        @NameInMap("oncePlan")
        public String oncePlan;

        /**
         * <p>The time when the quota plan specified by oncePlan is scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("onceTime")
        public String onceTime;

        /**
         * <p>The operator name.</p>
         * 
         * <strong>example:</strong>
         * <p>userA</p>
         */
        @NameInMap("operatorName")
        public String operatorName;

        /**
         * <p>The time zone of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>UTC+8</p>
         */
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
        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>subscription: the subscription quota.</li>
         * <li>payasyougo: the pay-as-you-go quota.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>subscription</p>
         */
        @NameInMap("billingMethod")
        public String billingMethod;

        /**
         * <p>In MaxCompute, instanceId and orderId are considered the same.</p>
         * 
         * <strong>example:</strong>
         * <p>880c0d0d-5d79-4217-b683-8e8bdd2a2523</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The order specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>OdpsStandard</p>
         */
        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>880c0d0d-5d79-4217-b683-8e8bdd2a2523</p>
         */
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
        /**
         * <p>The identifier of a MaxCompute quota object. This identifier exists in the Alibaba Cloud sales bill. You can use this identifier to associate the cost of a quota object with a tag.</p>
         */
        @NameInMap("resourceIds")
        public java.util.List<String> resourceIds;

        /**
         * <p>The object type. Valid values: quota and project.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;quota&quot;</p>
         */
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
        /**
         * <p>The current quota plan that has taken effect based on the scheduling plan.</p>
         * 
         * <strong>example:</strong>
         * <p>planA</p>
         */
        @NameInMap("currPlan")
        public String currPlan;

        /**
         * <p>The time when the plan specified by currPlan is scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>0800</p>
         */
        @NameInMap("currTime")
        public String currTime;

        /**
         * <p>The quota plan that will take effect based on the scheduling plan.</p>
         * 
         * <strong>example:</strong>
         * <p>planB</p>
         */
        @NameInMap("nextPlan")
        public String nextPlan;

        /**
         * <p>The time when the plan specified by nextPlan is scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>1700</p>
         */
        @NameInMap("nextTime")
        public String nextTime;

        /**
         * <p>The quota plan that immediately takes effect. If the quota plan specified by this parameter is triggered and the plan is different from the plan specified by currPlan, this parameter is not empty.</p>
         * 
         * <strong>example:</strong>
         * <p>planC</p>
         */
        @NameInMap("oncePlan")
        public String oncePlan;

        /**
         * <p>The time when the quota plan specified by oncePlan is scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("onceTime")
        public String onceTime;

        /**
         * <p>The operator name.</p>
         * 
         * <strong>example:</strong>
         * <p>userA</p>
         */
        @NameInMap("operatorName")
        public String operatorName;

        /**
         * <p>The time zone of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>UTC+8</p>
         */
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
        /**
         * <p>The order information.</p>
         */
        @NameInMap("billingPolicy")
        public QueryQuotaResponseBodyDataSubQuotaInfoListBillingPolicy billingPolicy;

        /**
         * <p>The cluster ID.</p>
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
         * <p>1688653978768</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to create the quota plan.</p>
         * 
         * <strong>example:</strong>
         * <p>672863518</p>
         */
        @NameInMap("creatorId")
        public String creatorId;

        /**
         * <p>The role group name.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The ID of the level-2 quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1000048</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the level-2 quota.</p>
         * 
         * <strong>example:</strong>
         * <p>subquotaA</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The nickname of the level-2 quota.</p>
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
         * <p>{\&quot;maxCU\&quot;: 10, \&quot;minCU\&quot;: 10, \&quot;adhocCU\&quot;: 0, \&quot;schedulerType\&quot;: \&quot;Fifo\&quot;}</p>
         */
        @NameInMap("parameter")
        public java.util.Map<String, ?> parameter;

        /**
         * <p>The parent resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("parentId")
        public String parentId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The identifiers of MaxCompute quota objects. The identifiers are the same as those in the Alibaba Cloud sales bill. This parameter is used for tags.</p>
         */
        @NameInMap("saleTag")
        public QueryQuotaResponseBodyDataSubQuotaInfoListSaleTag saleTag;

        /**
         * <p>The information about the scheduling plan.</p>
         */
        @NameInMap("scheduleInfo")
        public QueryQuotaResponseBodyDataSubQuotaInfoListScheduleInfo scheduleInfo;

        /**
         * <p>The status of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The resource tag of a quota.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>478403690625249</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>This parameter corresponds to the resourceSystemType field.</p>
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
        /**
         * <p>The order information.</p>
         */
        @NameInMap("billingPolicy")
        public QueryQuotaResponseBodyDataBillingPolicy billingPolicy;

        /**
         * <p>The ID of the Managed Service for Prometheus cluster.</p>
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
         * <p>1714356241163</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to create the quota plan.</p>
         * 
         * <strong>example:</strong>
         * <p>1248953767546358</p>
         */
        @NameInMap("creatorId")
        public String creatorId;

        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The quota ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2523</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The quota name.</p>
         * 
         * <strong>example:</strong>
         * <p>quota_a</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The quota alias.</p>
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
         * <p>The parent resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("parentId")
        public String parentId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The identifiers of MaxCompute quota objects. The identifiers are the same as those in the Alibaba Cloud sales bill. This parameter is used for tags.</p>
         */
        @NameInMap("saleTag")
        public QueryQuotaResponseBodyDataSaleTag saleTag;

        /**
         * <p>The information about the scheduling plan.</p>
         */
        @NameInMap("scheduleInfo")
        public QueryQuotaResponseBodyDataScheduleInfo scheduleInfo;

        /**
         * <p>The status of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The level-2 quotas.</p>
         */
        @NameInMap("subQuotaInfoList")
        public java.util.List<QueryQuotaResponseBodyDataSubQuotaInfoList> subQuotaInfoList;

        /**
         * <p>The resource tag of a quota.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>478403690625249</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>This parameter corresponds to the resourceSystemType field.</p>
         * 
         * <strong>example:</strong>
         * <p>FUXI_OFFLINE</p>
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
