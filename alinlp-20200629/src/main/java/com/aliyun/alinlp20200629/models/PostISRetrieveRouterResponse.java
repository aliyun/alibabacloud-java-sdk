// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class PostISRetrieveRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PostISRetrieveRouterResponseBody body;

    public static PostISRetrieveRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        PostISRetrieveRouterResponse self = new PostISRetrieveRouterResponse();
        return TeaModel.build(map, self);
    }

    public PostISRetrieveRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PostISRetrieveRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PostISRetrieveRouterResponse setBody(PostISRetrieveRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public PostISRetrieveRouterResponseBody getBody() {
        return this.body;
    }

}
