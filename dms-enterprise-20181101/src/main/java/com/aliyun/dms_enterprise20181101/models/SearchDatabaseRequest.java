// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchDatabaseRequest extends TeaModel {
    /**
     * <p>The type of the database. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The type of the environment to which the database belongs. For more information, see [Change the environment type of an instance](~~163309~~).</p>
     */
    @NameInMap("EnvType")
    public String envType;

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
     * <p>The keyword that is used to search for databases.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The query range based on permissions. Valid values:</p>
     * <br>
     * <p>*   **HAS_PERMSSION**: searches for databases on which the current user has permissions.</p>
     * <p>*   **OWNER**: searches for databases owned by the current user.</p>
     * <p>*   **MY_FOCUS**: searches for databases that the current user follows.</p>
     * <p>*   **UNKNOWN**: searches for all databases.</p>
     */
    @NameInMap("SearchRange")
    public String searchRange;

    /**
     * <p>The category of the database. Valid values:</p>
     * <br>
     * <p>*   **DB**: single database or logical database.</p>
     * <p>*   **SINGLE_DB**: single database.</p>
     * <p>*   **LOGIC_DB**: logical database.</p>
     */
    @NameInMap("SearchTarget")
    public String searchTarget;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to obtain the tenant ID.</p>
     */
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
