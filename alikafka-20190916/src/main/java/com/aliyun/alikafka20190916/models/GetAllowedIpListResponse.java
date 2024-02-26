// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetAllowedIpListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAllowedIpListResponseBody body;

    public static GetAllowedIpListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllowedIpListResponse self = new GetAllowedIpListResponse();
        return TeaModel.build(map, self);
    }

    public GetAllowedIpListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllowedIpListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAllowedIpListResponse setBody(GetAllowedIpListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllowedIpListResponseBody getBody() {
        return this.body;
    }

}
