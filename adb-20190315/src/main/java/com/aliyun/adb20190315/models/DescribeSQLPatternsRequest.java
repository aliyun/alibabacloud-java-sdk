// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQLPatternsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the information about all AnalyticDB for MySQL clusters in a region, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1r053byu48p****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-30T00:15:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The keyword that is used for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
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
     * <p>The order by which to sort query results. Specify the parameter value in the JSON format. Example: <code>[{&quot;Field&quot;:&quot;AverageQueryTime&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>.</p>
     * <ul>
     * <li><p><code>Field</code> specifies the field by which to sort the query results. Valid values:</p>
     * <ul>
     * <li><code>PatternCreationTime</code>: the earliest commit time of the SQL pattern within the time range to query.</li>
     * <li><code>AverageQueryTime</code>: the average total amount of time consumed by the SQL pattern within the time range to query.</li>
     * <li><code>MaxQueryTime</code>: the maximum total amount of time consumed by the SQL pattern within the time range to query.</li>
     * <li><code>AverageExecutionTime</code>: the average execution duration of the SQL pattern within the time range to query.</li>
     * <li><code>MaxExecutionTime</code>: the maximum execution duration of the SQL pattern within the time range to query.</li>
     * <li><code>AveragePeakMemory</code>: the average peak memory usage of the SQL pattern within the time range to query.</li>
     * <li><code>MaxPeakMemory</code>: the maximum peak memory usage of the SQL pattern within the time range to query.</li>
     * <li><code>AverageScanSize</code>: the average amount of data scanned based on the SQL pattern within the time range to query.</li>
     * <li><code>MaxScanSize</code>: the maximum amount of data scanned based on the SQL pattern within the time range to query.</li>
     * <li><code>QueryCount</code>: the number of queries performed in association with the SQL pattern within the time range to query.</li>
     * <li><code>FailedCount</code>: the number of failed queries performed in association with the SQL pattern within the time range to query.</li>
     * </ul>
     * </li>
     * <li><p><code>Type</code> specifies the sorting order. Valid values (case-insensitive):</p>
     * <ul>
     * <li><code>Asc</code>: ascending order.</li>
     * <li><code>Desc</code>: descending order.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Field&quot;:&quot;AverageQueryTime&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the value <strong>1</strong> is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the value <strong>30</strong> is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time must be in UTC.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Only data within the last 14 days can be queried. For example, if the current time is 2021-11-22T12:00:00Z, you can query SQL patterns at a point in time as early as 2021-11-09T12:00:00Z.</p>
     * </li>
     * <li><p>The maximum time range that can be specified is 24 hours.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-30T00:10:00Z</p>
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
