// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetSceneDetailsListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSceneDetailsListResponseBody body;

    public static GetSceneDetailsListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSceneDetailsListResponse self = new GetSceneDetailsListResponse();
        return TeaModel.build(map, self);
    }

    public GetSceneDetailsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSceneDetailsListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSceneDetailsListResponse setBody(GetSceneDetailsListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSceneDetailsListResponseBody getBody() {
        return this.body;
    }

}
