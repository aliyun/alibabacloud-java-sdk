// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QuerySlbSpecResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The returned data.
    @NameInMap("Data")
    public java.util.List<QuerySlbSpecResponseBodyData> data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned. If the request is successful, a success message is returned. If the request fails, an error message is returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // - `true`: The request is successful. 
    // - `false`: The request fails.
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
        // The ID of the returned data.
        @NameInMap("Id")
        public Integer id;

        // The maximum number of connections.
        @NameInMap("MaxConnection")
        public String maxConnection;

        // The name of the instance type.
        @NameInMap("Name")
        public String name;

        // The maximum connections per second (CPS).
        @NameInMap("NewConnectionPerSecond")
        public String newConnectionPerSecond;

        // The maximum queries per second (QPS).
        @NameInMap("Qps")
        public String qps;

        // The instance type of the SLB instance.
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
