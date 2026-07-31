// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSQLPatternsRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL (Data Lakehouse Edition) cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> API to find the cluster IDs of all AnalyticDB for MySQL (Data Lakehouse Edition) clusters in a specific region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-8vb8de93v9b****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end of the time range to query. The time must be in UTC and formatted as <em>yyyy-MM-ddTHH:mm:ssZ</em>.</p>
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
     * <p>The keyword for filtering the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The response language. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Simplified Chinese (default)</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * <li><p><strong>ja</strong>: Japanese</p>
     * </li>
     * <li><p><strong>zh-tw</strong>: Traditional Chinese</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The sort order for the results. Specify this parameter as a JSON string, for example, <code>[{&quot;Field&quot;:&quot;AverageQueryTime&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>. The string consists of the following fields:</p>
     * <ul>
     * <li><p><code>Field</code>: the sort field. Valid values:</p>
     * <ul>
     * <li><p><code>PatternCreationTime</code>: The earliest submission time of the pattern.</p>
     * </li>
     * <li><p><code>AverageQueryTime</code>: The average query time of the pattern.</p>
     * </li>
     * <li><p><code>MaxQueryTime</code>: The maximum query time of the pattern.</p>
     * </li>
     * <li><p><code>AverageExecutionTime</code>: The average execution time of the pattern.</p>
     * </li>
     * <li><p><code>MaxExecutionTime</code>: The maximum execution time of the pattern.</p>
     * </li>
     * <li><p><code>AveragePeakMemory</code>: The average peak memory of the pattern.</p>
     * </li>
     * <li><p><code>MaxPeakMemory</code>: The maximum peak memory of the pattern.</p>
     * </li>
     * <li><p><code>AverageScanSize</code>: The average scanned data size of the pattern.</p>
     * </li>
     * <li><p><code>MaxScanSize</code>: The maximum scanned data size of the pattern.</p>
     * </li>
     * <li><p><code>QueryCount</code>: The query count of the pattern.</p>
     * </li>
     * <li><p><code>FailedCount</code>: The failure count of the pattern.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><code>Type</code>: the sort order. Valid values (case-insensitive):</p>
     * <ul>
     * <li><p><code>Asc</code>: ascending order.</p>
     * </li>
     * <li><p><code>Desc</code>: descending order.</p>
     * </li>
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
     * <p>The page number. Must be an integer greater than 0. Default: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><p><strong>10</strong> (default)</p>
     * </li>
     * <li><p><strong>30</strong></p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SqlPatternHash")
    public Long sqlPatternHash;

    /**
     * <p>The start of the time range to query. The time must be in UTC and formatted as <em>yyyy-MM-ddTHH:mm:ssZ</em>.</p>
     * <blockquote>
     * <ul>
     * <li>Data is available for the last 14 days only.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The time range cannot exceed 24 hours.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2022-09-06T03:06:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The username of the database account used to execute the SQL statements.</p>
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
