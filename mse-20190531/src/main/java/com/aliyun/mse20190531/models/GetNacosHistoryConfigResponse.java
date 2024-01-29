// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetNacosHistoryConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNacosHistoryConfigResponseBody body;

    public static GetNacosHistoryConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNacosHistoryConfigResponse self = new GetNacosHistoryConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetNacosHistoryConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNacosHistoryConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNacosHistoryConfigResponse setBody(GetNacosHistoryConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNacosHistoryConfigResponseBody getBody() {
        return this.body;
    }

}
