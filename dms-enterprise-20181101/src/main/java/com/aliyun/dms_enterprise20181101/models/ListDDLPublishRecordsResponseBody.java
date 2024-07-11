// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDDLPublishRecordsResponseBody extends TeaModel {
    /**
     * <p>The details of the publishing records.</p>
     */
    @NameInMap("DDLPublishRecordList")
    public java.util.List<ListDDLPublishRecordsResponseBodyDDLPublishRecordList> DDLPublishRecordList;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A1549FB0-D4B8-4140-919F-17322C1072B8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDDLPublishRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDDLPublishRecordsResponseBody self = new ListDDLPublishRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDDLPublishRecordsResponseBody setDDLPublishRecordList(java.util.List<ListDDLPublishRecordsResponseBodyDDLPublishRecordList> DDLPublishRecordList) {
        this.DDLPublishRecordList = DDLPublishRecordList;
        return this;
    }
    public java.util.List<ListDDLPublishRecordsResponseBodyDDLPublishRecordList> getDDLPublishRecordList() {
        return this.DDLPublishRecordList;
    }

    public ListDDLPublishRecordsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDDLPublishRecordsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDDLPublishRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDDLPublishRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoListPublishJobList extends TeaModel {
        /**
         * <p>The ID of the SQL task group.</p>
         * 
         * <strong>example:</strong>
         * <p>423515</p>
         */
        @NameInMap("DBTaskGroupId")
        public Long DBTaskGroupId;

        /**
         * <p>The number of SQL statements that are executed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExecuteCount")
        public Long executeCount;

        /**
         * <p>The script for data changes.</p>
         * 
         * <strong>example:</strong>
         * <p>ALTER TABLE test_toolkit_rename_table_after_rename MODIFY COLUMN gmt_modified datetime NOT NULL</p>
         */
        @NameInMap("Scripts")
        public String scripts;

        /**
         * <p>The description of the state.</p>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The name of the table after the change.</p>
         * 
         * <strong>example:</strong>
         * <p>test_toolkit_rename_table_after_rename</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The state of the publishing task. Valid values:</p>
         * <ul>
         * <li><strong>NONE</strong>: The state of the task is unknown.</li>
         * <li><strong>SUCCESS</strong>: The task is successful.</li>
         * <li><strong>FAIL</strong>: The task fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("TaskJobStatus")
        public String taskJobStatus;

        public static ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoListPublishJobList build(java.util.Map<String, ?> map) throws Exception {
            ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoListPublishJobList self = new ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoListPublishJobList();
            return TeaModel.build(map, self);
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoListPublishJobList setDBTaskGroupId(Long DBTaskGroupId) {
            this.DBTaskGroupId = DBTaskGroupId;
            return this;
        }
        public Long getDBTaskGroupId() {
            return this.DBTaskGroupId;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoListPublishJobList setExecuteCount(Long executeCount) {
            this.executeCount = executeCount;
            return this;
        }
        public Long getExecuteCount() {
            return this.executeCount;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoListPublishJobList setScripts(String scripts) {
            this.scripts = scripts;
            return this;
        }
        public String getScripts() {
            return this.scripts;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoListPublishJobList setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoListPublishJobList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoListPublishJobList setTaskJobStatus(String taskJobStatus) {
            this.taskJobStatus = taskJobStatus;
            return this;
        }
        public String getTaskJobStatus() {
            return this.taskJobStatus;
        }

    }

    public static class ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoList extends TeaModel {
        /**
         * <p>The ID of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>4325</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>Indicates whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The database is a logical database.</li>
         * <li><strong>false</strong>: the database is not a logical database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The time to publish the ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-14 20:52:38</p>
         */
        @NameInMap("PlanTime")
        public String planTime;

        /**
         * <p>The list of the publishing tasks.</p>
         */
        @NameInMap("PublishJobList")
        public java.util.List<ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoListPublishJobList> publishJobList;

        /**
         * <p>The publishing policy. Valid values:</p>
         * <ul>
         * <li><strong>IMMEDIATELY</strong>: immediately publishes the ticket.</li>
         * <li><strong>REGULARLY</strong>: publishes the ticket at a scheduled time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IMMEDIATELY</p>
         */
        @NameInMap("PublishStrategy")
        public String publishStrategy;

        /**
         * <p>The description of the state.</p>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The state of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("TaskJobStatus")
        public String taskJobStatus;

        public static ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoList self = new ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoList();
            return TeaModel.build(map, self);
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoList setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoList setPlanTime(String planTime) {
            this.planTime = planTime;
            return this;
        }
        public String getPlanTime() {
            return this.planTime;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoList setPublishJobList(java.util.List<ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoListPublishJobList> publishJobList) {
            this.publishJobList = publishJobList;
            return this;
        }
        public java.util.List<ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoListPublishJobList> getPublishJobList() {
            return this.publishJobList;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoList setPublishStrategy(String publishStrategy) {
            this.publishStrategy = publishStrategy;
            return this;
        }
        public String getPublishStrategy() {
            return this.publishStrategy;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoList setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoList setTaskJobStatus(String taskJobStatus) {
            this.taskJobStatus = taskJobStatus;
            return this;
        }
        public String getTaskJobStatus() {
            return this.taskJobStatus;
        }

    }

    public static class ListDDLPublishRecordsResponseBodyDDLPublishRecordList extends TeaModel {
        /**
         * <p>The time when the approval expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-14 20:52:38</p>
         */
        @NameInMap("AuditExpireTime")
        public String auditExpireTime;

        /**
         * <p>The approval state of the ticket. Valid values:</p>
         * <ul>
         * <li><strong>EXEMPT_PASS</strong>: The ticket passes without approval.</li>
         * <li><strong>TO_AUDIT</strong>: The ticket is pending for approval.</li>
         * <li><strong>CANCEL</strong>: The ticket is canceled.</li>
         * <li><strong>SUCCESS</strong>: The ticket is approved.</li>
         * <li><strong>FAIL</strong>: The ticket fails to pass the approval.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CANCEL</p>
         */
        @NameInMap("AuditStatus")
        public String auditStatus;

        /**
         * <p>Release remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>Release remarks</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The ID of the user who creates the ticket. You can obtain the user ID by calling the <a href="https://help.aliyun.com/document_detail/147098.html">GetUser</a> operation and querying the value of the UserId parameter. The value is not the unique ID (UID) of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1423</p>
         */
        @NameInMap("CreatorId")
        public Long creatorId;

        /**
         * <p>Indicates whether the approval is terminated. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The approval is terminated.</li>
         * <li><strong>false</strong>: The approval is not terminated.</li>
         * </ul>
         * <blockquote>
         * <p>Multiple reasons can terminate the approval. For example, you withdraw the application or your ticket is not approved before the specified time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Finality")
        public Boolean finality;

        /**
         * <p>The reason for the termination.</p>
         * 
         * <strong>example:</strong>
         * <p>CANCEL</p>
         */
        @NameInMap("FinalityReason")
        public String finalityReason;

        /**
         * <p>The publishing state of the ticket. Valid values:</p>
         * <ul>
         * <li><strong>START</strong>: The ticket is created.</li>
         * <li><strong>ANALYZE</strong>: The ticket is under analysis.</li>
         * <li><strong>AUDIT</strong>: The ticket is under approval.</li>
         * <li><strong>DISPATCH</strong>: A task is generated for the ticket.</li>
         * <li><strong>SUCCESS</strong>: The task is successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUDIT</p>
         */
        @NameInMap("PublishStatus")
        public String publishStatus;

        /**
         * <p>The list of publishing tasks.</p>
         */
        @NameInMap("PublishTaskInfoList")
        public java.util.List<ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoList> publishTaskInfoList;

        /**
         * <p>The risk level of the operation. Valid values:</p>
         * <ul>
         * <li><strong>NONE_RISK</strong>: The operation does not have risks.</li>
         * <li><strong>LOW_RISK</strong>: The operation is at low risk.</li>
         * <li><strong>MIDDLE_RISK</strong>: The operation is at medium risk.</li>
         * <li><strong>HIGH_RISK</strong>: The operation is at high risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LOW_RISK</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The description of the publishing state.</p>
         * 
         * <strong>example:</strong>
         * <p>CANCEL</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The ID of the approval process.</p>
         * 
         * <strong>example:</strong>
         * <p>432153</p>
         */
        @NameInMap("WorkflowInstanceId")
        public Long workflowInstanceId;

        public static ListDDLPublishRecordsResponseBodyDDLPublishRecordList build(java.util.Map<String, ?> map) throws Exception {
            ListDDLPublishRecordsResponseBodyDDLPublishRecordList self = new ListDDLPublishRecordsResponseBodyDDLPublishRecordList();
            return TeaModel.build(map, self);
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordList setAuditExpireTime(String auditExpireTime) {
            this.auditExpireTime = auditExpireTime;
            return this;
        }
        public String getAuditExpireTime() {
            return this.auditExpireTime;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordList setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordList setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordList setFinality(Boolean finality) {
            this.finality = finality;
            return this;
        }
        public Boolean getFinality() {
            return this.finality;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordList setFinalityReason(String finalityReason) {
            this.finalityReason = finalityReason;
            return this;
        }
        public String getFinalityReason() {
            return this.finalityReason;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordList setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordList setPublishTaskInfoList(java.util.List<ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoList> publishTaskInfoList) {
            this.publishTaskInfoList = publishTaskInfoList;
            return this;
        }
        public java.util.List<ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoList> getPublishTaskInfoList() {
            return this.publishTaskInfoList;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordList setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordList setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ListDDLPublishRecordsResponseBodyDDLPublishRecordList setWorkflowInstanceId(Long workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

    }

}
