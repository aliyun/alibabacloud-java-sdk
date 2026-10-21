// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticTableColumnEngineMeta extends TeaModel {
    /**
     * <p>Specifies whether the field is auto-incremented.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoIncrement")
    public Boolean autoIncrement;

    /**
     * <p>The defined length of the field.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DataLength")
    public Long dataLength;

    /**
     * <p>The precision of the numeric field.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DataPrecision")
    public Integer dataPrecision;

    /**
     * <p>The scale of the numeric field, which is the number of decimal places.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DataScale")
    public Integer dataScale;

    /**
     * <p>The default value of the field.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DefaultValue")
    public String defaultValue;

    /**
     * <p>The character set of the field.</p>
     * 
     * <strong>example:</strong>
     * <p>utf8mb4</p>
     */
    @NameInMap("Encoding")
    public String encoding;

    /**
     * <p>The additional information of the field, such as auto_increment.</p>
     * 
     * <strong>example:</strong>
     * <p>auto_increment</p>
     */
    @NameInMap("Extra")
    public String extra;

    /**
     * <p>Specifies whether the field is a generated column.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GenerationColumn")
    public Boolean generationColumn;

    /**
     * <p>The calculation expression of the generated column.</p>
     * 
     * <strong>example:</strong>
     * <p>price * quantity</p>
     */
    @NameInMap("GenerationExpression")
    public String generationExpression;

    /**
     * <p>Specifies whether the field allows null values.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
