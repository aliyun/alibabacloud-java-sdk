// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ResizeWuyingServerDiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResizeWuyingServerDiskResponseBody body;

    public static ResizeWuyingServerDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ResizeWuyingServerDiskResponse self = new ResizeWuyingServerDiskResponse();
        return TeaModel.build(map, self);
    }

    public ResizeWuyingServerDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResizeWuyingServerDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResizeWuyingServerDiskResponse setBody(ResizeWuyingServerDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public ResizeWuyingServerDiskResponseBody getBody() {
        return this.body;
    }

}
