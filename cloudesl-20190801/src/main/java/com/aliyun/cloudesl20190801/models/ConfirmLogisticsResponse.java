// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class ConfirmLogisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmLogisticsResponseBody body;

    public static ConfirmLogisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLogisticsResponse self = new ConfirmLogisticsResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmLogisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmLogisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmLogisticsResponse setBody(ConfirmLogisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmLogisticsResponseBody getBody() {
        return this.body;
    }

}
