// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppStatsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetAiAppStatsResponseBodyData data;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. Used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAiAppStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppStatsResponseBody self = new GetAiAppStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiAppStatsResponseBody setData(GetAiAppStatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAiAppStatsResponseBodyData getData() {
        return this.data;
    }

    public GetAiAppStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAiAppStatsResponseBodyDataLabelStatChartTreeChart extends TeaModel {
        /**
         * <p>The label description.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The label.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The score.</p>
         * 
         * <strong>example:</strong>
         * <p>99.91</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetAiAppStatsResponseBodyDataLabelStatChartTreeChart build(java.util.Map<String, ?> map) throws Exception {
            GetAiAppStatsResponseBodyDataLabelStatChartTreeChart self = new GetAiAppStatsResponseBodyDataLabelStatChartTreeChart();
            return TeaModel.build(map, self);
        }

        public GetAiAppStatsResponseBodyDataLabelStatChartTreeChart setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAiAppStatsResponseBodyDataLabelStatChartTreeChart setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAiAppStatsResponseBodyDataLabelStatChartTreeChart setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAiAppStatsResponseBodyDataLabelStatChart extends TeaModel {
        /**
         * <p>The tree chart.</p>
         */
        @NameInMap("TreeChart")
        public java.util.List<GetAiAppStatsResponseBodyDataLabelStatChartTreeChart> treeChart;

        public static GetAiAppStatsResponseBodyDataLabelStatChart build(java.util.Map<String, ?> map) throws Exception {
            GetAiAppStatsResponseBodyDataLabelStatChart self = new GetAiAppStatsResponseBodyDataLabelStatChart();
            return TeaModel.build(map, self);
        }

        public GetAiAppStatsResponseBodyDataLabelStatChart setTreeChart(java.util.List<GetAiAppStatsResponseBodyDataLabelStatChartTreeChart> treeChart) {
            this.treeChart = treeChart;
            return this;
        }
        public java.util.List<GetAiAppStatsResponseBodyDataLabelStatChartTreeChart> getTreeChart() {
            return this.treeChart;
        }

    }

    public static class GetAiAppStatsResponseBodyDataY extends TeaModel {
        /**
         * <p>The returned data.</p>
         */
        @NameInMap("Data")
        public java.util.List<Long> data;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetAiAppStatsResponseBodyDataY build(java.util.Map<String, ?> map) throws Exception {
            GetAiAppStatsResponseBodyDataY self = new GetAiAppStatsResponseBodyDataY();
            return TeaModel.build(map, self);
        }

        public GetAiAppStatsResponseBodyDataY setData(java.util.List<Long> data) {
            this.data = data;
            return this;
        }
        public java.util.List<Long> getData() {
            return this.data;
        }

        public GetAiAppStatsResponseBodyDataY setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAiAppStatsResponseBodyData extends TeaModel {
        /**
         * <p>The label usage chart.</p>
         */
        @NameInMap("LabelStatChart")
        public java.util.List<GetAiAppStatsResponseBodyDataLabelStatChart> labelStatChart;

        /**
         * <p>The total count categorized statistics.</p>
         */
        @NameInMap("TotalStat")
        public java.util.Map<String, DataTotalStatValue> totalStat;

        /**
         * <p>The X value of the coordinate point.</p>
         */
        @NameInMap("X")
        public java.util.List<String> x;

        /**
         * <p>The Y value of the coordinate point.</p>
         */
        @NameInMap("Y")
        public java.util.List<GetAiAppStatsResponseBodyDataY> y;

        public static GetAiAppStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAiAppStatsResponseBodyData self = new GetAiAppStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAiAppStatsResponseBodyData setLabelStatChart(java.util.List<GetAiAppStatsResponseBodyDataLabelStatChart> labelStatChart) {
            this.labelStatChart = labelStatChart;
            return this;
        }
        public java.util.List<GetAiAppStatsResponseBodyDataLabelStatChart> getLabelStatChart() {
            return this.labelStatChart;
        }

        public GetAiAppStatsResponseBodyData setTotalStat(java.util.Map<String, DataTotalStatValue> totalStat) {
            this.totalStat = totalStat;
            return this;
        }
        public java.util.Map<String, DataTotalStatValue> getTotalStat() {
            return this.totalStat;
        }

        public GetAiAppStatsResponseBodyData setX(java.util.List<String> x) {
            this.x = x;
            return this;
        }
        public java.util.List<String> getX() {
            return this.x;
        }

        public GetAiAppStatsResponseBodyData setY(java.util.List<GetAiAppStatsResponseBodyDataY> y) {
            this.y = y;
            return this;
        }
        public java.util.List<GetAiAppStatsResponseBodyDataY> getY() {
            return this.y;
        }

    }

}
