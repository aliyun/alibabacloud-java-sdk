// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchCloudGtmInstancesResponseBody body;

    public static SearchCloudGtmInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchCloudGtmInstancesResponse self = new SearchCloudGtmInstancesResponse();
        return TeaModel.build(map, self);
    }

    public SearchCloudGtmInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchCloudGtmInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchCloudGtmInstancesResponse setBody(SearchCloudGtmInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchCloudGtmInstancesResponseBody getBody() {
        return this.body;
    }

}
