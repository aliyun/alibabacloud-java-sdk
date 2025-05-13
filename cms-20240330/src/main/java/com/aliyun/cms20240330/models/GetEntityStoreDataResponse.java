// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetEntityStoreDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEntityStoreDataResponseBody body;

    public static GetEntityStoreDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEntityStoreDataResponse self = new GetEntityStoreDataResponse();
        return TeaModel.build(map, self);
    }

    public GetEntityStoreDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEntityStoreDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEntityStoreDataResponse setBody(GetEntityStoreDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEntityStoreDataResponseBody getBody() {
        return this.body;
    }

}
