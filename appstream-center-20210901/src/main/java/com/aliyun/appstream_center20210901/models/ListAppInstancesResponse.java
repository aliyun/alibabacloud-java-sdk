// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAppInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppInstancesResponseBody body;

    public static ListAppInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppInstancesResponse self = new ListAppInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListAppInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppInstancesResponse setBody(ListAppInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppInstancesResponseBody getBody() {
        return this.body;
    }

}
