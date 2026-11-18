// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class AiSearchRequest extends TeaModel {
    /**
     * <p>The industry. If specified, only site content restricted to the specified industry is recalled. Separate multiple industries with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>finance</p>
     */
    @NameInMap("industry")
    public String industry;

    /**
     * <p>The page number. Starts from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The search query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iPhone</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The query range for the web page publish time.</p>
     * 
     * <strong>example:</strong>
     * <p>17dc8bcd-f34a-46d1-a7a3-0fa3d1ce3824</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The session ID for multi-turn interaction.</p>
     * 
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
