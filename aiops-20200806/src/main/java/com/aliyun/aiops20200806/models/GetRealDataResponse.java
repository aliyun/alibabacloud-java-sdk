// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRealDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRealDataResponseBody body;

    public static GetRealDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRealDataResponse self = new GetRealDataResponse();
        return TeaModel.build(map, self);
    }

    public GetRealDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRealDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRealDataResponse setBody(GetRealDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRealDataResponseBody getBody() {
        return this.body;
    }

}
