// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetSaasServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSaasServiceResponseBody body;

    public static GetSaasServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSaasServiceResponse self = new GetSaasServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetSaasServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSaasServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSaasServiceResponse setBody(GetSaasServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSaasServiceResponseBody getBody() {
        return this.body;
    }

}
