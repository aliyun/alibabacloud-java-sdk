// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListServiceSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceSourceResponseBody body;

    public static ListServiceSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceSourceResponse self = new ListServiceSourceResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceSourceResponse setBody(ListServiceSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceSourceResponseBody getBody() {
        return this.body;
    }

}
