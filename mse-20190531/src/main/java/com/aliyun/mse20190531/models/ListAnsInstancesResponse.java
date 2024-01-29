// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAnsInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAnsInstancesResponseBody body;

    public static ListAnsInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAnsInstancesResponse self = new ListAnsInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListAnsInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAnsInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAnsInstancesResponse setBody(ListAnsInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAnsInstancesResponseBody getBody() {
        return this.body;
    }

}
