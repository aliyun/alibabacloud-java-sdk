// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWatermarkResponseBody body;

    public static GetWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkResponse self = new GetWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public GetWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWatermarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWatermarkResponse setBody(GetWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWatermarkResponseBody getBody() {
        return this.body;
    }

}
