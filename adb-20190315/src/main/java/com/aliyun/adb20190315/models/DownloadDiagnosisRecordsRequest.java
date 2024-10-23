// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DownloadDiagnosisRecordsRequest extends TeaModel {
    /**
     * <p>The source IP addresses.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to query the resource group, database name, username, and source IP address of the SQL statements to be queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>106.11.XX.XX</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1r053byu48p****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the database on which the SQL statements are executed.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to query the resource group, database name, username, and source IP address of the SQL statements to be queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>adb_demo</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The end of the time range to query. Specify a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The end time must be later than the start time.</p>
     * </li>
     * <li><p>The maximum time range that can be specified is 24 hours.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1625220213000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The keyword that is used for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>select</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language of file titles and error messages. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): simplified Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * <li><strong>ja</strong>: Japanese.</li>
     * <li><strong>zh-tw</strong>: traditional Chinese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum peak memory of the SQL statements. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>88000000</p>
     */
    @NameInMap("MaxPeakMemory")
    public Long maxPeakMemory;

    /**
     * <p>The maximum scan size of the SQL statements. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>110000000</p>
     */
    @NameInMap("MaxScanSize")
    public Long maxScanSize;

    /**
     * <p>The minimum peak memory of the SQL statements. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>88000000</p>
     */
    @NameInMap("MinPeakMemory")
    public Long minPeakMemory;

    /**
     * <p>The minimum scan size of the SQL statements. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>100000000</p>
     */
    @NameInMap("MinScanSize")
    public Long minScanSize;

    /**
     * <p>The SQL query condition, which can be a combination of the <code>Type</code> and <code>Value</code> fields or a combination of the Type, <code>Min</code>, and <code>Max</code> fields. Specify the condition in the JSON format. <code>Type</code> specifies the SQL query dimension. Valid values for Type: <code>maxCost</code>, <code>status</code>, and <code>cost</code>. <code>Value</code>, <code>Min</code>, or <code>Max</code> specifies the SQL query range for the dimension. Valid values:</p>
     * <ul>
     * <li><code>{&quot;Type&quot;:&quot;maxCost&quot;,&quot;Value&quot;:&quot;100&quot;}</code>: queries the top 100 most time-consuming SQL statements. Set <code>Value</code> to 100.</li>
     * <li><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;finished&quot;}</code>: queries executed SQL statements. You can set <code>Value</code> to <code>running</code> to query SQL statements that are being executed. You can also set Value to <code>failed</code> to query SQL statements that failed to be executed.</li>
     * <li><code>{&quot;Type&quot;:&quot;cost&quot;,&quot;Min&quot;:&quot;10&quot;,&quot;Max&quot;:&quot;200&quot;}</code>: queries SQL statements whose execution durations are in the range of 10 to 200 milliseconds. You can also customize the maximum and minimum execution durations.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;finished&quot;}</p>
     */
    @NameInMap("QueryCondition")
    public String queryCondition;

    /**
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group to which the SQL statements belong.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to query the resource group, database name, username, and source IP address of the SQL statements to be queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>user_default</p>
     */
    @NameInMap("ResourceGroup")
    public String resourceGroup;

    /**
     * <p>The beginning of the time range to query. Specify a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p>Only data within the last 14 days can be queried.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1625220210000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The username that is used to execute the SQL statements.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to query the resource group, database name, username, and source IP address of the SQL statements to be queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test_user</p>
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
