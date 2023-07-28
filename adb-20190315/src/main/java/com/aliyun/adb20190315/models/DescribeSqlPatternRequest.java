// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSqlPatternRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>>  You can call the [DescribeDBClusters](~~129857~~) operation to query the details of all AnalyticDB for MySQL clusters within a specified region, including cluster IDs.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The order by which to sort query results. Specify the parameter value in the JSON string format. Example: `[{"Field":"Pattern","Type":"Asc"}]`.</p>
     * <br>
     * <p>*   `Field` indicates the field that is used to sort the retrieved entries. Valid values:</p>
     * <br>
     * <p>    *   `Pattern` : the SQL pattern.</p>
     * <p>    *   `AccessIP`: the IP address of the client.</p>
     * <p>    *   `User`: the username.</p>
     * <p>    *   `QueryCount`: the total number of queries.</p>
     * <p>    *   `AvgPeakMemory`: the average peak memory. Unit: KB.</p>
     * <p>    *   `MaxPeakMemory`: the maximum peak memory. Unit: KB.</p>
     * <p>    *   `AvgCpuTime`: the average CPU time. Unit: milliseconds.</p>
     * <p>    *   `MaxCpuTime`: the maximum CPU time. Unit: milliseconds.</p>
     * <p>    *   `AvgStageCount`: the average number of stages.</p>
     * <p>    *   `MaxStageCount`: the maximum number of stages.</p>
     * <p>    *   `AvgTaskCount`: the average number of tasks.</p>
     * <p>    *   `MaxTaskCount`: the maximum number of tasks.</p>
     * <p>    *   `AvgScanSize`: the average scan size. Unit: KB.</p>
     * <p>    *   `MaxScanSize`: the maximum scan size. Unit: KB.</p>
     * <br>
     * <p>*   `Type` indicates the sorting method. Valid values:</p>
     * <br>
     * <p>    *   `Asc`: ascending order.</p>
     * <p>    *   `Desc`: descending order.</p>
     * <br>
     * <p>> *   If this parameter is not specified, query results are sorted in ascending order of `Pattern`.</p>
     * <p>> *   If you need to sort query results by `AccessIP`, you must set the `Type` parameter to `accessip`. If you need to sort query results by `User`, you must leave the `Type` parameter empty or set it to `user`.</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than 0. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The value must be a positive integer. Default value: **30**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~143074~~) operation to query the regions and zones supported by AnalyticDB for MySQL, including region IDs.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The keyword contained in the SQL pattern.</p>
     * <br>
     * <p>>  If this parameter is not specified, all SQL patterns within an AnalyticDB for MySQL cluster for a date specified by `StartTime` are returned.</p>
     */
    @NameInMap("SqlPattern")
    public String sqlPattern;

    /**
     * <p>The date to query. Specify the time in the *yyyy-MM-dd* format. The time must be in UTC.</p>
     * <br>
     * <p>>  Only data for the last 30 days can be queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The dimension by which to aggregate the SQL pattern. Valid values:</p>
     * <br>
     * <p>*   `user`: the user.</p>
     * <p>*   `accessip`: the IP address of the client.</p>
     * <br>
     * <p>>  If this parameter is not specified, the SQL pattern is aggregated by `user`.</p>
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
