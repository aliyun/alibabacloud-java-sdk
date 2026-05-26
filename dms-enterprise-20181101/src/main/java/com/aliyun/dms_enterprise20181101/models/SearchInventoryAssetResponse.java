// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchInventoryAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchInventoryAssetResponseBody body;

    public static SearchInventoryAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchInventoryAssetResponse self = new SearchInventoryAssetResponse();
        return TeaModel.build(map, self);
    }

    public SearchInventoryAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchInventoryAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchInventoryAssetResponse setBody(SearchInventoryAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchInventoryAssetResponseBody getBody() {
        return this.body;
    }

}
