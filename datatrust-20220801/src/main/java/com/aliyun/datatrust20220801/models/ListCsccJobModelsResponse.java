// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccJobModelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCsccJobModelsResponseBody body;

    public static ListCsccJobModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCsccJobModelsResponse self = new ListCsccJobModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListCsccJobModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCsccJobModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCsccJobModelsResponse setBody(ListCsccJobModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCsccJobModelsResponseBody getBody() {
        return this.body;
    }

}
