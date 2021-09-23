// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QuerySlbSpecResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<QuerySlbSpecResponseBodyData> data;

    public static QuerySlbSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySlbSpecResponseBody self = new QuerySlbSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySlbSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public QuerySlbSpecResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QuerySlbSpecResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySlbSpecResponseBody setData(java.util.List<QuerySlbSpecResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuerySlbSpecResponseBodyData> getData() {
        return this.data;
    }

    public static class QuerySlbSpecResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Integer id;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("Name")
        public String name;

        @NameInMap("MaxConnection")
        public String maxConnection;

        @NameInMap("NewConnectionPerSecond")
        public String newConnectionPerSecond;

        @NameInMap("Qps")
        public String qps;

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

        public QuerySlbSpecResponseBodyData setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public QuerySlbSpecResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QuerySlbSpecResponseBodyData setMaxConnection(String maxConnection) {
            this.maxConnection = maxConnection;
            return this;
        }
        public String getMaxConnection() {
            return this.maxConnection;
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

    }

}
