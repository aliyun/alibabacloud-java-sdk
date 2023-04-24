// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDatabaseExportOrderDetailResponseBody extends TeaModel {
    @NameInMap("DatabaseExportOrderDetail")
    public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetail databaseExportOrderDetail;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDatabaseExportOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseExportOrderDetailResponseBody self = new GetDatabaseExportOrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatabaseExportOrderDetailResponseBody setDatabaseExportOrderDetail(GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetail databaseExportOrderDetail) {
        this.databaseExportOrderDetail = databaseExportOrderDetail;
        return this;
    }
    public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetail getDatabaseExportOrderDetail() {
        return this.databaseExportOrderDetail;
    }

    public GetDatabaseExportOrderDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDatabaseExportOrderDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDatabaseExportOrderDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatabaseExportOrderDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigExportTypes extends TeaModel {
        @NameInMap("ExportTypes")
        public java.util.List<String> exportTypes;

        public static GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigExportTypes build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigExportTypes self = new GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigExportTypes();
            return TeaModel.build(map, self);
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigExportTypes setExportTypes(java.util.List<String> exportTypes) {
            this.exportTypes = exportTypes;
            return this;
        }
        public java.util.List<String> getExportTypes() {
            return this.exportTypes;
        }

    }

    public static class GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigSQLExtOption extends TeaModel {
        @NameInMap("SQLExtOption")
        public java.util.List<String> SQLExtOption;

        public static GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigSQLExtOption build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigSQLExtOption self = new GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigSQLExtOption();
            return TeaModel.build(map, self);
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigSQLExtOption setSQLExtOption(java.util.List<String> SQLExtOption) {
            this.SQLExtOption = SQLExtOption;
            return this;
        }
        public java.util.List<String> getSQLExtOption() {
            return this.SQLExtOption;
        }

    }

    public static class GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigSelectedTables extends TeaModel {
        @NameInMap("SelectedTables")
        public java.util.List<String> selectedTables;

        public static GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigSelectedTables build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigSelectedTables self = new GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigSelectedTables();
            return TeaModel.build(map, self);
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigSelectedTables setSelectedTables(java.util.List<String> selectedTables) {
            this.selectedTables = selectedTables;
            return this;
        }
        public java.util.List<String> getSelectedTables() {
            return this.selectedTables;
        }

    }

    public static class GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfig extends TeaModel {
        @NameInMap("DbName")
        public String dbName;

        @NameInMap("ExportContent")
        public String exportContent;

        @NameInMap("ExportTypes")
        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigExportTypes exportTypes;

        @NameInMap("SQLExtOption")
        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigSQLExtOption SQLExtOption;

        @NameInMap("SelectedTables")
        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigSelectedTables selectedTables;

        @NameInMap("TargetOption")
        public String targetOption;

        public static GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfig self = new GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfig();
            return TeaModel.build(map, self);
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfig setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfig setExportContent(String exportContent) {
            this.exportContent = exportContent;
            return this;
        }
        public String getExportContent() {
            return this.exportContent;
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfig setExportTypes(GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigExportTypes exportTypes) {
            this.exportTypes = exportTypes;
            return this;
        }
        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigExportTypes getExportTypes() {
            return this.exportTypes;
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfig setSQLExtOption(GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigSQLExtOption SQLExtOption) {
            this.SQLExtOption = SQLExtOption;
            return this;
        }
        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigSQLExtOption getSQLExtOption() {
            return this.SQLExtOption;
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfig setSelectedTables(GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigSelectedTables selectedTables) {
            this.selectedTables = selectedTables;
            return this;
        }
        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigSelectedTables getSelectedTables() {
            return this.selectedTables;
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfig setTargetOption(String targetOption) {
            this.targetOption = targetOption;
            return this;
        }
        public String getTargetOption() {
            return this.targetOption;
        }

    }

    public static class GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfo extends TeaModel {
        @NameInMap("AuditDate")
        public String auditDate;

        @NameInMap("Config")
        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfig config;

        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("DownloadURL")
        public String downloadURL;

        public static GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfo self = new GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfo();
            return TeaModel.build(map, self);
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfo setAuditDate(String auditDate) {
            this.auditDate = auditDate;
            return this;
        }
        public String getAuditDate() {
            return this.auditDate;
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfo setConfig(GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfig config) {
            this.config = config;
            return this;
        }
        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfig getConfig() {
            return this.config;
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfo setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfo setDownloadURL(String downloadURL) {
            this.downloadURL = downloadURL;
            return this;
        }
        public String getDownloadURL() {
            return this.downloadURL;
        }

    }

    public static class GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetail extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("Committer")
        public String committer;

        @NameInMap("CommitterId")
        public String committerId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("KeyInfo")
        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfo keyInfo;

        @NameInMap("Log")
        public String log;

        @NameInMap("SearchName")
        public String searchName;

        @NameInMap("StatusDesc")
        public String statusDesc;

        @NameInMap("WorkflowStatusDesc")
        public String workflowStatusDesc;

        public static GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetail self = new GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetail();
            return TeaModel.build(map, self);
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetail setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetail setCommitter(String committer) {
            this.committer = committer;
            return this;
        }
        public String getCommitter() {
            return this.committer;
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetail setCommitterId(String committerId) {
            this.committerId = committerId;
            return this;
        }
        public String getCommitterId() {
            return this.committerId;
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetail setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetail setKeyInfo(GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfo keyInfo) {
            this.keyInfo = keyInfo;
            return this;
        }
        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfo getKeyInfo() {
            return this.keyInfo;
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetail setLog(String log) {
            this.log = log;
            return this;
        }
        public String getLog() {
            return this.log;
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetail setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetail setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetail setWorkflowStatusDesc(String workflowStatusDesc) {
            this.workflowStatusDesc = workflowStatusDesc;
            return this;
        }
        public String getWorkflowStatusDesc() {
            return this.workflowStatusDesc;
        }

    }

}
