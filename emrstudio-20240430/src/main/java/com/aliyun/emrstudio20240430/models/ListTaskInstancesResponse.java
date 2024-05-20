// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListTaskInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTaskInstancesResponseBody body;

    public static ListTaskInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskInstancesResponse self = new ListTaskInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskInstancesResponse setBody(ListTaskInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskInstancesResponseBody getBody() {
        return this.body;
    }

}
