// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class MCPToolMeta extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Here is an example</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("inputSchema")
    public java.util.Map<String, ?> inputSchema;

    /**
     * <strong>example:</strong>
     * <p>demo-tool</p>
     */
    @NameInMap("name")
    public String name;

    public static MCPToolMeta build(java.util.Map<String, ?> map) throws Exception {
        MCPToolMeta self = new MCPToolMeta();
        return TeaModel.build(map, self);
    }

    public MCPToolMeta setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MCPToolMeta setInputSchema(java.util.Map<String, ?> inputSchema) {
        this.inputSchema = inputSchema;
        return this;
    }
    public java.util.Map<String, ?> getInputSchema() {
        return this.inputSchema;
    }

    public MCPToolMeta setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
