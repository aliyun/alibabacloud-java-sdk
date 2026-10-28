// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSQLPatternsRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the details of all AnalyticDB for MySQL Data Lakehouse Edition clusters in a specified region, including the cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-8vb8de93v9b****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. Specify the time in UTC in the <i>yyyy-MM-ddTHH:mm:ssZ</i> format.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-09-07T03:06:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The search keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language configuration. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Simplified Chinese (default language).</li>
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
     * <p>The sorting rule for the query results. The format is a JSON character string. Example: <code>[{&quot;Field&quot;:&quot;AverageQueryTime&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>. The JSON character string contains the following parameters:</p>
     * <ul>
     * <li><p><code>Field</code>: the field by which to sort the results. Valid values:</p>
     * <ul>
     * <li><code>PatternCreationTime</code>: the earliest commit time of the pattern within the query time range.</li>
     * <li><code>AverageQueryTime</code>: the average total time consumed by the pattern within the query time range.</li>
     * <li><code>MaxQueryTime</code>: the maximum total time consumed by the pattern within the query time range.</li>
     * <li><code>AverageExecutionTime</code>: the average execution duration of the pattern within the query time range.</li>
     * <li><code>MaxExecutionTime</code>: the maximum execution duration of the pattern within the query time range.</li>
     * <li><code>AveragePeakMemory</code>: the average peak memory usage of the pattern within the query time range.</li>
     * <li><code>MaxPeakMemory</code>: the maximum peak memory usage of the pattern within the query time range.</li>
     * <li><code>AverageScanSize</code>: the average amount of data read by the pattern within the query time range.</li>
     * <li><code>MaxScanSize</code>: the maximum amount of data read by the pattern within the query time range.</li>
     * <li><code>QueryCount</code>: the number of executions of the pattern within the query time range.</li>
     * <li><code>FailedCount</code>: the number of failed executions of the pattern within the query time range.</li>
     * </ul>
     * </li>
     * <li><p><code>Type</code>: the sort order. The value is not case-sensitive. Valid values:</p>
     * <ul>
     * <li><code>Asc</code>: ascending order.</li>
     * <li><code>Desc</code>: descending order.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Field&quot;:&quot;AverageQueryTime&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Valid values: integers greater than 0 and up to the maximum integer value.
     * Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>10</strong> (default value)</li>
     * <li><strong>30</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The hash value of the SQL pattern, which is used to filter a specific SQL pattern.</p>
     */
    @NameInMap("SqlPatternHash")
    public Long sqlPatternHash;

    /**
     * <p>The start time of the query. Specify the time in UTC in the <i>yyyy-MM-ddTHH:mm:ssZ</i> format.</p>
     * <blockquote>
     * <ul>
     * <li>You can only query data from the last 14 days.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The interval between the start time and the end time cannot exceed 24 hours.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2022-09-06T03:06:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the database account that executes the SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>test_user</p>
     */
    @NameInMap("UserName")
    public String userName;

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

    public DescribeSQLPatternsRequest setSqlPatternHash(Long sqlPatternHash) {
        this.sqlPatternHash = sqlPatternHash;
        return this;
    }
    public Long getSqlPatternHash() {
        return this.sqlPatternHash;
    }

    public DescribeSQLPatternsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSQLPatternsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
