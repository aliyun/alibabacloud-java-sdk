// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeDataStatsRequest extends TeaModel {
    @NameInMap("Asc")
    public String asc;

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
    public String onlyOptimizedSql;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageNo")
    public String pageNo;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Rules")
    public String rules;

    @NameInMap("SqlIds")
    public String sqlIds;

    @NameInMap("TagNames")
    public String tagNames;

    @NameInMap("Time")
    public String time;

    public static GetQueryOptimizeDataStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeDataStatsRequest self = new GetQueryOptimizeDataStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeDataStatsRequest setAsc(String asc) {
        this.asc = asc;
        return this;
    }
    public String getAsc() {
        return this.asc;
    }

    public GetQueryOptimizeDataStatsRequest setDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }
    public String getDbNames() {
        return this.dbNames;
    }

    public GetQueryOptimizeDataStatsRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetQueryOptimizeDataStatsRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public GetQueryOptimizeDataStatsRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public GetQueryOptimizeDataStatsRequest setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
        return this;
    }
    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    public GetQueryOptimizeDataStatsRequest setOnlyOptimizedSql(String onlyOptimizedSql) {
        this.onlyOptimizedSql = onlyOptimizedSql;
        return this;
    }
    public String getOnlyOptimizedSql() {
        return this.onlyOptimizedSql;
    }

    public GetQueryOptimizeDataStatsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetQueryOptimizeDataStatsRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public GetQueryOptimizeDataStatsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetQueryOptimizeDataStatsRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public GetQueryOptimizeDataStatsRequest setSqlIds(String sqlIds) {
        this.sqlIds = sqlIds;
        return this;
    }
    public String getSqlIds() {
        return this.sqlIds;
    }

    public GetQueryOptimizeDataStatsRequest setTagNames(String tagNames) {
        this.tagNames = tagNames;
        return this;
    }
    public String getTagNames() {
        return this.tagNames;
    }

    public GetQueryOptimizeDataStatsRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
