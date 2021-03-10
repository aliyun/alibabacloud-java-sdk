// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteTopicRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTopicRouteTableResponseBody body;

    public static DeleteTopicRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTopicRouteTableResponse self = new DeleteTopicRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTopicRouteTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTopicRouteTableResponse setBody(DeleteTopicRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTopicRouteTableResponseBody getBody() {
        return this.body;
    }

}
