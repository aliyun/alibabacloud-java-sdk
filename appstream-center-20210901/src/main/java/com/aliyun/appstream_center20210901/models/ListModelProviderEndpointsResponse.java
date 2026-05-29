// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListModelProviderEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelProviderEndpointsResponseBody body;

    public static ListModelProviderEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelProviderEndpointsResponse self = new ListModelProviderEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public ListModelProviderEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelProviderEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelProviderEndpointsResponse setBody(ListModelProviderEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelProviderEndpointsResponseBody getBody() {
        return this.body;
    }

}
