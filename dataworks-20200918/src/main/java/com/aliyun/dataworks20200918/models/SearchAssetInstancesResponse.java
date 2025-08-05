// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class SearchAssetInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchAssetInstancesResponseBody body;

    public static SearchAssetInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAssetInstancesResponse self = new SearchAssetInstancesResponse();
        return TeaModel.build(map, self);
    }

    public SearchAssetInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchAssetInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchAssetInstancesResponse setBody(SearchAssetInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchAssetInstancesResponseBody getBody() {
        return this.body;
    }

}
