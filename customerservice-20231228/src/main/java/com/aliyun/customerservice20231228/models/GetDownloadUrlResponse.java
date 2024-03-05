// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class GetDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDownloadUrlResponseBody body;

    public static GetDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadUrlResponse self = new GetDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDownloadUrlResponse setBody(GetDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
