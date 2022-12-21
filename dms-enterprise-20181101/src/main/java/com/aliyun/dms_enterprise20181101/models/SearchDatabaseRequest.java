// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchDatabaseRequest extends TeaModel {
    // The type of the database. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).
    @NameInMap("DbType")
    public String dbType;

    // The type of the environment to which the database belongs. For more information, see [Change the environment type of an instance](~~163309~~).
    @NameInMap("EnvType")
    public String envType;

    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The keyword that is used to search for databases.
    @NameInMap("SearchKey")
    public String searchKey;

    // The query range based on permissions. Valid values:
    // 
    // *   **HAS_PERMSSION**: searches for databases on which the current user has permissions.
    // *   **OWNER**: searches for databases owned by the current user.
    // *   **MY_FOCUS**: searches for databases that the current user follows.
    // *   **UNKNOWN**: searches for all databases.
    @NameInMap("SearchRange")
    public String searchRange;

    // The category of the database. Valid values:
    // 
    // *   **DB**: single database or logical database.
    // *   **SINGLE_DB**: single database.
    // *   **LOGIC_DB**: logical database.
    @NameInMap("SearchTarget")
    public String searchTarget;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to obtain the tenant ID.
    @NameInMap("Tid")
    public Long tid;

    public static SearchDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchDatabaseRequest self = new SearchDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public SearchDatabaseRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public SearchDatabaseRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public SearchDatabaseRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchDatabaseRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchDatabaseRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public SearchDatabaseRequest setSearchRange(String searchRange) {
        this.searchRange = searchRange;
        return this;
    }
    public String getSearchRange() {
        return this.searchRange;
    }

    public SearchDatabaseRequest setSearchTarget(String searchTarget) {
        this.searchTarget = searchTarget;
        return this;
    }
    public String getSearchTarget() {
        return this.searchTarget;
    }

    public SearchDatabaseRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
