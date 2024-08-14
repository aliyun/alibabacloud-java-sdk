// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportIntervenesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fed6555ec9e24b92aeecc34be484b887_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    public static ExportIntervenesRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportIntervenesRequest self = new ExportIntervenesRequest();
        return TeaModel.build(map, self);
    }

    public ExportIntervenesRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

}
