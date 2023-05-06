// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetDownloadStsCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDownloadStsCredentialResponseBody body;

    public static GetDownloadStsCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadStsCredentialResponse self = new GetDownloadStsCredentialResponse();
        return TeaModel.build(map, self);
    }

    public GetDownloadStsCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDownloadStsCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDownloadStsCredentialResponse setBody(GetDownloadStsCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDownloadStsCredentialResponseBody getBody() {
        return this.body;
    }

}
