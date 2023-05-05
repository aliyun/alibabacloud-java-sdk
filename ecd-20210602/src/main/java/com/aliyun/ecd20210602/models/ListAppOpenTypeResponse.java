// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListAppOpenTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppOpenTypeResponseBody body;

    public static ListAppOpenTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppOpenTypeResponse self = new ListAppOpenTypeResponse();
        return TeaModel.build(map, self);
    }

    public ListAppOpenTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppOpenTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppOpenTypeResponse setBody(ListAppOpenTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppOpenTypeResponseBody getBody() {
        return this.body;
    }

}
