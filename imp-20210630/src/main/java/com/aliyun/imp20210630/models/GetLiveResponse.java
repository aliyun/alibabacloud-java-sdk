// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLiveResponseBody body;

    public static GetLiveResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveResponse self = new GetLiveResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLiveResponse setBody(GetLiveResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveResponseBody getBody() {
        return this.body;
    }

}
