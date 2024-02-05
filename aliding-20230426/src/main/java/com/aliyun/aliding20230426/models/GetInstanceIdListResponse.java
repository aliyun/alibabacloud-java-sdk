// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetInstanceIdListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceIdListResponseBody body;

    public static GetInstanceIdListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceIdListResponse self = new GetInstanceIdListResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceIdListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceIdListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceIdListResponse setBody(GetInstanceIdListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceIdListResponseBody getBody() {
        return this.body;
    }

}
