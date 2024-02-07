// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListUserProvisioningEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserProvisioningEventsResponseBody body;

    public static ListUserProvisioningEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserProvisioningEventsResponse self = new ListUserProvisioningEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserProvisioningEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserProvisioningEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserProvisioningEventsResponse setBody(ListUserProvisioningEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserProvisioningEventsResponseBody getBody() {
        return this.body;
    }

}
