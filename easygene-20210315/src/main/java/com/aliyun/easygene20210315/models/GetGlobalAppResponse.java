// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetGlobalAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGlobalAppResponseBody body;

    public static GetGlobalAppResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalAppResponse self = new GetGlobalAppResponse();
        return TeaModel.build(map, self);
    }

    public GetGlobalAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGlobalAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGlobalAppResponse setBody(GetGlobalAppResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGlobalAppResponseBody getBody() {
        return this.body;
    }

}
