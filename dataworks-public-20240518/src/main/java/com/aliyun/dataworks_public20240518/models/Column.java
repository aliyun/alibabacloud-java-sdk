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
     * 
     * <strong>example:</strong>
     * <p>字段1</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Indicates whether the field is a foreign key. Only MaxCompute supports this property.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForeignKey")
    public Boolean foreignKey;

    /**
     * <p>The ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Metadata entity concepts</a>.</p>
     * <p>The format is <code>${EntityType}:${instance ID or URL-encoded connection string}:${data catalog identifier}:${database name}:${schema name}:${table name}:${field name}</code>. Use an empty string for any level that does not exist.</p>
     * <blockquote>
     * <p>For MaxCompute and DLF types, use an empty string for the instance ID. For MaxCompute, the database name is the MaxCompute project name. If the project uses the three-layer model, provide the schema name. Otherwise, use an empty string for the schema name.</p>
     * </blockquote>
     * <blockquote>
     * <p>For StarRocks, the data catalog identifier is the catalog name. For DLF, it is the catalog ID. Other types do not support the catalog level, so use an empty string.</p>
     * </blockquote>
     * <p>Examples of common ID formats:</p>
     * <p><code>maxcompute-column:::project_name:[schema_name]:table_name:column_name</code></p>
     * <p><code>dlf-column::catalog_id:database_name::table_name:column_name</code></p>
     * <p><code>hms-column:instance_id::database_name::table_name:column_name</code></p>
     * <p><code>holo-column:instance_id::database_name:schema_name:table_name:column_name</code></p>
     * <p><code>mysql-column:(instance_id|encoded_jdbc_url)::database_name::table_name:column_name</code></p>
     * <blockquote>
     * <p>Where:<br>
     * <code>instance_id</code>: The instance ID, required when the data source is registered in instance mode.<br>
     * <code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string, required when the data source is registered using a connection string.<br>
     * <code>catalog_id</code>: The DLF catalog ID.<br>
     * <code>project_name</code>: The MaxCompute project name.<br>
     * <code>database_name</code>: The database name.<br>
     * <code>schema_name</code>: The schema name. For MaxCompute, provide this only if the project uses the three-layer model. Otherwise, use an empty string.<br>
     * <code>table_name</code>: The table name.<br>
     * <code>column_name</code>: The field name.<br><br><br><br><br><br><br><br></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-column:::project_name:[schema_name]:table_name:column_name</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>column_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Indicates whether the field is a partition key.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PartitionKey")
    public Boolean partitionKey;

    /**
     * <p>The position.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Position")
    public Integer position;

    /**
     * <p>Indicates whether the field is a primary key. Only MaxCompute supports this property.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PrimaryKey")
    public Boolean primaryKey;

    /**
     * <p>The table ID. For details, see the <code>Table</code> object.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table:::project_name:[schema_name]:table_name</p>
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
         * <p>Custom attribute values. The key is the custom attribute identifier, and the value is a list of attribute values.</p>
         */
        @NameInMap("CustomAttributes")
        public java.util.Map<String, java.util.List<String>> customAttributes;

        /**
         * <p>The business description of the field. Supported only for MaxCompute, HMS (EMR cluster), and DLF types.</p>
         * 
         * <strong>example:</strong>
         * <p>字段1的业务描述</p>
         */
        @NameInMap("Description")
        public String description;

        public static ColumnBusinessMetadata build(java.util.Map<String, ?> map) throws Exception {
            ColumnBusinessMetadata self = new ColumnBusinessMetadata();
            return TeaModel.build(map, self);
        }

        public ColumnBusinessMetadata setCustomAttributes(java.util.Map<String, java.util.List<String>> customAttributes) {
            this.customAttributes = customAttributes;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getCustomAttributes() {
            return this.customAttributes;
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
