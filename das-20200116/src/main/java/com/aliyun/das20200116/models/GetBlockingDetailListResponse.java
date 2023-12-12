// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetBlockingDetailListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBlockingDetailListResponseBody body;

    public static GetBlockingDetailListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBlockingDetailListResponse self = new GetBlockingDetailListResponse();
        return TeaModel.build(map, self);
    }

    public GetBlockingDetailListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBlockingDetailListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBlockingDetailListResponse setBody(GetBlockingDetailListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBlockingDetailListResponseBody getBody() {
        return this.body;
    }

}
