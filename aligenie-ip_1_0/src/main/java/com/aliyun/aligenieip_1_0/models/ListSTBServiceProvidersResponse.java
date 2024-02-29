// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListSTBServiceProvidersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSTBServiceProvidersResponseBody body;

    public static ListSTBServiceProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSTBServiceProvidersResponse self = new ListSTBServiceProvidersResponse();
        return TeaModel.build(map, self);
    }

    public ListSTBServiceProvidersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSTBServiceProvidersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSTBServiceProvidersResponse setBody(ListSTBServiceProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSTBServiceProvidersResponseBody getBody() {
        return this.body;
    }

}
