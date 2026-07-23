// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryAskLumaLogRequest extends TeaModel {
    /**
     * <p>The cursor. Set this parameter to the messageId of the last entry on the previous page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ0cyI6MTcxN...</p>
     */
    @NameInMap("After")
    public String after;

    /**
     * <p>The agent name. If this parameter is not specified, logs of all agents are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-luma-agent</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>The number of entries to return. Default value: 20. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    public static QueryAskLumaLogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAskLumaLogRequest self = new QueryAskLumaLogRequest();
        return TeaModel.build(map, self);
    }

    public QueryAskLumaLogRequest setAfter(String after) {
        this.after = after;
        return this;
    }
    public String getAfter() {
        return this.after;
    }

    public QueryAskLumaLogRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public QueryAskLumaLogRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

}
