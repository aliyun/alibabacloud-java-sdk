// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class Column extends TeaModel {
    @NameInMap("BusinessMetadata")
    public ColumnBusinessMetadata businessMetadata;

    /**
     * <strong>example:</strong>
     * <p>字段1</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForeignKey")
    public Boolean foreignKey;

    /**
     * <strong>example:</strong>
     * <p>maxcompute-column:123456::test_project:default:test_tbl:col1</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>col1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PartitionKey")
    public Boolean partitionKey;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Position")
    public Integer position;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PrimaryKey")
    public Boolean primaryKey;

    /**
     * <strong>example:</strong>
     * <p>maxcompute-table:123456::test_project:default:test_tbl</p>
     */
    @NameInMap("TableId")
    public String tableId;

    /**
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
         * <strong>example:</strong>
         * <p>字段1的业务描述</p>
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
