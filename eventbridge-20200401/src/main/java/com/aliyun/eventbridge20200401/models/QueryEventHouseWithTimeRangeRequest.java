// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryEventHouseWithTimeRangeRequest extends TeaModel {
    /**
     * <p>The start time for querying internal EventHouse data. Specify a UNIX timestamp in seconds. The time range includes this point in time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1787587200</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The end time for querying internal EventHouse data. Specify a UNIX timestamp in seconds. The time range excludes this point in time. The value must be greater than BeginTime.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1787590800</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The maximum number of result rows that can be returned for this query.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The single read-only SQL statement to execute. You can query internal EventHouse data or perform federated queries with mounted external data sources.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT * FROM my_catalog.my_namespace.my_table LIMIT 100</p>
     */
    @NameInMap("Query")
    public String query;

    public static QueryEventHouseWithTimeRangeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEventHouseWithTimeRangeRequest self = new QueryEventHouseWithTimeRangeRequest();
        return TeaModel.build(map, self);
    }

    public QueryEventHouseWithTimeRangeRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public QueryEventHouseWithTimeRangeRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryEventHouseWithTimeRangeRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QueryEventHouseWithTimeRangeRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
