// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticTableColumnEngineMeta extends TeaModel {
    /**
     * <p>Indicates whether the column uses auto-increment.</p>
     */
    @NameInMap("AutoIncrement")
    public Boolean autoIncrement;

    /**
     * <p>The data length of the column. This parameter typically applies to string and binary data types.</p>
     */
    @NameInMap("DataLength")
    public Long dataLength;

    /**
     * <p>The data precision of the column, which is the total number of digits in a numeric type.</p>
     */
    @NameInMap("DataPrecision")
    public Integer dataPrecision;

    /**
     * <p>The data scale of the column, which is the number of digits to the right of the decimal point in a numeric type.</p>
     */
    @NameInMap("DataScale")
    public Integer dataScale;

    /**
     * <p>The default value of the column.</p>
     */
    @NameInMap("DefaultValue")
    public String defaultValue;

    /**
     * <p>The character encoding of the column.</p>
     */
    @NameInMap("Encoding")
    public String encoding;

    /**
     * <p>Engine-specific attributes or flags for the column.</p>
     */
    @NameInMap("Extra")
    public String extra;

    /**
     * <p>Indicates whether the column is a generated column.</p>
     */
    @NameInMap("GenerationColumn")
    public Boolean generationColumn;

    /**
     * <p>The expression used to generate the column\&quot;s value. Applies only if <code>GenerationColumn</code> is <code>true</code>.</p>
     */
    @NameInMap("GenerationExpression")
    public String generationExpression;

    /**
     * <p>Indicates whether the column is nullable.</p>
     */
    @NameInMap("Nullable")
    public Boolean nullable;

    public static AgenticTableColumnEngineMeta build(java.util.Map<String, ?> map) throws Exception {
        AgenticTableColumnEngineMeta self = new AgenticTableColumnEngineMeta();
        return TeaModel.build(map, self);
    }

    public AgenticTableColumnEngineMeta setAutoIncrement(Boolean autoIncrement) {
        this.autoIncrement = autoIncrement;
        return this;
    }
    public Boolean getAutoIncrement() {
        return this.autoIncrement;
    }

    public AgenticTableColumnEngineMeta setDataLength(Long dataLength) {
        this.dataLength = dataLength;
        return this;
    }
    public Long getDataLength() {
        return this.dataLength;
    }

    public AgenticTableColumnEngineMeta setDataPrecision(Integer dataPrecision) {
        this.dataPrecision = dataPrecision;
        return this;
    }
    public Integer getDataPrecision() {
        return this.dataPrecision;
    }

    public AgenticTableColumnEngineMeta setDataScale(Integer dataScale) {
        this.dataScale = dataScale;
        return this;
    }
    public Integer getDataScale() {
        return this.dataScale;
    }

    public AgenticTableColumnEngineMeta setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public AgenticTableColumnEngineMeta setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public AgenticTableColumnEngineMeta setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public AgenticTableColumnEngineMeta setGenerationColumn(Boolean generationColumn) {
        this.generationColumn = generationColumn;
        return this;
    }
    public Boolean getGenerationColumn() {
        return this.generationColumn;
    }

    public AgenticTableColumnEngineMeta setGenerationExpression(String generationExpression) {
        this.generationExpression = generationExpression;
        return this;
    }
    public String getGenerationExpression() {
        return this.generationExpression;
    }

    public AgenticTableColumnEngineMeta setNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }
    public Boolean getNullable() {
        return this.nullable;
    }

}
