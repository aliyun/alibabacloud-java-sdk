// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class VerifyLogisticsSmsMailNoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyLogisticsSmsMailNoResponseBody body;

    public static VerifyLogisticsSmsMailNoResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyLogisticsSmsMailNoResponse self = new VerifyLogisticsSmsMailNoResponse();
        return TeaModel.build(map, self);
    }

    public VerifyLogisticsSmsMailNoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyLogisticsSmsMailNoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyLogisticsSmsMailNoResponse setBody(VerifyLogisticsSmsMailNoResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyLogisticsSmsMailNoResponseBody getBody() {
        return this.body;
    }

}
