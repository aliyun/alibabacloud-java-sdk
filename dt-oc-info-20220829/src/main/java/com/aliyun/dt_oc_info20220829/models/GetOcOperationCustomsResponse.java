// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcOperationCustomsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcOperationCustomsResponseBody body;

    public static GetOcOperationCustomsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcOperationCustomsResponse self = new GetOcOperationCustomsResponse();
        return TeaModel.build(map, self);
    }

    public GetOcOperationCustomsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcOperationCustomsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcOperationCustomsResponse setBody(GetOcOperationCustomsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcOperationCustomsResponseBody getBody() {
        return this.body;
    }

}
