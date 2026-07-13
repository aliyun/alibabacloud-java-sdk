// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class GetMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMessageResponseBody body;

    public static GetMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageResponse self = new GetMessageResponse();
        return TeaModel.build(map, self);
    }

    public GetMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMessageResponse setBody(GetMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessageResponseBody getBody() {
        return this.body;
    }

}
