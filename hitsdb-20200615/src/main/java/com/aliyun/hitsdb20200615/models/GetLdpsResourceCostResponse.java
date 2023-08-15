// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLdpsResourceCostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLdpsResourceCostResponseBody body;

    public static GetLdpsResourceCostResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLdpsResourceCostResponse self = new GetLdpsResourceCostResponse();
        return TeaModel.build(map, self);
    }

    public GetLdpsResourceCostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLdpsResourceCostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLdpsResourceCostResponse setBody(GetLdpsResourceCostResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLdpsResourceCostResponseBody getBody() {
        return this.body;
    }

}
