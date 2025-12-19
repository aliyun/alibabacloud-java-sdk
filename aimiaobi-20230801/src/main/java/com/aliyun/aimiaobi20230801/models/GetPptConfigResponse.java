// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetPptConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPptConfigResponseBody body;

    public static GetPptConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPptConfigResponse self = new GetPptConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetPptConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPptConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPptConfigResponse setBody(GetPptConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPptConfigResponseBody getBody() {
        return this.body;
    }

}
