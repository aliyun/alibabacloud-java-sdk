// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class RunDataResultAnalysisResponseBody extends TeaModel {
    @NameInMap("data")
    public RunDataResultAnalysisResponseBodyData data;

    public static RunDataResultAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunDataResultAnalysisResponseBody self = new RunDataResultAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public RunDataResultAnalysisResponseBody setData(RunDataResultAnalysisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RunDataResultAnalysisResponseBodyData getData() {
        return this.data;
    }

    public static class RunDataResultAnalysisResponseBodyDataVisualizationData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bar</p>
         */
        @NameInMap("plotType")
        public String plotType;

        @NameInMap("xAxis")
        public java.util.List<String> xAxis;

        @NameInMap("yAxis")
        public java.util.List<String> yAxis;

        public static RunDataResultAnalysisResponseBodyDataVisualizationData build(java.util.Map<String, ?> map) throws Exception {
            RunDataResultAnalysisResponseBodyDataVisualizationData self = new RunDataResultAnalysisResponseBodyDataVisualizationData();
            return TeaModel.build(map, self);
        }

        public RunDataResultAnalysisResponseBodyDataVisualizationData setPlotType(String plotType) {
            this.plotType = plotType;
            return this;
        }
        public String getPlotType() {
            return this.plotType;
        }

        public RunDataResultAnalysisResponseBodyDataVisualizationData setXAxis(java.util.List<String> xAxis) {
            this.xAxis = xAxis;
            return this;
        }
        public java.util.List<String> getXAxis() {
            return this.xAxis;
        }

        public RunDataResultAnalysisResponseBodyDataVisualizationData setYAxis(java.util.List<String> yAxis) {
            this.yAxis = yAxis;
            return this;
        }
        public java.util.List<String> getYAxis() {
            return this.yAxis;
        }

    }

    public static class RunDataResultAnalysisResponseBodyDataVisualization extends TeaModel {
        @NameInMap("data")
        public RunDataResultAnalysisResponseBodyDataVisualizationData data;

        @NameInMap("text")
        public String text;

        public static RunDataResultAnalysisResponseBodyDataVisualization build(java.util.Map<String, ?> map) throws Exception {
            RunDataResultAnalysisResponseBodyDataVisualization self = new RunDataResultAnalysisResponseBodyDataVisualization();
            return TeaModel.build(map, self);
        }

        public RunDataResultAnalysisResponseBodyDataVisualization setData(RunDataResultAnalysisResponseBodyDataVisualizationData data) {
            this.data = data;
            return this;
        }
        public RunDataResultAnalysisResponseBodyDataVisualizationData getData() {
            return this.data;
        }

        public RunDataResultAnalysisResponseBodyDataVisualization setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunDataResultAnalysisResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Access was denied, message: No such namespace namespaces/tech-scp-chain7.</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>result</p>
         */
        @NameInMap("event")
        public String event;

        /**
         * <strong>example:</strong>
         * <p>DA2578F7-88A5-5D6E-9305-33E724E97D60</p>
         */
        @NameInMap("requestId")
        public String requestId;

        @NameInMap("rewrite")
        public String rewrite;

        /**
         * <strong>example:</strong>
         * <p>select p.product_id, p.product_name, sum(o.quantity) as total_sales from products p join orders o on p.product_id = o.product_id where o.order_date between \&quot;2022-10-22\&quot; and \&quot;2024-10-22\&quot; group by p.product_id, p.product_name having total_sales &gt; 5</p>
         */
        @NameInMap("sql")
        public String sql;

        @NameInMap("visualization")
        public RunDataResultAnalysisResponseBodyDataVisualization visualization;

        public static RunDataResultAnalysisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunDataResultAnalysisResponseBodyData self = new RunDataResultAnalysisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RunDataResultAnalysisResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunDataResultAnalysisResponseBodyData setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunDataResultAnalysisResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public RunDataResultAnalysisResponseBodyData setRewrite(String rewrite) {
            this.rewrite = rewrite;
            return this;
        }
        public String getRewrite() {
            return this.rewrite;
        }

        public RunDataResultAnalysisResponseBodyData setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public RunDataResultAnalysisResponseBodyData setVisualization(RunDataResultAnalysisResponseBodyDataVisualization visualization) {
            this.visualization = visualization;
            return this;
        }
        public RunDataResultAnalysisResponseBodyDataVisualization getVisualization() {
            return this.visualization;
        }

    }

}
