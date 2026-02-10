// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryDigitalSignByNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDigitalSignByNameResponseBody body;

    public static QueryDigitalSignByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalSignByNameResponse self = new QueryDigitalSignByNameResponse();
        return TeaModel.build(map, self);
    }

    public QueryDigitalSignByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDigitalSignByNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDigitalSignByNameResponse setBody(QueryDigitalSignByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDigitalSignByNameResponseBody getBody() {
        return this.body;
    }

}
