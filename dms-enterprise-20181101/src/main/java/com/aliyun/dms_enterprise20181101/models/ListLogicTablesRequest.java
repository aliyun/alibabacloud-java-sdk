// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListLogicTablesRequest extends TeaModel {
    /**
     * <p>The ID of the logical database.</p>
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
     * <p>Specifies whether to return the GUID of the table.</p>
     */
    @NameInMap("ReturnGuid")
    public Boolean returnGuid;

    /**
     * <p>The keyword that is used to search for the logical tables. Prefix match is supported.</p>
     */
    @NameInMap("SearchName")
    public String searchName;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [Manage DMS tenants](~~181330~~).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListLogicTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogicTablesRequest self = new ListLogicTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListLogicTablesRequest setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }
    public String getDatabaseId() {
        return this.databaseId;
    }

    public ListLogicTablesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLogicTablesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLogicTablesRequest setReturnGuid(Boolean returnGuid) {
        this.returnGuid = returnGuid;
        return this;
    }
    public Boolean getReturnGuid() {
        return this.returnGuid;
    }

    public ListLogicTablesRequest setSearchName(String searchName) {
        this.searchName = searchName;
        return this;
    }
    public String getSearchName() {
        return this.searchName;
    }

    public ListLogicTablesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
