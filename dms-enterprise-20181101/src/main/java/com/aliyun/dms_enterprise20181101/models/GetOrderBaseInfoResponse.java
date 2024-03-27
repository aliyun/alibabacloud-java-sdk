// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOrderBaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOrderBaseInfoResponseBody body;

    public static GetOrderBaseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrderBaseInfoResponse self = new GetOrderBaseInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetOrderBaseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrderBaseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrderBaseInfoResponse setBody(GetOrderBaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrderBaseInfoResponseBody getBody() {
        return this.body;
    }

}
