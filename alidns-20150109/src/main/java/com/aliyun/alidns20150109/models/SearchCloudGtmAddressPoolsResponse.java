// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmAddressPoolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchCloudGtmAddressPoolsResponseBody body;

    public static SearchCloudGtmAddressPoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchCloudGtmAddressPoolsResponse self = new SearchCloudGtmAddressPoolsResponse();
        return TeaModel.build(map, self);
    }

    public SearchCloudGtmAddressPoolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchCloudGtmAddressPoolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchCloudGtmAddressPoolsResponse setBody(SearchCloudGtmAddressPoolsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchCloudGtmAddressPoolsResponseBody getBody() {
        return this.body;
    }

}
