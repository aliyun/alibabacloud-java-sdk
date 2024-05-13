// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListUserPermissionsRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The type of the database. For more information about the valid values of this parameter, see [DbType parameter](https://help.aliyun.com/document_detail/198106.html).</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The type of the environment to which the database belongs. Valid values:</p>
     * <br>
     * <p>*   product: production environment</p>
     * <p>*   dev: development environment</p>
     * <p>*   pre: staging environment</p>
     * <p>*   test: test environment</p>
     * <p>*   sit: SIT environment</p>
     * <p>*   uat: user acceptance testing (UAT) environment</p>
     * <p>*   pet: stress testing environment</p>
     * <p>*   stag: STAG environment</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>Specifies whether the database is a logical database. Valid values:</p>
     * <br>
     * <p>*   true: The database is a logical database.</p>
     * <p>*   false: The database is a physical database.</p>
     */
    @NameInMap("Logic")
    public Boolean logic;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The permissions on a specific type of resources that you want to query. Valid values:</p>
     * <br>
     * <p>*   DATABASE: permissions on databases</p>
     * <p>*   TABLE: permissions on tables</p>
     * <p>*   COLUMN: permissions on fields</p>
     * <p>*   INSTANCE: permissions on instances</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PermType")
    public String permType;

    /**
     * <p>The keyword used in the query. For example, if you want to query permissions on an instance, you can specify the endpoint of the instance, such as rm-bp144d5ky4l4r****.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](https://help.aliyun.com/document_detail/181330.html) topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The ID of the user. You can call the [GetUser](https://help.aliyun.com/document_detail/147098.html) or [ListUsers](https://help.aliyun.com/document_detail/141938.html) operation to query the ID of the user.</p>
     * <br>
     * <p>>  The user ID is different from the ID of your Alibaba Cloud account.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
