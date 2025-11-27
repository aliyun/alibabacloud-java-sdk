// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsOcrOssInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSmsOcrOssInfoResponseBody body;

    public static GetSmsOcrOssInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSmsOcrOssInfoResponse self = new GetSmsOcrOssInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSmsOcrOssInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSmsOcrOssInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSmsOcrOssInfoResponse setBody(GetSmsOcrOssInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSmsOcrOssInfoResponseBody getBody() {
        return this.body;
    }

}
