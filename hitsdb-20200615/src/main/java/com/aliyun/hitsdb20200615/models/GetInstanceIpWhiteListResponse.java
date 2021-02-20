// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetInstanceIpWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetInstanceIpWhiteListResponse setBody(GetInstanceIpWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceIpWhiteListResponseBody getBody() {
        return this.body;
    }

}
