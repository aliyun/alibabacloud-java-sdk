// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListViberServiceMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListViberServiceMessageResponseBody body;

    public static ListViberServiceMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListViberServiceMessageResponse self = new ListViberServiceMessageResponse();
        return TeaModel.build(map, self);
    }

    public ListViberServiceMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListViberServiceMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListViberServiceMessageResponse setBody(ListViberServiceMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListViberServiceMessageResponseBody getBody() {
        return this.body;
    }

}
