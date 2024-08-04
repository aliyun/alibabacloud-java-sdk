// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ColumnMetadata extends TeaModel {
    @NameInMap("ColumnDefault")
    public String columnDefault;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("IsCaseSensitive")
    public Boolean isCaseSensitive;

    @NameInMap("IsCurrency")
    public Boolean isCurrency;

    @NameInMap("IsPrimaryKey")
    public Boolean isPrimaryKey;

    @NameInMap("IsSigned")
    public Boolean isSigned;

    @NameInMap("MaxLength")
    public Integer maxLength;

    @NameInMap("Name")
    public String name;

    @NameInMap("Nullable")
    public Boolean nullable;

    @NameInMap("Precision")
    public Integer precision;

    @NameInMap("Scale")
    public Integer scale;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("UdtName")
    public String udtName;

    public static ColumnMetadata build(java.util.Map<String, ?> map) throws Exception {
        ColumnMetadata self = new ColumnMetadata();
        return TeaModel.build(map, self);
    }

    public ColumnMetadata setColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault;
        return this;
    }
    public String getColumnDefault() {
        return this.columnDefault;
    }

    public ColumnMetadata setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ColumnMetadata setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public ColumnMetadata setIsCaseSensitive(Boolean isCaseSensitive) {
        this.isCaseSensitive = isCaseSensitive;
        return this;
    }
    public Boolean getIsCaseSensitive() {
        return this.isCaseSensitive;
    }

    public ColumnMetadata setIsCurrency(Boolean isCurrency) {
        this.isCurrency = isCurrency;
        return this;
    }
    public Boolean getIsCurrency() {
        return this.isCurrency;
    }

    public ColumnMetadata setIsPrimaryKey(Boolean isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
        return this;
    }
    public Boolean getIsPrimaryKey() {
        return this.isPrimaryKey;
    }

    public ColumnMetadata setIsSigned(Boolean isSigned) {
        this.isSigned = isSigned;
        return this;
    }
    public Boolean getIsSigned() {
        return this.isSigned;
    }

    public ColumnMetadata setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }
    public Integer getMaxLength() {
        return this.maxLength;
    }

    public ColumnMetadata setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ColumnMetadata setNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }
    public Boolean getNullable() {
        return this.nullable;
    }

    public ColumnMetadata setPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }
    public Integer getPrecision() {
        return this.precision;
    }

    public ColumnMetadata setScale(Integer scale) {
        this.scale = scale;
        return this;
    }
    public Integer getScale() {
        return this.scale;
    }

    public ColumnMetadata setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public ColumnMetadata setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ColumnMetadata setUdtName(String udtName) {
        this.udtName = udtName;
        return this;
    }
    public String getUdtName() {
        return this.udtName;
    }

}
