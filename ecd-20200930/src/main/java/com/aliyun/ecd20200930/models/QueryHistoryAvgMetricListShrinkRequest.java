// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryHistoryAvgMetricListShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2026-04-01</p>
     */
    @NameInMap("DataDate")
    public String dataDate;

    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <strong>example:</strong>
     * <p>LOAD_SCORE</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Range")
    public String rangeShrink;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    /**
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("SortType")
    public String sortType;

    public static QueryHistoryAvgMetricListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoryAvgMetricListShrinkRequest self = new QueryHistoryAvgMetricListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryHistoryAvgMetricListShrinkRequest setDataDate(String dataDate) {
        this.dataDate = dataDate;
        return this;
    }
    public String getDataDate() {
        return this.dataDate;
    }

    public QueryHistoryAvgMetricListShrinkRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public QueryHistoryAvgMetricListShrinkRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public QueryHistoryAvgMetricListShrinkRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryHistoryAvgMetricListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryHistoryAvgMetricListShrinkRequest setRangeShrink(String rangeShrink) {
        this.rangeShrink = rangeShrink;
        return this;
    }
    public String getRangeShrink() {
        return this.rangeShrink;
    }

    public QueryHistoryAvgMetricListShrinkRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public QueryHistoryAvgMetricListShrinkRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

}
