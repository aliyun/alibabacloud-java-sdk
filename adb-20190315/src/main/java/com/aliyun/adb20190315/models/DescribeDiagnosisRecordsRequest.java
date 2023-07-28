// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisRecordsRequest extends TeaModel {
    /**
     * <p>The source IP address.</p>
     * <br>
     * <p>> You can call the [DescribeDiagnosisDimensions](~~308210~~) operation to query the resource group, database name, username, and source IP address of the SQL statements to be queried.</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>> You can call the [DescribeDBClusters](~~129857~~) operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The database on which the SQL statements are executed.</p>
     * <br>
     * <p>> You can call the [DescribeDiagnosisDimensions](~~308210~~) operation to query the resource group, database name, username, and source IP address of the SQL statements to be queried.</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The end of the time range to query. Specify a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   The end time must be later than the start time.</p>
     * <br>
     * <p>*   The maximum time range that can be specified is 24 hours.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The keyword for the query.</p>
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
     * <p>The maximum peak memory of the SQL statements. Unit: bytes.</p>
     */
    @NameInMap("MaxPeakMemory")
    public Long maxPeakMemory;

    /**
     * <p>The maximum scan size of the SQL statements. Unit: bytes.</p>
     */
    @NameInMap("MaxScanSize")
    public Long maxScanSize;

    /**
     * <p>The minimum peak memory of the SQL statements. Unit: bytes.</p>
     */
    @NameInMap("MinPeakMemory")
    public Long minPeakMemory;

    /**
     * <p>The minimum scan size of the SQL statements. Unit: bytes.</p>
     */
    @NameInMap("MinScanSize")
    public Long minScanSize;

    /**
     * <p>The order in which to sort the retrieved SQL statements by field. Specify this value in the JSON format. The value is an ordered array that uses the order of the input array and contains the `Field` and `Type` fields. Example: `[{"Field":"StartTime", "Type": "desc" }]`. Fields:</p>
     * <br>
     * <p>*   `Field` specifies the field that is used to sort the retrieved SQL statements. Valid values:</p>
     * <br>
     * <p>    *   `StartTime`: the start time of the execution.</p>
     * <p>    *   `Status`: the execution state.</p>
     * <p>    *   `UserName`: the username.</p>
     * <p>    *   `Cost`: the execution duration.</p>
     * <p>    *   `PeakMemory`: the peak memory.</p>
     * <p>    *   `ScanSize`: the amount of data to be scanned.</p>
     * <p>    *   `Database`: the name of the database.</p>
     * <p>    *   `ClientIp`: the source IP address.</p>
     * <p>    *   `ResourceGroup`: the name of the resource group.</p>
     * <p>    *   `QueueTime`: the amount of time that is consumed for queuing.</p>
     * <p>    *   `OutputRows`: the number of output rows.</p>
     * <p>    *   `OutputDataSize`: the amount of output data.</p>
     * <p>    *   `ResourceCostRank`: the execution duration rank of operators that are used in the SQL statements. This field takes effect only when `QueryCondition` is set to `{"Type":"status","Value":"running"}`.</p>
     * <br>
     * <p>*   `Type` specifies the sorting order. Valid values (case-insensitive):</p>
     * <br>
     * <p>    *   `Desc`: descending order.</p>
     * <p>    *   `Asc`: ascending order.</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from page 1. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: **30**, **50**, and **100**. Default value: 30.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the SQL pattern.[](~~321868~~)</p>
     */
    @NameInMap("PatternId")
    public String patternId;

    /**
     * <p>The query condition for SQL statements, which can contain the `Type`, `Value`, and `Min` or `Max` fields. Specify the condition in the JSON format. `Type` specifies the query dimension. Valid values for Type: `maxCost`, `status`, and `cost`. `Value`, `Min`, or `Max` specifies the query range for the dimension. Valid values:</p>
     * <br>
     * <p>*   `{"Type":"maxCost","Value":"100"}`: queries the top 100 most time-consuming SQL statements. Set `Value` to 100.</p>
     * <p>*   `{"Type":"status","Value":"finished"}`: queries executed SQL statements. You can set `Value` to `running` to query SQL statements that are being executed. You can also set Value to `failed` to query SQL statements that failed to be executed.</p>
     * <p>*   `{"Type":"cost","Min":"10","Max":"200"}`: queries SQL statements whose execution durations are in the range of 10 to 200 milliseconds. You can also customize the maximum and minimum execution durations.</p>
     */
    @NameInMap("QueryCondition")
    public String queryCondition;

    /**
     * <p>The region ID of the cluster.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](~~143074~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group to which the SQL statements belong.</p>
     * <br>
     * <p>> You can call the [DescribeDiagnosisDimensions](~~308210~~) operation to query the resource group, database name, username, and source IP address of the SQL statements to be queried.</p>
     */
    @NameInMap("ResourceGroup")
    public String resourceGroup;

    /**
     * <p>The beginning of the time range to query. Specify a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>> Only data within the last 14 days can be queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The username that is used to execute the SQL statements.</p>
     * <br>
     * <p>> You can call the [DescribeDiagnosisDimensions](~~308210~~) operation to query the resource group, database name, username, and source IP address of the SQL statements to be queried.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static DescribeDiagnosisRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisRecordsRequest self = new DescribeDiagnosisRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisRecordsRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public DescribeDiagnosisRecordsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDiagnosisRecordsRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeDiagnosisRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDiagnosisRecordsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeDiagnosisRecordsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDiagnosisRecordsRequest setMaxPeakMemory(Long maxPeakMemory) {
        this.maxPeakMemory = maxPeakMemory;
        return this;
    }
    public Long getMaxPeakMemory() {
        return this.maxPeakMemory;
    }

    public DescribeDiagnosisRecordsRequest setMaxScanSize(Long maxScanSize) {
        this.maxScanSize = maxScanSize;
        return this;
    }
    public Long getMaxScanSize() {
        return this.maxScanSize;
    }

    public DescribeDiagnosisRecordsRequest setMinPeakMemory(Long minPeakMemory) {
        this.minPeakMemory = minPeakMemory;
        return this;
    }
    public Long getMinPeakMemory() {
        return this.minPeakMemory;
    }

    public DescribeDiagnosisRecordsRequest setMinScanSize(Long minScanSize) {
        this.minScanSize = minScanSize;
        return this;
    }
    public Long getMinScanSize() {
        return this.minScanSize;
    }

    public DescribeDiagnosisRecordsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeDiagnosisRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDiagnosisRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDiagnosisRecordsRequest setPatternId(String patternId) {
        this.patternId = patternId;
        return this;
    }
    public String getPatternId() {
        return this.patternId;
    }

    public DescribeDiagnosisRecordsRequest setQueryCondition(String queryCondition) {
        this.queryCondition = queryCondition;
        return this;
    }
    public String getQueryCondition() {
        return this.queryCondition;
    }

    public DescribeDiagnosisRecordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiagnosisRecordsRequest setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public DescribeDiagnosisRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDiagnosisRecordsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
