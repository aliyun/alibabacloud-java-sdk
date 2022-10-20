// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AddImageMosaicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddImageMosaicResponseBody body;

    public static AddImageMosaicResponse build(java.util.Map<String, ?> map) throws Exception {
        AddImageMosaicResponse self = new AddImageMosaicResponse();
        return TeaModel.build(map, self);
    }

    public AddImageMosaicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddImageMosaicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddImageMosaicResponse setBody(AddImageMosaicResponseBody body) {
        this.body = body;
        return this;
    }
    public AddImageMosaicResponseBody getBody() {
        return this.body;
    }

}
