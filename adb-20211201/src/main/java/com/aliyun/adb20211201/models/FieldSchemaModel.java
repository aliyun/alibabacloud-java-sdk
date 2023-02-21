// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class FieldSchemaModel extends TeaModel {
    @NameInMap("AutoIncrement")
    public Boolean autoIncrement;

    @NameInMap("ColumnRawName")
    public String columnRawName;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("CompressFloatUseShort")
    public Boolean compressFloatUseShort;

    @NameInMap("Compression")
    public String compression;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("DefaultValue")
    public String defaultValue;

    @NameInMap("Delimiter")
    public String delimiter;

    @NameInMap("Encode")
    public String encode;

    @NameInMap("IsPartitionKey")
    public Boolean isPartitionKey;

    @NameInMap("MappedName")
    public String mappedName;

    @NameInMap("Name")
    public String name;

    @NameInMap("Nullable")
    public Boolean nullable;

    @NameInMap("OnUpdate")
    public String onUpdate;

    @NameInMap("OrdinalPosition")
    public Long ordinalPosition;

    @NameInMap("PhysicalColumnName")
    public String physicalColumnName;

    @NameInMap("PkPosition")
    public Long pkPosition;

    @NameInMap("Precision")
    public Long precision;

    @NameInMap("Primarykey")
    public Boolean primarykey;

    @NameInMap("Scale")
    public Long scale;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("Tokenizer")
    public String tokenizer;

    @NameInMap("Type")
    public String type;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("ValueType")
    public String valueType;

    public static FieldSchemaModel build(java.util.Map<String, ?> map) throws Exception {
        FieldSchemaModel self = new FieldSchemaModel();
        return TeaModel.build(map, self);
    }

    public FieldSchemaModel setAutoIncrement(Boolean autoIncrement) {
        this.autoIncrement = autoIncrement;
        return this;
    }
    public Boolean getAutoIncrement() {
        return this.autoIncrement;
    }

    public FieldSchemaModel setColumnRawName(String columnRawName) {
        this.columnRawName = columnRawName;
        return this;
    }
    public String getColumnRawName() {
        return this.columnRawName;
    }

    public FieldSchemaModel setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public FieldSchemaModel setCompressFloatUseShort(Boolean compressFloatUseShort) {
        this.compressFloatUseShort = compressFloatUseShort;
        return this;
    }
    public Boolean getCompressFloatUseShort() {
        return this.compressFloatUseShort;
    }

    public FieldSchemaModel setCompression(String compression) {
        this.compression = compression;
        return this;
    }
    public String getCompression() {
        return this.compression;
    }

    public FieldSchemaModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public FieldSchemaModel setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public FieldSchemaModel setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public FieldSchemaModel setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public FieldSchemaModel setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }
    public String getDelimiter() {
        return this.delimiter;
    }

    public FieldSchemaModel setEncode(String encode) {
        this.encode = encode;
        return this;
    }
    public String getEncode() {
        return this.encode;
    }

    public FieldSchemaModel setIsPartitionKey(Boolean isPartitionKey) {
        this.isPartitionKey = isPartitionKey;
        return this;
    }
    public Boolean getIsPartitionKey() {
        return this.isPartitionKey;
    }

    public FieldSchemaModel setMappedName(String mappedName) {
        this.mappedName = mappedName;
        return this;
    }
    public String getMappedName() {
        return this.mappedName;
    }

    public FieldSchemaModel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FieldSchemaModel setNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }
    public Boolean getNullable() {
        return this.nullable;
    }

    public FieldSchemaModel setOnUpdate(String onUpdate) {
        this.onUpdate = onUpdate;
        return this;
    }
    public String getOnUpdate() {
        return this.onUpdate;
    }

    public FieldSchemaModel setOrdinalPosition(Long ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
        return this;
    }
    public Long getOrdinalPosition() {
        return this.ordinalPosition;
    }

    public FieldSchemaModel setPhysicalColumnName(String physicalColumnName) {
        this.physicalColumnName = physicalColumnName;
        return this;
    }
    public String getPhysicalColumnName() {
        return this.physicalColumnName;
    }

    public FieldSchemaModel setPkPosition(Long pkPosition) {
        this.pkPosition = pkPosition;
        return this;
    }
    public Long getPkPosition() {
        return this.pkPosition;
    }

    public FieldSchemaModel setPrecision(Long precision) {
        this.precision = precision;
        return this;
    }
    public Long getPrecision() {
        return this.precision;
    }

    public FieldSchemaModel setPrimarykey(Boolean primarykey) {
        this.primarykey = primarykey;
        return this;
    }
    public Boolean getPrimarykey() {
        return this.primarykey;
    }

    public FieldSchemaModel setScale(Long scale) {
        this.scale = scale;
        return this;
    }
    public Long getScale() {
        return this.scale;
    }

    public FieldSchemaModel setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public FieldSchemaModel setTokenizer(String tokenizer) {
        this.tokenizer = tokenizer;
        return this;
    }
    public String getTokenizer() {
        return this.tokenizer;
    }

    public FieldSchemaModel setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public FieldSchemaModel setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public FieldSchemaModel setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

}
