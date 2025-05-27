// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDisposeStrategyResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public ListDisposeStrategyResponseBodyData data;

    /**
     * <p>The returned message.</p>
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
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
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

    public static class ListDisposeStrategyResponseBodyDataPageInfo extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
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
        /**
         * <p>The UUID of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_71e24437d2797ce8fc59692905a4****</p>
         */
        @NameInMap("AlertUuid")
        public String alertUuid;

        /**
         * <p>The ID of the Alibaba Cloud account that is associated with the policy in SIEM.</p>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        @NameInMap("Aliuid")
        public Long aliuid;

        /**
         * <p>The status of the policy. Valid values:</p>
         * <ul>
         * <li>0: invalid</li>
         * <li>1: valid</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EffectiveStatus")
        public Integer effectiveStatus;

        /**
         * <p>The details of the entity. The value is a JSON array.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ip&quot;:&quot;1.1.1.1&quot;}]</p>
         */
        @NameInMap("Entity")
        public java.util.List<?> entity;

        /**
         * <p>The ID of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("EntityId")
        public Long entityId;

        /**
         * <p>The type of the entity. Valid values:</p>
         * <ul>
         * <li>ip</li>
         * <li>process</li>
         * <li>file</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The summary information about the failed task.</p>
         * 
         * <strong>example:</strong>
         * <p>DisposalEntity failed which description is Aegis Quarantine File , return_info failed which description is Check Aegis Process Result , [ERROR DETAIL] *******.php:file not found</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The end time of the task.</p>
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
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Multiple type of alerts, including Miner Network, Command line download and run malicious files, Backdoor Process, etc</p>
         */
        @NameInMap("IncidentName")
        public String incidentName;

        /**
         * <p>The UUID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
         */
        @NameInMap("IncidentUuid")
        public String incidentUuid;

        /**
         * <p>The name of the playbook, which is the unique identifier of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>WafBlockIP</p>
         */
        @NameInMap("PlaybookName")
        public String playbookName;

        /**
         * <p>The type of the playbook. Valid values:</p>
         * <ul>
         * <li>system: user-triggered playbook</li>
         * <li>custom: event-triggered playbook</li>
         * <li>custom_alert: alert-triggered playbook</li>
         * <li>soar-manual: user-run playbook</li>
         * <li>soar-mdr: MDR-run playbook</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("PlaybookType")
        public String playbookType;

        /**
         * <p>The UUID of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>system_aliyun_clb_process_book</p>
         */
        @NameInMap("PlaybookUuid")
        public String playbookUuid;

        /**
         * <p>The scope of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>[{ aliUid: 1766185894104675 }]</p>
         */
        @NameInMap("Scope")
        public java.util.List<?> scope;

        /**
         * <p>The ID of the SOAR handling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>577bbf90-a770-44a7-8154-586aa2d318fa</p>
         */
        @NameInMap("SophonTaskId")
        public String sophonTaskId;

        /**
         * <p>The running status of the playbook. Valid values:</p>
         * <ul>
         * <li>200: successful</li>
         * <li>10: deleted</li>
         * <li>5: failed</li>
         * <li>0: initial</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the Alibaba account that is used to configure the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>176555323***</p>
         */
        @NameInMap("SubAliuid")
        public Long subAliuid;

        /**
         * <p>The parameters that are used to trigger the playbook. The value is in the JSON format.</p>
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

        @NameInMap("TaskUrl")
        public String taskUrl;

        public static ListDisposeStrategyResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDisposeStrategyResponseBodyDataResponseData self = new ListDisposeStrategyResponseBodyDataResponseData();
            return TeaModel.build(map, self);
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
