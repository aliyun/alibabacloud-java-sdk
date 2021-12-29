// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListAllDeviceGroupResponse setBody(ListAllDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
