// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListNacosConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNacosConfigsResponseBody body;

    public static ListNacosConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNacosConfigsResponse self = new ListNacosConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListNacosConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNacosConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNacosConfigsResponse setBody(ListNacosConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNacosConfigsResponseBody getBody() {
        return this.body;
    }

}
