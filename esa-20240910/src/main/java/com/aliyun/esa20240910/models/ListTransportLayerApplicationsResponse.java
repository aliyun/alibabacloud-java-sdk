// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListTransportLayerApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransportLayerApplicationsResponseBody body;

    public static ListTransportLayerApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransportLayerApplicationsResponse self = new ListTransportLayerApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListTransportLayerApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransportLayerApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransportLayerApplicationsResponse setBody(ListTransportLayerApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransportLayerApplicationsResponseBody getBody() {
        return this.body;
    }

}
