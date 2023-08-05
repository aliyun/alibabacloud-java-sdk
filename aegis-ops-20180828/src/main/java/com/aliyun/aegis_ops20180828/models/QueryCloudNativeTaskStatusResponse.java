// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class QueryCloudNativeTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCloudNativeTaskStatusResponseBody body;

    public static QueryCloudNativeTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudNativeTaskStatusResponse self = new QueryCloudNativeTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryCloudNativeTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCloudNativeTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCloudNativeTaskStatusResponse setBody(QueryCloudNativeTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCloudNativeTaskStatusResponseBody getBody() {
        return this.body;
    }

}
