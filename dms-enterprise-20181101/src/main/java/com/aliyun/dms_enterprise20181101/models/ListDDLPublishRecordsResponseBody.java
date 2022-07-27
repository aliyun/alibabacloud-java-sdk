// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDDLPublishRecordsResponseBody extends TeaModel {
    @NameInMap("DDLPublishRecordList")
    public java.util.List<ListDDLPublishRecordsResponseBodyDDLPublishRecordList> DDLPublishRecordList;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DBTaskGroupId")
        public Long DBTaskGroupId;

        @NameInMap("ExecuteCount")
        public Long executeCount;

        @NameInMap("Scripts")
        public String scripts;

        @NameInMap("StatusDesc")
        public String statusDesc;

        @NameInMap("TableName")
        public String tableName;

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
        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("PlanTime")
        public String planTime;

        @NameInMap("PublishJobList")
        public java.util.List<ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoListPublishJobList> publishJobList;

        @NameInMap("PublishStrategy")
        public String publishStrategy;

        @NameInMap("StatusDesc")
        public String statusDesc;

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
        @NameInMap("AuditExpireTime")
        public String auditExpireTime;

        @NameInMap("AuditStatus")
        public String auditStatus;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("Finality")
        public Boolean finality;

        @NameInMap("FinalityReason")
        public String finalityReason;

        @NameInMap("PublishStatus")
        public String publishStatus;

        @NameInMap("PublishTaskInfoList")
        public java.util.List<ListDDLPublishRecordsResponseBodyDDLPublishRecordListPublishTaskInfoList> publishTaskInfoList;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("StatusDesc")
        public String statusDesc;

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
