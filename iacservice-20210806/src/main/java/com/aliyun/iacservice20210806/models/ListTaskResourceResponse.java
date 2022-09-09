// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListTaskResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTaskResourceResponseBody body;

    public static ListTaskResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskResourceResponse self = new ListTaskResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskResourceResponse setBody(ListTaskResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskResourceResponseBody getBody() {
        return this.body;
    }

}
