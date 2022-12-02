// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetOsDownloadPathResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOsDownloadPathResponseBody body;

    public static GetOsDownloadPathResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOsDownloadPathResponse self = new GetOsDownloadPathResponse();
        return TeaModel.build(map, self);
    }

    public GetOsDownloadPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOsDownloadPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOsDownloadPathResponse setBody(GetOsDownloadPathResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOsDownloadPathResponseBody getBody() {
        return this.body;
    }

}
