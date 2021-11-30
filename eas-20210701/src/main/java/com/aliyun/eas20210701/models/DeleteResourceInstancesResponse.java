// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteResourceInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteResourceInstancesResponseBody body;

    public static DeleteResourceInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceInstancesResponse self = new DeleteResourceInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceInstancesResponse setBody(DeleteResourceInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceInstancesResponseBody getBody() {
        return this.body;
    }

}
