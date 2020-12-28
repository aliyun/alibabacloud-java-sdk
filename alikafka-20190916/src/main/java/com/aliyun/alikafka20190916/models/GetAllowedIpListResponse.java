// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetAllowedIpListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetAllowedIpListResponse setBody(GetAllowedIpListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllowedIpListResponseBody getBody() {
        return this.body;
    }

}
