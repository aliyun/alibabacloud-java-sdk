// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class QueryPerspectivesRequest extends TeaModel {
    /**
     * <p>The key of the business space. If this parameter is omitted, the default business space is used. You can find the key on the Business Management page of your primary account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
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
