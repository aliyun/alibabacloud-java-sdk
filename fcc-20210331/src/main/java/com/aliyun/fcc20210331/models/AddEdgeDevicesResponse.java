// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class AddEdgeDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddEdgeDevicesResponseBody body;

    public static AddEdgeDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEdgeDevicesResponse self = new AddEdgeDevicesResponse();
        return TeaModel.build(map, self);
    }

    public AddEdgeDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEdgeDevicesResponse setBody(AddEdgeDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEdgeDevicesResponseBody getBody() {
        return this.body;
    }

}
