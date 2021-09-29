// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListVehicleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVehicleResponseBody body;

    public static ListVehicleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVehicleResponse self = new ListVehicleResponse();
        return TeaModel.build(map, self);
    }

    public ListVehicleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVehicleResponse setBody(ListVehicleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVehicleResponseBody getBody() {
        return this.body;
    }

}
