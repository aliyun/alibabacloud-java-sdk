// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListNvrDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNvrDevicesResponseBody body;

    public static ListNvrDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNvrDevicesResponse self = new ListNvrDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ListNvrDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNvrDevicesResponse setBody(ListNvrDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNvrDevicesResponseBody getBody() {
        return this.body;
    }

}
