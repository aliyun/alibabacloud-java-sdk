// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetInstanceIpWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceIpWhiteListResponseBody body;

    public static GetInstanceIpWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceIpWhiteListResponse self = new GetInstanceIpWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceIpWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceIpWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceIpWhiteListResponse setBody(GetInstanceIpWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceIpWhiteListResponseBody getBody() {
        return this.body;
    }

}
