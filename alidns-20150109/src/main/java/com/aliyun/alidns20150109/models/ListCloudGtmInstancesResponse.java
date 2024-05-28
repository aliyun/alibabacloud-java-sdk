// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudGtmInstancesResponseBody body;

    public static ListCloudGtmInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmInstancesResponse self = new ListCloudGtmInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudGtmInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudGtmInstancesResponse setBody(ListCloudGtmInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudGtmInstancesResponseBody getBody() {
        return this.body;
    }

}
