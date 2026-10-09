// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListLineageRelationshipsRequest extends TeaModel {
    /**
     * <p>The ID of the destination entity. You can refer to the table or field ID returned by the ListTables or ListColumns operation, or use a custom entity ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dlf-table::catalog_id:database_name::table_name</p>
     */
    @NameInMap("DstEntityId")
    public String dstEntityId;

    /**
     * <p>The name of the destination entity. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>dstName</p>
     */
    @NameInMap("DstEntityName")
    public String dstEntityName;

    /**
     * <p>The sort order. Default value: Asc. Valid values:</p>
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
     * <p>The field used for sorting. Default value: Name.</p>
     * 
     * <strong>example:</strong>
     * <p>Name</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The ID of the source entity. You can refer to the table or field ID returned by the ListTables or ListColumns operation, or use a custom entity ID.</p>
     * <p>To obtain the entity ID of a table or field, first call ListCrawlers to obtain the MetaEntityId of the metadata crawler. For types that include a data catalog hierarchy, such as DLF and StarRocks, call ListCatalogs to obtain the catalog ID. Then, call ListDatabases to obtain the database ID, and call ListSchemas to obtain the schema ID if necessary. Finally, call ListTables or ListColumns to obtain the table or field ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table:::project_name:[schema_name]:table_name</p>
     */
    @NameInMap("SrcEntityId")
    public String srcEntityId;

    /**
     * <p>The name of the source entity. Fuzzy match is supported.</p>
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
