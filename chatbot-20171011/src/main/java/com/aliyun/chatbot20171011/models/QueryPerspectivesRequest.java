// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryPerspectivesRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    public static QueryPerspectivesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPerspectivesRequest self = new QueryPerspectivesRequest();
        return TeaModel.build(map, self);
    }

    public QueryPerspectivesRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

}
