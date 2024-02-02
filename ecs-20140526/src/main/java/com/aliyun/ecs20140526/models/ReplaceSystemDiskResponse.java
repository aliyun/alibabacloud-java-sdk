// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReplaceSystemDiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReplaceSystemDiskResponseBody body;

    public static ReplaceSystemDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceSystemDiskResponse self = new ReplaceSystemDiskResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceSystemDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceSystemDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceSystemDiskResponse setBody(ReplaceSystemDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceSystemDiskResponseBody getBody() {
        return this.body;
    }

}
