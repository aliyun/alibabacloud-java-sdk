// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppImagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppImagesResponseBody body;

    public static ListAppImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppImagesResponse self = new ListAppImagesResponse();
        return TeaModel.build(map, self);
    }

    public ListAppImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppImagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppImagesResponse setBody(ListAppImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppImagesResponseBody getBody() {
        return this.body;
    }

}
