// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryAskLumaLogRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eyJ0cyI6MTcxN...</p>
     */
    @NameInMap("After")
    public String after;

    /**
     * <strong>example:</strong>
     * <p>demo-luma-agent</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
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
