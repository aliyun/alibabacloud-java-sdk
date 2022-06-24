// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DownloadMPCDByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadMPCDByIdResponseBody body;

    public static DownloadMPCDByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadMPCDByIdResponse self = new DownloadMPCDByIdResponse();
        return TeaModel.build(map, self);
    }

    public DownloadMPCDByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadMPCDByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadMPCDByIdResponse setBody(DownloadMPCDByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadMPCDByIdResponseBody getBody() {
        return this.body;
    }

}
