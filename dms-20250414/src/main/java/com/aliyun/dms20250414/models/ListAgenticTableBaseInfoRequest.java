// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAgenticTableBaseInfoRequest extends TeaModel {
    /**
     * <p>The UUID of the database to which the table belongs. You can obtain the UUID by calling the ListAgenticDatabase or SearchAgenticDatabase operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>md-HZ-fp9K7r***</p>
     */
    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    /**
     * <p>The maximum number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. You do not need to specify this parameter for the first query. When you query the next page, set this parameter to the NextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>f056501ada12****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The search keyword. The system matches the keyword against table names. The results are sorted by exact match, prefix match, and contains match. Within the same match level, the results are sorted by the field specified by SortFieldName.</p>
     * 
     * <strong>example:</strong>
     * <p>order</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The field by which to sort the results. This parameter is case-sensitive. Valid values:</p>
     * <ul>
     * <li><strong>name</strong>: Sorts the results by table name. This value is recommended.</li>
     * <li><strong>numRows</strong>: Sorts the results by the number of rows.</li>
     * <li><strong>storeCapacity</strong>: Sorts the results by the storage capacity.</li>
     * </ul>
     * <p>If you specify other values, the request fails. If you do not specify this parameter, the results are returned in the default order, and the SortOrder parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("SortFieldName")
    public String sortFieldName;

    /**
     * <p>The sort order. This parameter takes effect only when SortFieldName is specified. This parameter is not case-sensitive. Valid values:</p>
     * <ul>
     * <li><strong>ASC</strong>: Sorts the results in ascending order. This is the default value and is recommended.</li>
     * <li><strong>DESC</strong>: Sorts the results in descending order.</li>
     * </ul>
     * <p>If you specify other values, the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The table type. The results are strictly filtered by this type. Valid values:</p>
     * <ul>
     * <li><strong>NORMAL</strong>: Regular table.</li>
     * <li><strong>VIEW</strong>: View.</li>
     * <li><strong>FOREIGN</strong>: Foreign table.</li>
     * <li><strong>SYNONYM</strong>: Synonym. This value is supported only for Oracle data sources.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("TableType")
    public String tableType;

    public static ListAgenticTableBaseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgenticTableBaseInfoRequest self = new ListAgenticTableBaseInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListAgenticTableBaseInfoRequest setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public ListAgenticTableBaseInfoRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAgenticTableBaseInfoRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAgenticTableBaseInfoRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListAgenticTableBaseInfoRequest setSortFieldName(String sortFieldName) {
        this.sortFieldName = sortFieldName;
        return this;
    }
    public String getSortFieldName() {
        return this.sortFieldName;
    }

    public ListAgenticTableBaseInfoRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListAgenticTableBaseInfoRequest setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

}
