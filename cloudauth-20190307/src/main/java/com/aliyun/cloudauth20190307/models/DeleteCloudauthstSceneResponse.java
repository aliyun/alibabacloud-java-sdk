// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteCloudauthstSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCloudauthstSceneResponseBody body;

    public static DeleteCloudauthstSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudauthstSceneResponse self = new DeleteCloudauthstSceneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudauthstSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudauthstSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCloudauthstSceneResponse setBody(DeleteCloudauthstSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudauthstSceneResponseBody getBody() {
        return this.body;
    }

}
