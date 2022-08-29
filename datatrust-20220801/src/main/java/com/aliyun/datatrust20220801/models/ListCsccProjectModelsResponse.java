// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccProjectModelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCsccProjectModelsResponseBody body;

    public static ListCsccProjectModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCsccProjectModelsResponse self = new ListCsccProjectModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListCsccProjectModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCsccProjectModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCsccProjectModelsResponse setBody(ListCsccProjectModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCsccProjectModelsResponseBody getBody() {
        return this.body;
    }

}
