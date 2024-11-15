// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class AiSearchRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>finance</p>
     */
    @NameInMap("industry")
    public String industry;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;total_count\&quot;: 6851, \&quot;page_number\&quot;: 54, \&quot;page_size\&quot;: 100}</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>17dc8bcd-f34a-46d1-a7a3-0fa3d1ce3824</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>OneWeek</p>
     */
    @NameInMap("timeRange")
    public String timeRange;

    public static AiSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        AiSearchRequest self = new AiSearchRequest();
        return TeaModel.build(map, self);
    }

    public AiSearchRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public AiSearchRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public AiSearchRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public AiSearchRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public AiSearchRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
