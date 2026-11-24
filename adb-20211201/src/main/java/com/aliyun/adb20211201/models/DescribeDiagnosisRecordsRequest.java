// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisRecordsRequest extends TeaModel {
    /**
     * <p>The source IP address.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to query the resource group, database name, username, and source IP address of the SQL statements that meet the specified search conditions.</p>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/612397.html">DescribeDBClusters</a> operation to query the details of all clusters under your account, including the cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1scs48yc125****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The database in which the SQL statement is executed.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to query the resource group, database name, username, and source IP address of the SQL statements that meet the specified search conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>adb_demo</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The end time of the query. The time is a UNIX timestamp in milliseconds.</p>
     * <blockquote>
     * <ul>
     * <li>The end time must be later than the start time.</li>
     * <li>The interval between the start time and the end time cannot exceed 24 hours.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1633017540000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The keyword used to filter SQL statements.</p>
     * 
     * <strong>example:</strong>
     * <p>select</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language of the downloaded file title and some error messages. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Simplified Chinese (default).</li>
     * <li><strong>en</strong>: English.</li>
     * <li><strong>ja</strong>: Japanese.</li>
     * <li><strong>zh-tw</strong>: Traditional Chinese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The Peak Volume of memory for the SQL statement. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>89000000</p>
     */
    @NameInMap("MaxPeakMemory")
    public Long maxPeakMemory;

    /**
     * <p>The maximum scan size of the SQL statement. Unit: bytes.</p>
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
     * <p>The sorting rules for SQL statements based on specified fields. The value is a JSON array that contains the Field and Type fields. The SQL statements are sorted in the order of the fields in the array. Example: <code>[{&quot;Field&quot;:&quot;StartTime&quot;, &quot;Type&quot;: &quot;desc&quot; }]</code>.</p>
     * <ul>
     * <li>Field: the name of the field by which you want to sort the SQL statements. Valid values:<ul>
     * <li>StartTime: the start time of the execution.</li>
     * <li>Status: the execution status.</li>
     * <li>UserName: the username.</li>
     * <li>Cost: the execution duration.</li>
     * <li>PeakMemory: the peak memory.</li>
     * <li>ScanSize: the scan size.</li>
     * <li>Database: the database name.</li>
     * <li>ClientIp: the source IP address.</li>
     * <li>ResourceGroup: the resource group.</li>
     * <li>QueueTime: the queue time.</li>
     * <li>OutputRows: the number of output rows.</li>
     * <li>OutputDataSize: the output data size.</li>
     * <li>ResourceCostRank: the ranking of the execution duration of internal operators in the SQL statement. This field is supported only when QueryCondition is set to <code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;running&quot;}</code>.</li>
     * </ul>
     * </li>
     * <li>Type: the sorting type. Valid values (case-insensitive):<ul>
     * <li>Desc: descending order.</li>
     * <li>Asc: ascending order.</li>
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
     * <p>The page number. The value must be a positive integer that does not exceed the maximum value of the INTEGER data type. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong> (default)</li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
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
     * <p>The conditions for the SQL query. The value is a JSON string that contains fields such as Type, Value, Min, and Max. The Type field specifies the query dimension. Valid values: maxCost, status, and cost. The Value, Min, or Max field specifies the query range for the dimension. Valid values:</p>
     * <ul>
     * <li><code>{&quot;Type&quot;:&quot;maxCost&quot;,&quot;Value&quot;:&quot;100&quot;}</code>: queries the details of the top 100 SQL statements with the longest execution duration. Currently, the Value field can only be set to 100.</li>
     * <li><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;finished&quot;}</code>: queries the details of completed SQL statements. You can also set Value to running or failed to query the details of running or failed SQL statements.</li>
     * <li><code>{&quot;Type&quot;:&quot;cost&quot;,&quot;Min&quot;:&quot;10&quot;,&quot;Max&quot;:&quot;200&quot;}</code>: queries the details of SQL statements whose execution duration is between 10 milliseconds and 200 milliseconds. You can also customize the maximum and minimum execution duration in milliseconds.</li>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the regions and zones supported by AnalyticDB for MySQL, including the region IDs.</p>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to query the resource group, database name, username, and source IP address of the SQL statements that meet the specified search conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>user_default</p>
     */
    @NameInMap("ResourceGroup")
    public String resourceGroup;

    /**
     * <p>The start time of the query. The time is a UNIX timestamp in milliseconds.</p>
     * <blockquote>
     * <p>You can only query data within the last 14 days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1632931200000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The username that executes the SQL statement.
     * You can call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to query the resource group, database name, username, and source IP address of the SQL statements that meet the specified search conditions.</p>
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
