// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListTablesRequest extends TeaModel {
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
     * <p>The parent metadata entity ID. You can refer to the responses of the ListDatabases or ListSchemas operation and <a href="https://help.aliyun.com/document_detail/2880092.html">Description of concepts related to metadata entities.</a></p>
     * <ul>
     * <li>The parent metadata entity is a database: The format of <code>ParentMetaEntityId</code> is <code>${EntityType}:${Instance ID or encoded URL}:${Catalog Identifier}:${Database Name}</code>. Use an empty string (\<code>&quot;&quot;\\</code>) as a placeholder for any non-existent level.</li>
     * <li>The parent metadata entity is a database schema:. The format of <code>ParentMetaEntityId</code> is <code>${EntityType}:${Instance ID or encoded URL}:${Catalog Identifier}:${Database Name}:${Schema Name}</code>. Use an empty string (\<code>&quot;&quot;\\</code>) as a placeholder for any non-existent level.</li>
     * </ul>
     * <blockquote>
     * <p> The schema level in <code>ParentMetaEntityId</code> is supported only for database types that support schemas, such as MaxCompute (with schema enabled), Hologres, PostgreSQL, SQL Server, HybridDB for PostgreSQL, and Oracle.``</p>
     * </blockquote>
     * <blockquote>
     * <p> For MaxCompute and DLF types, use empty strings as the instance ID. For MaxCompute, the database name is the same as the project name.</p>
     * </blockquote>
     * <blockquote>
     * <p> For the StarRocks type, the catalog identifier is the catalog name. For the DLF type, it refers to the catalog ID. Other types do not support a catalog-level hierarchy and the catalog identifier must be replaced with an empty string as a placeholder.</p>
     * </blockquote>
     * <p>Examples of common ParentMetaEntityId formats</p>
     * <p><code>maxcompute-project:::project_name</code></p>
     * <p><code>maxcompute-schema:::project_name:schema_name</code> (for MaxCompute projects with schema enabled)</p>
     * <p><code>dlf-database::catalog_id:database_name</code></p>
     * <p><code>hms-database:instance_id::database_name</code></p>
     * <p><code>holo-schema:instance_id::database_name:schema_name</code></p>
     * <p><code>mysql-database:(instance_id|encoded_jdbc_url)::database_name</code></p>
     * <blockquote>
     * <p>\
     * <code>instance_id</code>: The instance ID, required when the data source is registered in instance mode.\
     * <code>encoded_jdbc_url</code>: The JDBC connection string that has been URL encoded, required for the data source registered via a connection string.\
     * <code>catalog_id</code>: The DLF catalog ID.\
     * <code>project_name</code>: The MaxCompute project name.\
     * <code>database_name</code>: The database name.\
     * <code>schema_name</code>: The schema name.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-schema:123456XXX::test_project_with_schema:default
     * maxcompute-project:123456XXX::test_project_without_schema
     * dlf-database:123456XXX:test_catalog:test_db
     * hms-database:c-abc123xxx::test_db
     * holo-schema:h-abc123xxx::test_db:test_schema
     * mysql-database:jdbc%3Amysql%3A%2F%2F127.0.0.1%3A3306%2Ftest_db::test_db</p>
     */
    @NameInMap("ParentMetaEntityId")
    public String parentMetaEntityId;

    /**
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

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
