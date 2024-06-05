// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class DownloadGatewayProgramResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
