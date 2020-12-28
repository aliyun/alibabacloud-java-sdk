// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceListResponseBody body;

    public static GetInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceListResponse self = new GetInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceListResponse setBody(GetInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceListResponseBody getBody() {
        return this.body;
    }

}
