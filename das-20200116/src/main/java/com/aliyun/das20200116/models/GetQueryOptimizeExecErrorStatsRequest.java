// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeExecErrorStatsRequest extends TeaModel {
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

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageNo")
    public String pageNo;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Region")
    public String region;

    @NameInMap("Time")
    public String time;

    public static GetQueryOptimizeExecErrorStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeExecErrorStatsRequest self = new GetQueryOptimizeExecErrorStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeExecErrorStatsRequest setAsc(String asc) {
        this.asc = asc;
        return this;
    }
    public String getAsc() {
        return this.asc;
    }

    public GetQueryOptimizeExecErrorStatsRequest setDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }
    public String getDbNames() {
        return this.dbNames;
    }

    public GetQueryOptimizeExecErrorStatsRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetQueryOptimizeExecErrorStatsRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public GetQueryOptimizeExecErrorStatsRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public GetQueryOptimizeExecErrorStatsRequest setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
        return this;
    }
    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    public GetQueryOptimizeExecErrorStatsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetQueryOptimizeExecErrorStatsRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public GetQueryOptimizeExecErrorStatsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetQueryOptimizeExecErrorStatsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetQueryOptimizeExecErrorStatsRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
