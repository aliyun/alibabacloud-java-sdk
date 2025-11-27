// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateBizTraceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBizTraceResponseBody body;

    public static CreateBizTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBizTraceResponse self = new CreateBizTraceResponse();
        return TeaModel.build(map, self);
    }

    public CreateBizTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBizTraceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBizTraceResponse setBody(CreateBizTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBizTraceResponseBody getBody() {
        return this.body;
    }

}
