// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetListMcpServerToolsResultRequest extends TeaModel {
    /**
     * <p>The DMS unit identifier. This is typically the same as the DMSUnit used in the request to start tool detection.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The MCP server ID used when starting the detection. It must match the detection record corresponding to SessionId.</p>
     * 
     * <strong>example:</strong>
     * <p>44lg***z65</p>
     */
    @NameInMap("McpServerUuid")
    public String mcpServerUuid;

    /**
     * <p>The temporary session ID returned by StartListMcpServerTools, which is used to locate this connectivity detection task.</p>
     * 
     * <strong>example:</strong>
     * <p>1vwe***6wr</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static GetListMcpServerToolsResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetListMcpServerToolsResultRequest self = new GetListMcpServerToolsResultRequest();
        return TeaModel.build(map, self);
    }

    public GetListMcpServerToolsResultRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public GetListMcpServerToolsResultRequest setMcpServerUuid(String mcpServerUuid) {
        this.mcpServerUuid = mcpServerUuid;
        return this;
    }
    public String getMcpServerUuid() {
        return this.mcpServerUuid;
    }

    public GetListMcpServerToolsResultRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
