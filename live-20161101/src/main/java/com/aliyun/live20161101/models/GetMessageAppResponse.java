// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMessageAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMessageAppResponseBody body;

    public static GetMessageAppResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageAppResponse self = new GetMessageAppResponse();
        return TeaModel.build(map, self);
    }

    public GetMessageAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessageAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMessageAppResponse setBody(GetMessageAppResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessageAppResponseBody getBody() {
        return this.body;
    }

}
