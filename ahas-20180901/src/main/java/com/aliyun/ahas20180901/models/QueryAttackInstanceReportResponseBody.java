// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackInstanceReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryAttackInstanceReportResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAttackInstanceReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackInstanceReportResponseBody self = new QueryAttackInstanceReportResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAttackInstanceReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAttackInstanceReportResponseBody setData(java.util.List<QueryAttackInstanceReportResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAttackInstanceReportResponseBodyData> getData() {
        return this.data;
    }

    public QueryAttackInstanceReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAttackInstanceReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAttackInstanceReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAttackInstanceReportResponseBodyDataSeriesSeriesData extends TeaModel {
        @NameInMap("time")
        public Long time;

        @NameInMap("value")
        public Float value;

        public static QueryAttackInstanceReportResponseBodyDataSeriesSeriesData build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackInstanceReportResponseBodyDataSeriesSeriesData self = new QueryAttackInstanceReportResponseBodyDataSeriesSeriesData();
            return TeaModel.build(map, self);
        }

        public QueryAttackInstanceReportResponseBodyDataSeriesSeriesData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QueryAttackInstanceReportResponseBodyDataSeriesSeriesData setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class QueryAttackInstanceReportResponseBodyDataSeries extends TeaModel {
        @NameInMap("metric")
        public String metric;

        @NameInMap("name")
        public String name;

        @NameInMap("seriesData")
        public java.util.List<QueryAttackInstanceReportResponseBodyDataSeriesSeriesData> seriesData;

        public static QueryAttackInstanceReportResponseBodyDataSeries build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackInstanceReportResponseBodyDataSeries self = new QueryAttackInstanceReportResponseBodyDataSeries();
            return TeaModel.build(map, self);
        }

        public QueryAttackInstanceReportResponseBodyDataSeries setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public QueryAttackInstanceReportResponseBodyDataSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAttackInstanceReportResponseBodyDataSeries setSeriesData(java.util.List<QueryAttackInstanceReportResponseBodyDataSeriesSeriesData> seriesData) {
            this.seriesData = seriesData;
            return this;
        }
        public java.util.List<QueryAttackInstanceReportResponseBodyDataSeriesSeriesData> getSeriesData() {
            return this.seriesData;
        }

    }

    public static class QueryAttackInstanceReportResponseBodyData extends TeaModel {
        @NameInMap("chartType")
        public String chartType;

        @NameInMap("series")
        public java.util.List<QueryAttackInstanceReportResponseBodyDataSeries> series;

        @NameInMap("title")
        public String title;

        @NameInMap("yAxis")
        public String yAxis;

        public static QueryAttackInstanceReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackInstanceReportResponseBodyData self = new QueryAttackInstanceReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAttackInstanceReportResponseBodyData setChartType(String chartType) {
            this.chartType = chartType;
            return this;
        }
        public String getChartType() {
            return this.chartType;
        }

        public QueryAttackInstanceReportResponseBodyData setSeries(java.util.List<QueryAttackInstanceReportResponseBodyDataSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<QueryAttackInstanceReportResponseBodyDataSeries> getSeries() {
            return this.series;
        }

        public QueryAttackInstanceReportResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryAttackInstanceReportResponseBodyData setYAxis(String yAxis) {
            this.yAxis = yAxis;
            return this;
        }
        public String getYAxis() {
            return this.yAxis;
        }

    }

}
