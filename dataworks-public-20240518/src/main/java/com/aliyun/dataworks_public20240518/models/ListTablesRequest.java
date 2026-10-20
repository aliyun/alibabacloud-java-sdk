// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListTablesRequest extends TeaModel {
    /**
     * <p>The comment. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Specifies whether to return extended properties. If this parameter is set to <code>true</code>, extended properties are returned. If this parameter is set to <code>false</code>, extended properties are not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeExtendedProperties")
    public Boolean includeExtendedProperties;

    /**
     * <p>The name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order. Default value: Asc. Valid values:</p>
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
     * <p>The ID of the parent metadata entity. You can refer to the response of the ListDatabases or ListSchemas operation, or see <a href="https://help.aliyun.com/document_detail/2880092.html">Metadata entity concepts</a>.</p>
     * <ul>
     * <li><p>The parent entity can be the database to which the table belongs. The <code>ParentMetaEntityId</code> format is <code>${EntityType}:${Instance ID or URL-encoded JDBC URL}:${Data catalog identifier}:${Database name}</code>. Use an empty string as a placeholder for non-existent levels.</p>
     * </li>
     * <li><p>The parent entity can also be the database schema to which the table belongs. The <code>ParentMetaEntityId</code> format is <code>${EntityType}:${Instance ID or URL-encoded JDBC URL}:${Data catalog identifier}:${Database name}:${Schema name}</code>. Use an empty string as a placeholder for non-existent levels.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>The database schema can be used for <code>ParentMetaEntityId</code> only when the database type supports schemas (<code>maxcompute</code>, <code>holo</code>, <code>postgresql</code>, <code>sqlserver</code>, <code>hybriddb_for_postgresql</code>, or <code>oracle</code>). For MaxCompute, the three-level model must be enabled. Otherwise, only the database can be used.</li>
     * <li>For MaxCompute and DLF types, use an empty string as a placeholder for the instance ID. For MaxCompute, the database name is the MaxCompute project name.</li>
     * <li>For StarRocks, the data catalog identifier is the catalog name. For DLF, the data catalog identifier is the catalog ID. Other types do not support the catalog level, so use an empty string as a placeholder.</li>
     * </ul>
     * </blockquote>
     * <p>Examples of <code>ParentMetaEntityId</code> formats for common types:</p>
     * <ul>
     * <li><p><code>maxcompute-project:::project_name</code></p>
     * </li>
     * <li><p><code>maxcompute-schema:::project_name:schema_name</code> (only when the three-level model is enabled for the project)</p>
     * </li>
     * <li><p><code>dlf-database::catalog_id:database_name</code></p>
     * </li>
     * <li><p><code>hms-database:instance_id::database_name</code></p>
     * </li>
     * <li><p><code>holo-schema:instance_id::database_name:schema_name</code></p>
     * </li>
     * <li><p><code>mysql-database:(instance_id|encoded_jdbc_url)::database_name</code></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Where:  </p>
     * <ul>
     * <li><code>instance_id</code>: the instance ID, which is required when the data source is registered in instance mode.</li>
     * <li><code>encoded_jdbc_url</code>: the URL-encoded JDBC connection string, which is required when the data source is registered by using a connection string.</li>
     * <li><code>catalog_id</code>: the DLF catalog ID.</li>
     * <li><code>project_name</code>: the MaxCompute project name.</li>
     * <li><code>database_name</code>: the database name.</li>
     * <li><code>schema_name</code>: the schema name.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-project:::project_name</p>
     */
    @NameInMap("ParentMetaEntityId")
    public String parentMetaEntityId;

    /**
     * <p>The field used for sorting. Default value: CreateTime. Valid values:</p>
     * <ul>
     * <li>CreateTime: creation time</li>
     * <li>ModifyTime: modification time</li>
     * <li>Name: name</li>
     * <li>TableType: table type</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The list of table types to query. If this parameter is left empty, all table types are queried.</p>
     */
    @NameInMap("TableTypes")
    public java.util.List<String> tableTypes;

    public static ListTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTablesRequest self = new ListTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListTablesRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ListTablesRequest setIncludeExtendedProperties(Boolean includeExtendedProperties) {
        this.includeExtendedProperties = includeExtendedProperties;
        return this;
    }
    public Boolean getIncludeExtendedProperties() {
        return this.includeExtendedProperties;
    }

    public ListTablesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListTablesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListTablesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTablesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTablesRequest setParentMetaEntityId(String parentMetaEntityId) {
        this.parentMetaEntityId = parentMetaEntityId;
        return this;
    }
    public String getParentMetaEntityId() {
        return this.parentMetaEntityId;
    }

    public ListTablesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListTablesRequest setTableTypes(java.util.List<String> tableTypes) {
        this.tableTypes = tableTypes;
        return this;
    }
    public java.util.List<String> getTableTypes() {
        return this.tableTypes;
    }

}
