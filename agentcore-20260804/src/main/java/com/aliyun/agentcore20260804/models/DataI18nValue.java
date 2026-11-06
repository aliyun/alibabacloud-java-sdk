// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DataI18nValue extends TeaModel {
    /**
     * <p>The MCP service description in this language.</p>
     * 
     * <strong>example:</strong>
     * <p>MCP service for querying knowledge bases</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The MCP marketplace template name in this language.</p>
     * 
     * <strong>example:</strong>
     * <p>Knowledge base</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The MCP marketplace template instructions in this language.</p>
     * 
     * <strong>example:</strong>
     * <h1>Knowledge base\nKnowledge base query service</h1>
     */
    @NameInMap("readme")
    public String readme;

    public static DataI18nValue build(java.util.Map<String, ?> map) throws Exception {
        DataI18nValue self = new DataI18nValue();
        return TeaModel.build(map, self);
    }

    public DataI18nValue setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DataI18nValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DataI18nValue setReadme(String readme) {
        this.readme = readme;
        return this;
    }
    public String getReadme() {
        return this.readme;
    }

}
