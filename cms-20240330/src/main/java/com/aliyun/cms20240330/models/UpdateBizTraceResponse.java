// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateBizTraceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBizTraceResponseBody body;

    public static UpdateBizTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizTraceResponse self = new UpdateBizTraceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBizTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBizTraceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBizTraceResponse setBody(UpdateBizTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBizTraceResponseBody getBody() {
        return this.body;
    }

}
