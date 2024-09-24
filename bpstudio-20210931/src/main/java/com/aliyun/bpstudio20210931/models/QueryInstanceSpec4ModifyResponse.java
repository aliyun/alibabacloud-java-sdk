// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class QueryInstanceSpec4ModifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryInstanceSpec4ModifyResponseBody body;

    public static QueryInstanceSpec4ModifyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceSpec4ModifyResponse self = new QueryInstanceSpec4ModifyResponse();
        return TeaModel.build(map, self);
    }

    public QueryInstanceSpec4ModifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInstanceSpec4ModifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInstanceSpec4ModifyResponse setBody(QueryInstanceSpec4ModifyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInstanceSpec4ModifyResponseBody getBody() {
        return this.body;
    }

}
