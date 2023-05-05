// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetIconDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetIconDownloadUrlResponseBody body;

    public static GetIconDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIconDownloadUrlResponse self = new GetIconDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetIconDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIconDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIconDownloadUrlResponse setBody(GetIconDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIconDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
