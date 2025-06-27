// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListSchemasRequest extends TeaModel {
    /**
     * <p>The comment. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The order in which schemas are sorted. Default value: Asc. Valid values:</p>
     * <ul>
     * <li>Asc: ascending order</li>
     * <li>Desc: descending order</li>
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
     * <p>The parent entity ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>. For the Hologres metadata crawler type, you can call the ListDatabases operation to query the settings of the <code>ParentMetaEntityId</code> parameter.</p>
     * <p>Configure the <code>ParentMetaEntityId</code> parameter in the <code>${EntityType}:${Instance ID or escaped URL}:${Catalog identifier}:${Database name}</code> format. If a level does not exist, leave the level empty.</p>
     * <blockquote>
     * <p> If you want to query the information about a MaxCompute schema, specify an empty string at the Instance ID level as a placeholder and a MaxCompute project name at the Database name level. Make sure that the schema feature is enabled for the MaxCompute project.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-project:123456XXX::test_project
     * holo-database:h-abc123xxx::test_db</p>
     */
    @NameInMap("ParentMetaEntityId")
    public String parentMetaEntityId;

    /**
     * <p>The field used for sorting. Default value: CreateTime. Valid values:</p>
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
     * <p>The types. Exact match is supported. If this parameter is left empty, all types are queried.</p>
     */
    @NameInMap("Types")
    public java.util.List<String> types;

    public static ListSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSchemasRequest self = new ListSchemasRequest();
        return TeaModel.build(map, self);
    }

    public ListSchemasRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ListSchemasRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSchemasRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListSchemasRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSchemasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSchemasRequest setParentMetaEntityId(String parentMetaEntityId) {
        this.parentMetaEntityId = parentMetaEntityId;
        return this;
    }
    public String getParentMetaEntityId() {
        return this.parentMetaEntityId;
    }

    public ListSchemasRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListSchemasRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

}
