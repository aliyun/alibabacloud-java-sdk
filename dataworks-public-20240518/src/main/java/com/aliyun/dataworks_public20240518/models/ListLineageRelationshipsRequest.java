// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListLineageRelationshipsRequest extends TeaModel {
    /**
     * <p>The ID of the destination entity. You can get the ID for a table or column from the response of the <code>ListTables</code> or <code>ListColumns</code> operation, or specify the ID of a custom entity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dlf-table::catalog_id:database_name::table_name</p>
     */
    @NameInMap("DstEntityId")
    public String dstEntityId;

    /**
     * <p>The name of the destination entity. Supports fuzzy matching.</p>
     * 
     * <strong>example:</strong>
     * <p>dstName</p>
     */
    @NameInMap("DstEntityName")
    public String dstEntityName;

    /**
     * <p>The sort order. The default value is <code>Asc</code>. Valid values:</p>
     * <ul>
     * <li><p><code>Asc</code>: ascending order</p>
     * </li>
     * <li><p><code>Desc</code>: descending order</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size. The default value is 10. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field to sort the results by. The default value is <code>Name</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Name</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The ID of the source entity. You can get the ID for a table or column from the response of the <code>ListTables</code> or <code>ListColumns</code> operation, or specify the ID of a custom entity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table:::project_name:[schema_name]:table_name</p>
     */
    @NameInMap("SrcEntityId")
    public String srcEntityId;

    /**
     * <p>The name of the source entity. Supports fuzzy matching.</p>
     * 
     * <strong>example:</strong>
     * <p>srcName</p>
     */
    @NameInMap("SrcEntityName")
    public String srcEntityName;

    public static ListLineageRelationshipsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLineageRelationshipsRequest self = new ListLineageRelationshipsRequest();
        return TeaModel.build(map, self);
    }

    public ListLineageRelationshipsRequest setDstEntityId(String dstEntityId) {
        this.dstEntityId = dstEntityId;
        return this;
    }
    public String getDstEntityId() {
        return this.dstEntityId;
    }

    public ListLineageRelationshipsRequest setDstEntityName(String dstEntityName) {
        this.dstEntityName = dstEntityName;
        return this;
    }
    public String getDstEntityName() {
        return this.dstEntityName;
    }

    public ListLineageRelationshipsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListLineageRelationshipsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLineageRelationshipsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLineageRelationshipsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLineageRelationshipsRequest setSrcEntityId(String srcEntityId) {
        this.srcEntityId = srcEntityId;
        return this;
    }
    public String getSrcEntityId() {
        return this.srcEntityId;
    }

    public ListLineageRelationshipsRequest setSrcEntityName(String srcEntityName) {
        this.srcEntityName = srcEntityName;
        return this;
    }
    public String getSrcEntityName() {
        return this.srcEntityName;
    }

}
