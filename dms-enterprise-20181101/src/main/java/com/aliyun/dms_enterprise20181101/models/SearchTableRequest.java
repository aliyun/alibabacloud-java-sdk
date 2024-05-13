// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchTableRequest extends TeaModel {
    /**
     * <p>The type of database. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **SQLServer**</p>
     * <p>*   **PostgreSQL**</p>
     * <p>*   **Oracle**</p>
     * <p>*   **DRDS**</p>
     * <p>*   **OceanBase**</p>
     * <p>*   **Mongo**</p>
     * <p>*   **Redis**</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The type of the environment to which databases belong. For more information, see [Change the environment type of an instance](https://help.aliyun.com/document_detail/163309.html).</p>
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
     * <p>Specifies whether to return the GUID of each table.</p>
     */
    @NameInMap("ReturnGuid")
    public Boolean returnGuid;

    /**
     * <p>The keyword that is used to query tables.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The scope of tables that you want to query. Valid values:</p>
     * <br>
     * <p>*   **HAS_PERMSSION**: the tables on which the current account has permissions.</p>
     * <p>*   **OWNER**: the tables owned by the current account.</p>
     * <p>*   **MY_FOCUS**: the tables that the current account follows.</p>
     * <p>*   **UNKNOWN**: all tables.</p>
     */
    @NameInMap("SearchRange")
    public String searchRange;

    /**
     * <p>The type of table that you want to query. Valid values:</p>
     * <br>
     * <p>*   **TABLE**: physical and logical tables</p>
     * <p>*   **SINGLE_TABLE**: physical tables</p>
     * <p>*   **LOGIC_TABLE**: logical tables</p>
     */
    @NameInMap("SearchTarget")
    public String searchTarget;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the [View information about the current tenant](https://help.aliyun.com/document_detail/181330.html) section of the "Manage DMS tenants" topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static SearchTableRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTableRequest self = new SearchTableRequest();
        return TeaModel.build(map, self);
    }

    public SearchTableRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public SearchTableRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public SearchTableRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchTableRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchTableRequest setReturnGuid(Boolean returnGuid) {
        this.returnGuid = returnGuid;
        return this;
    }
    public Boolean getReturnGuid() {
        return this.returnGuid;
    }

    public SearchTableRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public SearchTableRequest setSearchRange(String searchRange) {
        this.searchRange = searchRange;
        return this;
    }
    public String getSearchRange() {
        return this.searchRange;
    }

    public SearchTableRequest setSearchTarget(String searchTarget) {
        this.searchTarget = searchTarget;
        return this;
    }
    public String getSearchTarget() {
        return this.searchTarget;
    }

    public SearchTableRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
