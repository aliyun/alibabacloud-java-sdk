// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class SearchAssetCatalogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchAssetCatalogsResponseBody body;

    public static SearchAssetCatalogsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAssetCatalogsResponse self = new SearchAssetCatalogsResponse();
        return TeaModel.build(map, self);
    }

    public SearchAssetCatalogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchAssetCatalogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchAssetCatalogsResponse setBody(SearchAssetCatalogsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchAssetCatalogsResponseBody getBody() {
        return this.body;
    }

}
