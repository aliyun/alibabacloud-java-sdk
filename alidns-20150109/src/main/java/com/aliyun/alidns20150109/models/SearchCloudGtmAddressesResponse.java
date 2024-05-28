// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmAddressesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchCloudGtmAddressesResponseBody body;

    public static SearchCloudGtmAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchCloudGtmAddressesResponse self = new SearchCloudGtmAddressesResponse();
        return TeaModel.build(map, self);
    }

    public SearchCloudGtmAddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchCloudGtmAddressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchCloudGtmAddressesResponse setBody(SearchCloudGtmAddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchCloudGtmAddressesResponseBody getBody() {
        return this.body;
    }

}
