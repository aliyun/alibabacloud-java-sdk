// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertHistoriesResponseBody extends TeaModel {
    /**
     * <p>The list of alert histories that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;alertHistoryId&quot;:&quot;ah_123456&quot;,&quot;alertRuleId&quot;:&quot;rule_789&quot;,&quot;status&quot;:&quot;ALARM&quot;,&quot;startTime&quot;:1704067200000}]</p>
     */
    @NameInMap("data")
    public java.util.List<ListAlertHistoriesResponseBodyData> data;

    /**
     * <p>The maximum number of entries to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>2-ba4d-4b9f-aa24-dcb067a30f1c</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of alert history records that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>81</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListAlertHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertHistoriesResponseBody self = new ListAlertHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertHistoriesResponseBody setData(java.util.List<ListAlertHistoriesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAlertHistoriesResponseBodyData> getData() {
        return this.data;
    }

    public ListAlertHistoriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlertHistoriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAlertHistoriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertHistoriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlertHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertHistoriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAlertHistoriesResponseBodyData extends TeaModel {
        /**
         * <p>The unique identifier of the alert history.</p>
         * 
         * <strong>example:</strong>
         * <p>u1oe4i7c197uucfmvscum4u797</p>
         */
        @NameInMap("alertHistoryId")
        public String alertHistoryId;

        /**
         * <p>The unique identifier of the alert rule that generated the alert history.</p>
         * 
         * <strong>example:</strong>
         * <p>51d0da46-bb65-4a14-8d65-de73f41e495f</p>
         */
        @NameInMap("alertRuleId")
        public String alertRuleId;

        /**
         * <p>The snapshot of the annotations of the alert rule. The annotations are stored as key-value pairs and copied from the rule when the alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;_cms_alert_explore_url&quot;:&quot;<a href="https://sls.console.aliyun.com/...%22%7D">https://sls.console.aliyun.com/...&quot;}</a></p>
         */
        @NameInMap("annotations")
        public java.util.Map<String, String> annotations;

        /**
         * <p>The business source.</p>
         * 
         * <strong>example:</strong>
         * <p>managed_service_for_prometheus</p>
         */
        @NameInMap("bizSource")
        public String bizSource;

        /**
         * <p>The cumulative number of alerts (alert events) during the alert duration.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("count")
        public Long count;

        /**
         * <p>The end time (recovery time) of the alert. This field has a value only when the alert history enters the OK state. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1740535517000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The creation time of the alert history record. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1751608363000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>The last modification time of the alert history record. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1751608363000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>The detailed information of the alert object. The information is stored as key-value pairs.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;datasourceInfo&quot;:{&quot;type&quot;:&quot;SLS_MULTI_DS&quot;}}</p>
         */
        @NameInMap("instanceDetail")
        public java.util.Map<String, String> instanceDetail;

        /**
         * <p>The unique key (instanceKey) used to identify the alert object instance.</p>
         * 
         * <strong>example:</strong>
         * <p>entity/apm/apm.service/6dc9e46fda6d012537b48c3250ff806b</p>
         */
        @NameInMap("instanceKey")
        public String instanceKey;

        /**
         * <p>The snapshot of the labels of the alert rule. The labels are stored as key-value pairs and copied from the rule when the alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;_cms_rule_id&quot;:&quot;42c0f464-a3b0-4c4b-b426-6242289244f8&quot;,&quot;tenant_id&quot;:&quot;mygt&quot;}</p>
         */
        @NameInMap("labels")
        public java.util.Map<String, String> labels;

        /**
         * <p>The level of the most recent alert during the alert duration, such as CRITICAL, WARN, or INFO.</p>
         * 
         * <strong>example:</strong>
         * <p>CRITICAL</p>
         */
        @NameInMap("latestLevel")
        public String latestLevel;

        /**
         * <p>The highest alert level reached during the alert duration.</p>
         * 
         * <strong>example:</strong>
         * <p>CRITICAL</p>
         */
        @NameInMap("maxLevel")
        public String maxLevel;

        /**
         * <p>The content of the latest alert message.</p>
         * 
         * <strong>example:</strong>
         * <p>The number of zombie child processes of the process {{$tags.comm}} running on the instance {{$tags.instanceId}} is greater than 128</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>Indicates whether the observed object is in the global scope. The value is copied from the rule when the alert history is created.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("observeResourceGlobalScope")
        public Boolean observeResourceGlobalScope;

        /**
         * <p>The serialized string of the observed object list. The value is copied from the rule when the alert history is created.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;resourceId&quot;:&quot;i-bp1234567890abcdef&quot;,&quot;resourceType&quot;:&quot;ACS::ECS::Instance&quot;}]</p>
         */
        @NameInMap("observeResourceList")
        public String observeResourceList;

        /**
         * <p>The type of the observed object, such as PROMETHEUS, APM, RUM, or cms_basic. The value is copied from the rule when the alert history is created.</p>
         * 
         * <strong>example:</strong>
         * <p>PROMETHEUS</p>
         */
        @NameInMap("observeResourceType")
        public String observeResourceType;

        /**
         * <p>The ID of the region to which the alert history belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The display name of the corresponding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>myTestRule</p>
         */
        @NameInMap("ruleDisplayName")
        public String ruleDisplayName;

        /**
         * <p>The notification sending configuration information corresponding to the alert history.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;notification&quot;:{&quot;contacts&quot;:[&quot;ops-team&quot;],&quot;silenceTime&quot;:3600}}</p>
         */
        @NameInMap("send")
        public AlertRuleSend send;

        /**
         * <p>The start time of the alert history. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1751508233000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <p>The current alert status of the rule. Valid values: OK (recovered) and ALARM (alerting).</p>
         * 
         * <strong>example:</strong>
         * <p>ALARM</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The identifier of the workspace to which the alert history belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-<userId>-cn-hangzhou</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static ListAlertHistoriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAlertHistoriesResponseBodyData self = new ListAlertHistoriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAlertHistoriesResponseBodyData setAlertHistoryId(String alertHistoryId) {
            this.alertHistoryId = alertHistoryId;
            return this;
        }
        public String getAlertHistoryId() {
            return this.alertHistoryId;
        }

        public ListAlertHistoriesResponseBodyData setAlertRuleId(String alertRuleId) {
            this.alertRuleId = alertRuleId;
            return this;
        }
        public String getAlertRuleId() {
            return this.alertRuleId;
        }

        public ListAlertHistoriesResponseBodyData setAnnotations(java.util.Map<String, String> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.Map<String, String> getAnnotations() {
            return this.annotations;
        }

        public ListAlertHistoriesResponseBodyData setBizSource(String bizSource) {
            this.bizSource = bizSource;
            return this;
        }
        public String getBizSource() {
            return this.bizSource;
        }

        public ListAlertHistoriesResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListAlertHistoriesResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListAlertHistoriesResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAlertHistoriesResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListAlertHistoriesResponseBodyData setInstanceDetail(java.util.Map<String, String> instanceDetail) {
            this.instanceDetail = instanceDetail;
            return this;
        }
        public java.util.Map<String, String> getInstanceDetail() {
            return this.instanceDetail;
        }

        public ListAlertHistoriesResponseBodyData setInstanceKey(String instanceKey) {
            this.instanceKey = instanceKey;
            return this;
        }
        public String getInstanceKey() {
            return this.instanceKey;
        }

        public ListAlertHistoriesResponseBodyData setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public ListAlertHistoriesResponseBodyData setLatestLevel(String latestLevel) {
            this.latestLevel = latestLevel;
            return this;
        }
        public String getLatestLevel() {
            return this.latestLevel;
        }

        public ListAlertHistoriesResponseBodyData setMaxLevel(String maxLevel) {
            this.maxLevel = maxLevel;
            return this;
        }
        public String getMaxLevel() {
            return this.maxLevel;
        }

        public ListAlertHistoriesResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAlertHistoriesResponseBodyData setObserveResourceGlobalScope(Boolean observeResourceGlobalScope) {
            this.observeResourceGlobalScope = observeResourceGlobalScope;
            return this;
        }
        public Boolean getObserveResourceGlobalScope() {
            return this.observeResourceGlobalScope;
        }

        public ListAlertHistoriesResponseBodyData setObserveResourceList(String observeResourceList) {
            this.observeResourceList = observeResourceList;
            return this;
        }
        public String getObserveResourceList() {
            return this.observeResourceList;
        }

        public ListAlertHistoriesResponseBodyData setObserveResourceType(String observeResourceType) {
            this.observeResourceType = observeResourceType;
            return this;
        }
        public String getObserveResourceType() {
            return this.observeResourceType;
        }

        public ListAlertHistoriesResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAlertHistoriesResponseBodyData setRuleDisplayName(String ruleDisplayName) {
            this.ruleDisplayName = ruleDisplayName;
            return this;
        }
        public String getRuleDisplayName() {
            return this.ruleDisplayName;
        }

        public ListAlertHistoriesResponseBodyData setSend(AlertRuleSend send) {
            this.send = send;
            return this;
        }
        public AlertRuleSend getSend() {
            return this.send;
        }

        public ListAlertHistoriesResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListAlertHistoriesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAlertHistoriesResponseBodyData setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
