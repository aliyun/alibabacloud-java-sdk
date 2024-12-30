// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetClusterQueueInfoByEnvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClusterQueueInfoByEnvResponseBody body;

    public static GetClusterQueueInfoByEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterQueueInfoByEnvResponse self = new GetClusterQueueInfoByEnvResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterQueueInfoByEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterQueueInfoByEnvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterQueueInfoByEnvResponse setBody(GetClusterQueueInfoByEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterQueueInfoByEnvResponseBody getBody() {
        return this.body;
    }

}
