// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResetDiskDefaultKMSKeyIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetDiskDefaultKMSKeyIdResponseBody body;

    public static ResetDiskDefaultKMSKeyIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetDiskDefaultKMSKeyIdResponse self = new ResetDiskDefaultKMSKeyIdResponse();
        return TeaModel.build(map, self);
    }

    public ResetDiskDefaultKMSKeyIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetDiskDefaultKMSKeyIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetDiskDefaultKMSKeyIdResponse setBody(ResetDiskDefaultKMSKeyIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetDiskDefaultKMSKeyIdResponseBody getBody() {
        return this.body;
    }

}
