// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForNetworkZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationsForNetworkZoneResponseBody body;

    public static ListApplicationsForNetworkZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForNetworkZoneResponse self = new ListApplicationsForNetworkZoneResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForNetworkZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationsForNetworkZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationsForNetworkZoneResponse setBody(ListApplicationsForNetworkZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationsForNetworkZoneResponseBody getBody() {
        return this.body;
    }

}
