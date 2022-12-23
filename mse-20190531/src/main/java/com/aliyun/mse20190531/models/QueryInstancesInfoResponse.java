// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryInstancesInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryInstancesInfoResponseBody body;

    public static QueryInstancesInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInstancesInfoResponse self = new QueryInstancesInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryInstancesInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInstancesInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInstancesInfoResponse setBody(QueryInstancesInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInstancesInfoResponseBody getBody() {
        return this.body;
    }

}
