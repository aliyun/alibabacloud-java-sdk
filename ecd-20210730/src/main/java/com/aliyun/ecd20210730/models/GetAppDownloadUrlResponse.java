// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppDownloadUrlResponseBody body;

    public static GetAppDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppDownloadUrlResponse self = new GetAppDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAppDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppDownloadUrlResponse setBody(GetAppDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
