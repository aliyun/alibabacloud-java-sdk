// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListPartitionsRequest extends TeaModel {
    /**
     * <p>The partition name. Fuzzy match is supported. This parameter is valid only for MaxCompute tables.</p>
     * 
     * <strong>example:</strong>
     * <p>ds=20250101</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort direction. Default value: Asc. Valid values:</p>
     * <ul>
     * <li>Asc: ascending order.</li>
     * <li>Desc: descending order.</li>
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
     * <p>The field by which to sort the results. Default value: CreateTime. Valid values:</p>
     * <ul>
     * <li>CreateTime: the creation time. Only MaxCompute tables are supported.</li>
     * <li>ModifyTime: the modification time. Only MaxCompute tables are supported.</li>
     * <li>Name: the name. This is the sort method used for HMS tables.</li>
     * <li>RecordCount: the number of records. Only MaxCompute tables are supported.</li>
     * <li>DataSize: the storage size. Only MaxCompute tables are supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The ID of the table. You can obtain this value from the response of the <a href="https://help.aliyun.com/document_detail/2880092.html">ListTables</a> operation. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Metadata entity concepts</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table:::project_name:[schema_name]:table_name</p>
     */
    @NameInMap("TableId")
    public String tableId;

    public static ListPartitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionsRequest self = new ListPartitionsRequest();
        return TeaModel.build(map, self);
    }

    public ListPartitionsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPartitionsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListPartitionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPartitionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPartitionsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListPartitionsRequest setTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }
    public String getTableId() {
        return this.tableId;
    }

}
