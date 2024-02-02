// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateTopicRouteTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTopicRouteTableResponseBody body;

    public static CreateTopicRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTopicRouteTableResponse self = new CreateTopicRouteTableResponse();
        return TeaModel.build(map, self);
    }

    public CreateTopicRouteTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTopicRouteTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTopicRouteTableResponse setBody(CreateTopicRouteTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTopicRouteTableResponseBody getBody() {
        return this.body;
    }

}
