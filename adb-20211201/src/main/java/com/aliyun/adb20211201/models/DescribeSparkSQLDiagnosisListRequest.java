// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkSQLDiagnosisListRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the details of all AnalyticDB for MySQL Data Lakehouse Edition (3.0) clusters in a specific region, including the cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-2zez35ww415xjwk5</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The maximum start time. Format: yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-11-28 23:00:00</p>
     */
    @NameInMap("MaxStartTime")
    public String maxStartTime;

    /**
     * <p>The minimum start time. Format: yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-11-28 22:00:00</p>
     */
    @NameInMap("MinStartTime")
    public String minStartTime;

    /**
     * <p>Sorts the query results by a specified field. The value must be a JSON string. Example: <code>[{&quot;Field&quot;:&quot;MaxExclusiveTime&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>. Parameters in the JSON string:</p>
     * <ul>
     * <li><p><code>Field</code>: the sort field. Valid values:</p>
     * <ul>
     * <li><code>MaxExclusiveTime</code>: the maximum execution time.</li>
     * <li><code>PeakMemory</code>: the peak memory usage.</li>
     * <li><code>QueryStartTime</code>: the query start time.</li>
     * <li><code>QueryWallclockTime</code>: the query execution time.</li>
     * </ul>
     * </li>
     * <li><p><code>Type</code>: the sort order. Valid values:</p>
     * <ul>
     * <li><code>Asc</code>: ascending order.</li>
     * <li><code>Desc</code>: descending order.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If this parameter is not specified, the results are sorted in ascending order by the <code>MaxExclusiveTime</code> field by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;Field\&quot;:\&quot;QueryStartTime\&quot;,\&quot;Type\&quot;:\&quot;Desc\&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the regions and zones supported by AnalyticDB for MySQL, including region IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The unique ID of the code block in the Spark job.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("StatementId")
    public Long statementId;

    public static DescribeSparkSQLDiagnosisListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkSQLDiagnosisListRequest self = new DescribeSparkSQLDiagnosisListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSparkSQLDiagnosisListRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSparkSQLDiagnosisListRequest setMaxStartTime(String maxStartTime) {
        this.maxStartTime = maxStartTime;
        return this;
    }
    public String getMaxStartTime() {
        return this.maxStartTime;
    }

    public DescribeSparkSQLDiagnosisListRequest setMinStartTime(String minStartTime) {
        this.minStartTime = minStartTime;
        return this;
    }
    public String getMinStartTime() {
        return this.minStartTime;
    }

    public DescribeSparkSQLDiagnosisListRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeSparkSQLDiagnosisListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSparkSQLDiagnosisListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSparkSQLDiagnosisListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSparkSQLDiagnosisListRequest setStatementId(Long statementId) {
        this.statementId = statementId;
        return this;
    }
    public Long getStatementId() {
        return this.statementId;
    }

}
