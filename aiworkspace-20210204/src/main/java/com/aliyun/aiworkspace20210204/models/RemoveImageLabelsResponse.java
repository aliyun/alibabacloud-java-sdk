// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class RemoveImageLabelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RemoveImageLabelsResponse setBody(RemoveImageLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveImageLabelsResponseBody getBody() {
        return this.body;
    }

}
