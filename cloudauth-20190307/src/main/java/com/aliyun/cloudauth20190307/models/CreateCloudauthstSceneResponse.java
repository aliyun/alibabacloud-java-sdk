// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateCloudauthstSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudauthstSceneResponseBody body;

    public static CreateCloudauthstSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudauthstSceneResponse self = new CreateCloudauthstSceneResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudauthstSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudauthstSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudauthstSceneResponse setBody(CreateCloudauthstSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudauthstSceneResponseBody getBody() {
        return this.body;
    }

}
