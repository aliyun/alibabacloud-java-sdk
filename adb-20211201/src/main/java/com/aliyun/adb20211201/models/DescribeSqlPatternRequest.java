// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlPatternRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1ej1nq9n6****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The order by which to sort query results. Specify the parameter value in the JSON string format. Example: <code>[{&quot;Field&quot;:&quot;Pattern&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>. Parameters:</p>
     * <ul>
     * <li><p><code>Field</code> specifies the field by which to sort the query results. Valid values:</p>
     * <ul>
     * <li><code>Pattern</code>: the SQL pattern.</li>
     * <li><code>AccessIP</code>: the IP address of the client.</li>
     * <li><code>User</code>: the username.</li>
     * <li><code>QueryCount</code>: the number of queries performed in association with the SQL pattern within the time range to query.</li>
     * <li><code>AvgPeakMemory</code>: the average peak memory usage of the SQL pattern within the time range to query. Unit: KB.</li>
     * <li><code>MaxPeakMemory</code>: the maximum peak memory usage of the SQL pattern within the time range to query. Unit: KB.</li>
     * <li><code>AvgCpuTime</code>: the average execution duration of the SQL pattern within the time range to query. Unit: milliseconds.</li>
     * <li><code>MaxCpuTime</code>: the maximum execution duration of the SQL pattern within the time range to query. Unit: milliseconds.</li>
     * <li><code>AvgStageCount</code>: the average number of stages.</li>
     * <li><code>MaxStageCount</code>: the maximum number of stages.</li>
     * <li><code>AvgTaskCount</code>: the average number of tasks.</li>
     * <li><code>MaxTaskCount</code>: the maximum number of tasks.</li>
     * <li><code>AvgScanSize</code>: the average amount of data scanned based on the SQL pattern within the time range to query. Unit: KB.</li>
     * <li><code>MaxScanSize</code>: the maximum amount of data scanned based on the SQL pattern within the time range to query. Unit: KB.</li>
     * </ul>
     * </li>
     * <li><p><code>Type</code> specifies the sorting order. Valid values:</p>
     * <ul>
     * <li><code>Asc</code>: ascending order.</li>
     * <li><code>Desc</code>: descending order.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you do not specify this parameter, query results are sorted in ascending order of <code>Pattern</code>.</p>
     * </li>
     * <li><p>If you want to sort query results by <code>AccessIP</code>, you must set the <code>Type</code> parameter to <code>accessip</code>. If you want to sort query results by <code>User</code>, you must leave the <code>Type</code> parameter empty or set it to <code>user</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Field&quot;:&quot;Pattern&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
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
     * <p>The region ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The keyword that is used for the query.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, all SQL patterns of the AnalyticDB for MySQL cluster within the time period specified by <code>StartTime</code> are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("SqlPattern")
    public String sqlPattern;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-dd format. The time must be in UTC.</p>
     * <blockquote>
     * <p>Only data within the last 30 days can be queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-08-30T12:10:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The dimension by which to aggregate the SQL patterns. Valid values:</p>
     * <ul>
     * <li><code>user</code>: aggregates the SQL patterns by user.</li>
     * <li><code>accessip</code>: aggregates the SQL patterns by client IP address.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the SQL patterns are aggregated by <code>user</code>.</p>
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
