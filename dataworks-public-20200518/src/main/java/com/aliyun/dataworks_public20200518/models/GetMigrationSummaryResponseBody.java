// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMigrationSummaryResponseBody extends TeaModel {
    /**
     * <p>The details of the migration task.</p>
     */
    @NameInMap("Data")
    public GetMigrationSummaryResponseBodyData data;

    /**
     * <p>The request ID. You can use the request ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>19999A96-71BA-2845-B455-ED620EF4E37F</p>
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
         * <p>The ID of the user who created the task.</p>
         * 
         * <strong>example:</strong>
         * <p>982293332403****</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The URL that is used to download the package of the export task. You can use the URL to download the package of the export task.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://shanghai-xxx-oss.oss-cn-shanghai.aliyuncs.com/pre/store/f10_bf47_b4fa7df0860f.zip?Expires=1639540903&OSSAccessKeyId=XXXXXXeF4Lv5j&Signature=qxxxxx">https://shanghai-xxx-oss.oss-cn-shanghai.aliyuncs.com/pre/store/f10_bf47_b4fa7df0860f.zip?Expires=1639540903&amp;OSSAccessKeyId=XXXXXXeF4Lv5j&amp;Signature=qxxxxx</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1589904000000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the task was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1589904000000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("MigrationId")
        public Long migrationId;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_export_01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the user who managed the task.</p>
         * 
         * <strong>example:</strong>
         * <p>982293332403****</p>
         */
        @NameInMap("OpUser")
        public String opUser;

        /**
         * <p>The ID of the DataWorks workspace to which the migration task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The status of the migration task. Valid values:</p>
         * <ul>
         * <li>INIT</li>
         * <li>EDITING</li>
         * <li>IMPORTING</li>
         * <li>IMPORT_ERROR</li>
         * <li>IMPORT_SUCCESS</li>
         * <li>EXPORTING</li>
         * <li>EXPORT_ERROR</li>
         * <li>EXPORT_SUCCESS</li>
         * <li>REVOKED</li>
         * <li>PARTIAL_SUCCESS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXPORT_SUCCESS</p>
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
