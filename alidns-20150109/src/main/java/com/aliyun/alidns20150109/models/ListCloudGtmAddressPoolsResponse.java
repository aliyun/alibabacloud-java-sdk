// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmAddressPoolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudGtmAddressPoolsResponseBody body;

    public static ListCloudGtmAddressPoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmAddressPoolsResponse self = new ListCloudGtmAddressPoolsResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmAddressPoolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudGtmAddressPoolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudGtmAddressPoolsResponse setBody(ListCloudGtmAddressPoolsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudGtmAddressPoolsResponseBody getBody() {
        return this.body;
    }

}
