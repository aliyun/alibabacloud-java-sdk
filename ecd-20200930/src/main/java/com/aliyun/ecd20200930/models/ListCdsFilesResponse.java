// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListCdsFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCdsFilesResponseBody body;

    public static ListCdsFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCdsFilesResponse self = new ListCdsFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListCdsFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCdsFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCdsFilesResponse setBody(ListCdsFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCdsFilesResponseBody getBody() {
        return this.body;
    }

}
