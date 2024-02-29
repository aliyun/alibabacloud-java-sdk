// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaDBTableListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetaDBTableListResponseBody body;

    public static GetMetaDBTableListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDBTableListResponse self = new GetMetaDBTableListResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaDBTableListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaDBTableListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetaDBTableListResponse setBody(GetMetaDBTableListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaDBTableListResponseBody getBody() {
        return this.body;
    }

}
