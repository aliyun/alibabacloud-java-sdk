// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeDataByQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRetcodeDataByQueryResponseBody body;

    public static GetRetcodeDataByQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeDataByQueryResponse self = new GetRetcodeDataByQueryResponse();
        return TeaModel.build(map, self);
    }

    public GetRetcodeDataByQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRetcodeDataByQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRetcodeDataByQueryResponse setBody(GetRetcodeDataByQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRetcodeDataByQueryResponseBody getBody() {
        return this.body;
    }

}
