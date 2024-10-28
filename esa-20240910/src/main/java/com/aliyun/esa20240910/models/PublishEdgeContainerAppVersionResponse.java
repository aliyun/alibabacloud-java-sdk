// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PublishEdgeContainerAppVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishEdgeContainerAppVersionResponseBody body;

    public static PublishEdgeContainerAppVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishEdgeContainerAppVersionResponse self = new PublishEdgeContainerAppVersionResponse();
        return TeaModel.build(map, self);
    }

    public PublishEdgeContainerAppVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishEdgeContainerAppVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishEdgeContainerAppVersionResponse setBody(PublishEdgeContainerAppVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishEdgeContainerAppVersionResponseBody getBody() {
        return this.body;
    }

}
