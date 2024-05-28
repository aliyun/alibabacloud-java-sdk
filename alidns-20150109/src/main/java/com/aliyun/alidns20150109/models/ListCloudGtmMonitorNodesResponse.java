// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmMonitorNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudGtmMonitorNodesResponseBody body;

    public static ListCloudGtmMonitorNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmMonitorNodesResponse self = new ListCloudGtmMonitorNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmMonitorNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudGtmMonitorNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudGtmMonitorNodesResponse setBody(ListCloudGtmMonitorNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudGtmMonitorNodesResponseBody getBody() {
        return this.body;
    }

}
