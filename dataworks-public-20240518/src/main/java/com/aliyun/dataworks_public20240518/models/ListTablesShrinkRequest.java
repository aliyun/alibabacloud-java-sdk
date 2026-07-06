// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListTablesShrinkRequest extends TeaModel {
    /**
     * <p>The comment. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

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
     * <p>The page size. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the parent-level metadata entity. You can obtain this value from the response of the ListDatabases or ListSchemas operation. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Metadata entity concepts</a>.</p>
     * <ul>
     * <li><p>The value can be the database to which the table belongs. The ParentMetaEntityId format is <code>${EntityType}:${InstanceID or encoded URL}:${DataCatalogIdentifier}:${DatabaseName}</code>. Use an empty string as a placeholder for levels that do not exist.</p>
     * </li>
     * <li><p>The value can also be the database schema to which the table belongs. The ParentMetaEntityId format is <code>${EntityType}:${InstanceID or encoded URL}:${DataCatalogIdentifier}:${DatabaseName}:${SchemaName}</code>. Use an empty string as a placeholder for levels that do not exist.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can set ParentMetaEntityId to a database schema only when the database type supports schemas (<code>maxcompute/holo/postgresql/sqlserver/hybriddb_for_postgresql/oracle</code>, and the three-level model must be enabled for the maxcompute type). Otherwise, you can set this parameter only to a database.</li>
     * <li>For the maxcompute and dlf types, use an empty string as a placeholder for the instance ID. For the maxcompute type, the database name is the MaxCompute project name.</li>
     * <li>For the starrocks type, the data catalog identifier is the catalog name. For the dlf type, the data catalog identifier is the catalog ID. Other types do not support the catalog level. Use an empty string as a placeholder.</li>
     * </ul>
     * </blockquote>
     * <p>The following examples show the ParentMetaEntityId formats for common types:</p>
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
     * <li><code>instance_id</code>: The instance ID. This value is required when the data source is registered in instance mode.</li>
     * <li><code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string. This value is required when the data source is registered by using a connection string.</li>
     * <li><code>catalog_id</code>: The DLF catalog ID.</li>
     * <li><code>project_name</code>: The MaxCompute project name.</li>
     * <li><code>database_name</code>: The database name.</li>
     * <li><code>schema_name</code>: The schema name.</li>
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
     * <p>The field by which to sort the results. Default value: CreateTime. Valid values:</p>
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
     * <p>The list of table types to query. If this parameter is left empty, all types are queried.</p>
     */
    @NameInMap("TableTypes")
    public String tableTypesShrink;

    public static ListTablesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTablesShrinkRequest self = new ListTablesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTablesShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ListTablesShrinkRequest setIncludeExtendedProperties(Boolean includeExtendedProperties) {
        this.includeExtendedProperties = includeExtendedProperties;
        return this;
    }
    public Boolean getIncludeExtendedProperties() {
        return this.includeExtendedProperties;
    }

    public ListTablesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListTablesShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListTablesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTablesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTablesShrinkRequest setParentMetaEntityId(String parentMetaEntityId) {
        this.parentMetaEntityId = parentMetaEntityId;
        return this;
    }
    public String getParentMetaEntityId() {
        return this.parentMetaEntityId;
    }

    public ListTablesShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListTablesShrinkRequest setTableTypesShrink(String tableTypesShrink) {
        this.tableTypesShrink = tableTypesShrink;
        return this;
    }
    public String getTableTypesShrink() {
        return this.tableTypesShrink;
    }

}
