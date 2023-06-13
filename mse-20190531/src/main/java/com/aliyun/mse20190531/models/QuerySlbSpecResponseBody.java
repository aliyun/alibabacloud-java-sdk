// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QuerySlbSpecResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data entries returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<QuerySlbSpecResponseBodyData> data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned. If the request is successful, a success message is returned. If the request fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySlbSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySlbSpecResponseBody self = new QuerySlbSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySlbSpecResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QuerySlbSpecResponseBody setData(java.util.List<QuerySlbSpecResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuerySlbSpecResponseBodyData> getData() {
        return this.data;
    }

    public QuerySlbSpecResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QuerySlbSpecResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySlbSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySlbSpecResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySlbSpecResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the returned data.</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The maximum number of connections.</p>
         */
        @NameInMap("MaxConnection")
        public String maxConnection;

        /**
         * <p>The name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The maximum connections per second (CPS).</p>
         */
        @NameInMap("NewConnectionPerSecond")
        public String newConnectionPerSecond;

        /**
         * <p>The number of queries per second (QPS).</p>
         */
        @NameInMap("Qps")
        public String qps;

        /**
         * <p>The specifications.</p>
         */
        @NameInMap("Spec")
        public String spec;

        public static QuerySlbSpecResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySlbSpecResponseBodyData self = new QuerySlbSpecResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySlbSpecResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public QuerySlbSpecResponseBodyData setMaxConnection(String maxConnection) {
            this.maxConnection = maxConnection;
            return this;
        }
        public String getMaxConnection() {
            return this.maxConnection;
        }

        public QuerySlbSpecResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QuerySlbSpecResponseBodyData setNewConnectionPerSecond(String newConnectionPerSecond) {
            this.newConnectionPerSecond = newConnectionPerSecond;
            return this;
        }
        public String getNewConnectionPerSecond() {
            return this.newConnectionPerSecond;
        }

        public QuerySlbSpecResponseBodyData setQps(String qps) {
            this.qps = qps;
            return this;
        }
        public String getQps() {
            return this.qps;
        }

        public QuerySlbSpecResponseBodyData setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

}
