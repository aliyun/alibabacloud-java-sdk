// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetAliyunPKByAliyunIDResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAliyunPKByAliyunIDResponseBody body;

    public static GetAliyunPKByAliyunIDResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAliyunPKByAliyunIDResponse self = new GetAliyunPKByAliyunIDResponse();
        return TeaModel.build(map, self);
    }

    public GetAliyunPKByAliyunIDResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAliyunPKByAliyunIDResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAliyunPKByAliyunIDResponse setBody(GetAliyunPKByAliyunIDResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAliyunPKByAliyunIDResponseBody getBody() {
        return this.body;
    }

}
