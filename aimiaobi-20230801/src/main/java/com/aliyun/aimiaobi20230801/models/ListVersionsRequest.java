// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListVersionsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    public static ListVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVersionsRequest self = new ListVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListVersionsRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

}
