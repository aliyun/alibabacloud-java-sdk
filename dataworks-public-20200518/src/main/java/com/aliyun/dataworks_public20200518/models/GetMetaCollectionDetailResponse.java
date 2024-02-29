// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaCollectionDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetaCollectionDetailResponseBody body;

    public static GetMetaCollectionDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaCollectionDetailResponse self = new GetMetaCollectionDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaCollectionDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaCollectionDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetaCollectionDetailResponse setBody(GetMetaCollectionDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaCollectionDetailResponseBody getBody() {
        return this.body;
    }

}
