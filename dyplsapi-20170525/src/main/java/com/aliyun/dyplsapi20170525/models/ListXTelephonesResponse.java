// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class ListXTelephonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListXTelephonesResponseBody body;

    public static ListXTelephonesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListXTelephonesResponse self = new ListXTelephonesResponse();
        return TeaModel.build(map, self);
    }

    public ListXTelephonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListXTelephonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListXTelephonesResponse setBody(ListXTelephonesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListXTelephonesResponseBody getBody() {
        return this.body;
    }

}
