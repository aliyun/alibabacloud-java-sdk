// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRequestDiagnosisResultResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
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
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.</p>
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
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
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
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>das</p>
         */
        @NameInMap("dbSchema")
        public String dbSchema;

        /**
         * <p>The database engine. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>SQLServer</strong></li>
         * <li><strong>PolarDBMySQL</strong></li>
         * <li><strong>PolarDBOracle</strong></li>
         * <li><strong>MongoDB</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("engine")
        public String engine;

        /**
         * <p>The time when the SQL diagnostics task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1633071840000</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the SQL diagnostics task was modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1633071850000</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The unique ID of the diagnostics task.</p>
         * 
         * <strong>example:</strong>
         * <p>61820b594664275c4429****</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <p>The additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;&quot;:&quot;&quot;}</p>
         */
        @NameInMap("param")
        public String param;

        /**
         * <p>The result of the SQL diagnostics task. The result includes the following information:</p>
         * <ul>
         * <li><p><strong>endTime</strong>: the end time of the SQL diagnostics task.</p>
         * </li>
         * <li><p><strong>errorCode</strong>: the error code.</p>
         * <ul>
         * <li><strong>0001</strong>: The SQL diagnostics task is complete.</li>
         * <li><strong>0003</strong>: The SQL diagnostics task failed.</li>
         * </ul>
         * </li>
         * <li><p><strong>errorMessage</strong>: the error message.</p>
         * </li>
         * <li><p><strong>estimateCost</strong>: the estimated cost.</p>
         * <ul>
         * <li><strong>cpu</strong>: the estimated CPU utilization of the index.</li>
         * <li><strong>io</strong>: the estimated I/O usage of the index.</li>
         * <li><strong>rows</strong>: the estimated values of the rows returned for the index.</li>
         * </ul>
         * </li>
         * <li><p><strong>improvement</strong>: the performance improvement ratio.</p>
         * </li>
         * <li><p><strong>indexAdvices</strong>: the index recommendations, which include the following information:</p>
         * <ul>
         * <li><strong>columns</strong>: the index columns.</li>
         * <li><strong>ddlAddIndex</strong>: the DDL statement for the index.</li>
         * <li><strong>indexName</strong>: the name of the index.</li>
         * <li><strong>schemaName</strong>: the name of the database.</li>
         * <li><strong>tableName</strong>: the name of the table.</li>
         * <li><strong>unique</strong>: indicates whether the index is unique.</li>
         * </ul>
         * </li>
         * <li><p><strong>ip</strong>: the IP address of the instance.</p>
         * </li>
         * <li><p><strong>messageId</strong>: the ID of the diagnostics task.</p>
         * </li>
         * <li><p><strong>port</strong>: the port used to connect to the instance.</p>
         * </li>
         * <li><p><strong>sqlTag</strong>: the SQL tag.</p>
         * </li>
         * <li><p><strong>startTime</strong>: the start time of the SQL diagnostics task.</p>
         * </li>
         * <li><p><strong>success</strong>: indicates whether the request was successful.</p>
         * </li>
         * <li><p><strong>support</strong>: indicates whether the SQL statement can be diagnosed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * </li>
         * <li><p><strong>tuningAdvices</strong> : the SQL rewrite suggestions.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;endTime&quot;:1636354256000, &quot;errorCode&quot;:&quot;0001&quot;, &quot;errorMessage&quot;:&quot;TFX succeeded&quot;, &quot;estimateCost&quot;:{ &quot;cpu&quot;:1.7878745150389268, &quot;io&quot;:9.948402604746128, &quot;rows&quot;:8.889372575194633 }, &quot;improvement&quot;:12933.97, &quot;indexAdvices&quot;:[ { &quot;columns&quot;:[ &quot;work_no&quot; ], &quot;ddlAddIndex&quot;:&quot;ALTER TABLE <code>test</code>.<code>work_order</code> ADD INDEX <code>idx_workno</code> (<code>work_no</code>)&quot;, &quot;indexName&quot;:&quot;idx_workno&quot;, &quot;schemaName&quot;:&quot;test&quot;, &quot;tableName&quot;:&quot;work_order&quot;, &quot;unique&quot;:false } ], &quot;ip&quot;:&quot;<strong><strong>.mysql.rds.aliyuncs.com&quot;, &quot;messageId&quot;:&quot;6188c8cb2f1365b16aee</strong></strong>&quot;, &quot;port&quot;:3306, &quot;sqlTag&quot;:&quot;{\&quot;PRED_EQUAL\&quot;:\&quot;Y\&quot;,\&quot;CNT_QB\&quot;:\&quot;1\&quot;,\&quot;CNT_TB\&quot;:\&quot;1\&quot;}&quot;, &quot;startTime&quot;:1636354252000, &quot;success&quot;:true, &quot;support&quot;:true, &quot;tuningAdvices&quot;:[ ] }</p>
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
         * <p>The state of the diagnostics task. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The diagnostics task is in progress.</li>
         * <li><strong>1</strong>: A diagnostics error occurred.</li>
         * <li><strong>2</strong>: The diagnostics task is complete.</li>
         * <li><strong>3</strong>: An SQL error occurred.</li>
         * <li><strong>4</strong>: An engine error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("state")
        public Integer state;

        /**
         * <p>The unique ID of the diagnostics instance.</p>
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
