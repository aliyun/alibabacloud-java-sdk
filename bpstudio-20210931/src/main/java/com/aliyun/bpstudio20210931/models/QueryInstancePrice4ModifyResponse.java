// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class QueryInstancePrice4ModifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryInstancePrice4ModifyResponseBody body;

    public static QueryInstancePrice4ModifyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInstancePrice4ModifyResponse self = new QueryInstancePrice4ModifyResponse();
        return TeaModel.build(map, self);
    }

    public QueryInstancePrice4ModifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInstancePrice4ModifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInstancePrice4ModifyResponse setBody(QueryInstancePrice4ModifyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInstancePrice4ModifyResponseBody getBody() {
        return this.body;
    }

}
