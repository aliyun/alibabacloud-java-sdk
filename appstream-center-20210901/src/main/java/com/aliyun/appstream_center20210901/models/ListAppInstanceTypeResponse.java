// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAppInstanceTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppInstanceTypeResponseBody body;

    public static ListAppInstanceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppInstanceTypeResponse self = new ListAppInstanceTypeResponse();
        return TeaModel.build(map, self);
    }

    public ListAppInstanceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppInstanceTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppInstanceTypeResponse setBody(ListAppInstanceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppInstanceTypeResponseBody getBody() {
        return this.body;
    }

}
