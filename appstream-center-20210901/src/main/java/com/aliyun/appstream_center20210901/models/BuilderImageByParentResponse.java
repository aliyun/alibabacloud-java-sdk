// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class BuilderImageByParentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BuilderImageByParentResponseBody body;

    public static BuilderImageByParentResponse build(java.util.Map<String, ?> map) throws Exception {
        BuilderImageByParentResponse self = new BuilderImageByParentResponse();
        return TeaModel.build(map, self);
    }

    public BuilderImageByParentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BuilderImageByParentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BuilderImageByParentResponse setBody(BuilderImageByParentResponseBody body) {
        this.body = body;
        return this;
    }
    public BuilderImageByParentResponseBody getBody() {
        return this.body;
    }

}
