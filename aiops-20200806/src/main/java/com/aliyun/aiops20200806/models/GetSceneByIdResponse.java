// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetSceneByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSceneByIdResponseBody body;

    public static GetSceneByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSceneByIdResponse self = new GetSceneByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetSceneByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSceneByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSceneByIdResponse setBody(GetSceneByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSceneByIdResponseBody getBody() {
        return this.body;
    }

}
