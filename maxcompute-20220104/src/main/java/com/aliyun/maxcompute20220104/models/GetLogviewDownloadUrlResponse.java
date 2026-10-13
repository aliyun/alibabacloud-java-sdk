// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetLogviewDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLogviewDownloadUrlResponseBody body;

    public static GetLogviewDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogviewDownloadUrlResponse self = new GetLogviewDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetLogviewDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogviewDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogviewDownloadUrlResponse setBody(GetLogviewDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogviewDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
