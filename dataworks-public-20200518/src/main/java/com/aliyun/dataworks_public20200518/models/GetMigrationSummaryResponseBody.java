// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMigrationSummaryResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request is successful.</p>
     * <p>*   false: The request fails. You can locate the error based on the request ID.</p>
     */
    @NameInMap("Data")
    public GetMigrationSummaryResponseBodyData data;

    /**
     * <p>The ID of the migration task.</p>
     * <br>
     * <p>You can call the [CreateImportMigration](https://help.aliyun.com/document_detail/2780280.html) operation to obtain the ID of the import task and call the [CreateExportMigration](https://help.aliyun.com/document_detail/2780281.html) operation to obtain the ID of the export task.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the request. You can locate logs and troubleshoot issues based on the ID.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMigrationSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationSummaryResponseBody self = new GetMigrationSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMigrationSummaryResponseBody setData(GetMigrationSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMigrationSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetMigrationSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMigrationSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMigrationSummaryResponseBodyData extends TeaModel {
        /**
         * <p>The time when the migration task was modified.</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The ID of the DataWorks workspace.</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The name of the migration task.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the migration task was created.</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The details of the migration task.</p>
         */
        @NameInMap("MigrationId")
        public Long migrationId;

        /**
         * <p>The ID of the migration task.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the user who creates the migration task.</p>
         */
        @NameInMap("OpUser")
        public String opUser;

        /**
         * <p>The status of the migration task. Valid values:</p>
         * <br>
         * <p>*   INIT: The migration task is initiating.</p>
         * <p>*   EDITING: The migration task is being edited.</p>
         * <p>*   IMPORTING: The migration task is importing data objects.</p>
         * <p>*   IMPORT_ERROR: The migration task fails to import data objects.</p>
         * <p>*   IMPORT_SUCCESS: Data objects are imported.</p>
         * <p>*   EXPORTING: The migration task is exporting data objects.</p>
         * <p>*   EXPORT_ERROR: The migration task fails to export data objects.</p>
         * <p>*   EXPORT_SUCCESS: The migration task successfully exports data objects.</p>
         * <p>*   REVOKED: The migration task is canceled.</p>
         * <p>*   PARTIAL_SUCCESS: The migration task successfully imports or exports only some data objects.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The ID of the user who manages the migration task.</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetMigrationSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMigrationSummaryResponseBodyData self = new GetMigrationSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMigrationSummaryResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetMigrationSummaryResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetMigrationSummaryResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetMigrationSummaryResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetMigrationSummaryResponseBodyData setMigrationId(Long migrationId) {
            this.migrationId = migrationId;
            return this;
        }
        public Long getMigrationId() {
            return this.migrationId;
        }

        public GetMigrationSummaryResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMigrationSummaryResponseBodyData setOpUser(String opUser) {
            this.opUser = opUser;
            return this;
        }
        public String getOpUser() {
            return this.opUser;
        }

        public GetMigrationSummaryResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetMigrationSummaryResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
