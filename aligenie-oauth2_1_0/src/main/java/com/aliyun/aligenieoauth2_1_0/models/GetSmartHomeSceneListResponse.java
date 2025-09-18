// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class GetSmartHomeSceneListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSmartHomeSceneListResponseBody body;

    public static GetSmartHomeSceneListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSmartHomeSceneListResponse self = new GetSmartHomeSceneListResponse();
        return TeaModel.build(map, self);
    }

    public GetSmartHomeSceneListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSmartHomeSceneListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSmartHomeSceneListResponse setBody(GetSmartHomeSceneListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSmartHomeSceneListResponseBody getBody() {
        return this.body;
    }

}
