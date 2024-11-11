// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class RunDataAnalysisResponseBody extends TeaModel {
    @NameInMap("data")
    public RunDataAnalysisResponseBodyData data;

    public static RunDataAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunDataAnalysisResponseBody self = new RunDataAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public RunDataAnalysisResponseBody setData(RunDataAnalysisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RunDataAnalysisResponseBodyData getData() {
        return this.data;
    }

    public static class RunDataAnalysisResponseBodyDataSqlData extends TeaModel {
        @NameInMap("column")
        public java.util.List<String> column;

        @NameInMap("data")
        public java.util.List<java.util.Map<String, ?>> data;

        public static RunDataAnalysisResponseBodyDataSqlData build(java.util.Map<String, ?> map) throws Exception {
            RunDataAnalysisResponseBodyDataSqlData self = new RunDataAnalysisResponseBodyDataSqlData();
            return TeaModel.build(map, self);
        }

        public RunDataAnalysisResponseBodyDataSqlData setColumn(java.util.List<String> column) {
            this.column = column;
            return this;
        }
        public java.util.List<String> getColumn() {
            return this.column;
        }

        public RunDataAnalysisResponseBodyDataSqlData setData(java.util.List<java.util.Map<String, ?>> data) {
            this.data = data;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

    }

    public static class RunDataAnalysisResponseBodyDataVisualizationData extends TeaModel {
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

        public static RunDataAnalysisResponseBodyDataVisualizationData build(java.util.Map<String, ?> map) throws Exception {
            RunDataAnalysisResponseBodyDataVisualizationData self = new RunDataAnalysisResponseBodyDataVisualizationData();
            return TeaModel.build(map, self);
        }

        public RunDataAnalysisResponseBodyDataVisualizationData setPlotType(String plotType) {
            this.plotType = plotType;
            return this;
        }
        public String getPlotType() {
            return this.plotType;
        }

        public RunDataAnalysisResponseBodyDataVisualizationData setXAxis(java.util.List<String> xAxis) {
            this.xAxis = xAxis;
            return this;
        }
        public java.util.List<String> getXAxis() {
            return this.xAxis;
        }

        public RunDataAnalysisResponseBodyDataVisualizationData setYAxis(java.util.List<String> yAxis) {
            this.yAxis = yAxis;
            return this;
        }
        public java.util.List<String> getYAxis() {
            return this.yAxis;
        }

    }

    public static class RunDataAnalysisResponseBodyDataVisualization extends TeaModel {
        @NameInMap("data")
        public RunDataAnalysisResponseBodyDataVisualizationData data;

        @NameInMap("text")
        public String text;

        public static RunDataAnalysisResponseBodyDataVisualization build(java.util.Map<String, ?> map) throws Exception {
            RunDataAnalysisResponseBodyDataVisualization self = new RunDataAnalysisResponseBodyDataVisualization();
            return TeaModel.build(map, self);
        }

        public RunDataAnalysisResponseBodyDataVisualization setData(RunDataAnalysisResponseBodyDataVisualizationData data) {
            this.data = data;
            return this;
        }
        public RunDataAnalysisResponseBodyDataVisualizationData getData() {
            return this.data;
        }

        public RunDataAnalysisResponseBodyDataVisualization setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunDataAnalysisResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Access was denied, message: No such namespace namespaces/tech-scp-chain7.</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>rewrite</p>
         */
        @NameInMap("event")
        public String event;

        @NameInMap("evidence")
        public String evidence;

        /**
         * <strong>example:</strong>
         * <p>DA2578F7-88A5-5D6E-9305-33E724E97D60</p>
         */
        @NameInMap("requestId")
        public String requestId;

        @NameInMap("rewrite")
        public String rewrite;

        @NameInMap("selector")
        public java.util.List<String> selector;

        /**
         * <strong>example:</strong>
         * <p>sessionid1</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>select p.product_id, p.product_name, sum(o.quantity) as total_sales from products p join orders o on p.product_id = o.product_id where o.order_date between \&quot;2022-10-22\&quot; and \&quot;2024-10-22\&quot; group by p.product_id, p.product_name having total_sales &gt; 5</p>
         */
        @NameInMap("sql")
        public String sql;

        @NameInMap("sqlData")
        public RunDataAnalysisResponseBodyDataSqlData sqlData;

        /**
         * <strong>example:</strong>
         * <p>Can not issue data manipulation statements with executeQuery()</p>
         */
        @NameInMap("sqlError")
        public String sqlError;

        @NameInMap("visualization")
        public RunDataAnalysisResponseBodyDataVisualization visualization;

        public static RunDataAnalysisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunDataAnalysisResponseBodyData self = new RunDataAnalysisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RunDataAnalysisResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunDataAnalysisResponseBodyData setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunDataAnalysisResponseBodyData setEvidence(String evidence) {
            this.evidence = evidence;
            return this;
        }
        public String getEvidence() {
            return this.evidence;
        }

        public RunDataAnalysisResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public RunDataAnalysisResponseBodyData setRewrite(String rewrite) {
            this.rewrite = rewrite;
            return this;
        }
        public String getRewrite() {
            return this.rewrite;
        }

        public RunDataAnalysisResponseBodyData setSelector(java.util.List<String> selector) {
            this.selector = selector;
            return this;
        }
        public java.util.List<String> getSelector() {
            return this.selector;
        }

        public RunDataAnalysisResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunDataAnalysisResponseBodyData setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public RunDataAnalysisResponseBodyData setSqlData(RunDataAnalysisResponseBodyDataSqlData sqlData) {
            this.sqlData = sqlData;
            return this;
        }
        public RunDataAnalysisResponseBodyDataSqlData getSqlData() {
            return this.sqlData;
        }

        public RunDataAnalysisResponseBodyData setSqlError(String sqlError) {
            this.sqlError = sqlError;
            return this;
        }
        public String getSqlError() {
            return this.sqlError;
        }

        public RunDataAnalysisResponseBodyData setVisualization(RunDataAnalysisResponseBodyDataVisualization visualization) {
            this.visualization = visualization;
            return this;
        }
        public RunDataAnalysisResponseBodyDataVisualization getVisualization() {
            return this.visualization;
        }

    }

}
