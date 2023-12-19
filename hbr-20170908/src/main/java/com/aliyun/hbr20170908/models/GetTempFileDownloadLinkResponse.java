// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class GetTempFileDownloadLinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTempFileDownloadLinkResponseBody body;

    public static GetTempFileDownloadLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTempFileDownloadLinkResponse self = new GetTempFileDownloadLinkResponse();
        return TeaModel.build(map, self);
    }

    public GetTempFileDownloadLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTempFileDownloadLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTempFileDownloadLinkResponse setBody(GetTempFileDownloadLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTempFileDownloadLinkResponseBody getBody() {
        return this.body;
    }

}
