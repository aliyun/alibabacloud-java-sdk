// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendLogisticsSmsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendLogisticsSmsResponseBody body;

    public static SendLogisticsSmsResponse build(java.util.Map<String, ?> map) throws Exception {
        SendLogisticsSmsResponse self = new SendLogisticsSmsResponse();
        return TeaModel.build(map, self);
    }

    public SendLogisticsSmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendLogisticsSmsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendLogisticsSmsResponse setBody(SendLogisticsSmsResponseBody body) {
        this.body = body;
        return this;
    }
    public SendLogisticsSmsResponseBody getBody() {
        return this.body;
    }

}
