// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSqlPatternRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>> You can call the [DescribeDBClusters](~~129857~~) operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The order by which to sort query results. Specify the parameter value in the JSON string format. Example: `[{"Field":"Pattern","Type":"Asc"}]`. Parameters:</p>
     * <br>
     * <p>*   `Field` specifies the field by which to sort the query results. Valid values:</p>
     * <br>
     * <p>    *   `Pattern`: the SQL pattern.</p>
     * <p>    *   `AccessIP`: the IP address of the client.</p>
     * <p>    *   `User`: the username.</p>
     * <p>    *   `QueryCount`: the number of queries performed in association with the SQL pattern within the time range to query.</p>
     * <p>    *   `AvgPeakMemory`: the average peak memory usage of the SQL pattern within the time range to query. Unit: KB.</p>
     * <p>    *   `MaxPeakMemory`: the maximum peak memory usage of the SQL pattern within the time range to query. Unit: KB.</p>
     * <p>    *   `AvgCpuTime`: the average execution duration of the SQL pattern within the time range to query. Unit: milliseconds.</p>
     * <p>    *   `MaxCpuTime`: the maximum execution duration of the SQL pattern within the time range to query. Unit: milliseconds.</p>
     * <p>    *   `AvgStageCount`: the average number of stages.</p>
     * <p>    *   `MaxStageCount`: the maximum number of stages.</p>
     * <p>    *   `AvgTaskCount`: the average number of tasks.</p>
     * <p>    *   `MaxTaskCount`: the maximum number of tasks.</p>
     * <p>    *   `AvgScanSize`: the average amount of data scanned based on the SQL pattern within the time range to query. Unit: KB.</p>
     * <p>    *   `MaxScanSize`: the maximum amount of data scanned based on the SQL pattern within the time range to query. Unit: KB.</p>
     * <br>
     * <p>*   `Type` specifies the sorting order. Valid values:</p>
     * <br>
     * <p>    *   `Asc`: ascending order.</p>
     * <p>    *   `Desc`: descending order.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you do not specify this parameter, query results are sorted in ascending order of `Pattern`.</p>
     * <br>
     * <p>*   If you want to sort query results by `AccessIP`, you must set the `Type` parameter to `accessip`. If you want to sort query results by `User`, you must leave the `Type` parameter empty or set it to `user`.</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from page 1. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. The value must be a positive integer. Default value: **30**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the cluster.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](~~143074~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The keyword that is used for the query.</p>
     * <br>
     * <p>> If you do not specify this parameter, all SQL patterns of the AnalyticDB for MySQL cluster within the time period specified by `StartTime` are returned.</p>
     */
    @NameInMap("SqlPattern")
    public String sqlPattern;

    /**
     * <p>The start date to query. Specify the time in the *yyyy-MM-dd* format. The time must be in UTC.</p>
     * <br>
     * <p>> Only data within the last 30 days can be queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The dimension by which to aggregate the SQL patterns. Valid values:</p>
     * <br>
     * <p>*   `user`: aggregates the SQL patterns by user.</p>
     * <p>*   `accessip`: aggregates the SQL patterns by client IP address.</p>
     * <br>
     * <p>> If you do not specify this parameter, the SQL patterns are aggregated by `user`.</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeSqlPatternRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlPatternRequest self = new DescribeSqlPatternRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSqlPatternRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSqlPatternRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeSqlPatternRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSqlPatternRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSqlPatternRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSqlPatternRequest setSqlPattern(String sqlPattern) {
        this.sqlPattern = sqlPattern;
        return this;
    }
    public String getSqlPattern() {
        return this.sqlPattern;
    }

    public DescribeSqlPatternRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSqlPatternRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
