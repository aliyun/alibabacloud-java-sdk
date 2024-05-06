// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class MultimodAddComponentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MultimodAddComponentsResponseBody body;

    public static MultimodAddComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        MultimodAddComponentsResponse self = new MultimodAddComponentsResponse();
        return TeaModel.build(map, self);
    }

    public MultimodAddComponentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MultimodAddComponentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MultimodAddComponentsResponse setBody(MultimodAddComponentsResponseBody body) {
        this.body = body;
        return this;
    }
    public MultimodAddComponentsResponseBody getBody() {
        return this.body;
    }

}
