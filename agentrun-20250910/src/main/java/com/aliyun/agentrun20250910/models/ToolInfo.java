// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ToolInfo extends TeaModel {
    @NameInMap("CAPConfig")
    public CAPConfig CAPConfig;

    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("description")
    public String description;

    @NameInMap("id")
    public String id;

    @NameInMap("name")
    public String name;

    @NameInMap("schema")
    public String schema;

    @NameInMap("sourceType")
    public String sourceType;

    @NameInMap("toolType")
    public String toolType;

    @NameInMap("updatedAt")
    public String updatedAt;

    public static ToolInfo build(java.util.Map<String, ?> map) throws Exception {
        ToolInfo self = new ToolInfo();
        return TeaModel.build(map, self);
    }

    public ToolInfo setCAPConfig(CAPConfig CAPConfig) {
        this.CAPConfig = CAPConfig;
        return this;
    }
    public CAPConfig getCAPConfig() {
        return this.CAPConfig;
    }

    public ToolInfo setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public ToolInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ToolInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ToolInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ToolInfo setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public ToolInfo setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ToolInfo setToolType(String toolType) {
        this.toolType = toolType;
        return this;
    }
    public String getToolType() {
        return this.toolType;
    }

    public ToolInfo setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
