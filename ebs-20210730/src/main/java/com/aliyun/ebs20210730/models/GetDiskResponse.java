// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class GetDiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDiskResponseBody body;

    public static GetDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiskResponse self = new GetDiskResponse();
        return TeaModel.build(map, self);
    }

    public GetDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDiskResponse setBody(GetDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDiskResponseBody getBody() {
        return this.body;
    }

}
