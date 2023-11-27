// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetMessageByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMessageByIdResponseBody body;

    public static GetMessageByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageByIdResponse self = new GetMessageByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetMessageByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessageByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMessageByIdResponse setBody(GetMessageByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessageByIdResponseBody getBody() {
        return this.body;
    }

}
