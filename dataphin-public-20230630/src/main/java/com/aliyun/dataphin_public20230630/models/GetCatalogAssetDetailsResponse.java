// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetCatalogAssetDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCatalogAssetDetailsResponseBody body;

    public static GetCatalogAssetDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogAssetDetailsResponse self = new GetCatalogAssetDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetCatalogAssetDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCatalogAssetDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCatalogAssetDetailsResponse setBody(GetCatalogAssetDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCatalogAssetDetailsResponseBody getBody() {
        return this.body;
    }

}
