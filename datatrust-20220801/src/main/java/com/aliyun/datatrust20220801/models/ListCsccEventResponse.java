// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCsccEventResponseBody body;

    public static ListCsccEventResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCsccEventResponse self = new ListCsccEventResponse();
        return TeaModel.build(map, self);
    }

    public ListCsccEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCsccEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCsccEventResponse setBody(ListCsccEventResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCsccEventResponseBody getBody() {
        return this.body;
    }

}
