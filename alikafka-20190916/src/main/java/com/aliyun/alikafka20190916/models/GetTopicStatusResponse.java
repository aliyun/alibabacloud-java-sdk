// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetTopicStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTopicStatusResponseBody body;

    public static GetTopicStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTopicStatusResponse self = new GetTopicStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetTopicStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTopicStatusResponse setBody(GetTopicStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTopicStatusResponseBody getBody() {
        return this.body;
    }

}
