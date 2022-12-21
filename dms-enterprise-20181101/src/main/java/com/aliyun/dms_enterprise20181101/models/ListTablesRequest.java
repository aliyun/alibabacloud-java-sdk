// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTablesRequest extends TeaModel {
    // The ID of the physical database. You can call the [ListDatabases](~~141873~~) or [SearchDatabase](~~141876~~) operation to obtain the ID of the physical database.
    @NameInMap("DatabaseId")
    public String databaseId;

    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // Specifies whether to return the GUID of a table. Valid values:
    // 
    // *   **true**: returns the GUID of a table.
    // *   **false**: does not return the GUID of a table.
    @NameInMap("ReturnGuid")
    public Boolean returnGuid;

    // The name used to search for tables. Fuzzy search is supported.
    @NameInMap("SearchName")
    public String searchName;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
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
