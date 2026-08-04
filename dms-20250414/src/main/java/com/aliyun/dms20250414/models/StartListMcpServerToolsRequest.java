// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class StartListMcpServerToolsRequest extends TeaModel {
    /**
     * <p>The identifier of the Data Management unit that runs the Data Agent resources.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The language used for the detection session.</p>
     * 
     * <strong>example:</strong>
     * <p>CHINESE</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The ID of the MCP Server for which to detect connectivity and query the tool list. Only the service creator can trigger the detection.</p>
     * 
     * <strong>example:</strong>
     * <p>44lg***z65</p>
     */
    @NameInMap("McpServerUuid")
    public String mcpServerUuid;

    public static StartListMcpServerToolsRequest build(java.util.Map<String, ?> map) throws Exception {
        StartListMcpServerToolsRequest self = new StartListMcpServerToolsRequest();
        return TeaModel.build(map, self);
    }

    public StartListMcpServerToolsRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public StartListMcpServerToolsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public StartListMcpServerToolsRequest setMcpServerUuid(String mcpServerUuid) {
        this.mcpServerUuid = mcpServerUuid;
        return this;
    }
    public String getMcpServerUuid() {
        return this.mcpServerUuid;
    }

}
