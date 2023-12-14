// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDisposeStrategyResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ListDisposeStrategyResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
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
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
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
         */
        @NameInMap("AlertUuid")
        public String alertUuid;

        /**
         * <p>The ID of the Alibaba Cloud account that is associated with the policy in SIEM.</p>
         */
        @NameInMap("Aliuid")
        public Long aliuid;

        /**
         * <p>The status of the policy. Valid values:</p>
         * <br>
         * <p>*   0: invalid</p>
         * <p>*   1: valid</p>
         */
        @NameInMap("EffectiveStatus")
        public Integer effectiveStatus;

        /**
         * <p>The details of the entity. The value is a JSON array.</p>
         */
        @NameInMap("Entity")
        public java.util.List<?> entity;

        /**
         * <p>The ID of the entity.</p>
         */
        @NameInMap("EntityId")
        public Long entityId;

        /**
         * <p>The type of the entity. Valid values:</p>
         * <br>
         * <p>*   ip</p>
         * <p>*   process</p>
         * <p>*   file</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The summary information about the failed task.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The end time of the task.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the policy.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the event.</p>
         */
        @NameInMap("IncidentName")
        public String incidentName;

        /**
         * <p>The UUID of the event.</p>
         */
        @NameInMap("IncidentUuid")
        public String incidentUuid;

        /**
         * <p>The name of the playbook, which is the unique identifier of the playbook.</p>
         */
        @NameInMap("PlaybookName")
        public String playbookName;

        /**
         * <p>The type of the playbook. Valid values:</p>
         * <br>
         * <p>*   system: user-triggered playbook</p>
         * <p>*   custom: event-triggered playbook</p>
         * <p>*   custom_alert: alert-triggered playbook</p>
         * <p>*   soar-manual: user-run playbook</p>
         * <p>*   soar-mdr: MDR-run playbook</p>
         */
        @NameInMap("PlaybookType")
        public String playbookType;

        /**
         * <p>The UUID of the playbook.</p>
         */
        @NameInMap("PlaybookUuid")
        public String playbookUuid;

        /**
         * <p>The scope of the policy.</p>
         */
        @NameInMap("Scope")
        public java.util.List<?> scope;

        /**
         * <p>The ID of the SOAR handling policy.</p>
         */
        @NameInMap("SophonTaskId")
        public String sophonTaskId;

        /**
         * <p>The running status of the playbook. Valid values:</p>
         * <br>
         * <p>*   200: successful</p>
         * <p>*   10: deleted</p>
         * <p>*   5: failed</p>
         * <p>*   0: initial</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the Alibaba account that is used to configure the policy.</p>
         */
        @NameInMap("SubAliuid")
        public Long subAliuid;

        /**
         * <p>The parameters that are used to trigger the playbook. The value is in the JSON format.</p>
         */
        @NameInMap("TaskParam")
        public String taskParam;

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
