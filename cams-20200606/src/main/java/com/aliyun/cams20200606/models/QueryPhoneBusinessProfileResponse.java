// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryPhoneBusinessProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPhoneBusinessProfileResponseBody body;

    public static QueryPhoneBusinessProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneBusinessProfileResponse self = new QueryPhoneBusinessProfileResponse();
        return TeaModel.build(map, self);
    }

    public QueryPhoneBusinessProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPhoneBusinessProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPhoneBusinessProfileResponse setBody(QueryPhoneBusinessProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPhoneBusinessProfileResponseBody getBody() {
        return this.body;
    }

}
