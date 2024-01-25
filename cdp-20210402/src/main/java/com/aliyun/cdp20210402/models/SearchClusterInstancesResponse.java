// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class SearchClusterInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchClusterInstancesResponseBody body;

    public static SearchClusterInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchClusterInstancesResponse self = new SearchClusterInstancesResponse();
        return TeaModel.build(map, self);
    }

    public SearchClusterInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchClusterInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchClusterInstancesResponse setBody(SearchClusterInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchClusterInstancesResponseBody getBody() {
        return this.body;
    }

}
