// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateAgentRuntimeVersionInput extends TeaModel {
    /**
     * <p>版本描述</p>
     * 
     * <strong>example:</strong>
     * <p>Version 1.0.0 release with new features</p>
     */
    @NameInMap("description")
    public String description;

    public static CreateAgentRuntimeVersionInput build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentRuntimeVersionInput self = new CreateAgentRuntimeVersionInput();
        return TeaModel.build(map, self);
    }

    public CreateAgentRuntimeVersionInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
