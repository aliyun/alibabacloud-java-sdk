// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GenericSearchRequest extends TeaModel {
    /**
     * <p>The advanced search parameters. Filters search results by the start and end dates of the webpage publication time. The date format is YYYY-MM-DD. This parameter takes precedence over timeRange.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;startPublishedDate&quot;:&quot;2025-07-01&quot;,&quot;endPublishedDate&quot;:&quot;2025-07-31&quot;}</p>
     */
    @NameInMap("advancedParams")
    public java.util.Map<String, ?> advancedParams;

    /**
     * <p>Specifies whether to rerank the search results. Default value: true.</p>
     */
    @NameInMap("enableRerank")
    public Boolean enableRerank;

    /**
     * <p>The industry. If specified, only site content restricted to the specified industries is recalled. Separate multiple industries with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>finance,law</p>
     */
    @NameInMap("industry")
    public String industry;

    /**
     * <p>The page number. The value starts from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The search keywords.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iPhone</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>Specifies whether to return the main text of the webpage. Default value: true.</p>
     */
    @NameInMap("returnMainText")
    public Boolean returnMainText;

    /**
     * <p>Specifies whether to return the webpage content in Markdown format. Default value: true.</p>
     */
    @NameInMap("returnMarkdownText")
    public Boolean returnMarkdownText;

    /**
     * <p>Specifies whether to return the full rich text body. Default value: false.</p>
     */
    @NameInMap("returnRichMainBody")
    public Boolean returnRichMainBody;

    /**
     * <p>Specifies whether to return the enhanced summary. Default value: true.</p>
     */
    @NameInMap("returnSummary")
    public Boolean returnSummary;

    /**
     * <p>The session ID for multi-turn interactions.</p>
     * 
     * <strong>example:</strong>
     * <p>282j3h3434j23hdw9sd72j3</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The time range.</p>
     * 
     * <strong>example:</strong>
     * <p>OneWeek</p>
     */
    @NameInMap("timeRange")
    public String timeRange;

    public static GenericSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        GenericSearchRequest self = new GenericSearchRequest();
        return TeaModel.build(map, self);
    }

    public GenericSearchRequest setAdvancedParams(java.util.Map<String, ?> advancedParams) {
        this.advancedParams = advancedParams;
        return this;
    }
    public java.util.Map<String, ?> getAdvancedParams() {
        return this.advancedParams;
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

    public GenericSearchRequest setReturnRichMainBody(Boolean returnRichMainBody) {
        this.returnRichMainBody = returnRichMainBody;
        return this;
    }
    public Boolean getReturnRichMainBody() {
        return this.returnRichMainBody;
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
