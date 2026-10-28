// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlPatternRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the DescribeDBClusters operation to query the IDs of all clusters in a specified region.
     * <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a></p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1ej1nq9n6****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies the sorting of query results by a specified field. The format is a JSON character string, such as <code>[{&quot;Field&quot;:&quot;Pattern&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>. Parameters:</p>
     * <ul>
     * <li><p>Field: the sorting field. Valid values:</p>
     * <ul>
     * <li>Pattern: SQL pattern.</li>
     * <li>AccessIP: client IP address.</li>
     * <li>User: username.</li>
     * <li>QueryCount: total number of queries.</li>
     * <li>AvgPeakMemory: average peak memory. Unit: KB.</li>
     * <li>MaxPeakMemory: Peak Volume memory. Unit: KB.</li>
     * <li>AvgCpuTime: average computing duration. Unit: milliseconds.</li>
     * <li>MaxCpuTime: maximum computing duration. Unit: milliseconds.</li>
     * <li>AvgStageCount: average number of stages.</li>
     * <li>MaxStageCount: maximum number of stages.</li>
     * <li>AvgTaskCount: average number of tasks.</li>
     * <li>MaxTaskCount: maximum number of tasks.</li>
     * <li>AvgScanSize: average scan size. Unit: KB.</li>
     * <li>MaxScanSize: maximum scan size. Unit: KB.</li>
     * </ul>
     * </li>
     * <li><p>Type: the sorting method. Valid values:</p>
     * <ul>
     * <li>Asc: ascending sorting.</li>
     * <li>Desc: descending sorting.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If no Settings are specified for this parameter, the results are sorted in ascending order by the Pattern field by default.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>To perform sorting by the AccessIP field, you must set the Type parameter to accessip. To perform sorting by the User field, you must leave the Type parameter empty or set it to user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Field&quot;:&quot;Pattern&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Valid values: integers greater than 0 and no greater than the maximum value of the Integer type.
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
     * <p>If this parameter is not specified, the details of all SQL patterns for the cluster on the date specified by the StartTime parameter are returned by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("SqlPattern")
    public String sqlPattern;

    /**
     * <p>The start date of the query. The time is in UTC and formatted as yyyy-MM-dd.</p>
     * <blockquote>
     * <p>You can only query data within the last 30 days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-08-30</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Aggregates SQL patterns by a specified dimension. Valid values:</p>
     * <ul>
     * <li>user: aggregates by user.</li>
     * <li>accessip: aggregates by access IP address.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, SQL patterns are aggregated by user by default.</p>
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
