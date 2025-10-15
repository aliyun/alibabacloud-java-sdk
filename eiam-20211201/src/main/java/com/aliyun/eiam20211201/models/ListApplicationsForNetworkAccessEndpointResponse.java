// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForNetworkAccessEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationsForNetworkAccessEndpointResponseBody body;

    public static ListApplicationsForNetworkAccessEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForNetworkAccessEndpointResponse self = new ListApplicationsForNetworkAccessEndpointResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForNetworkAccessEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationsForNetworkAccessEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationsForNetworkAccessEndpointResponse setBody(ListApplicationsForNetworkAccessEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationsForNetworkAccessEndpointResponseBody getBody() {
        return this.body;
    }

}
