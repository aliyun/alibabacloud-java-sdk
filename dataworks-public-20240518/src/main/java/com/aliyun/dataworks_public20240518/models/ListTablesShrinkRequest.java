// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListTablesShrinkRequest extends TeaModel {
    /**
     * <p>The comment. Supports fuzzy matching.</p>
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
     * <li>Asc</li>
     * <li>Desc</li>
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
     * <p>The parent metadata entity ID. You can refer to the responses of the ListDatabases or ListSchemas operation and <a href="https://help.aliyun.com/document_detail/2880092.html">Description of concepts related to metadata entities.</a></p>
     * <ul>
     * <li>The parent metadata entity is a database: The format of <code>ParentMetaEntityId</code> is <code>${EntityType}:${Instance ID or encoded URL}:${Catalog Identifier}:${Database Name}</code>. Use an empty string (\<code>&quot;&quot;\\</code>) as a placeholder for any non-existent level.</li>
     * <li>The parent metadata entity is a database schema: The format of <code>ParentMetaEntityId</code> is <code>${EntityType}:${Instance ID or encoded URL}:${Catalog Identifier}:${Database Name}:${Schema Name}</code>. Use an empty string (\<code>&quot;&quot;\\</code>) as a placeholder for any non-existent level.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The schema level in <code>ParentMetaEntityId</code> is supported only for database services, such as <code>MaxCompute (with schema enabled), Hologres, PostgreSQL, SQL Server, HybridDB for PostgreSQL, and Oracle</code>.</p>
     * </li>
     * <li><p>For the MaxCompute and DLF types, use an empty string as the placeholder for the instance ID. For MaxCompute, the database name is the same as the project name.</p>
     * </li>
     * <li><p>For StarRocks, the catalog identifier is the catalog name. For DLF, it is the catalog ID. Other types do not support the catalog level and you can use an empty string as a placeholder.</p>
     * </li>
     * </ul>
     * <p>Examples of common ParentMetaEntityId formats</p>
     * <ul>
     * <li><code>maxcompute-project:::project_name</code></li>
     * <li><code>maxcompute-schema:::project_name:schema_name</code> (for MaxCompute projects with schema enabled)</li>
     * <li><code>dlf-database::catalog_id:database_name</code></li>
     * <li><code>hms-database:instance_id::database_name</code></li>
     * <li><code>holo-schema:instance_id::database_name:schema_name</code></li>
     * <li><code>mysql-database:(instance_id|encoded_jdbc_url)::database_name</code></li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p><code>instance_id</code>: The instance ID, which is required when the data source is registered in instance mode.</p>
     * </li>
     * <li><p><code>encoded_jdbc_url</code>: The URLEncoded JDBC connection string, which is requiredwhen the data source is registered using a connection string.</p>
     * </li>
     * <li><p><code>catalog_id</code>: The DLF catalog ID.</p>
     * </li>
     * <li><p><code>project_name</code>: The MaxCompute project name.</p>
     * </li>
     * <li><p><code>database_name</code>: The database name.</p>
     * </li>
     * <li><p><code>schema_name</code>: The schema name.</p>
     * </li>
     * </ul>
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
     * <p>The sort field. Default value: CreateTime. Valid values:</p>
     * <ul>
     * <li>CreateTime</li>
     * <li>ModifyTime</li>
     * <li>Name</li>
     * <li>TableType</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The list of table types to query. If it\&quot;s left empty, all types will be queried.</p>
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
