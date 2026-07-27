// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetKgNeighborResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKgNeighborResponseBody body;

    public static GetKgNeighborResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKgNeighborResponse self = new GetKgNeighborResponse();
        return TeaModel.build(map, self);
    }

    public GetKgNeighborResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKgNeighborResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKgNeighborResponse setBody(GetKgNeighborResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKgNeighborResponseBody getBody() {
        return this.body;
    }

}
