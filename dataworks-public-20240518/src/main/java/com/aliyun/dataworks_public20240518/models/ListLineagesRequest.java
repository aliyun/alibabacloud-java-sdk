// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListLineagesRequest extends TeaModel {
    /**
     * <p>The ID of the destination entity. This can be a table or column ID returned by the <code>ListTables</code> or <code>ListColumns</code> API, or the ID of a custom entity.</p>
     * 
     * <strong>example:</strong>
     * <p>dlf-table::catalog_id:database_name::table_name</p>
     */
    @NameInMap("DstEntityId")
    public String dstEntityId;

    /**
     * <p>The name of the destination entity. This parameter supports fuzzy matching.</p>
     * 
     * <strong>example:</strong>
     * <p>dstName1</p>
     */
    @NameInMap("DstEntityName")
    public String dstEntityName;

    /**
     * <p>Specifies whether to include lineage relationships. Default: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedAttachRelationship")
    public Boolean needAttachRelationship;

    /**
     * <p>The sort order. Default: <code>Asc</code>. Valid values:</p>
     * <ul>
     * <li><p><code>Asc</code>: ascending</p>
     * </li>
     * <li><p><code>Desc</code>: descending</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number to retrieve. Default: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default: 10. Maximum: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field to sort the results by. The default is <code>Name</code>, which sorts by entity name.</p>
     * 
     * <strong>example:</strong>
     * <p>Name</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The ID of the source entity. This can be a table or column ID returned by the <code>ListTables</code> or <code>ListColumns</code> API, or the ID of a custom entity.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table:::project_name:[schema_name]:table_name</p>
     */
    @NameInMap("SrcEntityId")
    public String srcEntityId;

    /**
     * <p>The name of the source entity. This parameter supports fuzzy matching.</p>
     * 
     * <strong>example:</strong>
     * <p>srcName1</p>
     */
    @NameInMap("SrcEntityName")
    public String srcEntityName;

    public static ListLineagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLineagesRequest self = new ListLineagesRequest();
        return TeaModel.build(map, self);
    }

    public ListLineagesRequest setDstEntityId(String dstEntityId) {
        this.dstEntityId = dstEntityId;
        return this;
    }
    public String getDstEntityId() {
        return this.dstEntityId;
    }

    public ListLineagesRequest setDstEntityName(String dstEntityName) {
        this.dstEntityName = dstEntityName;
        return this;
    }
    public String getDstEntityName() {
        return this.dstEntityName;
    }

    public ListLineagesRequest setNeedAttachRelationship(Boolean needAttachRelationship) {
        this.needAttachRelationship = needAttachRelationship;
        return this;
    }
    public Boolean getNeedAttachRelationship() {
        return this.needAttachRelationship;
    }

    public ListLineagesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListLineagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLineagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLineagesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLineagesRequest setSrcEntityId(String srcEntityId) {
        this.srcEntityId = srcEntityId;
        return this;
    }
    public String getSrcEntityId() {
        return this.srcEntityId;
    }

    public ListLineagesRequest setSrcEntityName(String srcEntityName) {
        this.srcEntityName = srcEntityName;
        return this;
    }
    public String getSrcEntityName() {
        return this.srcEntityName;
    }

}
