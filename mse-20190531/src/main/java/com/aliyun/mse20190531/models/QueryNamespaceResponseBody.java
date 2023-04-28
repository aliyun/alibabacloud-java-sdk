// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryNamespaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryNamespaceResponseBodyData> data;

    /**
     * <p>HttpStatusCode。</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryNamespaceResponseBody self = new QueryNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryNamespaceResponseBody setData(java.util.List<QueryNamespaceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryNamespaceResponseBodyData> getData() {
        return this.data;
    }

    public QueryNamespaceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryNamespaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryNamespaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryNamespaceResponseBodyData extends TeaModel {
        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Region")
        public String region;

        public static QueryNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryNamespaceResponseBodyData self = new QueryNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryNamespaceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryNamespaceResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
