// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListMseNacosSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMseNacosSourcesResponseBody body;

    public static ListMseNacosSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMseNacosSourcesResponse self = new ListMseNacosSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListMseNacosSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMseNacosSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMseNacosSourcesResponse setBody(ListMseNacosSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMseNacosSourcesResponseBody getBody() {
        return this.body;
    }

}
