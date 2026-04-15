// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetScencegroupFileDownloadurlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScencegroupFileDownloadurlResponseBody body;

    public static GetScencegroupFileDownloadurlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScencegroupFileDownloadurlResponse self = new GetScencegroupFileDownloadurlResponse();
        return TeaModel.build(map, self);
    }

    public GetScencegroupFileDownloadurlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScencegroupFileDownloadurlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScencegroupFileDownloadurlResponse setBody(GetScencegroupFileDownloadurlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScencegroupFileDownloadurlResponseBody getBody() {
        return this.body;
    }

}
