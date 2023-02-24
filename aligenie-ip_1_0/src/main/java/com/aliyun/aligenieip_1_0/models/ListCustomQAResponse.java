// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListCustomQAResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCustomQAResponseBody body;

    public static ListCustomQAResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomQAResponse self = new ListCustomQAResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomQAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomQAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomQAResponse setBody(ListCustomQAResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomQAResponseBody getBody() {
        return this.body;
    }

}
