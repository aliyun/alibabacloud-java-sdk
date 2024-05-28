// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmInstanceConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudGtmInstanceConfigsResponseBody body;

    public static ListCloudGtmInstanceConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmInstanceConfigsResponse self = new ListCloudGtmInstanceConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmInstanceConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudGtmInstanceConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudGtmInstanceConfigsResponse setBody(ListCloudGtmInstanceConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudGtmInstanceConfigsResponseBody getBody() {
        return this.body;
    }

}
