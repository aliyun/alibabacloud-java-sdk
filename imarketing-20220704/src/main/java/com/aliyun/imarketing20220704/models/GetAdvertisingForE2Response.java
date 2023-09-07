// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetAdvertisingForE2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAdvertisingForE2ResponseBody body;

    public static GetAdvertisingForE2Response build(java.util.Map<String, ?> map) throws Exception {
        GetAdvertisingForE2Response self = new GetAdvertisingForE2Response();
        return TeaModel.build(map, self);
    }

    public GetAdvertisingForE2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAdvertisingForE2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAdvertisingForE2Response setBody(GetAdvertisingForE2ResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAdvertisingForE2ResponseBody getBody() {
        return this.body;
    }

}
