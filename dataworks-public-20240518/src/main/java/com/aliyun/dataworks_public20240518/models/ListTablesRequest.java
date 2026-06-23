// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListTablesRequest extends TeaModel {
    /**
     * <p>The comment on the table. Fuzzy matching is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The name of the table. Fuzzy matching is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order. Default value: <code>Asc</code>. Valid values:</p>
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
     * <p>The ID of the parent metadata entity. You can obtain this ID from the response of the ListDatabases or ListSchemas operation. For details, see <a href="https://help.aliyun.com/document_detail/2880092.html">Metadata entity concepts</a>.</p>
     * <ul>
     * <li><p>The value can be the database to which the table belongs. The format is <code>${EntityType}:${instance ID or URL-encoded connection string}:${data catalog identifier}:${database name}</code>. Use an empty string as a placeholder for a hierarchy level that does not exist.</p>
     * </li>
     * <li><p>The value can also be the schema to which the table belongs. The format is <code>${EntityType}:${instance ID or URL-encoded connection string}:${data catalog identifier}:${database name}:${schema name}</code>. Use an empty string as a placeholder for a hierarchy level that does not exist.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>You can specify a schema in <code>ParentMetaEntityId</code> only if the database type supports schemas, such as <code>maxcompute/holo/postgresql/sqlserver/hybriddb_for_postgresql/oracle</code>. For the maxcompute type, the three-layer model must be enabled. Otherwise, you can only specify a database.</p>
     * </li>
     * <li><p>For <code>maxcompute</code> and <code>dlf</code> data types, use an empty string as a placeholder for the instance ID. For the maxcompute data type, the database name is the MaxCompute project name.</p>
     * </li>
     * <li><p>For the <code>starrocks</code> type, the data catalog identifier is the catalog name. For the <code>dlf</code> type, the data catalog identifier is the catalog ID. Other types do not support the catalog level, so you can use an empty string as a placeholder.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>The following list shows the <code>ParentMetaEntityId</code> format for several common data source types:</p>
     * <ul>
     * <li><p><code>maxcompute-project:::project_name</code></p>
     * </li>
     * <li><p><code>maxcompute-schema:::project_name:schema_name</code> (Only when the three-layer model is enabled for the project)</p>
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
     * <p>In these formats:</p>
     * <ul>
     * <li><p><code>instance_id</code>: The instance ID. This parameter is required if the data source is registered in instance mode.</p>
     * </li>
     * <li><p><code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string. This parameter is required if the data source is registered by using a connection string.</p>
     * </li>
     * <li><p><code>catalog_id</code>: The ID of the DLF data catalog.</p>
     * </li>
     * <li><p><code>project_name</code>: The name of the MaxCompute project.</p>
     * </li>
     * <li><p><code>database_name</code>: The name of the database.</p>
     * </li>
     * <li><p><code>schema_name</code>: The name of the schema.</p>
     * </li>
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
     * <p>The sort field. Default value: <code>CreateTime</code>. Valid values:</p>
     * <ul>
     * <li><p><code>CreateTime</code>: creation time</p>
     * </li>
     * <li><p><code>ModifyTime</code>: modification time</p>
     * </li>
     * <li><p><code>Name</code>: name</p>
     * </li>
     * <li><p><code>TableType</code>: table type</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>A list of table types to query. If you omit this parameter, tables of all types are returned.</p>
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
