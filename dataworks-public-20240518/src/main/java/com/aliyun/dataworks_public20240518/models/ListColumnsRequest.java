// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListColumnsRequest extends TeaModel {
    /**
     * <p>The column comment. Supports fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>test comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The column name. Supports fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order. Default: Asc. Valid values:</p>
     * <ul>
     * <li><p>Asc</p>
     * </li>
     * <li><p>Desc</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Default: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size. Default: 10. Maximum: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sort field. Default: Position. Valid values:</p>
     * <ul>
     * <li><p>Name</p>
     * </li>
     * <li><p>Position</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Position</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The table ID. Call the ListTables operation or refer to <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a> to obtain this value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table:::project_name:[schema_name]:table_name</p>
     */
    @NameInMap("TableId")
    public String tableId;

    public static ListColumnsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListColumnsRequest self = new ListColumnsRequest();
        return TeaModel.build(map, self);
    }

    public ListColumnsRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ListColumnsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListColumnsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListColumnsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListColumnsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListColumnsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListColumnsRequest setTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }
    public String getTableId() {
        return this.tableId;
    }

}
