// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DetachVscFromFilesystemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachVscFromFilesystemsResponseBody body;

    public static DetachVscFromFilesystemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachVscFromFilesystemsResponse self = new DetachVscFromFilesystemsResponse();
        return TeaModel.build(map, self);
    }

    public DetachVscFromFilesystemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachVscFromFilesystemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachVscFromFilesystemsResponse setBody(DetachVscFromFilesystemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachVscFromFilesystemsResponseBody getBody() {
        return this.body;
    }

}
