// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAllDeviceGroupResponseBody body;

    public static ListAllDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllDeviceGroupResponse self = new ListAllDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListAllDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllDeviceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllDeviceGroupResponse setBody(ListAllDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
