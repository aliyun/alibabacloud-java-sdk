// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDatabasesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>test_tbl</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The parent entity ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">description of concepts related to metadata entities.</a></p>
     * <p>The type of the parent entity can be found in the response of the ListCrawlerTypes operation.</p>
     * <ul>
     * <li>If the parent entity is a catalog, the format of <code>ParentMetaEntityId</code> follows the response of the ListCatalogs API.</li>
     * <li>If the parent entity is a metadata crawler, the format of <code>ParentMetaEntityId</code> is <code>${CrawlerType}:${Instance ID or encoded URL}.</code></li>
     * </ul>
     * <p>ParentMetaEntityId format examples</p>
     * <p><code>dlf-catalog::catalog_id</code></p>
     * <p><code>holo:instance_id</code></p>
     * <p><code>mysql:(instance_id|encoded_jdbc_url)</code></p>
     * <blockquote>
     * <p>\
     * <code>catalog_id</code>: The DLF catalog ID.\
     * <code>instance_id</code>: The instance ID, required for the data source registered in instance mode.\
     * <code>encoded_jdbc_url</code>: The JDBC connection string that has been URL encoded, required for the data source registered via a connection string.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql:rm-abc123xxx
     * dlf-catalog:123456XXX:test_catalog</p>
     */
    @NameInMap("ParentMetaEntityId")
    public String parentMetaEntityId;

    /**
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
