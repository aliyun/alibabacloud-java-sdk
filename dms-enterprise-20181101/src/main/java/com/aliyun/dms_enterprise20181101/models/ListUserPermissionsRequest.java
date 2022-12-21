// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListUserPermissionsRequest extends TeaModel {
    // The name of the database.
    @NameInMap("DatabaseName")
    public String databaseName;

    // The type of the database. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).
    @NameInMap("DbType")
    public String dbType;

    // The type of the environment to which the database belongs. Valid values:
    // 
    // *   product: production environment
    // *   dev: development environment
    // *   pre: staging environment
    // *   test: test environment
    // *   sit: SIT environment
    // *   uat: user acceptance testing (UAT) environment
    // *   pet: stress testing environment
    // *   stag: STAG environment
    @NameInMap("EnvType")
    public String envType;

    // Specifies whether the database is a logical database. Valid values:
    // 
    // *   true: The database is a logical database.
    // *   false: The database is a physical database.
    @NameInMap("Logic")
    public Boolean logic;

    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The permissions on a specific type of resources that you want to query. Valid values:
    // 
    // *   DATABASE: permissions on databases
    // *   TABLE: permissions on tables
    // *   COLUMN: permissions on fields
    // *   INSTANCE: permissions on instances
    @NameInMap("PermType")
    public String permType;

    // The keyword used in the query. For example, if you want to query permissions on an instance, you can specify the endpoint of the instance, such as rm-bp144d5ky4l4r****.
    @NameInMap("SearchKey")
    public String searchKey;

    // The ID of the tenant.
    // 
    // >  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.
    @NameInMap("Tid")
    public Long tid;

    // The ID of the user. You can call the [GetUser](~~147098~~) or [ListUsers](~~141938~~) operation to query the ID of the user.
    // 
    // >  The user ID is different from the ID of your Alibaba Cloud account.
    @NameInMap("UserId")
    public String userId;

    public static ListUserPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserPermissionsRequest self = new ListUserPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserPermissionsRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ListUserPermissionsRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public ListUserPermissionsRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListUserPermissionsRequest setLogic(Boolean logic) {
        this.logic = logic;
        return this;
    }
    public Boolean getLogic() {
        return this.logic;
    }

    public ListUserPermissionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserPermissionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserPermissionsRequest setPermType(String permType) {
        this.permType = permType;
        return this;
    }
    public String getPermType() {
        return this.permType;
    }

    public ListUserPermissionsRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListUserPermissionsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListUserPermissionsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
