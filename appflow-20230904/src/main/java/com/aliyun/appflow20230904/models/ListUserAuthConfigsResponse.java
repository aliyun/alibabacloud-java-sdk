// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class ListUserAuthConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserAuthConfigsResponseBody body;

    public static ListUserAuthConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserAuthConfigsResponse self = new ListUserAuthConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserAuthConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserAuthConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserAuthConfigsResponse setBody(ListUserAuthConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserAuthConfigsResponseBody getBody() {
        return this.body;
    }

}
