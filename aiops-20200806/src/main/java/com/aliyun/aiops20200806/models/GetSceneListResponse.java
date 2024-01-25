// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetSceneListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSceneListResponseBody body;

    public static GetSceneListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSceneListResponse self = new GetSceneListResponse();
        return TeaModel.build(map, self);
    }

    public GetSceneListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSceneListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSceneListResponse setBody(GetSceneListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSceneListResponseBody getBody() {
        return this.body;
    }

}
