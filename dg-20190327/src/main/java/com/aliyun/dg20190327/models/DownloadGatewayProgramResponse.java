// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class DownloadGatewayProgramResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadGatewayProgramResponseBody body;

    public static DownloadGatewayProgramResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadGatewayProgramResponse self = new DownloadGatewayProgramResponse();
        return TeaModel.build(map, self);
    }

    public DownloadGatewayProgramResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadGatewayProgramResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadGatewayProgramResponse setBody(DownloadGatewayProgramResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadGatewayProgramResponseBody getBody() {
        return this.body;
    }

}
