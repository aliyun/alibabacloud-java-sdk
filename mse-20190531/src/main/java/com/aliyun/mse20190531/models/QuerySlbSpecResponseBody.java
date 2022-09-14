// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QuerySlbSpecResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<QuerySlbSpecResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Id")
        public Integer id;

        @NameInMap("MaxConnection")
        public String maxConnection;

        @NameInMap("Name")
        public String name;

        @NameInMap("NewConnectionPerSecond")
        public String newConnectionPerSecond;

        @NameInMap("Qps")
        public String qps;

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
