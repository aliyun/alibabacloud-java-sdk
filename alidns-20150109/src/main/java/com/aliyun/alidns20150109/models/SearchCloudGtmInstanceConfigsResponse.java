// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmInstanceConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchCloudGtmInstanceConfigsResponseBody body;

    public static SearchCloudGtmInstanceConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchCloudGtmInstanceConfigsResponse self = new SearchCloudGtmInstanceConfigsResponse();
        return TeaModel.build(map, self);
    }

    public SearchCloudGtmInstanceConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchCloudGtmInstanceConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchCloudGtmInstanceConfigsResponse setBody(SearchCloudGtmInstanceConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchCloudGtmInstanceConfigsResponseBody getBody() {
        return this.body;
    }

}
