// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateToolData extends TeaModel {
    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("id")
    public String id;

    @NameInMap("name")
    public String name;

    @NameInMap("sourceType")
    public String sourceType;

    @NameInMap("toolType")
    public String toolType;

    public static CreateToolData build(java.util.Map<String, ?> map) throws Exception {
        CreateToolData self = new CreateToolData();
        return TeaModel.build(map, self);
    }

    public CreateToolData setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateToolData setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateToolData setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateToolData setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateToolData setToolType(String toolType) {
        this.toolType = toolType;
        return this;
    }
    public String getToolType() {
        return this.toolType;
    }

}
