// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListNodeInstanceTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListNodeInstanceTypeResponseBody body;

    public static ListNodeInstanceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeInstanceTypeResponse self = new ListNodeInstanceTypeResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeInstanceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodeInstanceTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodeInstanceTypeResponse setBody(ListNodeInstanceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodeInstanceTypeResponseBody getBody() {
        return this.body;
    }

}
