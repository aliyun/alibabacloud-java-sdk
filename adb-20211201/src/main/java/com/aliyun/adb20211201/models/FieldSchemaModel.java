// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class FieldSchemaModel extends TeaModel {
    /**
     * <p>Indicates whether the column is auto-incremented.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoIncrement")
    public Boolean autoIncrement;

    /**
     * <p>The original name of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>ColumnRawName</p>
     */
    @NameInMap("ColumnRawName")
    public String columnRawName;

    /**
     * <p>The description of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Indicates whether FLOAT data is compressed to SHORT data.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CompressFloatUseShort")
    public Boolean compressFloatUseShort;

    /**
     * <p>The compression method of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>compression</p>
     */
    @NameInMap("Compression")
    public String compression;

    /**
     * <p>The time when the column was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-05 13:17:55</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The data type of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>long</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The logical name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>databaseName</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The default value of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DefaultValue")
    public String defaultValue;

    /**
     * <p>The delimiter of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>delimiter</p>
     */
    @NameInMap("Delimiter")
    public String delimiter;

    /**
     * <p>The encryption method of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>encode</p>
     */
    @NameInMap("Encode")
    public String encode;

    /**
     * <p>Indicates whether the column is the partition key.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsPartitionKey")
    public Boolean isPartitionKey;

    /**
     * <p>The mapping name.</p>
     * 
     * <strong>example:</strong>
     * <p>mappedName</p>
     */
    @NameInMap("MappedName")
    public String mappedName;

    /**
     * <p>The name of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Indicates whether the column can be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Nullable")
    public Boolean nullable;

    /**
     * <p>The update condition of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>onUpdate</p>
     */
    @NameInMap("OnUpdate")
    public String onUpdate;

    /**
     * <p>The location of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("OrdinalPosition")
    public Long ordinalPosition;

    /**
     * <p>The physical name of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>PhysicalColumnName</p>
     */
    @NameInMap("PhysicalColumnName")
    public String physicalColumnName;

    /**
     * <p>The location of the primary key.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("PkPosition")
    public Long pkPosition;

    /**
     * <p>The precision of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Precision")
    public Long precision;

    /**
     * <p>Indicates whether the column is the primary key.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Primarykey")
    public Boolean primarykey;

    /**
     * <p>The scale of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Scale")
    public Long scale;

    /**
     * <p>The logical name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>tableName</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The token of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>tokenizer</p>
     */
    @NameInMap("Tokenizer")
    public String tokenizer;

    /**
     * <p>The type of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>long</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The time when the index was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-05 13:17:55</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The value type of the column.</p>
     * 
     * <strong>example:</strong>
     * <p>valueType</p>
     */
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
