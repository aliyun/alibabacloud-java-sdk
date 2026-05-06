// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryHistoryAvgMetricListRequest extends TeaModel {
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
    public QueryHistoryAvgMetricListRequestRange range;

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

    public static QueryHistoryAvgMetricListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoryAvgMetricListRequest self = new QueryHistoryAvgMetricListRequest();
        return TeaModel.build(map, self);
    }

    public QueryHistoryAvgMetricListRequest setDataDate(String dataDate) {
        this.dataDate = dataDate;
        return this;
    }
    public String getDataDate() {
        return this.dataDate;
    }

    public QueryHistoryAvgMetricListRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public QueryHistoryAvgMetricListRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public QueryHistoryAvgMetricListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryHistoryAvgMetricListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryHistoryAvgMetricListRequest setRange(QueryHistoryAvgMetricListRequestRange range) {
        this.range = range;
        return this;
    }
    public QueryHistoryAvgMetricListRequestRange getRange() {
        return this.range;
    }

    public QueryHistoryAvgMetricListRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public QueryHistoryAvgMetricListRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public static class QueryHistoryAvgMetricListRequestRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IncludeMax")
        public Boolean includeMax;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IncludeMin")
        public Boolean includeMin;

        /**
         * <strong>example:</strong>
         * <p>label-02\&quot;</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Max")
        public Float max;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Min")
        public Float min;

        public static QueryHistoryAvgMetricListRequestRange build(java.util.Map<String, ?> map) throws Exception {
            QueryHistoryAvgMetricListRequestRange self = new QueryHistoryAvgMetricListRequestRange();
            return TeaModel.build(map, self);
        }

        public QueryHistoryAvgMetricListRequestRange setIncludeMax(Boolean includeMax) {
            this.includeMax = includeMax;
            return this;
        }
        public Boolean getIncludeMax() {
            return this.includeMax;
        }

        public QueryHistoryAvgMetricListRequestRange setIncludeMin(Boolean includeMin) {
            this.includeMin = includeMin;
            return this;
        }
        public Boolean getIncludeMin() {
            return this.includeMin;
        }

        public QueryHistoryAvgMetricListRequestRange setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryHistoryAvgMetricListRequestRange setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

        public QueryHistoryAvgMetricListRequestRange setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

    }

}
