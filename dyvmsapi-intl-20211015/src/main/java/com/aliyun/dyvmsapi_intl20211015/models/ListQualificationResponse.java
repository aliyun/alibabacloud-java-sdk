// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListQualificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListQualificationResponseBody body;

    public static ListQualificationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQualificationResponse self = new ListQualificationResponse();
        return TeaModel.build(map, self);
    }

    public ListQualificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQualificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQualificationResponse setBody(ListQualificationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQualificationResponseBody getBody() {
        return this.body;
    }

}
