// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetGroupByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetGroupByIdResponseBody body;

    public static GetGroupByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGroupByIdResponse self = new GetGroupByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetGroupByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGroupByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGroupByIdResponse setBody(GetGroupByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGroupByIdResponseBody getBody() {
        return this.body;
    }

}
