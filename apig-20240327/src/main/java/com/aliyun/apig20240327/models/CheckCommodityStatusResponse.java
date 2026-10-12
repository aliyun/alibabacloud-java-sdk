// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CheckCommodityStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckCommodityStatusResponseBody body;

    public static CheckCommodityStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCommodityStatusResponse self = new CheckCommodityStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckCommodityStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCommodityStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckCommodityStatusResponse setBody(CheckCommodityStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCommodityStatusResponseBody getBody() {
        return this.body;
    }

}
