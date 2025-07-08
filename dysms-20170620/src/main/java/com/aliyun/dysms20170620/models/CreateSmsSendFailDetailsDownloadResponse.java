// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsSendFailDetailsDownloadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSmsSendFailDetailsDownloadResponseBody body;

    public static CreateSmsSendFailDetailsDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsSendFailDetailsDownloadResponse self = new CreateSmsSendFailDetailsDownloadResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmsSendFailDetailsDownloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmsSendFailDetailsDownloadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSmsSendFailDetailsDownloadResponse setBody(CreateSmsSendFailDetailsDownloadResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmsSendFailDetailsDownloadResponseBody getBody() {
        return this.body;
    }

}
