// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateWorkItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkItemResponseBody body;

    public static UpdateWorkItemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkItemResponse self = new UpdateWorkItemResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkItemResponse setBody(UpdateWorkItemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkItemResponseBody getBody() {
        return this.body;
    }

}
