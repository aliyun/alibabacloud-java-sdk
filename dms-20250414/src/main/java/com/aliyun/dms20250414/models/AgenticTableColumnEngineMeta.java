// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticTableColumnEngineMeta extends TeaModel {
    @NameInMap("AutoIncrement")
    public Boolean autoIncrement;

    @NameInMap("DataLength")
    public Long dataLength;

    @NameInMap("DataPrecision")
    public Integer dataPrecision;

    @NameInMap("DataScale")
    public Integer dataScale;

    @NameInMap("DefaultValue")
    public String defaultValue;

    @NameInMap("Encoding")
    public String encoding;

    @NameInMap("Extra")
    public String extra;

    @NameInMap("GenerationColumn")
    public Boolean generationColumn;

    @NameInMap("GenerationExpression")
    public String generationExpression;

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
