// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class RunSqlGenerationResponseBody extends TeaModel {
    @NameInMap("data")
    public RunSqlGenerationResponseBodyData data;

    public static RunSqlGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunSqlGenerationResponseBody self = new RunSqlGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public RunSqlGenerationResponseBody setData(RunSqlGenerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RunSqlGenerationResponseBodyData getData() {
        return this.data;
    }

    public static class RunSqlGenerationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Access was denied, message: No such namespace namespaces/tech-scp-chain7.</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>sql</p>
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
         * <p>f64c38dd-a235-4bb4-ae6c-79eaedcba699</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>select p.product_id, p.product_name, sum(o.quantity) as total_sales from products p join orders o on p.product_id = o.product_id where o.order_date between \&quot;2022-10-22\&quot; and \&quot;2024-10-22\&quot; group by p.product_id, p.product_name having total_sales &gt; 5</p>
         */
        @NameInMap("sql")
        public String sql;

        /**
         * <strong>example:</strong>
         * <p>Can not issue data manipulation statements with executeQuery()</p>
         */
        @NameInMap("sqlError")
        public String sqlError;

        public static RunSqlGenerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunSqlGenerationResponseBodyData self = new RunSqlGenerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RunSqlGenerationResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunSqlGenerationResponseBodyData setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunSqlGenerationResponseBodyData setEvidence(String evidence) {
            this.evidence = evidence;
            return this;
        }
        public String getEvidence() {
            return this.evidence;
        }

        public RunSqlGenerationResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public RunSqlGenerationResponseBodyData setRewrite(String rewrite) {
            this.rewrite = rewrite;
            return this;
        }
        public String getRewrite() {
            return this.rewrite;
        }

        public RunSqlGenerationResponseBodyData setSelector(java.util.List<String> selector) {
            this.selector = selector;
            return this;
        }
        public java.util.List<String> getSelector() {
            return this.selector;
        }

        public RunSqlGenerationResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunSqlGenerationResponseBodyData setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public RunSqlGenerationResponseBodyData setSqlError(String sqlError) {
            this.sqlError = sqlError;
            return this;
        }
        public String getSqlError() {
            return this.sqlError;
        }

    }

}
