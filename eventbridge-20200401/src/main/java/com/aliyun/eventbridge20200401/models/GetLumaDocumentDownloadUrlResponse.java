// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetLumaDocumentDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLumaDocumentDownloadUrlResponseBody body;

    public static GetLumaDocumentDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLumaDocumentDownloadUrlResponse self = new GetLumaDocumentDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetLumaDocumentDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLumaDocumentDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLumaDocumentDownloadUrlResponse setBody(GetLumaDocumentDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLumaDocumentDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
