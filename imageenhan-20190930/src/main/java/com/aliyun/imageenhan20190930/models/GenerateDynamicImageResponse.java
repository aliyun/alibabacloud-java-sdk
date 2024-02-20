// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateDynamicImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateDynamicImageResponseBody body;

    public static GenerateDynamicImageResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDynamicImageResponse self = new GenerateDynamicImageResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDynamicImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateDynamicImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateDynamicImageResponse setBody(GenerateDynamicImageResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateDynamicImageResponseBody getBody() {
        return this.body;
    }

}
