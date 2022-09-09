// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListParameterSetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListParameterSetsResponseBody body;

    public static ListParameterSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListParameterSetsResponse self = new ListParameterSetsResponse();
        return TeaModel.build(map, self);
    }

    public ListParameterSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListParameterSetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListParameterSetsResponse setBody(ListParameterSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListParameterSetsResponseBody getBody() {
        return this.body;
    }

}
