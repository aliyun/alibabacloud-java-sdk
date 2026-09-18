// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlPatternCompareReportRequest extends TeaModel {
    /**
     * <p>The average change rate filter range for CHANGED reports. The format is <code>left~right</code>, where values are expressed as percentages and the interval is left-exclusive and right-inclusive. Examples:</p>
     * <ul>
     * <li><code>100~500</code>: greater than 100% and less than or equal to 500%.</li>
     * <li><code>100~</code>: greater than 100% with no upper limit.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>The left boundary is required and must be no less than 0. The right boundary must be no less than the left boundary.</li>
     * <li>This parameter is ignored for NEW reports.</li>
     * <li>When the time window 1 metric value is 0 and the time window 2 value is greater than 0, the Pattern is classified as zero-baseline growth and is categorized as <code>SEVERE</code> (significant change). To exclude such Patterns, set an upper limit for the change rate.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100~500</p>
     */
    @NameInMap("ChangeRate")
    public String changeRate;

    /**
     * <p>The ID of the AnalyticDB for MySQL instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-2ze1234567890****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to return the parameterized SQL Pattern text. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Returns the Pattern text.</li>
     * <li><code>false</code>: Does not return the Pattern text, which reduces the response size.</li>
     * </ul>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludePattern")
    public Boolean includePattern;

    /**
     * <p>The analysis metric. Valid values:</p>
     * <ul>
     * <li><code>QUERY_COUNT</code>: the number of query executions.</li>
     * <li><code>CPU_COST</code>: the CPU consumption.</li>
     * <li><code>SHUFFLE_SIZE</code>: the amount of shuffle data.</li>
     * <li><code>PEAK_MEMORY</code>: the peak memory consumption.</li>
     * <li><code>SCAN_SIZE</code>: the amount of scanned data.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CPU_COST</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>Sorts the query results by a specified field. The value is a JSON array string, such as <code>[{&quot;Field&quot;:&quot;Time2SumValue&quot;,&quot;Type&quot;:&quot;Desc&quot;}]</code>. The array can contain only one object. Parameters:</p>
     * <ul>
     * <li><code>Field</code>: the sort field. This parameter is case-sensitive. Valid values:<ul>
     * <li>NEW report: <code>Time2SumValue</code>, <code>Time2AvgValue</code>, <code>Time2MaxValue</code>.</li>
     * <li>CHANGED report: <code>AvgChangeRatePercent</code>, <code>AvgTime1Value</code>, <code>AvgTime2Value</code>, <code>SumChangeRatePercent</code>, <code>SumTime1Value</code>, <code>SumTime2Value</code>, <code>MaxChangeRatePercent</code>, <code>MaxTime1Value</code>, <code>MaxTime2Value</code>.</li>
     * <li>All report types and analysis metrics: <code>AvgRt</code>, <code>MaxRt</code>.</li>
     * <li><code>QUERY_COUNT</code>: <code>TotalQueryTime</code>.</li>
     * <li><code>CPU_COST</code>: <code>QueryCount</code>, <code>AvgPlanningTime</code>, <code>MaxPlanningTime</code>, <code>AvgExecutionTime</code>, <code>MaxExecutionTime</code>.</li>
     * <li><code>SHUFFLE_SIZE</code>, <code>PEAK_MEMORY</code>: <code>QueryCount</code>.</li>
     * <li><code>SCAN_SIZE</code>: <code>QueryCount</code>, <code>TotalScanCost</code>.</li>
     * </ul>
     * </li>
     * <li><code>Type</code>: the sort order. This parameter is case-insensitive. Valid values:<ul>
     * <li><code>Asc</code>: ascending order.</li>
     * <li><code>Desc</code>: descending order.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>NEW reports are sorted by <code>Time2SumValue</code> in descending order by default.</li>
     * <li>CHANGED reports are sorted by <code>AvgChangeRatePercent</code> in descending order by default.</li>
     * <li>The value of <code>Field</code> must be applicable to the current report type and <code>MetricType</code>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Field&quot;:&quot;AvgChangeRatePercent&quot;,&quot;Type&quot;:&quot;Desc&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * <p>Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the SQL Pattern comparison report.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("ReportId")
    public Long reportId;

    public static DescribeSqlPatternCompareReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlPatternCompareReportRequest self = new DescribeSqlPatternCompareReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSqlPatternCompareReportRequest setChangeRate(String changeRate) {
        this.changeRate = changeRate;
        return this;
    }
    public String getChangeRate() {
        return this.changeRate;
    }

    public DescribeSqlPatternCompareReportRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSqlPatternCompareReportRequest setIncludePattern(Boolean includePattern) {
        this.includePattern = includePattern;
        return this;
    }
    public Boolean getIncludePattern() {
        return this.includePattern;
    }

    public DescribeSqlPatternCompareReportRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeSqlPatternCompareReportRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeSqlPatternCompareReportRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSqlPatternCompareReportRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSqlPatternCompareReportRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSqlPatternCompareReportRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

}
