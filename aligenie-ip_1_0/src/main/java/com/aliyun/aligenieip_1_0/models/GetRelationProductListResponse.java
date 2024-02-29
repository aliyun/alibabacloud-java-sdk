// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetRelationProductListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRelationProductListResponseBody body;

    public static GetRelationProductListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRelationProductListResponse self = new GetRelationProductListResponse();
        return TeaModel.build(map, self);
    }

    public GetRelationProductListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRelationProductListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRelationProductListResponse setBody(GetRelationProductListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRelationProductListResponseBody getBody() {
        return this.body;
    }

}
