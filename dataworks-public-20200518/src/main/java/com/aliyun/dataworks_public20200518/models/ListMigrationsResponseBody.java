// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMigrationsResponseBody extends TeaModel {
    /**
     * <p>The list of migration tasks.</p>
     */
    @NameInMap("Data")
    public ListMigrationsResponseBodyData data;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request is successful.</p>
     * <p>*   false: The request fails.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListMigrationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationsResponseBody self = new ListMigrationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMigrationsResponseBody setData(ListMigrationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMigrationsResponseBodyData getData() {
        return this.data;
    }

    public ListMigrationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMigrationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMigrationsResponseBodyDataMigrations extends TeaModel {
        /**
         * <p>The time when the migration task was last updated.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The name of the user who created the migration task.</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The ID of the user who last updated the migration task.</p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The description of the export task.</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The name of the migration task.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The URL that is used to download the package of the export task. You can use the URL to download the package of the export task.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The time when the migration task was created.</p>
         */
        @NameInMap("MigrationType")
        public String migrationType;

        /**
         * <p>The type of the import or export package. Valid values:</p>
         * <br>
         * <p>*   DWMA (standard format)</p>
         * <p>*   DATAWORKS_MODEL (standard format)</p>
         * <p>*   DATAWORKS_V2 (Apsara Stack DataWorks V3.6.1 to V3.11)</p>
         * <p>*   DATAWORKS_V3 (Apsara Stack DataWorks V3.12 and later)</p>
         * <br>
         * <p>The DWMA and DATAWORKS_MODEL types are interchangeable.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the migration task.</p>
         * <br>
         * <p>*   IMPORT</p>
         * <p>*   EXPORT</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The status of the migration task. Valid values:</p>
         * <br>
         * <p>*   INIT: The migration task is in the initial state.</p>
         * <p>*   EDITING: The migration task is being edited.</p>
         * <p>*   RUNNING: The migration task is running.</p>
         * <p>*   FAILURE: The migration task fails to run.</p>
         * <p>*   SUCCESS: The migration task is successfully run.</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The ID of the user who created the migration task.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The name of the user who last updated the migration task.</p>
         */
        @NameInMap("UpdateUser")
        public String updateUser;

        /**
         * <p>The ID of the DataWorks workspace to which the task belongs.</p>
         */
        @NameInMap("UpdateUserName")
        public String updateUserName;

        public static ListMigrationsResponseBodyDataMigrations build(java.util.Map<String, ?> map) throws Exception {
            ListMigrationsResponseBodyDataMigrations self = new ListMigrationsResponseBodyDataMigrations();
            return TeaModel.build(map, self);
        }

        public ListMigrationsResponseBodyDataMigrations setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListMigrationsResponseBodyDataMigrations setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListMigrationsResponseBodyDataMigrations setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public ListMigrationsResponseBodyDataMigrations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMigrationsResponseBodyDataMigrations setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public ListMigrationsResponseBodyDataMigrations setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMigrationsResponseBodyDataMigrations setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListMigrationsResponseBodyDataMigrations setMigrationType(String migrationType) {
            this.migrationType = migrationType;
            return this;
        }
        public String getMigrationType() {
            return this.migrationType;
        }

        public ListMigrationsResponseBodyDataMigrations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMigrationsResponseBodyDataMigrations setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public ListMigrationsResponseBodyDataMigrations setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListMigrationsResponseBodyDataMigrations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMigrationsResponseBodyDataMigrations setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListMigrationsResponseBodyDataMigrations setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListMigrationsResponseBodyDataMigrations setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

        public ListMigrationsResponseBodyDataMigrations setUpdateUserName(String updateUserName) {
            this.updateUserName = updateUserName;
            return this;
        }
        public String getUpdateUserName() {
            return this.updateUserName;
        }

    }

    public static class ListMigrationsResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the primary key.</p>
         */
        @NameInMap("Migrations")
        public java.util.List<ListMigrationsResponseBodyDataMigrations> migrations;

        /**
         * <p>The number of entries returned per page. Default value: 10. Maximum value: 50.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListMigrationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMigrationsResponseBodyData self = new ListMigrationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMigrationsResponseBodyData setMigrations(java.util.List<ListMigrationsResponseBodyDataMigrations> migrations) {
            this.migrations = migrations;
            return this;
        }
        public java.util.List<ListMigrationsResponseBodyDataMigrations> getMigrations() {
            return this.migrations;
        }

        public ListMigrationsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListMigrationsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMigrationsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
