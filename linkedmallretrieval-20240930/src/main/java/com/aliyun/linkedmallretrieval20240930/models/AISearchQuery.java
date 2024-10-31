// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmallretrieval20240930.models;

import com.aliyun.tea.*;

public class AISearchQuery extends TeaModel {
    @NameInMap("card")
    public String card;

    @NameInMap("cardQuery")
    public String cardQuery;

    @NameInMap("page")
    public Integer page;

    @NameInMap("query")
    public String query;

    @NameInMap("searchEngine")
    public String searchEngine;

    @NameInMap("searchPlan")
    public String searchPlan;

    @NameInMap("sessionId")
    public String sessionId;

    @NameInMap("timeRange")
    public String timeRange;

    public static AISearchQuery build(java.util.Map<String, ?> map) throws Exception {
        AISearchQuery self = new AISearchQuery();
        return TeaModel.build(map, self);
    }

    public AISearchQuery setCard(String card) {
        this.card = card;
        return this;
    }
    public String getCard() {
        return this.card;
    }

    public AISearchQuery setCardQuery(String cardQuery) {
        this.cardQuery = cardQuery;
        return this;
    }
    public String getCardQuery() {
        return this.cardQuery;
    }

    public AISearchQuery setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public AISearchQuery setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public AISearchQuery setSearchEngine(String searchEngine) {
        this.searchEngine = searchEngine;
        return this;
    }
    public String getSearchEngine() {
        return this.searchEngine;
    }

    public AISearchQuery setSearchPlan(String searchPlan) {
        this.searchPlan = searchPlan;
        return this;
    }
    public String getSearchPlan() {
        return this.searchPlan;
    }

    public AISearchQuery setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public AISearchQuery setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
