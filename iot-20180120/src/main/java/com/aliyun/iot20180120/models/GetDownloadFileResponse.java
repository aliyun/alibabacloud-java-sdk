// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDownloadFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDownloadFileResponseBody body;

    public static GetDownloadFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadFileResponse self = new GetDownloadFileResponse();
        return TeaModel.build(map, self);
    }

    public GetDownloadFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDownloadFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDownloadFileResponse setBody(GetDownloadFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDownloadFileResponseBody getBody() {
        return this.body;
    }

}
