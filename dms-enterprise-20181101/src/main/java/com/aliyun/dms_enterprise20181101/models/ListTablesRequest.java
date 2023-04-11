// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTablesRequest extends TeaModel {
    /**
     * <p>The ID of the physical database. You can call the [ListDatabases](~~141873~~) or [SearchDatabase](~~141876~~) operation to obtain the ID of the physical database.</p>
     */
    @NameInMap("DatabaseId")
    public String databaseId;

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
     * <p>Specifies whether to return the GUID of a table. Valid values:</p>
     * <br>
     * <p>*   **true**: returns the GUID of a table.</p>
     * <p>*   **false**: does not return the GUID of a table.</p>
     */
    @NameInMap("ReturnGuid")
    public Boolean returnGuid;

    /**
     * <p>The name used to search for tables. Fuzzy search is supported.</p>
     */
    @NameInMap("SearchName")
    public String searchName;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTablesRequest self = new ListTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListTablesRequest setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }
    public String getDatabaseId() {
        return this.databaseId;
    }

    public ListTablesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTablesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTablesRequest setReturnGuid(Boolean returnGuid) {
        this.returnGuid = returnGuid;
        return this;
    }
    public Boolean getReturnGuid() {
        return this.returnGuid;
    }

    public ListTablesRequest setSearchName(String searchName) {
        this.searchName = searchName;
        return this;
    }
    public String getSearchName() {
        return this.searchName;
    }

    public ListTablesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
