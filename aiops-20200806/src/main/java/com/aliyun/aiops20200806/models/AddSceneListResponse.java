// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class AddSceneListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSceneListResponseBody body;

    public static AddSceneListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSceneListResponse self = new AddSceneListResponse();
        return TeaModel.build(map, self);
    }

    public AddSceneListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSceneListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSceneListResponse setBody(AddSceneListResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSceneListResponseBody getBody() {
        return this.body;
    }

}
