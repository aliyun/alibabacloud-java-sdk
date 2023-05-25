// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeShareUrlRequest extends TeaModel {
    @NameInMap("Asc")
    public Boolean asc;

    @NameInMap("DbNames")
    public String dbNames;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("Keywords")
    public String keywords;

    @NameInMap("LogicalOperator")
    public String logicalOperator;

    @NameInMap("OnlyOptimizedSql")
    public Boolean onlyOptimizedSql;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Region")
    public String region;

    @NameInMap("Rules")
    public String rules;

    @NameInMap("SqlIds")
    public String sqlIds;

    @NameInMap("TagNames")
    public String tagNames;

    @NameInMap("Time")
    public Long time;

    @NameInMap("User")
    public String user;

    public static GetQueryOptimizeShareUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeShareUrlRequest self = new GetQueryOptimizeShareUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeShareUrlRequest setAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }
    public Boolean getAsc() {
        return this.asc;
    }

    public GetQueryOptimizeShareUrlRequest setDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }
    public String getDbNames() {
        return this.dbNames;
    }

    public GetQueryOptimizeShareUrlRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetQueryOptimizeShareUrlRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public GetQueryOptimizeShareUrlRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public GetQueryOptimizeShareUrlRequest setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
        return this;
    }
    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    public GetQueryOptimizeShareUrlRequest setOnlyOptimizedSql(Boolean onlyOptimizedSql) {
        this.onlyOptimizedSql = onlyOptimizedSql;
        return this;
    }
    public Boolean getOnlyOptimizedSql() {
        return this.onlyOptimizedSql;
    }

    public GetQueryOptimizeShareUrlRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetQueryOptimizeShareUrlRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetQueryOptimizeShareUrlRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetQueryOptimizeShareUrlRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetQueryOptimizeShareUrlRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public GetQueryOptimizeShareUrlRequest setSqlIds(String sqlIds) {
        this.sqlIds = sqlIds;
        return this;
    }
    public String getSqlIds() {
        return this.sqlIds;
    }

    public GetQueryOptimizeShareUrlRequest setTagNames(String tagNames) {
        this.tagNames = tagNames;
        return this;
    }
    public String getTagNames() {
        return this.tagNames;
    }

    public GetQueryOptimizeShareUrlRequest setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public GetQueryOptimizeShareUrlRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
