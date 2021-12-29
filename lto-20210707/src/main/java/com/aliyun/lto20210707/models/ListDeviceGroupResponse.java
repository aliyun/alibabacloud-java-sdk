// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeviceGroupResponseBody body;

    public static ListDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceGroupResponse self = new ListDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceGroupResponse setBody(ListDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceGroupResponseBody getBody() {
        return this.body;
    }

}
