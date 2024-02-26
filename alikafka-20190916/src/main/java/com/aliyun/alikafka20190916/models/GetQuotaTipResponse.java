// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetQuotaTipResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQuotaTipResponseBody body;

    public static GetQuotaTipResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaTipResponse self = new GetQuotaTipResponse();
        return TeaModel.build(map, self);
    }

    public GetQuotaTipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQuotaTipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQuotaTipResponse setBody(GetQuotaTipResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQuotaTipResponseBody getBody() {
        return this.body;
    }

}
