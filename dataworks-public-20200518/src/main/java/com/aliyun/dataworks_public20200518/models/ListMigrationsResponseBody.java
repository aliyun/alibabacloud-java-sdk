// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMigrationsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListMigrationsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("CreateUserName")
        public String createUserName;

        @NameInMap("Description")
        public String description;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Message")
        public String message;

        @NameInMap("MigrationType")
        public String migrationType;

        @NameInMap("Name")
        public String name;

        @NameInMap("PackageType")
        public String packageType;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UpdateUser")
        public String updateUser;

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
        @NameInMap("Migrations")
        public java.util.List<ListMigrationsResponseBodyDataMigrations> migrations;

        @NameInMap("PageNumber")
        public Integer pageNumber;

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
