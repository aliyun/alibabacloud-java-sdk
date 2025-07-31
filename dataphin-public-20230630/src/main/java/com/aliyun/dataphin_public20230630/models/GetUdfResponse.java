// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetUdfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUdfResponseBody body;

    public static GetUdfResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUdfResponse self = new GetUdfResponse();
        return TeaModel.build(map, self);
    }

    public GetUdfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUdfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUdfResponse setBody(GetUdfResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUdfResponseBody getBody() {
        return this.body;
    }

}
