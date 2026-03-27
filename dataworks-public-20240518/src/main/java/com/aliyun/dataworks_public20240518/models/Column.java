// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class Column extends TeaModel {
    /**
     * <p>Business metadata.</p>
     */
    @NameInMap("BusinessMetadata")
    public ColumnBusinessMetadata businessMetadata;

    /**
     * <p>The comment.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Specifies whether the column is a foreign key (only supported by MaxCompute).</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForeignKey")
    public Boolean foreignKey;

    /**
     * <p>The ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Description of concepts related to metadata entities</a>.</p>
     * <p>The format is: <code>${EntityType}:${Instance ID or encoded URL}:${Catalog Identifier}:${Database name}:${Schema name}:${Table Name}:${Column name}</code>. Use empty strings as placeholders for non-existent hierarchy levels.</p>
     * <blockquote>
     * <p> For the MaxCompute and DLF types, use an empty string as the placeholder for the instance ID. For MaxCompute, the database name refers to the MaxCompute project name. If the project has schema enabled, you must specify the schema name. Otherwise, use an empty string as the placeholder for the schema name.</p>
     * </blockquote>
     * <blockquote>
     * <p> For StarRocks, the catalog identifier is the catalog name. For DLF, it is the catalog ID. Other types do not support the catalog level and you can use an empty string as a placeholder.</p>
     * </blockquote>
     * <p>Examples of ID formats for common types are as follows:</p>
     * <p><code>maxcompute-column:::project_name:[schema_name]:table_name:column_name</code></p>
     * <p><code>dlf-column::catalog_id:database_name::table_name:column_name</code></p>
     * <p><code>hms-column:instance_id::database_name::table_name:column_name</code></p>
     * <p><code>holo-column:instance_id::database_name:schema_name:table_name:column_name</code></p>
     * <p><code>mysql-column:(instance_id|encoded_jdbc_url)::database_name::table_name:column_name</code></p>
     * <blockquote>
     * <p>\
     * <code>instance_id</code>: The instance ID, required when the data source is registered in instance mode.\
     * <code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string, which is required when the data source is registered via a connection string.\
     * <code>catalog_id</code>: The DLF catalog ID.\
     * <code>project_name</code>: The MaxCompute project name.\
     * <code>database_name</code>: The database name.\
     * <code>schema_name</code>: The schema name. For the MaxCompute type, this is required only if the project has enabled schema; otherwise, use an empty string as a placeholder.\
     * <code>table_name</code>: The table name.\
     * <code>column_name</code>: The field name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-column:123456::test_project:default:test_tbl:col1</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>col1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether the column is a partition key.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PartitionKey")
    public Boolean partitionKey;

    /**
     * <p>The position of the field.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Position")
    public Integer position;

    /**
     * <p>Specifies whether the column is a primary key (only supported by MaxCompute).</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PrimaryKey")
    public Boolean primaryKey;

    /**
     * <p>The table ID. You can refer to the <code>Table</code> object.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table:123456::test_project:default:test_tbl</p>
     */
    @NameInMap("TableId")
    public String tableId;

    /**
     * <p>The type.</p>
     * 
     * <strong>example:</strong>
     * <p>bigint</p>
     */
    @NameInMap("Type")
    public String type;

    public static Column build(java.util.Map<String, ?> map) throws Exception {
        Column self = new Column();
        return TeaModel.build(map, self);
    }

    public Column setBusinessMetadata(ColumnBusinessMetadata businessMetadata) {
        this.businessMetadata = businessMetadata;
        return this;
    }
    public ColumnBusinessMetadata getBusinessMetadata() {
        return this.businessMetadata;
    }

    public Column setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Column setForeignKey(Boolean foreignKey) {
        this.foreignKey = foreignKey;
        return this;
    }
    public Boolean getForeignKey() {
        return this.foreignKey;
    }

    public Column setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Column setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Column setPartitionKey(Boolean partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }
    public Boolean getPartitionKey() {
        return this.partitionKey;
    }

    public Column setPosition(Integer position) {
        this.position = position;
        return this;
    }
    public Integer getPosition() {
        return this.position;
    }

    public Column setPrimaryKey(Boolean primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }
    public Boolean getPrimaryKey() {
        return this.primaryKey;
    }

    public Column setTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }
    public String getTableId() {
        return this.tableId;
    }

    public Column setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ColumnBusinessMetadata extends TeaModel {
        /**
         * <p>A business-level description of the field (supported only by MaxCompute, HMS (EMR clusters) and DLF.</p>
         */
        @NameInMap("Description")
        public String description;

        public static ColumnBusinessMetadata build(java.util.Map<String, ?> map) throws Exception {
            ColumnBusinessMetadata self = new ColumnBusinessMetadata();
            return TeaModel.build(map, self);
        }

        public ColumnBusinessMetadata setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
