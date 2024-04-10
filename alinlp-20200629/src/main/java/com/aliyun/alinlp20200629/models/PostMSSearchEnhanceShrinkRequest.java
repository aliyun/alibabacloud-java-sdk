// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class PostMSSearchEnhanceShrinkRequest extends TeaModel {
    @NameInMap("Body")
    public String body;

    @NameInMap("CustomConfigInfo")
    public String customConfigInfoShrink;

    @NameInMap("Debug")
    public Boolean debug;

    @NameInMap("Fields")
    public String fieldsShrink;

    @NameInMap("Filters")
    public String filters;

    @NameInMap("MinScore")
    public Double minScore;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("Queries")
    public String queries;

    @NameInMap("RankModelInfo")
    public String rankModelInfoShrink;

    @NameInMap("Rows")
    public Integer rows;

    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("Sort")
    public String sortShrink;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uq")
    public String uq;

    public static PostMSSearchEnhanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PostMSSearchEnhanceShrinkRequest self = new PostMSSearchEnhanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PostMSSearchEnhanceShrinkRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PostMSSearchEnhanceShrinkRequest setCustomConfigInfoShrink(String customConfigInfoShrink) {
        this.customConfigInfoShrink = customConfigInfoShrink;
        return this;
    }
    public String getCustomConfigInfoShrink() {
        return this.customConfigInfoShrink;
    }

    public PostMSSearchEnhanceShrinkRequest setDebug(Boolean debug) {
        this.debug = debug;
        return this;
    }
    public Boolean getDebug() {
        return this.debug;
    }

    public PostMSSearchEnhanceShrinkRequest setFieldsShrink(String fieldsShrink) {
        this.fieldsShrink = fieldsShrink;
        return this;
    }
    public String getFieldsShrink() {
        return this.fieldsShrink;
    }

    public PostMSSearchEnhanceShrinkRequest setFilters(String filters) {
        this.filters = filters;
        return this;
    }
    public String getFilters() {
        return this.filters;
    }

    public PostMSSearchEnhanceShrinkRequest setMinScore(Double minScore) {
        this.minScore = minScore;
        return this;
    }
    public Double getMinScore() {
        return this.minScore;
    }

    public PostMSSearchEnhanceShrinkRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public PostMSSearchEnhanceShrinkRequest setQueries(String queries) {
        this.queries = queries;
        return this;
    }
    public String getQueries() {
        return this.queries;
    }

    public PostMSSearchEnhanceShrinkRequest setRankModelInfoShrink(String rankModelInfoShrink) {
        this.rankModelInfoShrink = rankModelInfoShrink;
        return this;
    }
    public String getRankModelInfoShrink() {
        return this.rankModelInfoShrink;
    }

    public PostMSSearchEnhanceShrinkRequest setRows(Integer rows) {
        this.rows = rows;
        return this;
    }
    public Integer getRows() {
        return this.rows;
    }

    public PostMSSearchEnhanceShrinkRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public PostMSSearchEnhanceShrinkRequest setSortShrink(String sortShrink) {
        this.sortShrink = sortShrink;
        return this;
    }
    public String getSortShrink() {
        return this.sortShrink;
    }

    public PostMSSearchEnhanceShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PostMSSearchEnhanceShrinkRequest setUq(String uq) {
        this.uq = uq;
        return this;
    }
    public String getUq() {
        return this.uq;
    }

}
