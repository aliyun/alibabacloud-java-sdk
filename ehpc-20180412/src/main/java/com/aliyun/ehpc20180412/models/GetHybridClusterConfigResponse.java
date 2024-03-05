// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetHybridClusterConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHybridClusterConfigResponseBody body;

    public static GetHybridClusterConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHybridClusterConfigResponse self = new GetHybridClusterConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetHybridClusterConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHybridClusterConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHybridClusterConfigResponse setBody(GetHybridClusterConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHybridClusterConfigResponseBody getBody() {
        return this.body;
    }

}
