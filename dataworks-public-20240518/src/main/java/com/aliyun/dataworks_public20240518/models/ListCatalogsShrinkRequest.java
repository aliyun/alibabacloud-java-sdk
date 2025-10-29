// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCatalogsShrinkRequest extends TeaModel {
    /**
     * <p>The comment. Supports token-based matching.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The name. Supports fuzzy matching.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The order in which the tables are sorted. Default value: Asc. Valid values:</p>
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
     * <p>The number of records per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The parent entity ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
     * <p>Currently, only the DLF and StarRocks types are supported.</p>
     * <ul>
     * <li>For the DLF type, you can query all catalog lists. The format of <code>ParentMetaEntityId</code> is <code>DLF</code>.</li>
     * <li>For the StarRocks type, you can query the catalogs of a specific instance. The format of <code>ParentMetaEntityId</code> <code>is StarRocks:(instance_id|encoded_jdbc_url)</code>.</li>
     * </ul>
     * <blockquote>
     * <p>\
     * <code>instance_id</code>: The instance ID. Required if the data source is registered in instance mode.\
     * <code>encoded_jdbc_url</code>: The JDBC connection string encoded with URL encoding. Required if the data source is registered in connection-string mode.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dlf
     * starrocks:c-abc123xxx</p>
     */
    @NameInMap("ParentMetaEntityId")
    public String parentMetaEntityId;

    /**
     * <p>The sort field. Default value: CreateTime. Valid values:</p>
     * <ul>
     * <li>CreateTime</li>
     * <li>ModifyTime</li>
     * <li>Name</li>
     * <li>Type</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The type. Supports exact match. If left empty, all types are queried.</p>
     */
    @NameInMap("Types")
    public String typesShrink;

    public static ListCatalogsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCatalogsShrinkRequest self = new ListCatalogsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCatalogsShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ListCatalogsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListCatalogsShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListCatalogsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCatalogsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCatalogsShrinkRequest setParentMetaEntityId(String parentMetaEntityId) {
        this.parentMetaEntityId = parentMetaEntityId;
        return this;
    }
    public String getParentMetaEntityId() {
        return this.parentMetaEntityId;
    }

    public ListCatalogsShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListCatalogsShrinkRequest setTypesShrink(String typesShrink) {
        this.typesShrink = typesShrink;
        return this;
    }
    public String getTypesShrink() {
        return this.typesShrink;
    }

}
