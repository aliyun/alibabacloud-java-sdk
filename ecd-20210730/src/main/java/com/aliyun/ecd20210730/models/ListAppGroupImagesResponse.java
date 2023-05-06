// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppGroupImagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppGroupImagesResponseBody body;

    public static ListAppGroupImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupImagesResponse self = new ListAppGroupImagesResponse();
        return TeaModel.build(map, self);
    }

    public ListAppGroupImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppGroupImagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppGroupImagesResponse setBody(ListAppGroupImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppGroupImagesResponseBody getBody() {
        return this.body;
    }

}
