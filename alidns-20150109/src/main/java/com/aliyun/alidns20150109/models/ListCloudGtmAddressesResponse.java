// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmAddressesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudGtmAddressesResponseBody body;

    public static ListCloudGtmAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmAddressesResponse self = new ListCloudGtmAddressesResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmAddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudGtmAddressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudGtmAddressesResponse setBody(ListCloudGtmAddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudGtmAddressesResponseBody getBody() {
        return this.body;
    }

}
