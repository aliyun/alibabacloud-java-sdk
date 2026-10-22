// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListColumnsRequest extends TeaModel {
    /**
     * <p>The comment on the column. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Specifies whether to return extended properties. If you set this parameter to <code>true</code>, extended properties are returned. If you set this parameter to <code>false</code>, extended properties are not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeExtendedProperties")
    public Boolean includeExtendedProperties;

    /**
     * <p>The name of the column. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order. Default value: Asc. Valid values:</p>
     * <ul>
     * <li>Asc: Ascending order.</li>
     * <li>Desc: Descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field used for sorting. Default value: Position. Valid values:</p>
     * <ul>
     * <li>Name: Name.</li>
     * <li>Position: Position.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Position</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The table ID. You can obtain the ID from the response of the ListTables operation. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
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

    public ListColumnsRequest setIncludeExtendedProperties(Boolean includeExtendedProperties) {
        this.includeExtendedProperties = includeExtendedProperties;
        return this;
    }
    public Boolean getIncludeExtendedProperties() {
        return this.includeExtendedProperties;
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
