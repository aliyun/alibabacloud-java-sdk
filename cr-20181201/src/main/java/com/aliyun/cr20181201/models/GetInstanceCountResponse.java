// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceCountResponseBody body;

    public static GetInstanceCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceCountResponse self = new GetInstanceCountResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceCountResponse setBody(GetInstanceCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceCountResponseBody getBody() {
        return this.body;
    }

}
