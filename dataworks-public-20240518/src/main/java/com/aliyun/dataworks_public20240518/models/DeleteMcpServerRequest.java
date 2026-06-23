// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteMcpServerRequest extends TeaModel {
    /**
     * <p>The name of the MCP Server to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-mcp-server</p>
     */
    @NameInMap("Name")
    public String name;

    public static DeleteMcpServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcpServerRequest self = new DeleteMcpServerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMcpServerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
