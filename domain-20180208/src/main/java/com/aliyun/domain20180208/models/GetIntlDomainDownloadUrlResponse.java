// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class GetIntlDomainDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIntlDomainDownloadUrlResponseBody body;

    public static GetIntlDomainDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIntlDomainDownloadUrlResponse self = new GetIntlDomainDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetIntlDomainDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIntlDomainDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIntlDomainDownloadUrlResponse setBody(GetIntlDomainDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIntlDomainDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
