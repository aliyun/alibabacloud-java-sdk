// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlPatternRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all clusters in a specified region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1ej1nq9n6****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Sorts the query results by a specified field. The format is a JSON character string, such as <code>[{&quot;Field&quot;:&quot;Pattern&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>. Parameters:</p>
     * <ul>
     * <li><p><code>Field</code>: the sorting field. Valid values:</p>
     * <ul>
     * <li><code>Pattern</code>: SQL pattern.</li>
     * <li><code>AccessIP</code>: client IP address.</li>
     * <li><code>User</code>: username.</li>
     * <li><code>QueryCount</code>: total number of queries.</li>
     * <li><code>AvgPeakMemory</code>: average peak memory usage. Unit: KB.</li>
     * <li><code>MaxPeakMemory</code>: Peak Volume memory. Unit: KB.</li>
     * <li><code>AvgCpuTime</code>: average computing duration. Unit: milliseconds.</li>
     * <li><code>MaxCpuTime</code>: maximum computing duration. Unit: milliseconds.</li>
     * <li><code>AvgStageCount</code>: average number of stages.</li>
     * <li><code>MaxStageCount</code>: maximum number of stages.</li>
     * <li><code>AvgTaskCount</code>: average number of tasks.</li>
     * <li><code>MaxTaskCount</code>: maximum number of tasks.</li>
     * <li><code>AvgScanSize</code>: average scanned data size. Unit: KB.</li>
     * <li><code>MaxScanSize</code>: maximum scanned data size. Unit: KB.</li>
     * </ul>
     * </li>
     * <li><p><code>Type</code>: the sorting method. Valid values:</p>
     * <ul>
     * <li><code>Asc</code>: ascending sorting.</li>
     * <li><code>Desc</code>: descending sorting.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If the Settings are not specified, the results are sorted in ascending order by the <code>Pattern</code> field by default.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>To sort by the <code>AccessIP</code> field, you must set the <code>Type</code> parameter to <code>accessip</code>. To sort by the <code>User</code> field, you must leave the <code>Type</code> parameter empty or set it to <code>user</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Field&quot;:&quot;Pattern&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Valid values: integers greater than 0 and less than or equal to the maximum value of the Integer type.
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
     * <li><strong>10</strong> (default)</li>
     * <li><strong>30</strong></li>
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
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The keyword that the SQL pattern must contain.</p>
     * <blockquote>
     * <p>If this parameter is not specified, the details of all SQL patterns for the cluster on the date specified by the <code>StartTime</code> parameter are returned by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("SqlPattern")
    public String sqlPattern;

    /**
     * <p>The start date for the query. The time is in UTC and formatted as yyyy-MM-dd.</p>
     * <blockquote>
     * <p>Only data from the last 30 days can be queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-08-30</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The dimension by which to aggregate SQL patterns. Valid values:</p>
     * <ul>
     * <li><code>user</code>: aggregates by user.</li>
     * <li><code>accessip</code>: aggregates by access IP address.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, SQL patterns are aggregated by the <code>user</code> dimension by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>user</p>
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
