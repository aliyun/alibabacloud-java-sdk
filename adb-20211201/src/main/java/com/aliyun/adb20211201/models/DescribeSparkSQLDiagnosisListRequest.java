// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkSQLDiagnosisListRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the information about all AnalyticDB for MySQL Data Lakehouse Edition clusters within a region, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-2zez35ww415xjwk5</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The latest start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-11-28 23:00:00</p>
     */
    @NameInMap("MaxStartTime")
    public String maxStartTime;

    /**
     * <p>The earliest start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-11-28 22:00:00</p>
     */
    @NameInMap("MinStartTime")
    public String minStartTime;

    /**
     * <p>The order by which to sort query results. Specify the parameter value in the JSON format. Example: <code>[{&quot;Field&quot;:&quot;MaxExclusiveTime&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>.</p>
     * <ul>
     * <li><p><code>Field</code> specifies the field by which to sort the query results. Valid values:</p>
     * <ul>
     * <li><code>MaxExclusiveTime</code>: the maximum execution duration.</li>
     * <li><code>PeakMemory</code>: the peak memory.</li>
     * <li><code>QueryStartTime</code>: the start time of the query.</li>
     * <li><code>QueryWallclockTime</code>: the execution duration of the query.</li>
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
     * <li>If you do not specify this parameter, query results are sorted by <code>MaxExclusiveTime</code> in ascending order.</li>
     * </ul>
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
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
