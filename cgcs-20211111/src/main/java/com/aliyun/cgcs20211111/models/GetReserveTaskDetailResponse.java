// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetReserveTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetReserveTaskDetailResponseBody body;

    public static GetReserveTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReserveTaskDetailResponse self = new GetReserveTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetReserveTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReserveTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetReserveTaskDetailResponse setBody(GetReserveTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReserveTaskDetailResponseBody getBody() {
        return this.body;
    }

}
