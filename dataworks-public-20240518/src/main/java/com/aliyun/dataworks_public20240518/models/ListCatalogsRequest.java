// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCatalogsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>abc</p>
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
     * <p>The parent entity ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
     * <p>Only DLF and StarRocks data sources support this parameter.</p>
     * <ul>
     * <li>For DLF data sources, you can call this API operation to query all catalogs. In this case, you must set the <code>ParentMetaEntityId</code> parameter to <code>dlf</code>.</li>
     * <li>For StarRocks data sources, you can call this API operation to query the catalogs in a specific instance. In this case, you can configure the <code>ParentMetaEntityId</code> parameter in the <code>starrocks:(instance_id|encoded_jdbc_url)</code> format.</li>
     * </ul>
     * <blockquote>
     * <p>\
     * <code>instance_id</code>: the ID of an instance. If the related data source is added to DataWorks in Alibaba Cloud instance mode, you must configure this parameter.\
     * <code>encoded_jdbc_url</code>: the JDBC connection string that is URL-encoded. If the related data source is added to DataWorks in connection string mode, you must configure this parameter.</p>
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
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Types")
    public java.util.List<String> types;

    public static ListCatalogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCatalogsRequest self = new ListCatalogsRequest();
        return TeaModel.build(map, self);
    }

    public ListCatalogsRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ListCatalogsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListCatalogsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListCatalogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCatalogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCatalogsRequest setParentMetaEntityId(String parentMetaEntityId) {
        this.parentMetaEntityId = parentMetaEntityId;
        return this;
    }
    public String getParentMetaEntityId() {
        return this.parentMetaEntityId;
    }

    public ListCatalogsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListCatalogsRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

}
