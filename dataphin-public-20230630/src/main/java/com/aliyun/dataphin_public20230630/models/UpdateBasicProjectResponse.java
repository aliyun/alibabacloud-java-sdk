// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateBasicProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBasicProjectResponseBody body;

    public static UpdateBasicProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBasicProjectResponse self = new UpdateBasicProjectResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBasicProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBasicProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBasicProjectResponse setBody(UpdateBasicProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBasicProjectResponseBody getBody() {
        return this.body;
    }

}
