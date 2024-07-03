// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRequestDiagnosisPageResponseBody extends TeaModel {
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
    public GetRequestDiagnosisPageResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, Successful is returned. If the request failed, an error message that contains information such as an error code is returned.</p>
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

    public static GetRequestDiagnosisPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRequestDiagnosisPageResponseBody self = new GetRequestDiagnosisPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRequestDiagnosisPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRequestDiagnosisPageResponseBody setData(GetRequestDiagnosisPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRequestDiagnosisPageResponseBodyData getData() {
        return this.data;
    }

    public GetRequestDiagnosisPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRequestDiagnosisPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRequestDiagnosisPageResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetRequestDiagnosisPageResponseBodyDataList extends TeaModel {
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
         * <p>The time when the SQL diagnostics task was created. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
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
         * <p>Additional information.</p>
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
         * <li><p><strong>errorCode</strong>: indicates whether the SQL diagnostics task is complete. Valid values:</p>
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
         * <li><strong>true</strong>: The SQL statement can be diagnosed.</li>
         * <li><strong>false</strong>: The SQL statement cannot be diagnosed.</li>
         * </ul>
         * </li>
         * <li><p><strong>tuningAdvices</strong>: the SQL rewrite suggestions.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;endTime&quot;:1636354256000, &quot;errorCode&quot;:&quot;0001&quot;, &quot;errorMessage&quot;:&quot;TFX Successful&quot;, &quot;estimateCost&quot;:{ &quot;cpu&quot;:1.7878745150389268, &quot;io&quot;:9.948402604746128, &quot;rows&quot;:8.889372575194633 }, &quot;improvement&quot;:12933.97, &quot;indexAdvices&quot;:[ { &quot;columns&quot;:[ &quot;work_no&quot; ], &quot;ddlAddIndex&quot;:&quot;ALTER TABLE <code>test</code>.<code>work_order</code> ADD INDEX <code>idx_workno</code> (<code>work_no</code>)&quot;, &quot;indexName&quot;:&quot;idx_workno&quot;, &quot;schemaName&quot;:&quot;test&quot;, &quot;tableName&quot;:&quot;work_order&quot;, &quot;unique&quot;:false } ], &quot;ip&quot;:&quot;<strong><strong>.mysql.rds.aliyuncs.com&quot;, &quot;messageId&quot;:&quot;6188c8cb2f1365b16aee</strong></strong>&quot;, &quot;port&quot;:3306, &quot;sqlTag&quot;:&quot;{\&quot;PRED_EQUAL\&quot;:\&quot;Y\&quot;,\&quot;CNT_QB\&quot;:\&quot;1\&quot;,\&quot;CNT_TB\&quot;:\&quot;1\&quot;}&quot;, &quot;startTime&quot;:1636354252000, &quot;success&quot;:true, &quot;support&quot;:true, &quot;tuningAdvices&quot;:[ ] }</p>
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
         * <p>The status of the diagnostics task. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: The diagnostics task is in progress.</p>
         * </li>
         * <li><p><strong>1</strong>: A diagnostics error occurred.</p>
         * </li>
         * <li><p><strong>2</strong>: The diagnostics task is complete.</p>
         * </li>
         * <li><p><strong>3</strong>: An SQL error occurred.</p>
         * </li>
         * <li><p><strong>4</strong>: An engine error occurred.</p>
         * </li>
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

        public static GetRequestDiagnosisPageResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetRequestDiagnosisPageResponseBodyDataList self = new GetRequestDiagnosisPageResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetRequestDiagnosisPageResponseBodyDataList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setDbSchema(String dbSchema) {
            this.dbSchema = dbSchema;
            return this;
        }
        public String getDbSchema() {
            return this.dbSchema;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setParam(String param) {
            this.param = param;
            return this;
        }
        public String getParam() {
            return this.param;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class GetRequestDiagnosisPageResponseBodyData extends TeaModel {
        /**
         * <p>Additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;&quot;:&quot;&quot;}</p>
         */
        @NameInMap("extra")
        public String extra;

        /**
         * <p>The SQL diagnostics records returned.</p>
         */
        @NameInMap("list")
        public java.util.List<GetRequestDiagnosisPageResponseBodyDataList> list;

        /**
         * <p>The page number. The value must be a positive integer. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNo")
        public Long pageNo;

        /**
         * <p>The number of entries per page. The value must be a positive integer. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total")
        public Long total;

        public static GetRequestDiagnosisPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRequestDiagnosisPageResponseBodyData self = new GetRequestDiagnosisPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRequestDiagnosisPageResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetRequestDiagnosisPageResponseBodyData setList(java.util.List<GetRequestDiagnosisPageResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetRequestDiagnosisPageResponseBodyDataList> getList() {
            return this.list;
        }

        public GetRequestDiagnosisPageResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public GetRequestDiagnosisPageResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetRequestDiagnosisPageResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
