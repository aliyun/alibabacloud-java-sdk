// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetConsumerListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetConsumerListResponseBody body;

    public static GetConsumerListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerListResponse self = new GetConsumerListResponse();
        return TeaModel.build(map, self);
    }

    public GetConsumerListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConsumerListResponse setBody(GetConsumerListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConsumerListResponseBody getBody() {
        return this.body;
    }

}
