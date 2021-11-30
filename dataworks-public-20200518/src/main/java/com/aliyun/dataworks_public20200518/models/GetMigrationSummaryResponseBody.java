// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMigrationSummaryResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetMigrationSummaryResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("MigrationId")
        public Long migrationId;

        @NameInMap("Name")
        public String name;

        @NameInMap("OpUser")
        public String opUser;

        @NameInMap("ProjectId")
        public Long projectId;

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
