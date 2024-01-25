// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetUserOrderConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserOrderConfigResponseBody body;

    public static GetUserOrderConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserOrderConfigResponse self = new GetUserOrderConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetUserOrderConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserOrderConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserOrderConfigResponse setBody(GetUserOrderConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserOrderConfigResponseBody getBody() {
        return this.body;
    }

}
