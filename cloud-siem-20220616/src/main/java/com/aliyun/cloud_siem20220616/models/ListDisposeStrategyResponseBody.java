// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDisposeStrategyResponseBody extends TeaModel {
    /**
     * <p>The request status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The request return value.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public ListDisposeStrategyResponseBodyData data;

    /**
     * <p>The request return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDisposeStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDisposeStrategyResponseBody self = new ListDisposeStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDisposeStrategyResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListDisposeStrategyResponseBody setData(ListDisposeStrategyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDisposeStrategyResponseBodyData getData() {
        return this.data;
    }

    public ListDisposeStrategyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDisposeStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDisposeStrategyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDisposeStrategyResponseBodyDataGroupsGroupMeta extends TeaModel {
        @NameInMap("GroupInfo")
        public Object groupInfo;

        public static ListDisposeStrategyResponseBodyDataGroupsGroupMeta build(java.util.Map<String, ?> map) throws Exception {
            ListDisposeStrategyResponseBodyDataGroupsGroupMeta self = new ListDisposeStrategyResponseBodyDataGroupsGroupMeta();
            return TeaModel.build(map, self);
        }

        public ListDisposeStrategyResponseBodyDataGroupsGroupMeta setGroupInfo(Object groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public Object getGroupInfo() {
            return this.groupInfo;
        }

    }

    public static class ListDisposeStrategyResponseBodyDataGroups extends TeaModel {
        @NameInMap("FailedCount")
        public Long failedCount;

        @NameInMap("FirstOccurrenceTime")
        public Long firstOccurrenceTime;

        @NameInMap("GroupBy")
        public String groupBy;

        @NameInMap("GroupKey")
        public String groupKey;

        @NameInMap("GroupMeta")
        public ListDisposeStrategyResponseBodyDataGroupsGroupMeta groupMeta;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupTitle")
        public String groupTitle;

        @NameInMap("LastOccurrenceTime")
        public Long lastOccurrenceTime;

        @NameInMap("LatestModifiedTime")
        public Long latestModifiedTime;

        @NameInMap("RunningCount")
        public Long runningCount;

        @NameInMap("SuccessCount")
        public Long successCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListDisposeStrategyResponseBodyDataGroups build(java.util.Map<String, ?> map) throws Exception {
            ListDisposeStrategyResponseBodyDataGroups self = new ListDisposeStrategyResponseBodyDataGroups();
            return TeaModel.build(map, self);
        }

        public ListDisposeStrategyResponseBodyDataGroups setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public ListDisposeStrategyResponseBodyDataGroups setFirstOccurrenceTime(Long firstOccurrenceTime) {
            this.firstOccurrenceTime = firstOccurrenceTime;
            return this;
        }
        public Long getFirstOccurrenceTime() {
            return this.firstOccurrenceTime;
        }

        public ListDisposeStrategyResponseBodyDataGroups setGroupBy(String groupBy) {
            this.groupBy = groupBy;
            return this;
        }
        public String getGroupBy() {
            return this.groupBy;
        }

        public ListDisposeStrategyResponseBodyDataGroups setGroupKey(String groupKey) {
            this.groupKey = groupKey;
            return this;
        }
        public String getGroupKey() {
            return this.groupKey;
        }

        public ListDisposeStrategyResponseBodyDataGroups setGroupMeta(ListDisposeStrategyResponseBodyDataGroupsGroupMeta groupMeta) {
            this.groupMeta = groupMeta;
            return this;
        }
        public ListDisposeStrategyResponseBodyDataGroupsGroupMeta getGroupMeta() {
            return this.groupMeta;
        }

        public ListDisposeStrategyResponseBodyDataGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListDisposeStrategyResponseBodyDataGroups setGroupTitle(String groupTitle) {
            this.groupTitle = groupTitle;
            return this;
        }
        public String getGroupTitle() {
            return this.groupTitle;
        }

        public ListDisposeStrategyResponseBodyDataGroups setLastOccurrenceTime(Long lastOccurrenceTime) {
            this.lastOccurrenceTime = lastOccurrenceTime;
            return this;
        }
        public Long getLastOccurrenceTime() {
            return this.lastOccurrenceTime;
        }

        public ListDisposeStrategyResponseBodyDataGroups setLatestModifiedTime(Long latestModifiedTime) {
            this.latestModifiedTime = latestModifiedTime;
            return this;
        }
        public Long getLatestModifiedTime() {
            return this.latestModifiedTime;
        }

        public ListDisposeStrategyResponseBodyDataGroups setRunningCount(Long runningCount) {
            this.runningCount = runningCount;
            return this;
        }
        public Long getRunningCount() {
            return this.runningCount;
        }

        public ListDisposeStrategyResponseBodyDataGroups setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

        public ListDisposeStrategyResponseBodyDataGroups setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListDisposeStrategyResponseBodyDataPageInfo extends TeaModel {
        /**
         * <p>The current page number of the list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of records returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListDisposeStrategyResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDisposeStrategyResponseBodyDataPageInfo self = new ListDisposeStrategyResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public ListDisposeStrategyResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListDisposeStrategyResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDisposeStrategyResponseBodyDataPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListDisposeStrategyResponseBodyDataResponseData extends TeaModel {
        @NameInMap("AlertName")
        public String alertName;

        /**
         * <p>The alert UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_71e24437d2797ce8fc59692905a4****</p>
         */
        @NameInMap("AlertUuid")
        public String alertUuid;

        /**
         * <p>The SIEM primary account ID associated with the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        @NameInMap("Aliuid")
        public Long aliuid;

        /**
         * <p>The policy status. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EffectiveStatus")
        public Integer effectiveStatus;

        /**
         * <p>The entity details in JSON array format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ip&quot;:&quot;1.1.1.1&quot;}]</p>
         */
        @NameInMap("Entity")
        public java.util.List<?> entity;

        /**
         * <p>The entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("EntityId")
        public Long entityId;

        /**
         * <p>The entity type. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The failure summary of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>DisposalEntity failed which description is Aegis Quarantine File , return_info failed which description is Check Aegis Process Result , [ERROR DETAIL] *******.php:file not found</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The finish time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-10 21:34:07</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The incident name.</p>
         * 
         * <strong>example:</strong>
         * <p>Multiple type of alerts, including Miner Network, Command line download and run malicious files, Backdoor Process, etc</p>
         */
        @NameInMap("IncidentName")
        public String incidentName;

        /**
         * <p>The globally unique UUID of the incident.</p>
         * 
         * <strong>example:</strong>
         * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
         */
        @NameInMap("IncidentUuid")
        public String incidentUuid;

        /**
         * <p>The unique identifier name of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>WafBlockIP</p>
         */
        @NameInMap("PlaybookName")
        public String playbookName;

        /**
         * <p>The playbook type. Valid values:</p>
         * <ul>
         * <li>system: manual handling</li>
         * <li>custom: event-triggered playbook</li>
         * <li>custom_alert: alert-triggered playbook</li>
         * <li>soar-manual: manually run playbook</li>
         * <li>soar-mdr: MDR-run playbook</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("PlaybookType")
        public String playbookType;

        /**
         * <p>The playbook UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>system_aliyun_clb_process_book</p>
         */
        @NameInMap("PlaybookUuid")
        public String playbookUuid;

        /**
         * <p>The disposition scope.</p>
         * 
         * <strong>example:</strong>
         * <p>[{ aliUid: 1766185894104675 }]</p>
         */
        @NameInMap("Scope")
        public java.util.List<?> scope;

        /**
         * <p>The SOAR response policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>577bbf90-a770-44a7-8154-586aa2d3****</p>
         */
        @NameInMap("SophonTaskId")
        public String sophonTaskId;

        /**
         * <p>The playbook invocation status. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The Alibaba Cloud account ID that configured the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>176555323***</p>
         */
        @NameInMap("SubAliuid")
        public Long subAliuid;

        /**
         * <p>The playbook trigger parameters in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;file&quot;: {
         *             &quot;op_code&quot;: &quot;2&quot;,
         *             &quot;file_path&quot;: &quot;/root/alert0913/a886.jsp&quot;,
         *             &quot;entity_type&quot;: &quot;file&quot;,
         *             &quot;entity_name&quot;: &quot;a886.jsp&quot;,
         *             &quot;file_name&quot;: &quot;a886.jsp&quot;,
         *             &quot;file_owner&quot;: &quot;USER:,GROUP:&quot;,
         *             &quot;hash_value&quot;: &quot;5def10c9a4287d0920d86b42420b20b0&quot;,
         *             &quot;op_level&quot;: &quot;2&quot;,
         *             &quot;entity_id&quot;: &quot;/root/alert0913/a886.jsp&quot;,
         *             &quot;host_uuid&quot;: {
         *                   &quot;entity_type&quot;: &quot;host&quot;,
         *                   &quot;entity_name&quot;: &quot;N/A&quot;,
         *                   &quot;is_comprised&quot;: &quot;1&quot;,
         *                   &quot;os_type&quot;: &quot;linux&quot;,
         *                   &quot;entity_id&quot;: &quot;5f58ef67-8803-4314-8d67-c87dc92b****&quot;,
         *                   &quot;host_uuid&quot;: &quot;5f58ef67-8803-4314-8d67-c87dc92b****&quot;,
         *                   &quot;host_name&quot;: &quot;N/A&quot;
         *             },
         *             &quot;malware_type&quot;: &quot;${aliyun.siem.sas.alert_tag.webshell}&quot;
         *       },
         *       &quot;_sys_siem&quot;: {
         *             &quot;cloudCode&quot;: &quot;aliyun&quot;,
         *             &quot;alertId&quot;: &quot;89416745494****&quot;
         *       },
         *       &quot;scope&quot;: [
         *             {
         *                   &quot;aliUid&quot;: 1766185894104****
         *             }
         *       ]
         * }</p>
         */
        @NameInMap("TaskParam")
        public String taskParam;

        /**
         * <p>The playbook URL.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;playbookUuid&quot;:&quot;system_aliyun_aegis_stop_container_book&quot;,&quot;requestUuid&quot;:&quot;e8924356-448b-4301-aee9-*******&quot;}</p>
         */
        @NameInMap("TaskUrl")
        public String taskUrl;

        public static ListDisposeStrategyResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDisposeStrategyResponseBodyDataResponseData self = new ListDisposeStrategyResponseBodyDataResponseData();
            return TeaModel.build(map, self);
        }

        public ListDisposeStrategyResponseBodyDataResponseData setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setAlertUuid(String alertUuid) {
            this.alertUuid = alertUuid;
            return this;
        }
        public String getAlertUuid() {
            return this.alertUuid;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setAliuid(Long aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public Long getAliuid() {
            return this.aliuid;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setEffectiveStatus(Integer effectiveStatus) {
            this.effectiveStatus = effectiveStatus;
            return this;
        }
        public Integer getEffectiveStatus() {
            return this.effectiveStatus;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setEntity(java.util.List<?> entity) {
            this.entity = entity;
            return this;
        }
        public java.util.List<?> getEntity() {
            return this.entity;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setEntityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }
        public Long getEntityId() {
            return this.entityId;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setIncidentName(String incidentName) {
            this.incidentName = incidentName;
            return this;
        }
        public String getIncidentName() {
            return this.incidentName;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setIncidentUuid(String incidentUuid) {
            this.incidentUuid = incidentUuid;
            return this;
        }
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setPlaybookName(String playbookName) {
            this.playbookName = playbookName;
            return this;
        }
        public String getPlaybookName() {
            return this.playbookName;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setPlaybookType(String playbookType) {
            this.playbookType = playbookType;
            return this;
        }
        public String getPlaybookType() {
            return this.playbookType;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setPlaybookUuid(String playbookUuid) {
            this.playbookUuid = playbookUuid;
            return this;
        }
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setScope(java.util.List<?> scope) {
            this.scope = scope;
            return this;
        }
        public java.util.List<?> getScope() {
            return this.scope;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setSophonTaskId(String sophonTaskId) {
            this.sophonTaskId = sophonTaskId;
            return this;
        }
        public String getSophonTaskId() {
            return this.sophonTaskId;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setSubAliuid(Long subAliuid) {
            this.subAliuid = subAliuid;
            return this;
        }
        public Long getSubAliuid() {
            return this.subAliuid;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setTaskParam(String taskParam) {
            this.taskParam = taskParam;
            return this;
        }
        public String getTaskParam() {
            return this.taskParam;
        }

        public ListDisposeStrategyResponseBodyDataResponseData setTaskUrl(String taskUrl) {
            this.taskUrl = taskUrl;
            return this;
        }
        public String getTaskUrl() {
            return this.taskUrl;
        }

    }

    public static class ListDisposeStrategyResponseBodyData extends TeaModel {
        @NameInMap("Groups")
        public java.util.List<ListDisposeStrategyResponseBodyDataGroups> groups;

        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageInfo")
        public ListDisposeStrategyResponseBodyDataPageInfo pageInfo;

        /**
         * <p>The detailed data.</p>
         */
        @NameInMap("ResponseData")
        public java.util.List<ListDisposeStrategyResponseBodyDataResponseData> responseData;

        public static ListDisposeStrategyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDisposeStrategyResponseBodyData self = new ListDisposeStrategyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDisposeStrategyResponseBodyData setGroups(java.util.List<ListDisposeStrategyResponseBodyDataGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<ListDisposeStrategyResponseBodyDataGroups> getGroups() {
            return this.groups;
        }

        public ListDisposeStrategyResponseBodyData setPageInfo(ListDisposeStrategyResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public ListDisposeStrategyResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public ListDisposeStrategyResponseBodyData setResponseData(java.util.List<ListDisposeStrategyResponseBodyDataResponseData> responseData) {
            this.responseData = responseData;
            return this;
        }
        public java.util.List<ListDisposeStrategyResponseBodyDataResponseData> getResponseData() {
            return this.responseData;
        }

    }

}
