// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DownloadDiagnosisRecordsRequest extends TeaModel {
    /**
     * <p>The source IP addresses.</p>
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
     * <p>The name of the database on which the SQL statements are executed.</p>
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
     * <p>The SQL query condition, which can be a combination of the `Type` and `Value` fields or a combination of the Type, `Min`, and `Max` fields. Specify the condition in the JSON format. `Type` specifies the SQL query dimension. Valid values for Type: `maxCost`, `status`, and `cost`. `Value`, `Min`, or `Max` specifies the SQL query range for the dimension. Valid values:</p>
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

    public static DownloadDiagnosisRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadDiagnosisRecordsRequest self = new DownloadDiagnosisRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DownloadDiagnosisRecordsRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public DownloadDiagnosisRecordsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DownloadDiagnosisRecordsRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DownloadDiagnosisRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DownloadDiagnosisRecordsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DownloadDiagnosisRecordsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DownloadDiagnosisRecordsRequest setMaxPeakMemory(Long maxPeakMemory) {
        this.maxPeakMemory = maxPeakMemory;
        return this;
    }
    public Long getMaxPeakMemory() {
        return this.maxPeakMemory;
    }

    public DownloadDiagnosisRecordsRequest setMaxScanSize(Long maxScanSize) {
        this.maxScanSize = maxScanSize;
        return this;
    }
    public Long getMaxScanSize() {
        return this.maxScanSize;
    }

    public DownloadDiagnosisRecordsRequest setMinPeakMemory(Long minPeakMemory) {
        this.minPeakMemory = minPeakMemory;
        return this;
    }
    public Long getMinPeakMemory() {
        return this.minPeakMemory;
    }

    public DownloadDiagnosisRecordsRequest setMinScanSize(Long minScanSize) {
        this.minScanSize = minScanSize;
        return this;
    }
    public Long getMinScanSize() {
        return this.minScanSize;
    }

    public DownloadDiagnosisRecordsRequest setQueryCondition(String queryCondition) {
        this.queryCondition = queryCondition;
        return this;
    }
    public String getQueryCondition() {
        return this.queryCondition;
    }

    public DownloadDiagnosisRecordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DownloadDiagnosisRecordsRequest setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public DownloadDiagnosisRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DownloadDiagnosisRecordsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
