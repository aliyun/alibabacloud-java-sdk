// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListApplicationNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListApplicationNameResponseBody body;

    public static ListApplicationNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationNameResponse self = new ListApplicationNameResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationNameResponse setBody(ListApplicationNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationNameResponseBody getBody() {
        return this.body;
    }

}
