// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateToolInput extends TeaModel {
    @NameInMap("CAPConfig")
    public CAPConfig CAPConfig;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("schema")
    public String schema;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("toolType")
    public String toolType;

    public static CreateToolInput build(java.util.Map<String, ?> map) throws Exception {
        CreateToolInput self = new CreateToolInput();
        return TeaModel.build(map, self);
    }

    public CreateToolInput setCAPConfig(CAPConfig CAPConfig) {
        this.CAPConfig = CAPConfig;
        return this;
    }
    public CAPConfig getCAPConfig() {
        return this.CAPConfig;
    }

    public CreateToolInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateToolInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateToolInput setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public CreateToolInput setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateToolInput setToolType(String toolType) {
        this.toolType = toolType;
        return this;
    }
    public String getToolType() {
        return this.toolType;
    }

}
