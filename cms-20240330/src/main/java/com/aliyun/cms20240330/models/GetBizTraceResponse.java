// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetBizTraceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBizTraceResponseBody body;

    public static GetBizTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBizTraceResponse self = new GetBizTraceResponse();
        return TeaModel.build(map, self);
    }

    public GetBizTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBizTraceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBizTraceResponse setBody(GetBizTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBizTraceResponseBody getBody() {
        return this.body;
    }

}
