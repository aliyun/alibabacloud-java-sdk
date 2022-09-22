// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class UnmountPEDiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnmountPEDiskResponseBody body;

    public static UnmountPEDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        UnmountPEDiskResponse self = new UnmountPEDiskResponse();
        return TeaModel.build(map, self);
    }

    public UnmountPEDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnmountPEDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnmountPEDiskResponse setBody(UnmountPEDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public UnmountPEDiskResponseBody getBody() {
        return this.body;
    }

}
