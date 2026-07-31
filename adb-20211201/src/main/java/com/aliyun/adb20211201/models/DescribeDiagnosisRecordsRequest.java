// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisRecordsRequest extends TeaModel {
    /**
     * <p>The source IP address.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to view the resource groups, database names, usernames, and source IP addresses for the SQL statements that meet the specified query conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>59.82.XX.XX</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <p>The ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/612397.html">DescribeDBClusters</a> operation to view the details of all clusters in your account, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1scs48yc125****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The database where the SQL statement is executed.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to view the resource groups, database names, usernames, and source IP addresses for the SQL statements that meet the specified query conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>adb_demo</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The end of the time range to query. Specify the time in the UNIX timestamp format. The time must be in milliseconds.</p>
     * <blockquote>
     * <ul>
     * <li><p>The end time must be later than the start time.</p>
     * </li>
     * <li><p>The interval between the start time and the end time cannot exceed 24 hours.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1633017540000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Filters the queries by the keywords contained in the SQL statements.</p>
     * 
     * <strong>example:</strong>
     * <p>select</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language of the file title and some error messages in the downloaded file. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Simplified Chinese (default).</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * <li><p><strong>ja</strong>: Japanese.</p>
     * </li>
     * <li><p><strong>zh-tw</strong>: Traditional Chinese.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum peak memory of the SQL statement. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>89000000</p>
     */
    @NameInMap("MaxPeakMemory")
    public Long maxPeakMemory;

    /**
     * <p>The maximum scan size of the target SQL statement. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1024000000</p>
     */
    @NameInMap("MaxScanSize")
    public Long maxScanSize;

    /**
     * <p>The minimum peak memory of the SQL statement. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MinPeakMemory")
    public Long minPeakMemory;

    /**
     * <p>The minimum scan size of the SQL statement. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MinScanSize")
    public Long minScanSize;

    /**
     * <p>The sorting order of the SQL statements. This parameter is a JSON array that is ordered by the sequence of the input array. It contains the <code>Field</code> and <code>Type</code> fields. Example: <code>[{&quot;Field&quot;:&quot;StartTime&quot;, &quot;Type&quot;: &quot;desc&quot; }]</code>. The fields are described as follows:</p>
     * <ul>
     * <li><p><code>Field</code> specifies the field by which to sort the SQL statements. Valid values:</p>
     * <ul>
     * <li><p><code>StartTime</code>: the start time of the execution.</p>
     * </li>
     * <li><p><code>Status</code>: the execution state.</p>
     * </li>
     * <li><p><code>UserName</code>: the username.</p>
     * </li>
     * <li><p><code>Cost</code>: the execution duration.</p>
     * </li>
     * <li><p><code>PeakMemory</code>: the peak memory.</p>
     * </li>
     * <li><p><code>ScanSize</code>: the amount of scanned data.</p>
     * </li>
     * <li><p><code>Database</code>: the database name.</p>
     * </li>
     * <li><p><code>ClientIp</code>: the source IP address.</p>
     * </li>
     * <li><p><code>ResourceGroup</code>: the resource group.</p>
     * </li>
     * <li><p><code>QueueTime</code>: the amount of time that the query waited in a queue.</p>
     * </li>
     * <li><p><code>OutputRows</code>: the number of output rows.</p>
     * </li>
     * <li><p><code>OutputDataSize</code>: the amount of output data.</p>
     * </li>
     * <li><p><code>ResourceCostRank</code>: the ranking of the execution duration of an operator in the SQL statement. This field is returned only when <code>QueryCondition</code> is set to <code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;running&quot;}</code>.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><code>Type</code> specifies the sorting type. Valid values (case-insensitive):</p>
     * <ul>
     * <li><p><code>Desc</code>: descending order.</p>
     * </li>
     * <li><p><code>Asc</code>: ascending order.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Field&quot;:&quot;StartTime&quot;, &quot;Type&quot;: &quot;desc&quot; }]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. The value must be an integer that is greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong> (default)</p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the SQL pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>5575924945138******</p>
     */
    @NameInMap("PatternId")
    public String patternId;

    /**
     * <p>The conditions for the SQL query. This parameter is a JSON string that contains fields such as Type, <code>Value</code>, <code>Min</code>, and <code>Max</code>. The <code>Type</code> field indicates the query dimension. Valid values for <code>Type</code>: <code>maxCost</code>, <code>status</code>, and <code>cost</code>. The <code>Value</code>, <code>Min</code>, and <code>Max</code> fields specify the query range for the dimension. Valid values:</p>
     * <ul>
     * <li><p><code>{&quot;Type&quot;:&quot;maxCost&quot;,&quot;Value&quot;:&quot;100&quot;}</code>: queries the details of the top 100 SQL statements that have the longest execution durations. The <code>Value</code> field can only be set to 100.</p>
     * </li>
     * <li><p><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;finished&quot;}</code>: queries the details of completed SQL statements. You can also set <code>Value</code> to <code>running</code> or <code>failed</code> to query SQL statements that are running or have failed.</p>
     * </li>
     * <li><p><code>{&quot;Type&quot;:&quot;cost&quot;,&quot;Min&quot;:&quot;10&quot;,&quot;Max&quot;:&quot;200&quot;}</code>: queries the details of SQL statements whose execution durations are between 10 ms and 200 ms. You can customize the minimum and maximum execution durations. Unit: milliseconds.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;finished&quot;}</p>
     */
    @NameInMap("QueryCondition")
    public String queryCondition;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to view the regions and zones supported by AnalyticDB for MySQL, including region IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group to which the SQL statement belongs.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to view the resource groups, database names, usernames, and source IP addresses for the SQL statements that meet the specified query conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>user_default</p>
     */
    @NameInMap("ResourceGroup")
    public String resourceGroup;

    /**
     * <p>The start of the time range to query. Specify the time in the UNIX timestamp format. The time must be in milliseconds.</p>
     * <blockquote>
     * <p>Only data from the last 14 days can be queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1632931200000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The username used to execute the SQL statement.
     * Call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to view the resource groups, database names, usernames, and source IP addresses for the SQL statements that meet the specified query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>test_user</p>
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
