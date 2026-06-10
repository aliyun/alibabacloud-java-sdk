// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryHistoryUsageDurationRankRequest extends TeaModel {
    /**
     * <p>The business type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The end date of the query in <code>YYYY-MM-DD</code> format. You can query data within the last 90 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-19</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The number of entries to return. The default value is 5, and the maximum value is 200.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The token that is used to retrieve the next page of results. You can obtain this token from the response to the previous request.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The start date of the query in <code>YYYY-MM-DD</code> format. You can query data within the last 90 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-05-07</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static QueryHistoryUsageDurationRankRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoryUsageDurationRankRequest self = new QueryHistoryUsageDurationRankRequest();
        return TeaModel.build(map, self);
    }

    public QueryHistoryUsageDurationRankRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public QueryHistoryUsageDurationRankRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryHistoryUsageDurationRankRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QueryHistoryUsageDurationRankRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryHistoryUsageDurationRankRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
