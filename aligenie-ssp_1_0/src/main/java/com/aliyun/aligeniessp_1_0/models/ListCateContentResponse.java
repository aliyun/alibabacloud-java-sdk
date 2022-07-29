// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListCateContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCateContentResponseBody body;

    public static ListCateContentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCateContentResponse self = new ListCateContentResponse();
        return TeaModel.build(map, self);
    }

    public ListCateContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCateContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCateContentResponse setBody(ListCateContentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCateContentResponseBody getBody() {
        return this.body;
    }

}
