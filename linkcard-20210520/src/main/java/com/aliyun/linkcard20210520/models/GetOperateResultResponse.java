// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetOperateResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOperateResultResponseBody body;

    public static GetOperateResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOperateResultResponse self = new GetOperateResultResponse();
        return TeaModel.build(map, self);
    }

    public GetOperateResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOperateResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOperateResultResponse setBody(GetOperateResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOperateResultResponseBody getBody() {
        return this.body;
    }

}
