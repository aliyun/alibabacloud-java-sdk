// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetClusterQueueInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetClusterQueueInfoResponseBody body;

    public static GetClusterQueueInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterQueueInfoResponse self = new GetClusterQueueInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterQueueInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterQueueInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterQueueInfoResponse setBody(GetClusterQueueInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterQueueInfoResponseBody getBody() {
        return this.body;
    }

}
