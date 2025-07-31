// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetUdfByVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUdfByVersionResponseBody body;

    public static GetUdfByVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUdfByVersionResponse self = new GetUdfByVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetUdfByVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUdfByVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUdfByVersionResponse setBody(GetUdfByVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUdfByVersionResponseBody getBody() {
        return this.body;
    }

}
