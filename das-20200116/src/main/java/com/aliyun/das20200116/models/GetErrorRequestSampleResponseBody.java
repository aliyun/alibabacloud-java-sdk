// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetErrorRequestSampleResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>[         {             &quot;sqlId&quot;: &quot;2cd4432556c3dab9d825ba363637****&quot;,             &quot;database&quot;: &quot;dbgateway&quot;,             &quot;originHost&quot;: &quot;172.16.1****&quot;,             &quot;tables&quot;: [                 &quot;meter_****&quot;             ],             &quot;instanceId&quot;: &quot;rm-2ze8g2am97624****&quot;,             &quot;errorCode&quot;: &quot;1062&quot;,             &quot;user&quot;: &quot;dbgat****&quot;,             &quot;sql&quot;: &quot;insert into meter_****\n        ( \n        <strong><strong>\n     )\n        values (now(), now(), \&quot;bbbc8624-5e19-455a-9714-8466f688</strong></strong>\&quot;, \&quot;2022-02-10 14:00:00\&quot;, \&quot;{\&quot;endTime\&quot;:\&quot;2022-02-10 14:00:00\&quot;,\&quot;endTimestamp\&quot;:1644472800,\&quot;startTime\&quot;:\&quot;2022-02-10 13:00:00\&quot;,\&quot;startTimestamp\&quot;:1644469200}\&quot;, null, null)&quot;,             &quot;timestamp&quot;: 1644476100435         }]</p>
     */
    @NameInMap("Data")
    public java.util.List<GetErrorRequestSampleResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
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
     * <p>7172BECE-588A-5961-8126-C216E16B****</p>
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
    public Boolean success;

    public static GetErrorRequestSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetErrorRequestSampleResponseBody self = new GetErrorRequestSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetErrorRequestSampleResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetErrorRequestSampleResponseBody setData(java.util.List<GetErrorRequestSampleResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetErrorRequestSampleResponseBodyData> getData() {
        return this.data;
    }

    public GetErrorRequestSampleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetErrorRequestSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetErrorRequestSampleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetErrorRequestSampleResponseBodyData extends TeaModel {
        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>dbgateway</p>
         */
        @NameInMap("database")
        public String database;

        /**
         * <p>The error code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1062</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The IP address of the client that executes the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.1****</p>
         */
        @NameInMap("originHost")
        public String originHost;

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>insert into meter_****</p>
         */
        @NameInMap("sql")
        public String sql;

        /**
         * <p>The SQL query ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2cd4432556c3dab9d825ba363637****</p>
         */
        @NameInMap("sqlId")
        public String sqlId;

        /**
         * <p>The table information.</p>
         */
        @NameInMap("tables")
        public java.util.List<String> tables;

        /**
         * <p>The time when the SQL query was executed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1644476100435</p>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        /**
         * <p>The username of the account that is used to log on to the database.</p>
         * 
         * <strong>example:</strong>
         * <p>dbgat****</p>
         */
        @NameInMap("user")
        public String user;

        public static GetErrorRequestSampleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetErrorRequestSampleResponseBodyData self = new GetErrorRequestSampleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetErrorRequestSampleResponseBodyData setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public GetErrorRequestSampleResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetErrorRequestSampleResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetErrorRequestSampleResponseBodyData setOriginHost(String originHost) {
            this.originHost = originHost;
            return this;
        }
        public String getOriginHost() {
            return this.originHost;
        }

        public GetErrorRequestSampleResponseBodyData setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public GetErrorRequestSampleResponseBodyData setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public GetErrorRequestSampleResponseBodyData setTables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<String> getTables() {
            return this.tables;
        }

        public GetErrorRequestSampleResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetErrorRequestSampleResponseBodyData setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
