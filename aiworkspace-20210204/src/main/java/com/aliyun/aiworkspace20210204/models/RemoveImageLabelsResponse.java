// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class RemoveImageLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveImageLabelsResponseBody body;

    public static RemoveImageLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageLabelsResponse self = new RemoveImageLabelsResponse();
        return TeaModel.build(map, self);
    }

    public RemoveImageLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveImageLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveImageLabelsResponse setBody(RemoveImageLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveImageLabelsResponseBody getBody() {
        return this.body;
    }

}
