// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListEdgeDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEdgeDeviceGroupResponseBody body;

    public static ListEdgeDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeDeviceGroupResponse self = new ListEdgeDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListEdgeDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEdgeDeviceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEdgeDeviceGroupResponse setBody(ListEdgeDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEdgeDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
