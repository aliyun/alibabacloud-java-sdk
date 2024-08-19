// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmallretrieval20240501.models;

import com.aliyun.tea.*;

public class AISearchV2Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>14199B5E-5906-52BD-800D-900268AEC9F6</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    @NameInMap("timeRange")
    public String timeRange;

    public static AISearchV2Request build(java.util.Map<String, ?> map) throws Exception {
        AISearchV2Request self = new AISearchV2Request();
        return TeaModel.build(map, self);
    }

    public AISearchV2Request setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public AISearchV2Request setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public AISearchV2Request setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
