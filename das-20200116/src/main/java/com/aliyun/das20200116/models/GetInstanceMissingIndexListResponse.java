// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceMissingIndexListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceMissingIndexListResponseBody body;

    public static GetInstanceMissingIndexListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceMissingIndexListResponse self = new GetInstanceMissingIndexListResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceMissingIndexListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceMissingIndexListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceMissingIndexListResponse setBody(GetInstanceMissingIndexListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceMissingIndexListResponseBody getBody() {
        return this.body;
    }

}
