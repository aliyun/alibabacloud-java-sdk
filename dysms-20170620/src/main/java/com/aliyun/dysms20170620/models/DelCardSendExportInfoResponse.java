// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DelCardSendExportInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DelCardSendExportInfoResponseBody body;

    public static DelCardSendExportInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DelCardSendExportInfoResponse self = new DelCardSendExportInfoResponse();
        return TeaModel.build(map, self);
    }

    public DelCardSendExportInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelCardSendExportInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DelCardSendExportInfoResponse setBody(DelCardSendExportInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DelCardSendExportInfoResponseBody getBody() {
        return this.body;
    }

}
