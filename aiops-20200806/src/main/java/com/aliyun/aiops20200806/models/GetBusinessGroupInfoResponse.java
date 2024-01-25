// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessGroupInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBusinessGroupInfoResponseBody body;

    public static GetBusinessGroupInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessGroupInfoResponse self = new GetBusinessGroupInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessGroupInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusinessGroupInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBusinessGroupInfoResponse setBody(GetBusinessGroupInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusinessGroupInfoResponseBody getBody() {
        return this.body;
    }

}
