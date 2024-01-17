// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListBuildConfigsRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Type")
    public String type;

    public static ListBuildConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBuildConfigsRequest self = new ListBuildConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListBuildConfigsRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListBuildConfigsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
