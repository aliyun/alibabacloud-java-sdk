// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class GetRegionInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetRegionInfoResponseBody body;

    public static GetRegionInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegionInfoResponse self = new GetRegionInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetRegionInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRegionInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRegionInfoResponse setBody(GetRegionInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRegionInfoResponseBody getBody() {
        return this.body;
    }

}
