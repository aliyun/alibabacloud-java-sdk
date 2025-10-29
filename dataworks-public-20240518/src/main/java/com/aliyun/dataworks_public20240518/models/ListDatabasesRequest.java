// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDatabasesRequest extends TeaModel {
    /**
     * <p>The comment. Supports fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>test comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The name. Supports fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>test_tbl</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order. Default value: Asc. Valid values:</p>
     * <ul>
     * <li>Asc: ascending.</li>
     * <li>Desc: descending.</li>
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
     * <p>The number of records per page. Default: 10. Maximum: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The parent entity ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
     * <p>You can refer to the ListCrawlerTypes operation for the parent entity type.</p>
     * <ul>
     * <li>If the parent entity is a catalog, the format of <code>ParentMetaEntityId</code> follows the response of the ListCatalogs API.</li>
     * <li>If the parent entity is a metadata crawler, the format of <code>ParentMetaEntityId</code> is <code>${CrawlerType}:${Instance ID or encoded URL}</code>.</li>
     * </ul>
     * <p>ParentMetaEntityId format examples</p>
     * <ul>
     * <li><code>dlf-catalog::catalog_id</code></li>
     * <li><code>holo:instance_id</code></li>
     * <li><code>mysql:(instance_id|encoded_jdbc_url)</code></li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><code>catalog_id</code>: The ID of the DLF catalog.</li>
     * <li><code>instance_id</code>: The instance ID. Required when the data source is registered in instance mode.</li>
     * <li><code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string. Required when the data source is registered by connection string.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql:rm-abc123xxx
     * dlf-catalog:123456XXX:test_catalog</p>
     */
    @NameInMap("ParentMetaEntityId")
    public String parentMetaEntityId;

    /**
     * <p>The sort field. Default value: CreateTime. Valid values:</p>
     * <ul>
     * <li>CreateTime</li>
     * <li>ModifyTime</li>
     * <li>Name</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListDatabasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesRequest self = new ListDatabasesRequest();
        return TeaModel.build(map, self);
    }

    public ListDatabasesRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ListDatabasesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDatabasesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListDatabasesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatabasesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatabasesRequest setParentMetaEntityId(String parentMetaEntityId) {
        this.parentMetaEntityId = parentMetaEntityId;
        return this;
    }
    public String getParentMetaEntityId() {
        return this.parentMetaEntityId;
    }

    public ListDatabasesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
