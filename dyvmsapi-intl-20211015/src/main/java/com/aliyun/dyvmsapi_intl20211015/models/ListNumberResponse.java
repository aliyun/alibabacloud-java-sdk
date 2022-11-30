// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListNumberResponseBody body;

    public static ListNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNumberResponse self = new ListNumberResponse();
        return TeaModel.build(map, self);
    }

    public ListNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNumberResponse setBody(ListNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNumberResponseBody getBody() {
        return this.body;
    }

}
