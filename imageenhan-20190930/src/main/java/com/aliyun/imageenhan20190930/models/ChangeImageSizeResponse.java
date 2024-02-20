// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ChangeImageSizeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeImageSizeResponseBody body;

    public static ChangeImageSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeImageSizeResponse self = new ChangeImageSizeResponse();
        return TeaModel.build(map, self);
    }

    public ChangeImageSizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeImageSizeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeImageSizeResponse setBody(ChangeImageSizeResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeImageSizeResponseBody getBody() {
        return this.body;
    }

}
