// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApAddressByMacResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetApAddressByMacResponseBody body;

    public static GetApAddressByMacResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApAddressByMacResponse self = new GetApAddressByMacResponse();
        return TeaModel.build(map, self);
    }

    public GetApAddressByMacResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApAddressByMacResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApAddressByMacResponse setBody(GetApAddressByMacResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApAddressByMacResponseBody getBody() {
        return this.body;
    }

}
