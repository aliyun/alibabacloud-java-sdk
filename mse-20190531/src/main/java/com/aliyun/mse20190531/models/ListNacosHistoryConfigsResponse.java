// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListNacosHistoryConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNacosHistoryConfigsResponseBody body;

    public static ListNacosHistoryConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNacosHistoryConfigsResponse self = new ListNacosHistoryConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListNacosHistoryConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNacosHistoryConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNacosHistoryConfigsResponse setBody(ListNacosHistoryConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNacosHistoryConfigsResponseBody getBody() {
        return this.body;
    }

}
