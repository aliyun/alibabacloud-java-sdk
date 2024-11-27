// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetAttackedAssetDealResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAttackedAssetDealResponseBody body;

    public static GetAttackedAssetDealResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAttackedAssetDealResponse self = new GetAttackedAssetDealResponse();
        return TeaModel.build(map, self);
    }

    public GetAttackedAssetDealResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAttackedAssetDealResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAttackedAssetDealResponse setBody(GetAttackedAssetDealResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAttackedAssetDealResponseBody getBody() {
        return this.body;
    }

}
