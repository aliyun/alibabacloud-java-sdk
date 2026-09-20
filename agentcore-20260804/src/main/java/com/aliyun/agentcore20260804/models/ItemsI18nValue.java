// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ItemsI18nValue extends TeaModel {
    /**
     * <p>The MCP service description in the corresponding language.</p>
     * 
     * <strong>example:</strong>
     * <p>An MCP service for querying knowledge bases</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The MCP marketplace template name in the corresponding language.</p>
     * 
     * <strong>example:</strong>
     * <p>Knowledge Base</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The MCP marketplace template usage instructions in the corresponding language.</p>
     * 
     * <strong>example:</strong>
     * <h1>Knowledge Base\nKnowledge base query service</h1>
     */
    @NameInMap("readme")
    public String readme;

    public static ItemsI18nValue build(java.util.Map<String, ?> map) throws Exception {
        ItemsI18nValue self = new ItemsI18nValue();
        return TeaModel.build(map, self);
    }

    public ItemsI18nValue setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ItemsI18nValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ItemsI18nValue setReadme(String readme) {
        this.readme = readme;
        return this;
    }
    public String getReadme() {
        return this.readme;
    }

}
