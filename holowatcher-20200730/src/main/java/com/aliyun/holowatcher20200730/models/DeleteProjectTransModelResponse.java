// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DeleteProjectTransModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProjectTransModelResponseBody body;

    public static DeleteProjectTransModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectTransModelResponse self = new DeleteProjectTransModelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProjectTransModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProjectTransModelResponse setBody(DeleteProjectTransModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProjectTransModelResponseBody getBody() {
        return this.body;
    }

}
