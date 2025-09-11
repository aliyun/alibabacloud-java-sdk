// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class AttachVscToFilesystemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachVscToFilesystemsResponseBody body;

    public static AttachVscToFilesystemsResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachVscToFilesystemsResponse self = new AttachVscToFilesystemsResponse();
        return TeaModel.build(map, self);
    }

    public AttachVscToFilesystemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachVscToFilesystemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachVscToFilesystemsResponse setBody(AttachVscToFilesystemsResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachVscToFilesystemsResponseBody getBody() {
        return this.body;
    }

}
