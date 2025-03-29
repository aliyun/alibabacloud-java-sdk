// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GenericSearchRequest extends TeaModel {
    @NameInMap("enableRerank")
    public Boolean enableRerank;

    @NameInMap("industry")
    public String industry;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public String query;

    @NameInMap("returnMainText")
    public Boolean returnMainText;

    @NameInMap("returnMarkdownText")
    public Boolean returnMarkdownText;

    @NameInMap("returnSummary")
    public Boolean returnSummary;

    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>OneWeek</p>
     */
    @NameInMap("timeRange")
    public String timeRange;

    public static GenericSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        GenericSearchRequest self = new GenericSearchRequest();
        return TeaModel.build(map, self);
    }

    public GenericSearchRequest setEnableRerank(Boolean enableRerank) {
        this.enableRerank = enableRerank;
        return this;
    }
    public Boolean getEnableRerank() {
        return this.enableRerank;
    }

    public GenericSearchRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public GenericSearchRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GenericSearchRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GenericSearchRequest setReturnMainText(Boolean returnMainText) {
        this.returnMainText = returnMainText;
        return this;
    }
    public Boolean getReturnMainText() {
        return this.returnMainText;
    }

    public GenericSearchRequest setReturnMarkdownText(Boolean returnMarkdownText) {
        this.returnMarkdownText = returnMarkdownText;
        return this;
    }
    public Boolean getReturnMarkdownText() {
        return this.returnMarkdownText;
    }

    public GenericSearchRequest setReturnSummary(Boolean returnSummary) {
        this.returnSummary = returnSummary;
        return this;
    }
    public Boolean getReturnSummary() {
        return this.returnSummary;
    }

    public GenericSearchRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GenericSearchRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
