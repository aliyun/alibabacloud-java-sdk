// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQLPatternsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>> You can call the [DescribeDBClusters](~~129857~~) operation to query the information about all AnalyticDB for MySQL clusters in a region, including cluster IDs.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ssZ* format. The time must be in UTC.</p>
     * <br>
     * <p>> The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The keyword that is used for the query.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language of file titles and error messages. Valid values:</p>
     * <br>
     * <p>*   **zh** (default): simplified Chinese.</p>
     * <p>*   **en**: English.</p>
     * <p>*   **ja**: Japanese.</p>
     * <p>*   **zh-tw**: traditional Chinese.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The order by which to sort query results. Specify the parameter value in the JSON format. Example: `[{"Field":"AverageQueryTime","Type":"Asc"}]`.</p>
     * <br>
     * <p>*   `Field` specifies the field by which to sort the query results. Valid values:</p>
     * <br>
     * <p>    *   `PatternCreationTime`: the earliest commit time of the SQL pattern within the time range to query.</p>
     * <p>    *   `AverageQueryTime`: the average total amount of time consumed by the SQL pattern within the time range to query.</p>
     * <p>    *   `MaxQueryTime`: the maximum total amount of time consumed by the SQL pattern within the time range to query.</p>
     * <p>    *   `AverageExecutionTime`: the average execution duration of the SQL pattern within the time range to query.</p>
     * <p>    *   `MaxExecutionTime`: the maximum execution duration of the SQL pattern within the time range to query.</p>
     * <p>    *   `AveragePeakMemory`: the average peak memory usage of the SQL pattern within the time range to query.</p>
     * <p>    *   `MaxPeakMemory`: the maximum peak memory usage of the SQL pattern within the time range to query.</p>
     * <p>    *   `AverageScanSize`: the average amount of data scanned based on the SQL pattern within the time range to query.</p>
     * <p>    *   `MaxScanSize`: the maximum amount of data scanned based on the SQL pattern within the time range to query.</p>
     * <p>    *   `QueryCount`: the number of queries performed in association with the SQL pattern within the time range to query.</p>
     * <p>    *   `FailedCount`: the number of failed queries performed in association with the SQL pattern within the time range to query.</p>
     * <br>
     * <p>*   `Type` specifies the sorting order. Valid values (case-insensitive):</p>
     * <br>
     * <p>    *   `Asc`: ascending order.</p>
     * <p>    *   `Desc`: descending order.</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * <br>
     * <p>> If you do not specify this parameter, the value **1** is used.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <br>
     * <p>*   **30**</p>
     * <p>*   **50**</p>
     * <p>*   **100**</p>
     * <br>
     * <p>> If you do not specify this parameter, the value **30** is used.</p>
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
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ssZ* format. The time must be in UTC.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   Only data within the last 14 days can be queried. For example, if the current time is 2021-11-22T12:00:00Z, you can query SQL patterns at a point in time as early as 2021-11-09T12:00:00Z.</p>
     * <br>
     * <p>*   The maximum time range that can be specified is 24 hours.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSQLPatternsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLPatternsRequest self = new DescribeSQLPatternsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSQLPatternsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSQLPatternsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSQLPatternsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeSQLPatternsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSQLPatternsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeSQLPatternsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLPatternsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSQLPatternsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSQLPatternsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
