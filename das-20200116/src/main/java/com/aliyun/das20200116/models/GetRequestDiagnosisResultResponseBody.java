// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRequestDiagnosisResultResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetRequestDiagnosisResultResponseBodyData data;

    /**
     * <p>The response message.</p>
     * <blockquote>
     * <p>This parameter returns <code>Successful</code> if the request succeeds. If the request fails, it returns an error message, which may include an error code.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>800FBAF5-A539-5B97-A09E-C63AB2F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request succeeded.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetRequestDiagnosisResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRequestDiagnosisResultResponseBody self = new GetRequestDiagnosisResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRequestDiagnosisResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRequestDiagnosisResultResponseBody setData(GetRequestDiagnosisResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRequestDiagnosisResultResponseBodyData getData() {
        return this.data;
    }

    public GetRequestDiagnosisResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRequestDiagnosisResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRequestDiagnosisResultResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetRequestDiagnosisResultResponseBodyData extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2093****</p>
         */
        @NameInMap("accountId")
        public String accountId;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>das</p>
         */
        @NameInMap("dbSchema")
        public String dbSchema;

        /**
         * <p>The database engine. Valid values:</p>
         * <ul>
         * <li><p><strong>MySQL</strong></p>
         * </li>
         * <li><p><strong>PostgreSQL</strong></p>
         * </li>
         * <li><p><strong>SQL Server</strong></p>
         * </li>
         * <li><p><strong>PolarDB-X</strong></p>
         * </li>
         * <li><p><strong>PolarDB for Oracle</strong></p>
         * </li>
         * <li><p><strong>MongoDB</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("engine")
        public String engine;

        /**
         * <p>The creation time of the SQL diagnosis, provided as a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1633071840000</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time of the SQL diagnosis, provided as a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1633071850000</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The unique ID of the diagnosis.</p>
         * 
         * <strong>example:</strong>
         * <p>61820b594664275c4429****</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <p>Additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;&quot;:&quot;&quot;}</p>
         */
        @NameInMap("param")
        public String param;

        /**
         * <p>The details of the SQL diagnosis result, returned as a JSON-formatted string.</p>
         * <ul>
         * <li><p><strong>endTime</strong>: The end time of the SQL diagnosis.</p>
         * </li>
         * <li><p><strong>errorCode</strong>: The error code.</p>
         * <ul>
         * <li><p><strong>0001</strong>: The diagnosis was successful.</p>
         * </li>
         * <li><p><strong>0003</strong>: The diagnosis failed.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>errorMessage</strong>: The error message.</p>
         * </li>
         * <li><p><strong>estimateCost</strong>: The estimated cost.</p>
         * <ul>
         * <li><p><strong>cpu</strong>: The estimated CPU cost of the query.</p>
         * </li>
         * <li><p><strong>io</strong>: The estimated I/O cost of the query.</p>
         * </li>
         * <li><p><strong>rows</strong>: The estimated number of rows returned by the query.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>improvement</strong>: The performance improvement ratio.</p>
         * </li>
         * <li><p><strong>indexAdvices</strong>: The index suggestions.</p>
         * <ul>
         * <li><p><strong>columns</strong>: The index columns.</p>
         * </li>
         * <li><p><strong>ddlAddIndex</strong>: The DDL statement for creating the index.</p>
         * </li>
         * <li><p><strong>indexName</strong>: The index name.</p>
         * </li>
         * <li><p><strong>schemaName</strong>: The schema name.</p>
         * </li>
         * <li><p><strong>tableName</strong>: The table name.</p>
         * </li>
         * <li><p><strong>unique</strong>: Indicates whether the index is a unique index.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>ip</strong>: The instance IP address.</p>
         * </li>
         * <li><p><strong>messageId</strong>: The diagnosis ID.</p>
         * </li>
         * <li><p><strong>port</strong>: The instance port.</p>
         * </li>
         * <li><p><strong>sqlTag</strong>: The SQL tags.</p>
         * <ul>
         * <li><p><strong>PRED_EQUAL</strong>: Equality predicate.</p>
         * </li>
         * <li><p><strong>CNT_QB</strong>: Number of query blocks.</p>
         * </li>
         * <li><p><strong>CNT_TB</strong>: Number of tables.</p>
         * </li>
         * <li><p><strong>JOIN_LEFT</strong>: Left join.</p>
         * </li>
         * <li><p><strong>SEL_SMALL</strong>: Small result set selection.</p>
         * </li>
         * <li><p><strong>AGGR_SEL</strong>: Aggregate selection.</p>
         * </li>
         * <li><p><strong>PRED_LT_EQ / PRED_GT_EQ</strong>: Less-than-or-equal-to / greater-than-or-equal-to predicate.</p>
         * </li>
         * <li><p><strong>PRED_LIKE_PREFIX</strong>: LIKE prefix match.</p>
         * </li>
         * <li><p><strong>ORDER_BY</strong>: Contains an ORDER BY clause.</p>
         * </li>
         * <li><p><strong>LIMIT</strong>: Contains a LIMIT clause.</p>
         * </li>
         * <li><p><strong>GROUP_BY</strong>: Contains a GROUP BY clause.</p>
         * </li>
         * <li><p><strong>JOIN_INNER</strong>: Inner join.</p>
         * </li>
         * <li><p><strong>JOIN_RIGHT</strong>: Right join.</p>
         * </li>
         * <li><p><strong>HAVING</strong>: Contains a HAVING clause.</p>
         * </li>
         * <li><p><strong>UNION</strong>: Contains a UNION operation.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>startTime</strong>: The start time of the SQL diagnosis.</p>
         * </li>
         * <li><p><strong>success</strong>: Indicates whether the diagnosis was successful.</p>
         * </li>
         * <li><p><strong>support</strong>: Indicates whether the SQL statement can be diagnosed.</p>
         * <ul>
         * <li><p><strong>true</strong>: Supported.</p>
         * </li>
         * <li><p><strong>false</strong>: Not supported.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>tuningAdvices</strong>: The SQL rewrite suggestions.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;endTime&quot;:1636354256000, &quot;errorCode&quot;:&quot;0001&quot;, &quot;errorMessage&quot;:&quot;TFX成功&quot;, &quot;estimateCost&quot;:{ &quot;cpu&quot;:1.7878745150389268, &quot;io&quot;:9.948402604746128, &quot;rows&quot;:8.889372575194633 }, &quot;improvement&quot;:12933.97, &quot;indexAdvices&quot;:[ { &quot;columns&quot;:[ &quot;work_no&quot; ], &quot;ddlAddIndex&quot;:&quot;ALTER TABLE <code>test</code>.<code>work_order</code> ADD INDEX <code>idx_workno</code> (<code>work_no</code>)&quot;, &quot;indexName&quot;:&quot;idx_workno&quot;, &quot;schemaName&quot;:&quot;test&quot;, &quot;tableName&quot;:&quot;work_order&quot;, &quot;unique&quot;:false } ], &quot;ip&quot;:&quot;<strong><strong>.mysql.rds.aliyuncs.com&quot;, &quot;messageId&quot;:&quot;6188c8cb2f1365b16aee</strong></strong>&quot;, &quot;port&quot;:3306, &quot;sqlTag&quot;:&quot;{\&quot;PRED_EQUAL\&quot;:\&quot;Y\&quot;,\&quot;CNT_QB\&quot;:\&quot;1\&quot;,\&quot;CNT_TB\&quot;:\&quot;1\&quot;}&quot;, &quot;startTime&quot;:1636354252000, &quot;success&quot;:true, &quot;support&quot;:true, &quot;tuningAdvices&quot;:[ ] }</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <p>The SQL template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0c95dae3afef77be06572612df9b****</p>
         */
        @NameInMap("sqlId")
        public String sqlId;

        /**
         * <p>The diagnosis status. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: In progress.</p>
         * </li>
         * <li><p><strong>1</strong>: Diagnosis error.</p>
         * </li>
         * <li><p><strong>2</strong>: Completed.</p>
         * </li>
         * <li><p><strong>3</strong>: SQL error.</p>
         * </li>
         * <li><p><strong>4</strong>: Engine error.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("state")
        public Integer state;

        /**
         * <p>The unique identifier of the diagnosed instance.</p>
         * 
         * <strong>example:</strong>
         * <p>hdm_51fe9bc19ec413f4d530431af87a****</p>
         */
        @NameInMap("uuid")
        public String uuid;

        public static GetRequestDiagnosisResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRequestDiagnosisResultResponseBodyData self = new GetRequestDiagnosisResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRequestDiagnosisResultResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetRequestDiagnosisResultResponseBodyData setDbSchema(String dbSchema) {
            this.dbSchema = dbSchema;
            return this;
        }
        public String getDbSchema() {
            return this.dbSchema;
        }

        public GetRequestDiagnosisResultResponseBodyData setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetRequestDiagnosisResultResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetRequestDiagnosisResultResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetRequestDiagnosisResultResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public GetRequestDiagnosisResultResponseBodyData setParam(String param) {
            this.param = param;
            return this;
        }
        public String getParam() {
            return this.param;
        }

        public GetRequestDiagnosisResultResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetRequestDiagnosisResultResponseBodyData setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public GetRequestDiagnosisResultResponseBodyData setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public GetRequestDiagnosisResultResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
