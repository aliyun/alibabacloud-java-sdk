// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDatabaseExportOrderDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the database export ticket.</p>
     */
    @NameInMap("DatabaseExportOrderDetail")
    public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetail databaseExportOrderDetail;

    /**
     * <p>The error code.</p>
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
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CFD8FE00-36D9-4C1B-940D-65A7B73D9066</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>dmstest</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The type of data that was exported. Valid values:</p>
         * <ul>
         * <li><strong>DATA</strong>: The data of the database was exported.</li>
         * <li><strong>STRUCT</strong>: The schema of the database was exported.</li>
         * <li><strong>DATA_STRUCT</strong>: The data and schema of the database were exported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATA</p>
         */
        @NameInMap("ExportContent")
        public String exportContent;

        /**
         * <p>The type of schema that was exported.</p>
         */
        @NameInMap("ExportTypes")
        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigExportTypes exportTypes;

        /**
         * <p>The extension options of the SQL script.</p>
         */
        @NameInMap("SQLExtOption")
        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigSQLExtOption SQLExtOption;

        /**
         * <p>The tables that were exported from the database.</p>
         */
        @NameInMap("SelectedTables")
        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfigSelectedTables selectedTables;

        /**
         * <p>The format in which the database was exported. Valid values:</p>
         * <ul>
         * <li><strong>SQL</strong></li>
         * <li><strong>CSV</strong></li>
         * <li><strong>XLSX</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
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
        /**
         * <p>The time when the ticket was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-13 13:44:59</p>
         */
        @NameInMap("AuditDate")
        public String auditDate;

        /**
         * <p>The configuration information about the ticket.</p>
         */
        @NameInMap("Config")
        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfoConfig config;

        /**
         * <p>The database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2583****</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The URL that is used to download the export result.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss.xxx.com">https://oss.xxx.com</a></p>
         */
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
        /**
         * <p>The business background information of the database export ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The user who submitted the ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>dmsuser</p>
         */
        @NameInMap("Committer")
        public String committer;

        /**
         * <p>The ID of the user who submitted the ticket. This ID is a user ID and is not the ID of an Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>12***</p>
         */
        @NameInMap("CommitterId")
        public String committerId;

        /**
         * <p>The ticket ID.</p>
         * 
         * <strong>example:</strong>
         * <p>821****</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The key information about the ticket.</p>
         */
        @NameInMap("KeyInfo")
        public GetDatabaseExportOrderDetailResponseBodyDatabaseExportOrderDetailKeyInfo keyInfo;

        /**
         * <p>The execution logs.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-12 14:58:32:015 Database Dump Start.
         * 2023-04-12 14:58:32:096 set server side query timeout, sql : set max_execution_time = 0</p>
         */
        @NameInMap("Log")
        public String log;

        /**
         * <p>The name that is used to search for the database.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@xxx.xxx.xxx.xxx">test@xxx.xxx.xxx.xxx</a>:3306</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        /**
         * <p>The status description of the ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>ticket approval</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The status description of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>ticket approval</p>
         */
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
